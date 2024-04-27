package UI;
import java.awt.Toolkit;
import elements.DB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class Login extends javax.swing.JFrame {
    Connection connection = null;
    public Login(Connection connection) {
        initComponents();
        setIconImage();
        this.connection = connection;
    }
    
    public static boolean isNumeric(String strNum) {
        if (strNum == null) { return false; }
        try { Integer.parseInt(strNum); } catch (NumberFormatException nfe) { return false; } 
        return true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        Right = new javax.swing.JPanel();
        Left = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        LoginButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        UserIDField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jPanel2.setLayout(null);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN Page");
        setBackground(new java.awt.Color(0, 0, 0));
        setPreferredSize(new java.awt.Dimension(800, 525));
        setResizable(false);

        Right.setBackground(new java.awt.Color(255, 204, 204));
        Right.setLayout(null);

        Left.setBackground(new java.awt.Color(0, 0, 0));
        Left.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("SF Pro Rounded", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Welcome!");

        LoginButton.setBackground(new java.awt.Color(255, 153, 255));
        LoginButton.setFont(new java.awt.Font("SF Compact Text", 1, 24)); // NOI18N
        LoginButton.setText("Login");
        LoginButton.setToolTipText("Click to login!");
        LoginButton.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(102, 0, 102)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SF Pro Display", 0, 12), new java.awt.Color(102, 0, 102))); // NOI18N
        LoginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("SF Pro Display", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Enter Your User ID:");

        UserIDField.setBackground(new java.awt.Color(0, 0, 0));
        UserIDField.setFont(new java.awt.Font("SF Pro Display", 0, 24)); // NOI18N
        UserIDField.setForeground(new java.awt.Color(255, 255, 255));
        UserIDField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        UserIDField.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        UserIDField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel7.setFont(new java.awt.Font("SF Pro Display", 3, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("V1.0.5");

        jLabel9.setFont(new java.awt.Font("SF Pro Display", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("<html>Slama Med Amine<br>Ghassen Latrach</html>");

        javax.swing.GroupLayout LeftLayout = new javax.swing.GroupLayout(Left);
        Left.setLayout(LeftLayout);
        LeftLayout.setHorizontalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftLayout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(UserIDField)
                    .addComponent(LoginButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(107, 107, 107))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        LeftLayout.setVerticalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7))
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addGap(65, 65, 65)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(UserIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89)
                .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(140, Short.MAX_VALUE))
        );

        Right.add(Left);
        Left.setBounds(390, 0, 430, 580);

        jLabel6.setFont(new java.awt.Font("Source Code Pro Semibold", 2, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("<html> Ignite Passion. <br> Inspire Excellence. <br>  Imagine Possibilities. </html>");
        Right.add(jLabel6);
        jLabel6.setBounds(0, 340, 390, 100);

        jLabel8.setFont(new java.awt.Font("Noto Serif Display Black", 3, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("<html> Sakura  <br> High School </html>");
        jLabel8.setToolTipText("");
        Right.add(jLabel8);
        jLabel8.setBounds(160, 40, 210, 100);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Copyright © Sakura High School, All Rights Reserved.");
        Right.add(jLabel5);
        jLabel5.setBounds(0, 460, 390, 15);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        Right.add(jLabel4);
        jLabel4.setBounds(0, 0, 200, 190);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login_screen.png"))); // NOI18N
        Right.add(jLabel3);
        jLabel3.setBounds(-70, 0, 530, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Right, javax.swing.GroupLayout.DEFAULT_SIZE, 816, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Right, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        // UI.Dialogs.writeErr("Sus", "Something went wrong in my java understanding");
        String input = UserIDField.getText();

        //! Login using ID: XXXXXX
        if (input.length() == 6 && isNumeric(input)) {
            this.dispose();
            UserMode UM = new UserMode(connection, input);
            UM.setVisible(true);
            UM.pack();
            UM.setLocationRelativeTo(null);
        } else if (input.equals("root") || input.equals("admin") || input.equals("sudo")) {
            this.dispose();
            AdminMode AM = new AdminMode(connection);
            AM.setVisible(true);
            AM.pack();
            AM.setLocationRelativeTo(null);
        } else { Dialogs.writeErr("Invalid Input", "Please enter a valid Identifier!"); }
        
        //Needs to handle an already existsing data entered!
        
    }//GEN-LAST:event_LoginButtonActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Left;
    private javax.swing.JButton LoginButton;
    private javax.swing.JPanel Right;
    private javax.swing.JTextField UserIDField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
    
    private void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/logo.png")));
    }
}
