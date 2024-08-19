package ohmydog.validation;

import javax.swing.JOptionPane;
import ohmydog.model.Consulta;

public class ValidaConsulta {
    
     public static boolean validaDados(Consulta c) {
        if (c.getData().isBlank() || c.getHora().isBlank()) {
           JOptionPane.showMessageDialog(null, "Erro: Preencha todos os campos!", "Erro!", 2, null);
            return false;
        } else {
            return true;
        }
    }
}
