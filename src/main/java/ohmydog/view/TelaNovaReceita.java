package ohmydog.view;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import ohmydog.model.Consulta;
import ohmydog.model.ConsultaJPA;
import ohmydog.model.FabricaJanelas;
import ohmydog.model.Receita;
import ohmydog.model.ReceitaJPA;
import ohmydog.validation.ValidaReceita;

public class TelaNovaReceita extends javax.swing.JFrame {

    Consulta c = new Consulta();

    public TelaNovaReceita(int id) {
        c = ConsultaJPA.buscar(id);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelTitulo2 = new javax.swing.JPanel();
        lblNovaConsulta2 = new javax.swing.JLabel();
        panelDados = new javax.swing.JPanel();
        txtPaciente = new javax.swing.JTextField();
        lblPaciente = new javax.swing.JLabel();
        lblReceita = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtReceita = new javax.swing.JTextArea();
        panelbotoes = new javax.swing.JPanel();
        btnSalvar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuVoltar = new javax.swing.JMenuItem();
        menuPrincipal = new javax.swing.JMenuItem();
        menuFechar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(90, 148, 78));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        panelTitulo2.setBackground(new java.awt.Color(90, 148, 78));

        lblNovaConsulta2.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        lblNovaConsulta2.setForeground(new java.awt.Color(255, 255, 255));
        lblNovaConsulta2.setText("Nova Receita");

        javax.swing.GroupLayout panelTitulo2Layout = new javax.swing.GroupLayout(panelTitulo2);
        panelTitulo2.setLayout(panelTitulo2Layout);
        panelTitulo2Layout.setHorizontalGroup(
            panelTitulo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTitulo2Layout.createSequentialGroup()
                .addGap(258, 258, 258)
                .addComponent(lblNovaConsulta2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelTitulo2Layout.setVerticalGroup(
            panelTitulo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTitulo2Layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(lblNovaConsulta2))
        );

        panelDados.setBackground(new java.awt.Color(90, 148, 78));
        panelDados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        txtPaciente.setBackground(new java.awt.Color(255, 255, 255));
        txtPaciente.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtPaciente.setText(c.getPet().getNome());
        txtPaciente.setEnabled(false);

        lblPaciente.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblPaciente.setForeground(new java.awt.Color(255, 255, 255));
        lblPaciente.setText("Paciente:");

        lblReceita.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblReceita.setForeground(new java.awt.Color(255, 255, 255));
        lblReceita.setText("Receita:");

        txtReceita.setBackground(new java.awt.Color(255, 255, 255));
        txtReceita.setColumns(20);
        txtReceita.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtReceita.setRows(5);
        jScrollPane1.setViewportView(txtReceita);

        javax.swing.GroupLayout panelDadosLayout = new javax.swing.GroupLayout(panelDados);
        panelDados.setLayout(panelDadosLayout);
        panelDadosLayout.setHorizontalGroup(
            panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDadosLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDadosLayout.createSequentialGroup()
                        .addComponent(lblReceita)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDadosLayout.createSequentialGroup()
                        .addGroup(panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelDadosLayout.createSequentialGroup()
                                .addGroup(panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPaciente))
                                .addGap(0, 382, Short.MAX_VALUE)))
                        .addGap(31, 31, 31))))
        );
        panelDadosLayout.setVerticalGroup(
            panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblReceita, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        panelbotoes.setBackground(new java.awt.Color(90, 148, 78));

        btnSalvar.setBackground(new java.awt.Color(90, 148, 78));
        btnSalvar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setText("Salvar");
        btnSalvar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255)));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelbotoesLayout = new javax.swing.GroupLayout(panelbotoes);
        panelbotoes.setLayout(panelbotoesLayout);
        panelbotoesLayout.setHorizontalGroup(
            panelbotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelbotoesLayout.createSequentialGroup()
                .addGap(238, 238, 238)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelbotoesLayout.setVerticalGroup(
            panelbotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelbotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelbotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelTitulo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(panelDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(panelTitulo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelbotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(90, 148, 78));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));

        jMenu1.setBackground(new java.awt.Color(90, 148, 78));
        jMenu1.setForeground(new java.awt.Color(255, 255, 255));
        jMenu1.setText("Opções");

        menuVoltar.setBackground(new java.awt.Color(153, 153, 153));
        menuVoltar.setForeground(new java.awt.Color(255, 255, 255));
        menuVoltar.setText("Voltar");
        menuVoltar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menuVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVoltarActionPerformed(evt);
            }
        });
        jMenu1.add(menuVoltar);

        menuPrincipal.setBackground(new java.awt.Color(153, 153, 153));
        menuPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        menuPrincipal.setText("Ir para a Página Inicial");
        menuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPrincipalActionPerformed(evt);
            }
        });
        jMenu1.add(menuPrincipal);

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        try {
            Receita r = new Receita();
            r.setReceita(txtReceita.getText());
            r.setConsulta(c);
            if (ValidaReceita.valida(r)) {

                if (ReceitaJPA.cadastrarReceita(r)) {
                    JOptionPane.showMessageDialog(null, "Receita cadastrada com sucesso!", "Sucesso!", 1, null);
                    dispose();
                }

            }
        } catch (HeadlessException | ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar. Por favor, preencha os dados corretamente!", "Erro!", 2, null);
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void menuVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_menuVoltarActionPerformed

    private void menuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPrincipalActionPerformed
        FabricaJanelas.fecharTodos();
        FabricaJanelas.criaTelaPrincipal();
    }//GEN-LAST:event_menuPrincipalActionPerformed

    private void menuFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFecharActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuFecharActionPerformed

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
            java.util.logging.Logger.getLogger(TelaNovaReceita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaNovaReceita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaNovaReceita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaNovaReceita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new TelaNovaReceita().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNovaConsulta2;
    private javax.swing.JLabel lblPaciente;
    private javax.swing.JLabel lblReceita;
    private javax.swing.JMenuItem menuFechar;
    private javax.swing.JMenuItem menuPrincipal;
    private javax.swing.JMenuItem menuVoltar;
    private javax.swing.JPanel panelDados;
    private javax.swing.JPanel panelTitulo2;
    private javax.swing.JPanel panelbotoes;
    private javax.swing.JTextField txtPaciente;
    private javax.swing.JTextArea txtReceita;
    // End of variables declaration//GEN-END:variables
}
