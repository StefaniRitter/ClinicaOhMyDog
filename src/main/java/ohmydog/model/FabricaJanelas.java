package ohmydog.model;

import java.awt.Frame;
import javax.swing.JFrame;
import ohmydog.view.TelaAgenda;
import ohmydog.view.TelaCadastro;
import ohmydog.view.TelaClientes;
import ohmydog.view.TelaConsulta;
import ohmydog.view.TelaEdicaoCliente;
import ohmydog.view.TelaEdicaoConsulta;
import ohmydog.view.TelaEdicaoPet;
import ohmydog.view.TelaNovaReceita;
import ohmydog.view.TelaPets;
import ohmydog.view.TelaPrincipal;
import ohmydog.view.TelaReceitas;

public class FabricaJanelas {

    public static void criaTelaPrincipal() {
        TelaPrincipal t = new TelaPrincipal();
        t.setSize(669, 325);
        t.setResizable(false);
        t.setLocationRelativeTo(null);
        t.pack();
        t.setVisible(true);
    }

    public static void criaAgenda() {
        TelaAgenda t = new TelaAgenda();
        t.setSize(673, 463);
        t.setResizable(false);
        t.setLocationRelativeTo(null);
        t.pack();
        t.setVisible(true);
    }

    public static void criaTelaCadastro() {
        TelaCadastro t = new TelaCadastro();
        t.setSize(612, 596);
        t.setResizable(false);
        t.setLocationRelativeTo(null);
        t.pack();
        t.setVisible(true);
    }

    public static void criaTelaClientes() {
        TelaClientes t = new TelaClientes();
        t.setSize(675, 462);
        t.setResizable(false);
        t.setLocationRelativeTo(null);
        t.pack();
        t.setVisible(true);
    }

    public static void criaTelaConsulta() {
        TelaConsulta t = new TelaConsulta();
        t.setSize(667, 462);
        t.setResizable(false);
        t.setLocationRelativeTo(null);
        t.pack();
        t.setVisible(true);
    }

    public static void criaTelaNovaReceita(int id) {
        TelaNovaReceita t = new TelaNovaReceita(id);
        t.setSize(667, 382);
        t.setResizable(false);
        t.setLocationRelativeTo(null);
        t.pack();
        t.setVisible(true);
    }

    public static void criaTelaEdicaoConsulta(int id) {
        TelaEdicaoConsulta t = new TelaEdicaoConsulta(id);
        t.setSize(586, 498);
        t.setResizable(false);
        t.setLocationRelativeTo(null);
        t.pack();
        t.setVisible(true);
    }

    public static void criaTelaEdicaoCliente(int id) {
        TelaEdicaoCliente t = new TelaEdicaoCliente(id);
        t.setSize(613, 329);
        t.setResizable(false);
        t.setLocationRelativeTo(null);
        t.pack();
        t.setVisible(true);
    }

    public static void criaTelaEdicaoPet(int id) {
        TelaEdicaoPet t = new TelaEdicaoPet(id);
        t.setSize(610, 384);
        t.setResizable(false);
        t.setLocationRelativeTo(null);
        t.pack();
        t.setVisible(true);
    }

    public static void criaTelaPets() {
        TelaPets t = new TelaPets();
        t.setSize(674, 461);
        t.setResizable(false);
        t.setLocationRelativeTo(null);
        t.pack();
        t.setVisible(true);
    }

    public static void criaTelaReceitas() {
        TelaReceitas t = new TelaReceitas();
        t.setSize(677, 461);
        t.setResizable(false);
        t.setLocationRelativeTo(null);
        t.pack();
        t.setVisible(true);
    }

    public static void fecharTodos() {
        Frame[] frames = Frame.getFrames();
        for (Frame frame : frames) {
            if (frame instanceof JFrame) {
                frame.dispose();
            }
        }
    }
}
