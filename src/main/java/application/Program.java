package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Program {
	
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa(null, "Carlos da Silva", "carlos@gmail.com");
		Pessoa p2 = new Pessoa(null, "Joaquim da Silva", "jojo@gmail.com");
		Pessoa p3 = new Pessoa(null, "Marcos da Silva", "marcos@gmail.com");
		Pessoa p4 = new Pessoa(null, "Ana da Silva", "ana@gmail.com");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager(); //Conexao com banco de dados
		
		em.getTransaction().begin(); //Inicia a transação
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit(); //Finalizando a transacao
		
		System.out.println("Pronto!");
		
		
		
		
		
		
	}

}
