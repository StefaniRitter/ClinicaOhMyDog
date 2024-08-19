package ohmydog.model;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;

public class PetJPA {

    public static boolean CadastrarPet(Pet p) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(p);
            em.getTransaction().commit();
            return true;
        } catch (Exception e) {
            em.getTransaction().rollback();
            return false;
        } finally {
            JPAUtil.closeEntityManager();
        }
    }

    public static Pet buscar(int id) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            return em.find(Pet.class, id);
        } finally {
            JPAUtil.closeEntityManager();
        }
    }

    public static boolean atualizar(Pet p) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(p);
            em.getTransaction().commit();
            return true;
        } catch (Exception e) {
            em.getTransaction().rollback();
            return false;
        } finally {
            JPAUtil.closeEntityManager();
        }
    }

    public static boolean excluirPet(int id) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            Pet p = em.find(Pet.class, id);

            if (p != null) {
                em.getTransaction().begin();
                em.remove(p);
                em.getTransaction().commit();
            }
            return true;

        } catch (Exception e) {
            em.getTransaction().rollback();
            return false;
        } finally {
            JPAUtil.closeEntityManager();
        }
    }
    
     public static boolean excluirPetCliente(int idCliente) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
           
            String textoQuery = "SELECT p FROM Pet p WHERE p.cliente.id = :idCliente";
            List<Pet> pets = em.createQuery(textoQuery, Pet.class)
                    .setParameter("idCliente", idCliente)
                    .getResultList();

            em.getTransaction().begin();
            for (Pet p: pets) {
                em.remove(p);
            }
            em.getTransaction().commit();
            return true;
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
            return false;
        } finally {
            JPAUtil.closeEntityManager();
        }
    }
    
     public static List<Pet> listarPets() {
        EntityManager em = JPAUtil.getEntityManager();
        List pets = null;
        try {
            
            String textoQuery = "SELECT p FROM Pet p";
            Query consulta = em.createQuery(textoQuery);
            pets = consulta.getResultList();
            
        } finally {
            JPAUtil.closeEntityManager();
        }       
        return pets;
    }
    
      public static List<Pet> listarPetsNome(String filtroNome) {
        EntityManager em = JPAUtil.getEntityManager();
        List pets = null;
        try {
            
            String textoQuery = "SELECT p FROM Pet p WHERE (:filtro IS NULL OR p.nome LIKE :filtro)";
            Query consulta = em.createQuery(textoQuery);
            
            consulta.setParameter("filtro", filtroNome.isEmpty()? null: "%" + filtroNome + "%");
            pets = consulta.getResultList();
            
        } finally {
            JPAUtil.closeEntityManager();
        }
        
        return pets;
    }    
}
