/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabalho1;

import java.text.DecimalFormat;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author Nicolau&Beatriz
 */
public class verSaldo extends javax.swing.JFrame {

    /**
     * Creates new form CadastroContaComum
     */
    public verSaldo() {
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

        jButtonVoltar = new javax.swing.JButton();
        saldoTres = new javax.swing.JLabel();
        saldoUm = new javax.swing.JLabel();
        saldoDois = new javax.swing.JLabel();
        clienteUm = new javax.swing.JLabel();
        clienteDois = new javax.swing.JLabel();
        clienteTres = new javax.swing.JLabel();
        tipoContaCliente = new javax.swing.JLabel();
        tipoContaClienteDois = new javax.swing.JLabel();
        tipoContaClienteTres = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        tituloCliente = new javax.swing.JLabel();
        tipoConta = new javax.swing.JLabel();
        tituloSaldo = new javax.swing.JLabel();
        jLabelFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButtonVoltar.setText("VOLTAR");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVoltar);
        jButtonVoltar.setBounds(150, 180, 130, 30);

        saldoTres.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        saldoTres.setForeground(new java.awt.Color(255, 255, 255));
        saldoTres.setText("SALDO3");
        getContentPane().add(saldoTres);
        saldoTres.setBounds(330, 130, 120, 30);

        saldoUm.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        saldoUm.setForeground(new java.awt.Color(255, 255, 255));
        saldoUm.setText("SALDO1");
        getContentPane().add(saldoUm);
        saldoUm.setBounds(330, 50, 120, 30);

        saldoDois.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        saldoDois.setForeground(new java.awt.Color(255, 255, 255));
        saldoDois.setText("SALDO2");
        getContentPane().add(saldoDois);
        saldoDois.setBounds(330, 90, 120, 30);

        clienteUm.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        clienteUm.setForeground(new java.awt.Color(255, 255, 255));
        clienteUm.setText("CLIENTE1");
        getContentPane().add(clienteUm);
        clienteUm.setBounds(40, 50, 120, 30);

        clienteDois.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        clienteDois.setForeground(new java.awt.Color(255, 255, 255));
        clienteDois.setText("CLIENTE2");
        getContentPane().add(clienteDois);
        clienteDois.setBounds(40, 90, 120, 30);

        clienteTres.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        clienteTres.setForeground(new java.awt.Color(255, 255, 255));
        clienteTres.setText("CLIENTE3");
        getContentPane().add(clienteTres);
        clienteTres.setBounds(40, 130, 120, 30);

        tipoContaCliente.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        tipoContaCliente.setForeground(new java.awt.Color(255, 255, 255));
        tipoContaCliente.setText("CONTA COMUM");
        getContentPane().add(tipoContaCliente);
        tipoContaCliente.setBounds(160, 50, 120, 30);

        tipoContaClienteDois.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        tipoContaClienteDois.setForeground(new java.awt.Color(255, 255, 255));
        tipoContaClienteDois.setText("POUPANÇA");
        getContentPane().add(tipoContaClienteDois);
        tipoContaClienteDois.setBounds(180, 90, 120, 30);

        tipoContaClienteTres.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        tipoContaClienteTres.setForeground(new java.awt.Color(255, 255, 255));
        tipoContaClienteTres.setText("CONTA ESPECIAL");
        getContentPane().add(tipoContaClienteTres);
        tipoContaClienteTres.setBounds(160, 130, 120, 30);

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 42, 410, 10);

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(0, 82, 410, 20);

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(0, 122, 410, 20);

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator4);
        jSeparator4.setBounds(0, 158, 410, 10);

        tituloCliente.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        tituloCliente.setForeground(new java.awt.Color(255, 255, 255));
        tituloCliente.setText("SALDO(R$)");
        getContentPane().add(tituloCliente);
        tituloCliente.setBounds(320, 10, 80, 30);

        tipoConta.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        tipoConta.setForeground(new java.awt.Color(255, 255, 255));
        tipoConta.setText("CLIENTES");
        getContentPane().add(tipoConta);
        tipoConta.setBounds(40, 10, 120, 30);

        tituloSaldo.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        tituloSaldo.setForeground(new java.awt.Color(255, 255, 255));
        tituloSaldo.setText("TIPO DE CONTA");
        getContentPane().add(tituloSaldo);
        tituloSaldo.setBounds(160, 10, 120, 30);

        jLabelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo.jpg"))); // NOI18N
        getContentPane().add(jLabelFundo);
        jLabelFundo.setBounds(0, 0, 412, 223);

        setSize(new java.awt.Dimension(427, 261));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        Operacoes voltar = new Operacoes();
        voltar.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    
    public void preencheTabela(){
        Principal pesquisaSaldo = new Principal();
        
        clienteUm.setText(toUpperCase(pesquisaSaldo.contas.get(0).getNome()));
        clienteDois.setText(toUpperCase(pesquisaSaldo.contaPoupanca.get(0).getNome()));
        clienteTres.setText(toUpperCase(pesquisaSaldo.contaEspecial.get(0).getNome()));
        
        DecimalFormat df = new DecimalFormat("0.00");  
        saldoUm.setText(df.format(pesquisaSaldo.contas.get(0).getSaldo()));        
        saldoDois.setText(df.format(pesquisaSaldo.contaPoupanca.get(0).getSaldo()));
        saldoTres.setText(df.format(pesquisaSaldo.contaEspecial.get(0).getSaldo()));
    }
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
                new verSaldo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel clienteDois;
    private javax.swing.JLabel clienteTres;
    private javax.swing.JLabel clienteUm;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabelFundo;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel saldoDois;
    private javax.swing.JLabel saldoTres;
    private javax.swing.JLabel saldoUm;
    private javax.swing.JLabel tipoConta;
    private javax.swing.JLabel tipoContaCliente;
    private javax.swing.JLabel tipoContaClienteDois;
    private javax.swing.JLabel tipoContaClienteTres;
    private javax.swing.JLabel tituloCliente;
    private javax.swing.JLabel tituloSaldo;
    // End of variables declaration//GEN-END:variables
}
