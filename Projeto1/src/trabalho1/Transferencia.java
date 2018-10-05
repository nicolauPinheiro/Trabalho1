/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabalho1;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

/**
 *
 * @author Nicolau&Beatriz
 */
public class Transferencia extends javax.swing.JFrame {

    /**
     * Creates new form CadastroContaComum
     */
    public Transferencia() {
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

        btnCancelar = new javax.swing.JButton();
        jButtonTransferir = new javax.swing.JButton();
        jLabelTituloComum = new javax.swing.JLabel();
        jLabelValor = new javax.swing.JLabel();
        jTextOrigem = new javax.swing.JTextField();
        jTextValor = new javax.swing.JTextField();
        jTextDestino = new javax.swing.JTextField();
        jLabelNomeComum = new javax.swing.JLabel();
        jLabelNumeroComum = new javax.swing.JLabel();
        jLabelFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar);
        btnCancelar.setBounds(220, 180, 160, 30);

        jButtonTransferir.setText("TRANSFERIR");
        jButtonTransferir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTransferirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonTransferir);
        jButtonTransferir.setBounds(50, 180, 160, 30);

        jLabelTituloComum.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        jLabelTituloComum.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTituloComum.setText("TRANSFERÊNCIA");
        getContentPane().add(jLabelTituloComum);
        jLabelTituloComum.setBounds(140, 10, 190, 40);

        jLabelValor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelValor.setForeground(new java.awt.Color(255, 255, 255));
        jLabelValor.setText("VALOR:");
        getContentPane().add(jLabelValor);
        jLabelValor.setBounds(100, 140, 110, 30);
        getContentPane().add(jTextOrigem);
        jTextOrigem.setBounds(150, 60, 200, 30);
        getContentPane().add(jTextValor);
        jTextValor.setBounds(150, 140, 200, 30);
        getContentPane().add(jTextDestino);
        jTextDestino.setBounds(150, 100, 200, 30);

        jLabelNomeComum.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNomeComum.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNomeComum.setText("DE CONTA:");
        getContentPane().add(jLabelNomeComum);
        jLabelNomeComum.setBounds(70, 60, 80, 30);

        jLabelNumeroComum.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNumeroComum.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNumeroComum.setText("PARA CONTA: ");
        getContentPane().add(jLabelNumeroComum);
        jLabelNumeroComum.setBounds(60, 100, 110, 30);

        jLabelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo.jpg"))); // NOI18N
        getContentPane().add(jLabelFundo);
        jLabelFundo.setBounds(0, 0, 412, 223);

        setSize(new java.awt.Dimension(429, 261));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonTransferirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTransferirActionPerformed
        Principal retornaTitular  = new Principal();
        ConfirmacaoTransferencia dados = new ConfirmacaoTransferencia();
        int origem = parseInt(jTextOrigem.getText());
        int destino = parseInt(jTextDestino.getText());
        double valor = parseDouble(jTextValor.getText());        
        String titular1 = retornaTitular.retornaTitular(origem);
        String titular2 = retornaTitular.retornaTitular(destino);
        dados.recebeValores(origem,destino,valor,titular1,titular2);
        
        dados.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonTransferirActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        Operacoes voltaOperacoes = new Operacoes();
        voltaOperacoes.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroContaComum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroContaComum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroContaComum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroContaComum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Transferencia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton jButtonTransferir;
    private javax.swing.JLabel jLabelFundo;
    private javax.swing.JLabel jLabelNomeComum;
    private javax.swing.JLabel jLabelNumeroComum;
    private javax.swing.JLabel jLabelTituloComum;
    private javax.swing.JLabel jLabelValor;
    private javax.swing.JTextField jTextDestino;
    private javax.swing.JTextField jTextOrigem;
    private javax.swing.JTextField jTextValor;
    // End of variables declaration//GEN-END:variables
}
