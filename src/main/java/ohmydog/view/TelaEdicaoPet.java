package ohmydog.view;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import ohmydog.model.FabricaJanelas;
import ohmydog.model.Pet;
import ohmydog.model.PetJPA;
import ohmydog.validation.ValidaCadastro;

public class TelaEdicaoPet extends javax.swing.JFrame {

    Pet p = new Pet();

    public TelaEdicaoPet(int id) {
        p = PetJPA.buscar(id);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblCadastro = new javax.swing.JLabel();
        panelPet = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtIdade = new javax.swing.JTextField();
        lblIdade = new javax.swing.JLabel();
        lblPeso = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        lblEspecie = new javax.swing.JLabel();
        txtEspecie = new javax.swing.JTextField();
        lblRaca = new javax.swing.JLabel();
        txtRaca = new javax.swing.JTextField();
        lblSexo = new javax.swing.JLabel();
        txtSexo = new javax.swing.JTextField();
        lblObservacoes = new javax.swing.JLabel();
        txtObservacoes = new javax.swing.JTextField();
        btnSalvar5 = new javax.swing.JButton();
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

        lblCadastro.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        lblCadastro.setForeground(new java.awt.Color(255, 255, 255));
        lblCadastro.setText("Atualizar Cadastro");

        panelPet.setBackground(new java.awt.Color(90, 148, 78));
        panelPet.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do Pet", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Microsoft YaHei", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        lblNome.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblNome.setForeground(new java.awt.Color(255, 255, 255));
        lblNome.setText("Nome:");

        txtNome.setBackground(new java.awt.Color(255, 255, 255));
        txtNome.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtNome.setText(p.getNome());
        txtNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        txtIdade.setBackground(new java.awt.Color(255, 255, 255));
        txtIdade.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtIdade.setText(p.getIdade());
        txtIdade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdadeActionPerformed(evt);
            }
        });

        lblIdade.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblIdade.setForeground(new java.awt.Color(255, 255, 255));
        lblIdade.setText("Idade:");

        lblPeso.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblPeso.setForeground(new java.awt.Color(255, 255, 255));
        lblPeso.setText("Peso:");

        txtPeso.setBackground(new java.awt.Color(255, 255, 255));
        txtPeso.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtPeso.setText(p.getPeso());
        txtPeso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesoActionPerformed(evt);
            }
        });

        lblEspecie.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblEspecie.setForeground(new java.awt.Color(255, 255, 255));
        lblEspecie.setText("Espécie:");

        txtEspecie.setBackground(new java.awt.Color(255, 255, 255));
        txtEspecie.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtEspecie.setText(p.getEspecie());
        txtEspecie.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtEspecie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEspecieActionPerformed(evt);
            }
        });

        lblRaca.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblRaca.setForeground(new java.awt.Color(255, 255, 255));
        lblRaca.setText("Raça:");

        txtRaca.setBackground(new java.awt.Color(255, 255, 255));
        txtRaca.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtRaca.setText(p.getRaca());
        txtRaca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtRaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRacaActionPerformed(evt);
            }
        });

        lblSexo.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblSexo.setForeground(new java.awt.Color(255, 255, 255));
        lblSexo.setText("Sexo:");

        txtSexo.setBackground(new java.awt.Color(255, 255, 255));
        txtSexo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtSexo.setText(p.getSexo());
        txtSexo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSexoActionPerformed(evt);
            }
        });

        lblObservacoes.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblObservacoes.setForeground(new java.awt.Color(255, 255, 255));
        lblObservacoes.setText("Observações:");

        txtObservacoes.setBackground(new java.awt.Color(255, 255, 255));
        txtObservacoes.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtObservacoes.setText(p.getObservacoes());
        txtObservacoes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout panelPetLayout = new javax.swing.GroupLayout(panelPet);
        panelPet.setLayout(panelPetLayout);
        panelPetLayout.setHorizontalGroup(
            panelPetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPetLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(panelPetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtObservacoes)
                    .addGroup(panelPetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblObservacoes)
                        .addGroup(panelPetLayout.createSequentialGroup()
                            .addGroup(panelPetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblNome)
                                .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblIdade)
                                .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblPeso)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(37, 37, 37)
                            .addGroup(panelPetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblEspecie)
                                .addComponent(txtRaca, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblRaca)
                                .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblSexo)))))
                .addGap(37, 37, 37))
        );
        panelPetLayout.setVerticalGroup(
            panelPetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPetLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelPetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPetLayout.createSequentialGroup()
                        .addComponent(lblEspecie)
                        .addGap(3, 3, 3)
                        .addComponent(txtEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPetLayout.createSequentialGroup()
                        .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPetLayout.createSequentialGroup()
                        .addComponent(lblRaca)
                        .addGap(3, 3, 3)
                        .addComponent(txtRaca, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPetLayout.createSequentialGroup()
                        .addComponent(lblIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPetLayout.createSequentialGroup()
                        .addComponent(lblSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPetLayout.createSequentialGroup()
                        .addComponent(lblPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblObservacoes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtObservacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
        );

        btnSalvar5.setBackground(new java.awt.Color(90, 148, 78));
        btnSalvar5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnSalvar5.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar5.setText("Salvar");
        btnSalvar5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255)));
        btnSalvar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvar5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelPet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(201, 201, 201)
                                .addComponent(lblCadastro))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(btnSalvar5, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(lblCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelPet, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvar5)
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdadeActionPerformed

    private void txtPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesoActionPerformed

    private void txtEspecieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEspecieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEspecieActionPerformed

    private void txtRacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRacaActionPerformed

    private void txtSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSexoActionPerformed

    private void btnSalvar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvar5ActionPerformed
        try {
            p.setNome(txtNome.getText());
            p.setIdade(txtIdade.getText());
            p.setPeso(txtPeso.getText());
            p.setEspecie(txtEspecie.getText());
            p.setRaca(txtRaca.getText());
            p.setSexo(txtSexo.getText());

            if (txtObservacoes.getText().isBlank()) {
                p.setObservacoes("Sem observações");
            } else {
                p.setObservacoes(txtObservacoes.getText());
            }

            if (ValidaCadastro.validaDadosPet(p)) {

                if (PetJPA.atualizar(p)) {
                    JOptionPane.showMessageDialog(null, "Cadastro atualizado com sucesso!", "Sucesso!", 1, null);
                    dispose();
                }

            }
        } catch (HeadlessException | ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar cadastro.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSalvar5ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaEdicaoPet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEdicaoPet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEdicaoPet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEdicaoPet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //   new TelaEdicaoPet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCadastro;
    private javax.swing.JLabel lblEspecie;
    private javax.swing.JLabel lblIdade;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblObservacoes;
    private javax.swing.JLabel lblPeso;
    private javax.swing.JLabel lblRaca;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JMenuItem menuFechar;
    private javax.swing.JMenuItem menuPrincipal;
    private javax.swing.JMenuItem menuVoltar;
    private javax.swing.JPanel panelPet;
    private javax.swing.JTextField txtEspecie;
    private javax.swing.JTextField txtIdade;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtObservacoes;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtRaca;
    private javax.swing.JTextField txtSexo;
    // End of variables declaration//GEN-END:variables
}
