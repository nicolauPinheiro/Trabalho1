/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*/
package Trabalho1;

/**
 *
 * @author Nicolau
 */
public class Operacoes extends javax.swing.JFrame {

    /**
     * Creates new form CadastroContaComum
     */
    public Operacoes() {
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

        jLabelTituloOperacao = new javax.swing.JLabel();
        jButtonSaque = new javax.swing.JButton();
        jButtonDeposito = new javax.swing.JButton();
        jButtonTransferencia = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jButtonVerSaldos = new javax.swing.JButton();
        jButtonReajustar1 = new javax.swing.JButton();
        jLabelSaque = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabelTituloOperacao.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        jLabelTituloOperacao.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTituloOperacao.setText("SELECIONE A OPERAÇÃO DESEJADA");
        getContentPane().add(jLabelTituloOperacao);
        jLabelTituloOperacao.setBounds(90, 10, 250, 20);

        jButtonSaque.setBackground(new java.awt.Color(0, 51, 51));
        jButtonSaque.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSaque.setText("SAQUE");
        jButtonSaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaqueActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSaque);
        jButtonSaque.setBounds(20, 50, 110, 40);

        jButtonDeposito.setBackground(new java.awt.Color(0, 102, 153));
        jButtonDeposito.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDeposito.setText("DEPÓSITO");
        jButtonDeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDepositoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDeposito);
        jButtonDeposito.setBounds(290, 50, 110, 40);

        jButtonTransferencia.setBackground(new java.awt.Color(51, 51, 0));
        jButtonTransferencia.setForeground(new java.awt.Color(255, 255, 255));
        jButtonTransferencia.setText("TRANSFERÊNCIA");
        jButtonTransferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTransferenciaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonTransferencia);
        jButtonTransferencia.setBounds(140, 50, 140, 40);

        jButtonSair.setBackground(new java.awt.Color(51, 0, 51));
        jButtonSair.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSair.setText("SAIR");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSair);
        jButtonSair.setBounds(140, 150, 150, 40);

        jButtonVerSaldos.setBackground(new java.awt.Color(0, 51, 102));
        jButtonVerSaldos.setForeground(new java.awt.Color(255, 255, 255));
        jButtonVerSaldos.setText("VER SALDOS");
        jButtonVerSaldos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerSaldosActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVerSaldos);
        jButtonVerSaldos.setBounds(60, 100, 150, 40);

        jButtonReajustar1.setBackground(new java.awt.Color(0, 51, 51));
        jButtonReajustar1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonReajustar1.setText("REAJUSTAR");
        jButtonReajustar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReajustar1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonReajustar1);
        jButtonReajustar1.setBounds(220, 100, 150, 40);

        jLabelSaque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo.jpg"))); // NOI18N
        getContentPane().add(jLabelSaque);
        jLabelSaque.setBounds(0, 0, 412, 223);

        setSize(new java.awt.Dimension(429, 261));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButtonSaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaqueActionPerformed
       Sacar proximaTela = new Sacar();
       proximaTela.setVisible(true);
       dispose();
    }//GEN-LAST:event_jButtonSaqueActionPerformed

    private void jButtonReajustar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReajustar1ActionPerformed
      Reajustar pTela = new Reajustar();
      pTela.setVisible(true);
      dispose();
    }//GEN-LAST:event_jButtonReajustar1ActionPerformed

    private void jButtonDepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDepositoActionPerformed
        Deposito pTela = new Deposito();
        pTela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonDepositoActionPerformed

    private void jButtonTransferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTransferenciaActionPerformed
        Transferencia pTela = new Transferencia();
        pTela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonTransferenciaActionPerformed

    private void jButtonVerSaldosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerSaldosActionPerformed
        verSaldo pTela = new verSaldo();
        pTela.preencheTabela();
        pTela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonVerSaldosActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        Principal encerrar = new Principal();
        encerrar.encerrar();
    }//GEN-LAST:event_jButtonSairActionPerformed
    
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
                new Operacoes().setVisible(true);                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDeposito;
    private javax.swing.JButton jButtonReajustar1;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonSaque;
    private javax.swing.JButton jButtonTransferencia;
    private javax.swing.JButton jButtonVerSaldos;
    private javax.swing.JLabel jLabelSaque;
    private javax.swing.JLabel jLabelTituloOperacao;
    // End of variables declaration//GEN-END:variables
}
