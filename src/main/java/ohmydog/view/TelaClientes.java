package ohmydog.view;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import ohmydog.model.Cliente;
import ohmydog.model.ClienteJPA;
import ohmydog.model.ConsultaJPA;
import ohmydog.model.FabricaJanelas;
import ohmydog.model.PetJPA;
import ohmydog.model.ReceitaJPA;

public class TelaClientes extends javax.swing.JFrame {

    public TelaClientes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelTitulo = new javax.swing.JPanel();
        lblLista = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaClientes = new javax.swing.JTable();
        lblNomePet = new javax.swing.JLabel();
        txtPesquisar = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        panelBotoes = new javax.swing.JPanel();
        btnExcluir = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuVoltar = new javax.swing.JMenuItem();
        menuFechar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(56, 135, 40));
        setUndecorated(true);
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jPanel1.setBackground(new java.awt.Color(56, 135, 40));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        panelTitulo.setBackground(new java.awt.Color(56, 135, 40));
        panelTitulo.setAutoscrolls(true);

        lblLista.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        lblLista.setForeground(new java.awt.Color(255, 255, 255));
        lblLista.setText("Lista de Clientes");

        tabelaClientes.setBackground(new java.awt.Color(255, 255, 255));
        tabelaClientes.setForeground(new java.awt.Color(0, 0, 0));
        tabelaClientes.setModel(montarTabela());
        tabelaClientes.setSelectionBackground(new java.awt.Color(150, 193, 107));
        tabelaClientes.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tabelaClientesFocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaClientes);

        lblNomePet.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        lblNomePet.setForeground(new java.awt.Color(255, 255, 255));
        lblNomePet.setText("Nome do Cliente:");

        txtPesquisar.setBackground(new java.awt.Color(255, 255, 255));
        txtPesquisar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtPesquisar.setSelectionColor(new java.awt.Color(255, 255, 255));

        btnPesquisar.setBackground(new java.awt.Color(56, 135, 40));
        btnPesquisar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255)));
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTituloLayout = new javax.swing.GroupLayout(panelTitulo);
        panelTitulo.setLayout(panelTituloLayout);
        panelTituloLayout.setHorizontalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 649, Short.MAX_VALUE)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addGroup(panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTituloLayout.createSequentialGroup()
                        .addComponent(lblNomePet, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelTituloLayout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(lblLista)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelTituloLayout.setVerticalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(lblLista)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPesquisar)
                    .addGroup(panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblNomePet, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(txtPesquisar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE))
        );

        panelBotoes.setBackground(new java.awt.Color(56, 135, 40));

        btnExcluir.setBackground(new java.awt.Color(218, 1, 1));
        btnExcluir.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setText("Excluir Cadastro");
        btnExcluir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 1, 1), new java.awt.Color(255, 1, 1), new java.awt.Color(255, 1, 1), java.awt.Color.red));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(56, 135, 40));
        btnEditar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar Cadastro");
        btnEditar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(78, 181, 57), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255)));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBotoesLayout = new javax.swing.GroupLayout(panelBotoes);
        panelBotoes.setLayout(panelBotoesLayout);
        panelBotoesLayout.setHorizontalGroup(
            panelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBotoesLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 164, Short.MAX_VALUE)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );
        panelBotoesLayout.setVerticalGroup(
            panelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBotoes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(panelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenuBar1.setBackground(new java.awt.Color(56, 135, 40));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));

        jMenu1.setBackground(new java.awt.Color(56, 135, 40));
        jMenu1.setForeground(new java.awt.Color(255, 255, 255));
        jMenu1.setText("Opções");

        menuVoltar.setBackground(new java.awt.Color(153, 153, 153));
        menuVoltar.setForeground(new java.awt.Color(255, 255, 255));
        menuVoltar.setText("Voltar para a Página Inicial");
        menuVoltar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menuVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVoltarActionPerformed(evt);
            }
        });
        jMenu1.add(menuVoltar);

        menuFechar.setBackground(new java.awt.Color(204, 0, 0));
        menuFechar.setForeground(new java.awt.Color(255, 255, 255));
        menuFechar.setText("Fechar Sistema");
        menuFechar.setBorder(null);
        menuFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFecharActionPerformed(evt);
            }
        });
        jMenu1.add(menuFechar);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        try {
            int id = getPosicao();
            int resposta = JOptionPane.showConfirmDialog(null, "Tem certeza de que deseja excluir esse cadastro?");
            if (resposta == 0) {
                
                ReceitaJPA.excluirReceitaCliente(id);
                ConsultaJPA.excluirConsultaCliente(id);
                PetJPA.excluirPetCliente(id);
                ClienteJPA.excluirCliente(id);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Selecione o cadastro que deseja excluir!", "Erro!", 2, null);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void menuVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_menuVoltarActionPerformed

    private void menuFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFecharActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuFecharActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        String filtro = txtPesquisar.getText();
        tabelaClientes.setModel(montarTabelaFiltrada(filtro));
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void tabelaClientesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tabelaClientesFocusGained

    }//GEN-LAST:event_tabelaClientesFocusGained

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        try {
            FabricaJanelas.criaTelaEdicaoCliente(getPosicao());
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Por favor, selecione  um cliente para atualizar!", "Erro!", 2, null);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        tabelaClientes.setModel(montarTabela());
    }//GEN-LAST:event_formWindowGainedFocus

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaClientes().setVisible(true);
            }
        });
    }

    private int getPosicao() {
        int posicao = tabelaClientes.getSelectedRow();
        return Integer.parseInt((String) tabelaClientes.getValueAt(posicao, 0));
    }

    private DefaultTableModel montarTabelaFiltrada(String filtro) {
        String[] colunas = {"ID", "Nome", "CPF", "Endereço", "Telefone", "Email"};

        DefaultTableModel tabela = new DefaultTableModel(colunas, 0);

        List<Cliente> lista = ClienteJPA.listarClientesNome(filtro);

        for (int i = 0; i < lista.size(); i++) {

            Cliente c = lista.get(i);

            String[] linha = {
                Integer.toString(c.getId()),
                c.getNome(),
                c.getCpf(),
                c.getEndereco(),
                c.getTelefone(),
                c.getEmail()
            };

            tabela.addRow(linha);
        }
        return tabela;
    }

    private DefaultTableModel montarTabela() {
        String[] colunas = {"ID", "Nome", "CPF", "Endereço", "Telefone", "Email"};

        DefaultTableModel tabela = new DefaultTableModel(colunas, 0);

        List<Cliente> lista = ClienteJPA.listarClientes();

        for (int i = 0; i < lista.size(); i++) {

            Cliente c = lista.get(i);

            String[] linha = {
                Integer.toString(c.getId()),
                c.getNome(),
                c.getCpf(),
                c.getEndereco(),
                c.getTelefone(),
                c.getEmail()
            };

            tabela.addRow(linha);
        }
        return tabela;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblLista;
    private javax.swing.JLabel lblNomePet;
    private javax.swing.JMenuItem menuFechar;
    private javax.swing.JMenuItem menuVoltar;
    private javax.swing.JPanel panelBotoes;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JTable tabelaClientes;
    private javax.swing.JTextField txtPesquisar;
    // End of variables declaration//GEN-END:variables
}
