/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabalho1;

/**
 *
 * @author Nicolau&Beatriz
 */
public class SacarSucesso extends javax.swing.JFrame {

    /**
     * Creates new form CadastroContaComum
     */
    public SacarSucesso() {
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

        jButtonVoltarOperacoes = new javax.swing.JButton();
        jLabelTituloSucesso = new javax.swing.JLabel();
        jLabelFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButtonVoltarOperacoes.setText("VOLTAR AS OPERAÇÕES");
        jButtonVoltarOperacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarOperacoesActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVoltarOperacoes);
        jButtonVoltarOperacoes.setBounds(100, 140, 190, 30);

        jLabelTituloSucesso.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        jLabelTituloSucesso.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTituloSucesso.setText("SAQUE REALIZADO COM SUCESSO!");
        getContentPane().add(jLabelTituloSucesso);
        jLabelTituloSucesso.setBounds(80, 50, 270, 80);

        jLabelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo.jpg"))); // NOI18N
        getContentPane().add(jLabelFundo);
        jLabelFundo.setBounds(0, 0, 412, 223);

        setSize(new java.awt.Dimension(429, 261));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarOperacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarOperacoesActionPerformed
        Operacoes proximaTela = new Operacoes();
        proximaTela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonVoltarOperacoesActionPerformed

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
                new CadastroContaComum().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonVoltarOperacoes;
    private javax.swing.JLabel jLabelFundo;
    private javax.swing.JLabel jLabelTituloSucesso;
    // End of variables declaration//GEN-END:variables
}
