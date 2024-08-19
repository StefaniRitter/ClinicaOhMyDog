package ohmydog.model;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;

public class ReceitaJPA {

    public static boolean cadastrarReceita(Receita r) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(r);
            em.getTransaction().commit();
            return true;
        } catch (Exception e) {
            em.getTransaction().rollback();
            return false;
        } finally {
            JPAUtil.closeEntityManager();
        }
    }

    public static Receita buscar(int id) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            return em.find(Receita.class, id);
        } finally {
            JPAUtil.closeEntityManager();
        }
    }

    public static boolean atualizar(Receita r) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(r);
            em.getTransaction().commit();
            return true;
        } catch (Exception e) {
            em.getTransaction().rollback();
            return false;
        } finally {
            JPAUtil.closeEntityManager();
        }
    }

    public static boolean excluirReceita(int id) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            Receita r = em.find(Receita.class, id);
            if (r != null) {
                em.getTransaction().begin();
                em.remove(r);
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
    
      public static boolean excluirReceitaConsulta(int idConsulta) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            // Busca todas as receitas associadas à consulta pelo ID da consulta
            String textoQuery = "SELECT r FROM Receita r WHERE r.consulta.id = :idConsulta";
            List<Receita> receitas = em.createQuery(textoQuery, Receita.class)
                    .setParameter("idConsulta", idConsulta)
                    .getResultList();

            // Para cada receita encontrada, remove-a
            em.getTransaction().begin();
            for (Receita r : receitas) {
                em.remove(r);
            }
            em.getTransaction().commit();
            return true;
        } catch (Exception e) {
            em.getTransaction().rollback();
            return false;
        } finally {
            JPAUtil.closeEntityManager();
        }
    }

    public static boolean excluirReceitaCliente(int idCliente) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            
            String textoQuery = "SELECT r FROM Receita r WHERE r.consulta.pet.cliente.id = :idCliente";
            List<Receita> receitas = em.createQuery(textoQuery, Receita.class)
                    .setParameter("idCliente", idCliente)
                    .getResultList();

            // Para cada receita encontrada, remove-a
            em.getTransaction().begin();
            for (Receita r : receitas) {
                em.remove(r);
            }
            em.getTransaction().commit();
            return true;
        } catch (Exception e) {
            em.getTransaction().rollback();
            return false;
        } finally {
            JPAUtil.closeEntityManager();
        }
    }

    public static List<Receita> listarReceitas() {
        EntityManager em = JPAUtil.getEntityManager();
        List receitas = null;
        try {

            String textoQuery = "SELECT r FROM Receita r";
            Query consulta = em.createQuery(textoQuery);
            receitas = consulta.getResultList();

        } finally {
            JPAUtil.closeEntityManager();
        }
        return receitas;
    }

    public static List<Receita> listarReceitasNome(String filtroNome) {
        EntityManager em = JPAUtil.getEntityManager();
        List receitas = null;
        try {

            String textoQuery = "SELECT r FROM Receita r WHERE (:filtro IS NULL OR r.consulta.pet.nome LIKE :filtro)";
            Query consulta = em.createQuery(textoQuery);

            consulta.setParameter("filtro", filtroNome.isEmpty() ? null : "%" + filtroNome + "%");
            receitas = consulta.getResultList();

        } finally {
            JPAUtil.closeEntityManager();
        }

        return receitas;
    }

}
