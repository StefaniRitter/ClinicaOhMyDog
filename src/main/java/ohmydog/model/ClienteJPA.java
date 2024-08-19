package ohmydog.model;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;

public class ClienteJPA {

    public static boolean cadastrarCliente(Cliente c) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(c);
            em.getTransaction().commit();
            return true;
        } catch (Exception e) {
            em.getTransaction().rollback();
            return false;
        } finally {
            JPAUtil.closeEntityManager();
        }
    }

    public static Cliente buscar(int id) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            return em.find(Cliente.class, id);
        } finally {
            JPAUtil.closeEntityManager();
        }
    }

    public static boolean atualizar(Cliente c) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(c);
            em.getTransaction().commit();
            return true;
        } catch (Exception e) {
            em.getTransaction().rollback();
            return false;
        } finally {
            JPAUtil.closeEntityManager();
        }
    }

    public static boolean excluirCliente(int id) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            Cliente c = em.find(Cliente.class, id);
            if (c != null) {
                em.getTransaction().begin();
                em.remove(c);
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
    
    public static List<Cliente> listarClientes() {
        EntityManager em = JPAUtil.getEntityManager();
        List clientes = null;
        try {
            
            String textoQuery = "SELECT c FROM Cliente c";
            Query consulta = em.createQuery(textoQuery);
            clientes = consulta.getResultList();
            
        } finally {
            JPAUtil.closeEntityManager();
        }       
        return clientes;
    }
    
      public static List<Cliente> listarClientesNome(String filtroNome) {
        EntityManager em = JPAUtil.getEntityManager();
        List clientes = null;
        try {
            
            String textoQuery = "SELECT c FROM Cliente c WHERE (:filtro IS NULL OR c.nome LIKE :filtro)";
            Query consulta = em.createQuery(textoQuery);
            
            consulta.setParameter("filtro", filtroNome.isEmpty()? null: "%" + filtroNome + "%");
            clientes = consulta.getResultList();
            
        } finally {
            JPAUtil.closeEntityManager();
        }
        
        return clientes;
    }    
}
