package application;

import dominio.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;




public class Programa {
        public static void main(String[] args) {


            EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
            EntityManager em = emf.createEntityManager();

            Pessoa pessoa = em.find(Pessoa.class, 4);
            em.getTransaction().begin();
            em.remove(pessoa);
            em.getTransaction().commit();

            System.out.println("OK");
            em.close();
            emf.close();


        }
    }

