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
public class AdminMode extends javax.swing.JFrame {

    /**
     * Creates new form AdminMode
     */
    public AdminMode() {
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
        jLabel7 = new javax.swing.JLabel();
        Disconnect = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Modify = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Export = new javax.swing.JButton();
        Sort = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Mode");
        setPreferredSize(new java.awt.Dimension(1500, 840));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(null);

        jPanel2.setLayout(null);

        jLabel7.setFont(new java.awt.Font("SF Pro Rounded", 0, 36)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Admin Mode:");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(0, 300, 390, 70);

        Disconnect.setBackground(new java.awt.Color(255, 204, 255));
        Disconnect.setFont(new java.awt.Font("SF Pro Display", 3, 14)); // NOI18N
        Disconnect.setText("<<    Disconnect");
        Disconnect.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(102, 0, 102)));
        Disconnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisconnectActionPerformed(evt);
            }
        });
        jPanel2.add(Disconnect);
        Disconnect.setBounds(20, 20, 150, 30);

        jLabel6.setFont(new java.awt.Font("Source Code Pro", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("<html> Ignite Passion. <br> Inspire Excellence. <br>  Imagine Possibilities. </html>");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(0, 620, 390, 130);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Copyright © Sakura High School, All Rights Reserved.");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(0, 770, 390, 15);

        jLabel4.setFont(new java.awt.Font("Noto Serif Display", 1, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Sakura High School");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(0, 240, 390, 60);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        jPanel2.add(jLabel3);
        jLabel3.setBounds(0, 50, 390, 220);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(950, 33, 200, 200);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Admin_Screen.png"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(-40, -90, 440, 932);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 390, 1235);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1050, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(420, 80, 1050, 650);

        Modify.setBackground(new java.awt.Color(255, 204, 255));
        Modify.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        Modify.setText("Modify Selected Entry");
        Modify.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 153)));
        Modify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifyActionPerformed(evt);
            }
        });
        jPanel1.add(Modify);
        Modify.setBounds(420, 750, 210, 40);

        Delete.setBackground(new java.awt.Color(255, 204, 255));
        Delete.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        Delete.setText("Delete Selected Entries");
        Delete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 153)));
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        jPanel1.add(Delete);
        Delete.setBounds(700, 750, 210, 40);

        Export.setBackground(new java.awt.Color(255, 204, 255));
        Export.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        Export.setText("Export as CSV / PDF");
        Export.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 153)));
        Export.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExportActionPerformed(evt);
            }
        });
        jPanel1.add(Export);
        Export.setBounds(990, 750, 210, 40);

        Sort.setBackground(new java.awt.Color(255, 204, 255));
        Sort.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        Sort.setText("Sort by Highest Score");
        Sort.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 153)));
        Sort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SortActionPerformed(evt);
            }
        });
        jPanel1.add(Sort);
        Sort.setBounds(1260, 750, 210, 40);

        jLabel9.setFont(new java.awt.Font("SF Pro Display", 2, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("V0.0.3");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(1420, 20, 37, 15);

        jLabel8.setFont(new java.awt.Font("SF Pro Display", 1, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Database Report:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(400, 20, 1090, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1498, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 825, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DisconnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisconnectActionPerformed
        this.dispose();
        Login l = new Login();
        l.setVisible(true);
        l.pack();
        l.setLocationRelativeTo(null);
    }//GEN-LAST:event_DisconnectActionPerformed

    private void ExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ExportActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteActionPerformed

    private void SortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SortActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SortActionPerformed

    private void ModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ModifyActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Delete;
    private javax.swing.JButton Disconnect;
    private javax.swing.JButton Export;
    private javax.swing.JButton Modify;
    private javax.swing.JButton Sort;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables

    private void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/db_icon.png")));
    }
}
