//Made by Mónica Gómez (Autumn64).
package arefiguras;

import javax.swing.JOptionPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class Monica extends javax.swing.JFrame {
    
    private int tipo;
    
    public Monica() {
        initComponents();
        this.getContentPane().setBackground(Color.pink);
        calcular.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        resultado = new javax.swing.JLabel();
        textBase = new javax.swing.JTextField();
        textAltura = new javax.swing.JTextField();
        calcular = new javax.swing.JButton();
        comboFigura = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Área figuras");
        setBackground(new java.awt.Color(255, 102, 153));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setFont(new java.awt.Font("Fira Code Medium", 0, 24)); // NOI18N
        setForeground(new java.awt.Color(255, 102, 204));
        setName("window"); // NOI18N
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Fira Code Medium", 0, 36)); // NOI18N
        jLabel1.setText("Área figuras");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arefiguras/pngimg.com - triangle_PNG2.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Fira Code Medium", 0, 24)); // NOI18N
        jLabel3.setText("Base: ");

        jLabel5.setFont(new java.awt.Font("Fira Code Medium", 0, 24)); // NOI18N
        jLabel5.setText("Altura:");

        resultado.setFont(new java.awt.Font("Fira Code Medium", 0, 24)); // NOI18N
        resultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resultado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        textBase.setEditable(false);
        textBase.setFont(new java.awt.Font("Fira Code Medium", 0, 24)); // NOI18N
        textBase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textBaseActionPerformed(evt);
            }
        });

        textAltura.setEditable(false);
        textAltura.setFont(new java.awt.Font("Fira Code Medium", 0, 24)); // NOI18N

        calcular.setFont(new java.awt.Font("Fira Code Medium", 0, 24)); // NOI18N
        calcular.setText("Calcular");
        calcular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calcularMouseClicked(evt);
            }
        });
        calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularActionPerformed(evt);
            }
        });

        comboFigura.setFont(new java.awt.Font("Fira Code Medium", 0, 24)); // NOI18N
        comboFigura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Cuadrado", "Rectángulo", "Triángulo", "Círculo" }));
        comboFigura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboFiguraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 868, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(330, 330, 330)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textBase, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(45, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(406, 406, 406))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(comboFigura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(336, 336, 336))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(358, 358, 358))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(51, 51, 51)
                .addComponent(comboFigura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(textBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(38, 38, 38)
                .addComponent(calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textBaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textBaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textBaseActionPerformed

    private void calcularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calcularMouseClicked
        double n1, n2, r;
        try{
            switch(tipo){
                case 1:
                    n1 = Double.parseDouble(textAltura.getText());
                    r = (n1 * n1);
                    resultado.setText("El área es: " + r);
                    break;
                case 2:
                    n1 = Double.parseDouble(textBase.getText());
                    n2 = Double.parseDouble(textAltura.getText());
                    r = (n1 * n2);
                    resultado.setText("El área es: " + r);
                    break;
                case 3:
                    n1 = Double.parseDouble(textBase.getText());
                    n2 = Double.parseDouble(textAltura.getText());
                    r = (n1 * n2) / 2;
                    resultado.setText("El área es: " + r);
                    break;
                case 4:
                    n1 = Double.parseDouble(textBase.getText());
                    n2 = Double.parseDouble(textAltura.getText());
                    r = (n1 * (n2 * n2));
                    resultado.setText("El área es: " + r);
                    break;
            }
            
        }catch(Exception e){
            JOptionPane cuadro = new JOptionPane();
            JLabel mensaje = new JLabel("Debes introducir sólo números enteros o fraccionarios.");
            mensaje.setFont(new Font("Fira Code Medium", Font.PLAIN, 24));
            resultado.setText("");
            cuadro.showMessageDialog(this, mensaje, "Error", 1);
        }
    }//GEN-LAST:event_calcularMouseClicked

    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_calcularActionPerformed

    private void comboFiguraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboFiguraActionPerformed
        tipo = comboFigura.getSelectedIndex();
        textAltura.setText("");
        textBase.setText("");
        resultado.setText("");
        setTipo();
    }//GEN-LAST:event_comboFiguraActionPerformed

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
            java.util.logging.Logger.getLogger(Monica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Monica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Monica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Monica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Monica().setVisible(true);
            }
        });
    }
    
    private void setTipo(){  
        
        if(tipo == 0){
                jLabel3.setText("Base:");
                jLabel3.setVisible(true);
                textBase.setVisible(true);
                jLabel5.setText("Altura:");
                jLabel5.setVisible(true);
                textAltura.setVisible(true);
                calcular.setVisible(false);
                textBase.setEditable(false);
                textAltura.setEditable(false);
        }else{
            calcular.setVisible(true);
            textBase.setEditable(true);
            textAltura.setEditable(true);
        }
        switch(tipo){  
            case 1:
                jLabel3.setVisible(false);
                textBase.setVisible(false);
                jLabel5.setText("Lado:");
                break;
            case 2:
                jLabel3.setVisible(true);
                textBase.setVisible(true);
                jLabel5.setText("Altura:");
                break;
            case 3:
                jLabel3.setVisible(true);
                textBase.setVisible(true);
                jLabel5.setText("Altura:");
                break;
            case 4:
                jLabel3.setText("Pi:");
                jLabel3.setVisible(true);
                textBase.setText("3.1415926");
                textBase.setVisible(true);
                textBase.setEditable(false);
                jLabel5.setText("Radio:");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calcular;
    private javax.swing.JComboBox<String> comboFigura;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel resultado;
    private javax.swing.JTextField textAltura;
    private javax.swing.JTextField textBase;
    // End of variables declaration//GEN-END:variables
}
