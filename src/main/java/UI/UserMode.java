/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import java.awt.Toolkit;

/**
 *
 * @author slamzdank
 */
public class UserMode extends javax.swing.JFrame {

    /**
     * Creates new form UserMode
     */
    public UserMode() {
        initComponents();
        setIconImage();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Disconnect = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        reveal_moyenne = new javax.swing.JButton();
        Publish_To_DB1 = new javax.swing.JButton();
        Report_Score1 = new javax.swing.JLabel();
        Report_Score4 = new javax.swing.JLabel();
        englishField = new javax.swing.JTextField();
        physicsField = new javax.swing.JTextField();
        mathField = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        literatureField = new javax.swing.JTextField();
        chemistryField = new javax.swing.JTextField();
        geographyField = new javax.swing.JTextField();
        scienceField = new javax.swing.JTextField();
        historyField = new javax.swing.JTextField();
        frenchField = new javax.swing.JTextField();
        germanField = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        Report_Score5 = new javax.swing.JLabel();
        Report_Score6 = new javax.swing.JLabel();
        Report_Score7 = new javax.swing.JLabel();
        Report_Score8 = new javax.swing.JLabel();
        Report_Score9 = new javax.swing.JLabel();
        Report_Score10 = new javax.swing.JLabel();
        Report_Score11 = new javax.swing.JLabel();
        Report_Score12 = new javax.swing.JLabel();
        Report_Score13 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Submission Form");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(1242, 925));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.setPreferredSize(new java.awt.Dimension(1000, 980));
        jPanel2.setLayout(null);

        Disconnect.setBackground(new java.awt.Color(255, 204, 255));
        Disconnect.setFont(new java.awt.Font("SF Pro Display", 3, 14)); // NOI18N
        Disconnect.setText("<<    Disconnect");
        Disconnect.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(153, 0, 153)));
        Disconnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisconnectActionPerformed(evt);
            }
        });
        jPanel2.add(Disconnect);
        Disconnect.setBounds(20, 20, 150, 30);

        jPanel3.setLayout(null);

        jLabel7.setFont(new java.awt.Font("SF Pro Rounded", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("User Mode:");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(0, 380, 400, 60);

        jLabel8.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("<html>\nWARNING:\n<br>\nPlease TRIPLE CHECK your provided information before submitting\n<br>\npublishing this is irreversible! and can only be modified with\n<br>\nthe request of authorized personnel!\n</html>");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(50, 510, 310, 140);

        jLabel5.setFont(new java.awt.Font("Noto Serif Display Black", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Sakura High School");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(0, 260, 400, 50);

        jLabel4.setFont(new java.awt.Font("Source Code Pro Semibold", 2, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("<html> Ignite Passion. <br> Inspire Excellence. <br>  Imagine Possibilities. </html>");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(40, 710, 320, 130);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Copyright © Sakura High School, All Rights Reserved.");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(0, 870, 400, 15);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel3.add(jLabel2);
        jLabel2.setBounds(0, 60, 400, 210);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user_screen.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(-330, -150, 750, 1480);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(0, 0, 401, 900);

        reveal_moyenne.setBackground(new java.awt.Color(255, 204, 255));
        reveal_moyenne.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        reveal_moyenne.setText("Reveal Score");
        reveal_moyenne.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 255)));
        reveal_moyenne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reveal_moyenneActionPerformed(evt);
            }
        });
        jPanel2.add(reveal_moyenne);
        reveal_moyenne.setBounds(480, 820, 180, 40);

        Publish_To_DB1.setBackground(new java.awt.Color(255, 204, 255));
        Publish_To_DB1.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        Publish_To_DB1.setText("Publish");
        Publish_To_DB1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 255)));
        Publish_To_DB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Publish_To_DB1ActionPerformed(evt);
            }
        });
        jPanel2.add(Publish_To_DB1);
        Publish_To_DB1.setBounds(1030, 820, 150, 40);

        Report_Score1.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        Report_Score1.setForeground(new java.awt.Color(255, 255, 255));
        Report_Score1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Report_Score1.setText("insert Moyenne here");
        jPanel2.add(Report_Score1);
        Report_Score1.setBounds(480, 760, 700, 40);

        Report_Score4.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        Report_Score4.setForeground(new java.awt.Color(255, 255, 255));
        Report_Score4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Report_Score4.setText("Math:");
        jPanel2.add(Report_Score4);
        Report_Score4.setBounds(480, 280, 110, 50);

        englishField.setBackground(new java.awt.Color(0, 0, 0));
        englishField.setForeground(new java.awt.Color(255, 255, 255));
        englishField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        englishField.setText("0");
        jPanel2.add(englishField);
        englishField.setBounds(590, 640, 100, 50);

        physicsField.setBackground(new java.awt.Color(0, 0, 0));
        physicsField.setForeground(new java.awt.Color(255, 255, 255));
        physicsField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        physicsField.setText("0");
        jPanel2.add(physicsField);
        physicsField.setBounds(1070, 280, 100, 50);

        mathField.setBackground(new java.awt.Color(0, 0, 0));
        mathField.setForeground(new java.awt.Color(255, 255, 255));
        mathField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mathField.setText("0");
        jPanel2.add(mathField);
        mathField.setBounds(590, 280, 100, 50);

        jTextField5.setBackground(new java.awt.Color(0, 0, 0));
        jTextField5.setFont(new java.awt.Font("SF Pro", 3, 18)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(255, 255, 255));
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setText("Date of Birth");
        jPanel2.add(jTextField5);
        jTextField5.setBounds(960, 150, 230, 50);

        literatureField.setBackground(new java.awt.Color(0, 0, 0));
        literatureField.setForeground(new java.awt.Color(255, 255, 255));
        literatureField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        literatureField.setText("0");
        jPanel2.add(literatureField);
        literatureField.setBounds(590, 370, 100, 50);

        chemistryField.setBackground(new java.awt.Color(0, 0, 0));
        chemistryField.setForeground(new java.awt.Color(255, 255, 255));
        chemistryField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        chemistryField.setText("0");
        jPanel2.add(chemistryField);
        chemistryField.setBounds(590, 460, 100, 50);

        geographyField.setBackground(new java.awt.Color(0, 0, 0));
        geographyField.setForeground(new java.awt.Color(255, 255, 255));
        geographyField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        geographyField.setText("0");
        jPanel2.add(geographyField);
        geographyField.setBounds(590, 550, 100, 50);

        scienceField.setBackground(new java.awt.Color(0, 0, 0));
        scienceField.setForeground(new java.awt.Color(255, 255, 255));
        scienceField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        scienceField.setText("0");
        jPanel2.add(scienceField);
        scienceField.setBounds(1070, 370, 100, 50);

        historyField.setBackground(new java.awt.Color(0, 0, 0));
        historyField.setForeground(new java.awt.Color(255, 255, 255));
        historyField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        historyField.setText("0");
        jPanel2.add(historyField);
        historyField.setBounds(1070, 460, 100, 50);

        frenchField.setBackground(new java.awt.Color(0, 0, 0));
        frenchField.setForeground(new java.awt.Color(255, 255, 255));
        frenchField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        frenchField.setText("0");
        jPanel2.add(frenchField);
        frenchField.setBounds(1070, 550, 100, 50);

        germanField.setBackground(new java.awt.Color(0, 0, 0));
        germanField.setForeground(new java.awt.Color(255, 255, 255));
        germanField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        germanField.setText("0");
        jPanel2.add(germanField);
        germanField.setBounds(1070, 640, 100, 50);

        jTextField13.setBackground(new java.awt.Color(0, 0, 0));
        jTextField13.setFont(new java.awt.Font("SF Pro", 3, 18)); // NOI18N
        jTextField13.setForeground(new java.awt.Color(255, 255, 255));
        jTextField13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField13.setText("Surname");
        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField13);
        jTextField13.setBounds(710, 150, 230, 50);

        jTextField14.setBackground(new java.awt.Color(0, 0, 0));
        jTextField14.setFont(new java.awt.Font("SF Pro", 3, 18)); // NOI18N
        jTextField14.setForeground(new java.awt.Color(255, 255, 255));
        jTextField14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField14.setText("Name");
        jPanel2.add(jTextField14);
        jTextField14.setBounds(460, 150, 230, 50);

        Report_Score5.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        Report_Score5.setForeground(new java.awt.Color(255, 255, 255));
        Report_Score5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Report_Score5.setText("Litterature:");
        jPanel2.add(Report_Score5);
        Report_Score5.setBounds(480, 370, 110, 50);

        Report_Score6.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        Report_Score6.setForeground(new java.awt.Color(255, 255, 255));
        Report_Score6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Report_Score6.setText("German:");
        jPanel2.add(Report_Score6);
        Report_Score6.setBounds(960, 640, 110, 50);

        Report_Score7.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        Report_Score7.setForeground(new java.awt.Color(255, 255, 255));
        Report_Score7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Report_Score7.setText("Chemistry:");
        jPanel2.add(Report_Score7);
        Report_Score7.setBounds(480, 460, 110, 50);

        Report_Score8.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        Report_Score8.setForeground(new java.awt.Color(255, 255, 255));
        Report_Score8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Report_Score8.setText("Geography:");
        jPanel2.add(Report_Score8);
        Report_Score8.setBounds(480, 550, 110, 50);

        Report_Score9.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        Report_Score9.setForeground(new java.awt.Color(255, 255, 255));
        Report_Score9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Report_Score9.setText("English:");
        jPanel2.add(Report_Score9);
        Report_Score9.setBounds(480, 640, 110, 50);

        Report_Score10.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        Report_Score10.setForeground(new java.awt.Color(255, 255, 255));
        Report_Score10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Report_Score10.setText("Physics:");
        jPanel2.add(Report_Score10);
        Report_Score10.setBounds(960, 280, 110, 50);

        Report_Score11.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        Report_Score11.setForeground(new java.awt.Color(255, 255, 255));
        Report_Score11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Report_Score11.setText("Science:");
        jPanel2.add(Report_Score11);
        Report_Score11.setBounds(960, 370, 110, 50);

        Report_Score12.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        Report_Score12.setForeground(new java.awt.Color(255, 255, 255));
        Report_Score12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Report_Score12.setText("History:");
        jPanel2.add(Report_Score12);
        Report_Score12.setBounds(960, 460, 110, 50);

        Report_Score13.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        Report_Score13.setForeground(new java.awt.Color(255, 255, 255));
        Report_Score13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Report_Score13.setText("French:");
        jPanel2.add(Report_Score13);
        Report_Score13.setBounds(960, 550, 110, 50);

        jLabel6.setFont(new java.awt.Font("SF Pro Display", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Submission Form:");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(400, 50, 840, 60);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setFont(new java.awt.Font("SF Pro Display", 0, 48)); // NOI18N
        jPanel2.add(jSeparator1);
        jSeparator1.setBounds(830, 240, 30, 490);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1243, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Publish_To_DB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Publish_To_DB1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Publish_To_DB1ActionPerformed

    private void reveal_moyenneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reveal_moyenneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reveal_moyenneActionPerformed

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void DisconnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisconnectActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Login l = new Login();
        l.setVisible(true);
        l.pack();
        l.setLocationRelativeTo(null);
    }//GEN-LAST:event_DisconnectActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Disconnect;
    private javax.swing.JButton Publish_To_DB1;
    private javax.swing.JLabel Report_Score1;
    private javax.swing.JLabel Report_Score10;
    private javax.swing.JLabel Report_Score11;
    private javax.swing.JLabel Report_Score12;
    private javax.swing.JLabel Report_Score13;
    private javax.swing.JLabel Report_Score4;
    private javax.swing.JLabel Report_Score5;
    private javax.swing.JLabel Report_Score6;
    private javax.swing.JLabel Report_Score7;
    private javax.swing.JLabel Report_Score8;
    private javax.swing.JLabel Report_Score9;
    private javax.swing.JTextField chemistryField;
    private javax.swing.JTextField englishField;
    private javax.swing.JTextField frenchField;
    private javax.swing.JTextField geographyField;
    private javax.swing.JTextField germanField;
    private javax.swing.JTextField historyField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField literatureField;
    private javax.swing.JTextField mathField;
    private javax.swing.JTextField physicsField;
    private javax.swing.JButton reveal_moyenne;
    private javax.swing.JTextField scienceField;
    // End of variables declaration//GEN-END:variables

    private void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/logo.png")));
    }
}
