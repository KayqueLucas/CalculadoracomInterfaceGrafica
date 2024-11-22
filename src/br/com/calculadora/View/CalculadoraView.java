package br.com.calculadora.View;

import br.com.calculadora.Model.CalculadoraModel;


public class CalculadoraView extends javax.swing.JFrame {

    CalculadoraModel calculadora = new CalculadoraModel();
    boolean segundoValor = false;
    String operacao;

 
    public CalculadoraView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelNumero = new javax.swing.JLabel();
        jButtonClear = new javax.swing.JButton();
        jButtonPorcent = new javax.swing.JButton();
        jButtonDiv = new javax.swing.JButton();
        jButtonMult = new javax.swing.JButton();
        jButtonSub = new javax.swing.JButton();
        jButtonSum = new javax.swing.JButton();
        jButtonIgaldade = new javax.swing.JButton();
        jButtonDel = new javax.swing.JButton();
        jButtonPonto = new javax.swing.JButton();
        jButton0 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setIconImages(null);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelNumero.setFont(new java.awt.Font("Trebuchet MS", 0, 48)); // NOI18N
        jLabelNumero.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNumero.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(jLabelNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 380, 120));

        jButtonClear.setContentAreaFilled(false);
        jButtonClear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 90, 90));

        jButtonPorcent.setContentAreaFilled(false);
        jButtonPorcent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonPorcent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPorcentActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPorcent, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 80, 90));

        jButtonDiv.setContentAreaFilled(false);
        jButtonDiv.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDivActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDiv, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 220, 90, 90));

        jButtonMult.setContentAreaFilled(false);
        jButtonMult.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonMult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMultActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMult, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 220, 90, 90));

        jButtonSub.setContentAreaFilled(false);
        jButtonSub.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSub, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 90, 90));

        jButtonSum.setContentAreaFilled(false);
        jButtonSum.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSumActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSum, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 430, 90, 90));

        jButtonIgaldade.setContentAreaFilled(false);
        jButtonIgaldade.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonIgaldade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIgaldadeActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonIgaldade, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 540, 90, 190));

        jButtonDel.setContentAreaFilled(false);
        jButtonDel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDelActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDel, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 640, 90, 90));

        jButtonPonto.setContentAreaFilled(false);
        jButtonPonto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonPonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPontoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 640, 90, 90));

        jButton0.setContentAreaFilled(false);
        jButton0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton0ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton0, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 640, 90, 90));

        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, 90, 90));

        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 540, 80, 90));

        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 540, 90, 80));

        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 90, 90));

        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 430, 80, 90));

        jButton6.setContentAreaFilled(false);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 430, 90, 90));

        jButton7.setContentAreaFilled(false);
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 90, 90));

        jButton8.setContentAreaFilled(false);
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 80, 90));

        jButton9.setContentAreaFilled(false);
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 320, 80, 90));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resouces/Imagem do WhatsApp de 2024-11-21 à(s) 21.55.14_5d31646b.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 398, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jLabelNumero.setText(jLabelNumero.getText() + "3");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton0ActionPerformed
        jLabelNumero.setText(jLabelNumero.getText() + "0");
    }//GEN-LAST:event_jButton0ActionPerformed

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        calculadora.setValor1(0);
        calculadora.setValor2(0);
        segundoValor = false;
        jLabelNumero.setText(" ");
        operacao = " ";
    }//GEN-LAST:event_jButtonClearActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jLabelNumero.setText(jLabelNumero.getText() + "1");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jLabelNumero.setText(jLabelNumero.getText() + "2");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jLabelNumero.setText(jLabelNumero.getText() + "4");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jLabelNumero.setText(jLabelNumero.getText() + "5");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jLabelNumero.setText(jLabelNumero.getText() + "6");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jLabelNumero.setText(jLabelNumero.getText() + "7");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jLabelNumero.setText(jLabelNumero.getText() + "8");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        jLabelNumero.setText(jLabelNumero.getText() + "9");
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButtonSumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSumActionPerformed
        calculadora.setValor1(Double.parseDouble(jLabelNumero.getText()));
        segundoValor = true;
        jLabelNumero.setText(" ");
        operacao = "soma";
    }//GEN-LAST:event_jButtonSumActionPerformed

    private void jButtonIgaldadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIgaldadeActionPerformed
        if (segundoValor == true) {

            calculadora.setValor2(Double.parseDouble(jLabelNumero.getText()));
            if (operacao == "soma") {
                calculadora.somar();
                calculadora.getResultado();
                jLabelNumero.setText(String.valueOf(calculadora.getResultado()));
                operacao = "";
            }
            if (operacao == "subtrair") {
                calculadora.subtrair();
                calculadora.getResultado();
                jLabelNumero.setText(String.valueOf(calculadora.getResultado()));
                operacao = "";
            }
            if (operacao == "multiplicar") {
                calculadora.multiplicar();
                calculadora.getResultado();
                jLabelNumero.setText(String.valueOf(calculadora.getResultado()));
                operacao = "";
            }
            if (operacao == "dividir") {
                calculadora.dividir();
                calculadora.getResultado();
                jLabelNumero.setText(String.valueOf(calculadora.getResultado()));
                operacao = "";
            }

        }
    }//GEN-LAST:event_jButtonIgaldadeActionPerformed

    private void jButtonSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubActionPerformed
        calculadora.setValor1(Double.parseDouble(jLabelNumero.getText()));
        segundoValor = true;
        jLabelNumero.setText(" ");
        operacao = "subtrair";

    }//GEN-LAST:event_jButtonSubActionPerformed

    private void jButtonMultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMultActionPerformed
        calculadora.setValor1(Double.parseDouble(jLabelNumero.getText()));
        segundoValor = true;
        jLabelNumero.setText(" ");
        operacao = "multiplicar";
    }//GEN-LAST:event_jButtonMultActionPerformed

    private void jButtonDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDivActionPerformed
        calculadora.setValor1(Double.parseDouble(jLabelNumero.getText()));
        segundoValor = true;
        jLabelNumero.setText(" ");
        operacao = "dividir";
    }//GEN-LAST:event_jButtonDivActionPerformed

    private void jButtonPontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPontoActionPerformed
        jLabelNumero.setText(jLabelNumero.getText() + ".");
    }//GEN-LAST:event_jButtonPontoActionPerformed

    private void jButtonPorcentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPorcentActionPerformed
        calculadora.setValor1(Double.parseDouble(jLabelNumero.getText()));
        calculadora.setResultado(calculadora.getValor1()/100);
        jLabelNumero.setText(String.valueOf(calculadora.getResultado()));
    }//GEN-LAST:event_jButtonPorcentActionPerformed

    private void jButtonDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDelActionPerformed
        jLabelNumero.setText(jLabelNumero.getText().substring(0, jLabelNumero.getText().length() -1));
    }//GEN-LAST:event_jButtonDelActionPerformed

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
            java.util.logging.Logger.getLogger(CalculadoraView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton0;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonDel;
    private javax.swing.JButton jButtonDiv;
    private javax.swing.JButton jButtonIgaldade;
    private javax.swing.JButton jButtonMult;
    private javax.swing.JButton jButtonPonto;
    private javax.swing.JButton jButtonPorcent;
    private javax.swing.JButton jButtonSub;
    private javax.swing.JButton jButtonSum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelNumero;
    // End of variables declaration//GEN-END:variables
}
