/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.grupointegrado.view;

import br.com.grupointegrado.dao.ArtigoDao;
import br.com.grupointegrado.dao.ClienteDao;
import br.com.grupointegrado.dao.CompraDao;
import br.com.grupointegrado.dao.FidelidadeDao;
import br.com.grupointegrado.model.Artigo;
import br.com.grupointegrado.model.Cliente;
import br.com.grupointegrado.model.Compra;
import br.com.grupointegrado.model.Fidelidade;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author higordealmeida
 */
public class CompraView extends javax.swing.JFrame {

    private Compra compra;
    private CompraDao compraDao;
    private Cliente cliente;
    private ClienteDao clienteDao;
    private Fidelidade fidelidade;
    private FidelidadeDao fidelidadeDao;
    private Artigo artigo;
    private ArtigoDao artigoDao;
    
    /**
     * Creates new form PedidoView
     */
    public CompraView() {
        compra = new Compra();
        cliente = new Cliente();
        fidelidade = new Fidelidade();
        artigo = new Artigo();
        
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextClienteCodigo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextClienteNome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextClienteCpf = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextArtigoCodigo = new javax.swing.JTextField();
        jTextArtigoDescricao = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextArtigoValor = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextCompraQuantidade = new javax.swing.JTextField();
        jButtonCadastrar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel1.setText("Gerar Compra");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel2.setText("Cliente");

        jLabel3.setText("Código");

        jTextClienteCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextClienteCodigoFocusLost(evt);
            }
        });

        jLabel4.setText("Nome");
        jLabel4.setEnabled(false);

        jTextClienteNome.setEnabled(false);

        jLabel5.setText("CPF");
        jLabel5.setEnabled(false);

        jTextClienteCpf.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel6.setText("Artigo");

        jLabel7.setText("Código");

        jTextArtigoCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextArtigoCodigoFocusLost(evt);
            }
        });

        jTextArtigoDescricao.setEnabled(false);

        jLabel8.setText("Descrição");
        jLabel8.setEnabled(false);

        jTextArtigoValor.setEnabled(false);

        jLabel9.setText("Valor");
        jLabel9.setEnabled(false);

        jLabel10.setText("Qtd.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextClienteCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextClienteNome, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextClienteCpf))
                    .addComponent(jSeparator1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextArtigoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextArtigoDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextArtigoValor, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextCompraQuantidade, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextClienteCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTextClienteNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTextClienteCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextArtigoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jTextArtigoDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jTextArtigoValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jTextCompraQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jButtonCadastrar.setText("Cadastrar Pedido");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonCadastrar)
                        .addGap(36, 36, 36)
                        .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(268, 268, 268)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCadastrar)
                    .addComponent(jButtonCancelar))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        
        try {
            compraDao = new CompraDao();
            clienteDao = new ClienteDao();
            artigoDao = new ArtigoDao();
            
            cliente = clienteDao.findOne( Integer.parseInt( jTextClienteCodigo.getText() ) );
            artigo = artigoDao.findOne( Integer.parseInt( jTextArtigoCodigo.getText() ) );
            
            compra.setQuantidade( Integer.parseInt( jTextCompraQuantidade.getText() ) );
            compra.setCliente( cliente );
            compra.setArtigo( artigo );
            
            double desconto = 1.00;
            System.out.println(desconto);
            
            
            if ( compra.getCliente().getFidelidade().getBonus() > 1 ) {
                desconto = 1.00 + ( compra.getCliente().getFidelidade().getBonus() / 100 );
            }
            
            compra.setValor( ( compra.getQuantidade() *  artigo.getPreco() ) * desconto );
            
            compraDao.insert(compra);
            
            JOptionPane.showMessageDialog( this, "Compra cadastrada com sucesso.");
            
            jTextArtigoCodigo.setText("");
            jTextArtigoDescricao.setText("");
            jTextArtigoValor.setText("");
            jTextClienteCodigo.setText("");
            jTextClienteNome.setText("");
            jTextClienteCpf.setText("");
            jTextCompraQuantidade.setText("");
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CompraView.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jTextClienteCodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextClienteCodigoFocusLost
        try {
            clienteDao = new ClienteDao();
            
            cliente = clienteDao.findOne( Integer.parseInt( jTextClienteCodigo.getText() ) );
            
            jTextClienteCodigo.setText( String.valueOf( cliente.getCodigo() ) );
            jTextClienteNome.setText( cliente.getNome() );
            jTextClienteCpf.setText( cliente.getCpf() );
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CompraView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTextClienteCodigoFocusLost

    private void jTextArtigoCodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextArtigoCodigoFocusLost
        try {
            artigoDao = new ArtigoDao();
            
            artigo = artigoDao.findOne( Integer.parseInt( jTextArtigoCodigo.getText() ) );
            
            jTextArtigoCodigo.setText( String.valueOf( artigo.getCodigo() ) );
            jTextArtigoDescricao.setText( artigo.getDescricao() );
            jTextArtigoValor.setText( String.valueOf( artigo.getPreco() ) );
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CompraView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTextArtigoCodigoFocusLost

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(CompraView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CompraView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CompraView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CompraView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CompraView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextArtigoCodigo;
    private javax.swing.JTextField jTextArtigoDescricao;
    private javax.swing.JTextField jTextArtigoValor;
    private javax.swing.JTextField jTextClienteCodigo;
    private javax.swing.JTextField jTextClienteCpf;
    private javax.swing.JTextField jTextClienteNome;
    private javax.swing.JTextField jTextCompraQuantidade;
    // End of variables declaration//GEN-END:variables
}