package ohmydog.model;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;

public class ConsultaJPA {
    
    public static boolean cadastrarConsulta(Consulta c) {
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
    
     public static Consulta buscar(int id) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            return em.find(Consulta.class, id);
        } finally {
            JPAUtil.closeEntityManager();
        }
    }
     
      public static Consulta buscarPorNome(String nome) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
             return em.find(Consulta.class, nome);
        } finally {
            JPAUtil.closeEntityManager();
        }
    }

    public static boolean atualizar(Consulta c) {
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

    public static boolean excluirConsulta(int id) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            Consulta c = em.find(Consulta.class, id);
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
    
    public static boolean excluirConsultaCliente(int idCliente) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
           
            String textoQuery = "SELECT c FROM Consulta c WHERE c.pet.cliente.id = :idCliente";
            List<Consulta> consultas = em.createQuery(textoQuery, Consulta.class)
                    .setParameter("idCliente", idCliente)
                    .getResultList();

            em.getTransaction().begin();
            for (Consulta c : consultas) {
                em.remove(c);
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
        
     public static List<Consulta> listarConsultas() {
        EntityManager em = JPAUtil.getEntityManager();
        List consultas = null;
        try {
            
            String textoQuery = "SELECT c FROM Consulta c";
            Query retorno = em.createQuery(textoQuery);
            consultas = retorno.getResultList();
            
        } finally {
            JPAUtil.closeEntityManager();
        }       
        return consultas;
    }
    
      public static List<Consulta> listarConsultasNome(String filtroNome) {
        EntityManager em = JPAUtil.getEntityManager();
        List consultas = null;
        try {
            
            String textoQuery = "SELECT c FROM Consulta c WHERE (:filtro IS NULL OR c.pet.nome LIKE :filtro)";
            Query retorno = em.createQuery(textoQuery);
            
            retorno.setParameter("filtro", filtroNome.isEmpty()? null: "%" + filtroNome + "%");
            consultas = retorno.getResultList();
            
        } finally {
            JPAUtil.closeEntityManager();
        }
        
        return consultas;
    }    
}
