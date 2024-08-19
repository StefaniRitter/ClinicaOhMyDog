package ohmydog.validation;

import javax.swing.JOptionPane;
import ohmydog.model.Cliente;
import ohmydog.model.Pet;

public class ValidaCadastro {

    public static boolean validaDadosPet(Pet p) {
        if (p.getNome().isBlank() || p.getIdade().isBlank() || p.getPeso().isBlank() || p.getEspecie().isBlank()
                || p.getRaca().isBlank() || p.getSexo().isBlank()) {
            JOptionPane.showMessageDialog(null, "Erro: Preencha todos os campos!", "Erro!", 2, null);
            return false;
        } else {
            return true;
        }
    }

    public static boolean validaDadosCliente(Cliente c) {
        if (c.getNome().isBlank() || c.getEndereco().isBlank()) {
            JOptionPane.showMessageDialog(null, "Erro: Preencha todos os campos!", "Erro!", 2, null);
            return false;
        } else {
            return true;
        }
    }

    public static boolean validaCpf(Cliente c) {
        if (!c.getCpf().matches("[0-9]{3}[.][0-9]{3}[.][0-9]{3}[-][0-9]{2}")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo 'CPF' no formato XXX.XXX.XXX-XX", "Erro!", 2, null);
            return false;
        } else {
            return true;
        }
    }

    public static boolean validaTelefone(Cliente c) {
        if (!c.getTelefone().matches("[(][0-9]{2}[)][0-9]{5}[-][0-9]{4}") || !c.getTelefone().matches("[(][0-9]{2}[) ][0-9]{5}[-][0-9]{4}")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo 'Telefone' no formato (00)00000-0000", "Erro!", 2, null);
            return false;
        } else {
            return true;
        }
    }

    public static boolean validaEmail(Cliente c) {
        if (!c.getEmail().matches("^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[\\w-]+\\.)+[\\w]{2,6}$")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo 'Email' no formato correto!", "Erro!", 2, null);
            return false;
        } else {
            return true;
        }
    }

}
