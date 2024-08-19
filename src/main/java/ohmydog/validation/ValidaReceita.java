package ohmydog.validation;

import javax.swing.JOptionPane;
import ohmydog.model.Receita;

public class ValidaReceita {
    
    public static boolean valida(Receita r) {
        if (r.getReceita().isBlank()) {
            JOptionPane.showMessageDialog(null, "Erro: Preencha o campo 'Receita'.", "Erro!", 2, null);
            return false;
        } else {
            return true;
        }
    }
    
}
