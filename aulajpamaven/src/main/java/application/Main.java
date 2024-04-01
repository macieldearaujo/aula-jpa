package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.Pessoa;

public class Main {
	public static void main(String args[]) {
		//Pessoa p1 = new Pessoa(null, "Carlos da Silva", "carlos@gmail.com");
		//Pessoa p2 = new Pessoa(null, "Joaquim Torres", "joaquim@gmail.com");
		//Pessoa p3 = new Pessoa(null, "Ana Maria", "ana@gmail.com");
		
		//System.out.println(p1);
		//System.out.println(p2);
		//System.out.println(p3);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		//em.getTransaction().begin();
		//em.persist(p1);
		//em.persist(p2);
		//em.persist(p3);
		//em.getTransaction().commit();
		
		//Pessoa p1 = em.find(Pessoa.class, 2);
		//System.out.println(p1);
		
		em.getTransaction().begin();
		Pessoa p = em.find(Pessoa.class, 5);
		em.remove(p);
		em.getTransaction().commit();
		
		System.out.println("Pronto!");
		em.close();
		emf.close();
	}
}
