package UI;

import UI.UserMode;
import elements.Etudiant;
import elements.DB;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.Document;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import java.io.FileOutputStream;

import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.*;

public class AdminMode extends javax.swing.JFrame {
    private ArrayList<Etudiant> etudiants; // Stores student data
    int sortMode = -1;
    Connection connection = null;

    public AdminMode(Connection con) {
        initComponents();
        setIconImage();
        etudiants = new ArrayList<>();
        try {
            connection = con;
            System.err.println("**********************************************************************************");
            renderDatabase(con, sortMode);
        } catch (Exception e) {
            return;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    @SuppressWarnings("unused, unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Modify = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Export = new javax.swing.JButton();
        Sort = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Mode");
        setPreferredSize(new java.awt.Dimension(1500, 760));
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
        jLabel6.setBounds(0, 520, 390, 130);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Copyright © Sakura High School, All Rights Reserved.");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(0, 700, 390, 15);

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
        jLabel2.setBounds(0, 0, 440, 780);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 390, 1235);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {

                },
                new String[] {
                        "Id", "Name", "Surname", "Date Of Birth", "Math", "Physics", "Literrature", "Science",
                        "Chemistry", "History", "Geography", "French", "English", "German", "Score", "Mention"
                }) {
            Class[] types = new Class[] {
                    java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class,
                    java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class,
                    java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class,
                    java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class
            };

            @Override
            public boolean isCellEditable(int row, int column) {
                // all cells false
                return false;
            }

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }
        });
        jTable1.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1061,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)));
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 535,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)));

        jPanel1.add(jPanel3);
        jPanel3.setBounds(410, 80, 1060, 535);

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
        Modify.setBounds(480, 660, 180, 40);

        Delete.setBackground(new java.awt.Color(255, 204, 255));
        Delete.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        Delete.setText("Delete Selected Entries");
        Delete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 153)));
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

                int selectedRow = jTable1.getSelectedRow();
                if (selectedRow >= 0) {
                    // Confirmation dialog for deletion
                    int confirmation = Dialogs.ConfirmDialog("Confirmation",
                            "Are you sure you want to remove this student?");
                    if (confirmation == JOptionPane.YES_OPTION) {

                        // 1- Get the student object from the model (if applicable):
                        Etudiant selectedStudent = null;
                        if (etudiants != null && selectedRow < etudiants.size()) {
                            selectedStudent = etudiants.get(selectedRow);
                        }

                        // 2- Remove student from the underlying data source (database)
                        if (selectedStudent != null) {
                            // delete student from database using selectedStudent.getId()
                            System.out.println("Student " + selectedStudent.getId() + " deleted from database");
                        }

                        // 3- Update the table model
                        updateTableModel(selectedStudent.getId());
                    }
                } else {
                    Dialogs.writeErr("Error", "Select the student you want to remove!");
                }
            }
        });
        jPanel1.add(Delete);
        Delete.setBounds(950, 660, 210, 40);

        Export.setBackground(new java.awt.Color(255, 204, 255));
        Export.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        Export.setText("Export as PDF");
        Export.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 153)));
        Export.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExportActionPerformed(evt);
            }
        });
        jPanel1.add(Export);
        Export.setBounds(1190, 660, 210, 40);

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
        Sort.setBounds(700, 660, 210, 40);

        jLabel9.setFont(new java.awt.Font("SF Pro Display", 2, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("V1.0.4");
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
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1498, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void DisconnectActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_DisconnectActionPerformed
        this.dispose();
        Login l = new Login(connection);
        l.setVisible(true);
        l.pack();
        l.setLocationRelativeTo(null);
        // DB.closeConnection();
    }// GEN-LAST:event_DisconnectActionPerformed

    private void updateTableModel(int id) {
        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();

        // Remove the appropriate row (assuming student objects are stored in etudiants)
        int rowIndexToRemove = -1;
        for (int i = 0; i < etudiants.size(); i++) {
            if (etudiants.get(i).getId() == id) { // Assuming you have the selected student's id
                rowIndexToRemove = i;
                break;
            }
        }
        if (rowIndexToRemove >= 0) {
            tableModel.removeRow(rowIndexToRemove);
        }

        // Refresh the table
        tableModel.fireTableDataChanged();
        // refresh the database in here
        try (PreparedStatement ps = connection.prepareStatement("DELETE FROM etudiant WHERE idEtudiant = ?")) {
            ps.setInt(1, id); // Set the student ID in the prepared statement
            int rowsDeleted = ps.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Student with ID " + id + " deleted from database");
            } else {
                System.out.println("No student found with ID " + id + " in database");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error deleting student from database", "Error",
                    JOptionPane.ERROR_MESSAGE);

        }
    }

    public void SortActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_SortActionPerformed
        // Collections.sort((List<T>) etudiants);
        System.err.println("**********************************************************************************");
        sortMode *= -1;
        renderDatabase(connection, sortMode);
        // Sorting button will not change state Unless the connection to MySql is
        // established
        String text = (sortMode == 1) ? "Unsort the list" : "Sort by Highest Score";
        Sort.setText(text);
    }// GEN-LAST:event_SortActionPerformed

    public void ExportActionPerformed(java.awt.event.ActionEvent evt) {
        // The code used to get information from the jtable1
        String pathName = "";
        JFileChooser file = new JFileChooser();
        file.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int x = file.showSaveDialog(this);

        if (x == JFileChooser.APPROVE_OPTION) {
            pathName = file.getSelectedFile().getAbsolutePath();
        }
        com.itextpdf.text.Document doc = new com.itextpdf.text.Document();

        try {
            PdfWriter.getInstance(doc, new FileOutputStream(pathName + "/report.pdf"));
            doc.setPageSize(PageSize.A3.rotate()); // Make the page wider by rotating it
            doc.setMargins(0, 0, 0, 0); // Remove PDF margins
            doc.addTitle("Report");

            doc.open();
            PdfPTable table = new PdfPTable(jTable1.getColumnCount());

            table.addCell("ID");
            table.addCell("Name");
            table.addCell("Surname");
            table.addCell("Date of birth");
            table.addCell("Math");
            table.addCell("Physics");
            table.addCell("Litterary");
            table.addCell("Science");
            table.addCell("Chemistry");
            table.addCell("History");
            table.addCell("Geography");
            table.addCell("French");
            table.addCell("English");
            table.addCell("German");
            table.addCell("Score");
            table.addCell("Remarks");

            for (int i = 0; i < jTable1.getRowCount(); i++) {
                String id = jTable1.getValueAt(i, 0).toString();
                String name = jTable1.getValueAt(i, 1).toString();
                String surname = jTable1.getValueAt(i, 2).toString();
                String date = jTable1.getValueAt(i, 3).toString();
                String math = jTable1.getValueAt(i, 4).toString();
                String physics = jTable1.getValueAt(i, 5).toString();
                String lit = jTable1.getValueAt(i, 6).toString();
                String science = jTable1.getValueAt(i, 7).toString();
                String chem = jTable1.getValueAt(i, 8).toString();
                String history = jTable1.getValueAt(i, 9).toString();
                String geo = jTable1.getValueAt(i, 10).toString();
                String french = jTable1.getValueAt(i, 11).toString();
                String english = jTable1.getValueAt(i, 12).toString();
                String german = jTable1.getValueAt(i, 13).toString();
                String score = jTable1.getValueAt(i, 14).toString();
                String remarks = jTable1.getValueAt(i, 15).toString();
                table.addCell(id);
                table.addCell(name);
                table.addCell(surname);
                table.addCell(date);
                table.addCell(math);
                table.addCell(physics);
                table.addCell(lit);
                table.addCell(science);
                table.addCell(chem);
                table.addCell(history);
                table.addCell(geo);
                table.addCell(french);
                table.addCell(english);
                table.addCell(german);
                table.addCell(score);
                table.addCell(remarks);
            }
            table.setWidths(new float[] { 5f, 5f, 5f, 6f, 5f, 5f, 5f, 5f, 6f, 5f, 6f, 5f, 5f, 5f, 5f, 5f }); // make the
                                                                                                             // pdf
                                                                                                             // table
                                                                                                             // wider by
                                                                                                             // increasing
                                                                                                             // the
                                                                                                             // width of
                                                                                                             // each
                                                                                                             // column
            doc.add(table);
            doc.close();
            Dialogs.SuccessDialog("Success", "Report successfully created.");

        } catch (Exception e) {
            Dialogs.writeErr("Error", "No file Access.");
        }
    }

    // -----------work with this method to render the database-----
    public void renderDatabase(Connection connection, int sortMode) {
        // Clear existing data from the table model
        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();

        // Fetch updated student data from database
        etudiants.clear();

        try (Statement statement = connection.createStatement()) {
            // @Ghassen u need to check this result set

            ResultSet resultSet = sortMode == 1 ? statement.executeQuery("SELECT * FROM etudiant ORDER BY moyenne DESC")
                    : statement.executeQuery("SELECT * FROM etudiant");
            tableModel.setRowCount(0); // Clear existing data from the table maybe, tested and big works

            while (resultSet.next()) {
                int id = resultSet.getInt("idEtudiant");
                String name = resultSet.getString("nom");
                String surname = resultSet.getString("prenom");
                String dob = resultSet.getString("dateDeNaissance");
                double mathScore = resultSet.getDouble("noteMath");
                double physicsScore = resultSet.getDouble("notePhysique");
                double litteraturescore = resultSet.getDouble("noteLitterature");
                double chemistryScore = resultSet.getDouble("noteChimie");
                double scienceScore = resultSet.getDouble("noteSVT");
                double historyScore = resultSet.getDouble("noteHistoire");
                double geographyScore = resultSet.getDouble("noteGeographie");
                double frenchScore = resultSet.getDouble("noteFrancais");
                double englishScore = resultSet.getDouble("noteAnglais");
                double germanScore = resultSet.getDouble("noteAllemand");
                double Moyenne = resultSet.getDouble("Moyenne");
                String Mention = resultSet.getString("Mention");
                System.out.println(id + " " + name + " " + surname + " " + dob + " " + mathScore + " " + physicsScore
                        + " " + litteraturescore + " " + chemistryScore + " " + scienceScore + " " + historyScore + " "
                        + geographyScore + " " + frenchScore + " " + englishScore + " " + germanScore + " " + Moyenne
                        + " " + Mention);

                Etudiant etudiant = new Etudiant(name, surname, dob);

                etudiant.ajouteNotes(mathScore, physicsScore, litteraturescore, scienceScore, chemistryScore,
                        historyScore, geographyScore, englishScore, frenchScore, germanScore);
                etudiant.setId(id);

                // Repopulate the table model with updated student data
                etudiants.add(etudiant);
                tableModel.addRow(new Object[] { etudiant.getId(), etudiant.getNom(), etudiant.getPrenom(),
                        etudiant.getDateDeNaiss(), etudiant.getNoteMath(), etudiant.getNotePhysique(),
                        etudiant.getNoteLitterature(), etudiant.getNoteChimie(), etudiant.getNoteSvt(),
                        etudiant.getNoteHistoire(), etudiant.getNoteGeographie(), etudiant.getNoteFrancais(),
                        etudiant.getNoteAnglais(), etudiant.getNoteAllemand(), Moyenne,
                        Mention });

                // Refresh the table
                tableModel.fireTableDataChanged();

            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    public static boolean isvalidScore(String score) {
        if (score == null || score.isEmpty()) {
            return false;
        }
        try {
            double scoreValue = Double.parseDouble(score);
            return scoreValue >= 0 && scoreValue <= 20;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    public void ModifyActionPerformed(java.awt.event.ActionEvent evt) {
        int selectedRow = jTable1.getSelectedRow();
        int error = 0;
        String genHtml = "<html><h3>INVALID INPUT</h3><br>";
        String name=null,surname=null,dob=null,mention=null;
        double mathScore=0,physicsScore=0,litteraturescore=0,chemistryScore=0,historyScore=0,geographyScore=0,scienceScore=0,frenchScore=0,englishScore=0,germanScore=0;

        if (selectedRow >= 0) {
            // Prepare data for the dialog
            Etudiant selectedEtudiant = etudiants.get(selectedRow);
            String selectedStudentId = jTable1.getValueAt(selectedRow, 0).toString();
            //System.out.println(selectedStudentId);
            String sql = "SELECT * FROM Etudiant WHERE idEtudiant = ?";
            try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
                pstmt.setString(1, selectedStudentId);
                ResultSet resultSet = pstmt.executeQuery();
                
                if (resultSet.next()) {
                     name = resultSet.getString("nom");
                     surname = resultSet.getString("prenom");
                     dob = resultSet.getString("dateDeNaissance");
                     mathScore = resultSet.getDouble("noteMath");
                     physicsScore = resultSet.getDouble("notePhysique");
                     litteraturescore = resultSet.getDouble("noteLitterature");
                     chemistryScore = resultSet.getDouble("noteChimie");
                     scienceScore = resultSet.getDouble("noteSVT");
                     historyScore = resultSet.getDouble("noteHistoire");
                     geographyScore = resultSet.getDouble("noteGeographie");
                     frenchScore = resultSet.getDouble("noteFrancais");
                     englishScore = resultSet.getDouble("noteAnglais");
                     germanScore = resultSet.getDouble("noteAllemand");
        
                }     
                
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }




            
            JPanel modifyPanel = new JPanel(new GridLayout(0, 2, 5, 5));
            JTextField nameField = new JTextField(name, 20);
            JTextField surnameField = new JTextField(surname, 20);
            JTextField dobField = new JTextField(dob, 20);
            JTextField mathScoreField = new JTextField(String.valueOf(mathScore), 5);
            JTextField physicsScoreField = new JTextField(String.valueOf(physicsScore), 5);
            JTextField litteratureScoreField = new JTextField(String.valueOf(litteraturescore), 5);
            JTextField chemistryScoreField = new JTextField(String.valueOf(chemistryScore), 5);
            JTextField scienceScoreField = new JTextField(String.valueOf(scienceScore), 5);
            JTextField historyScoreField = new JTextField(String.valueOf(historyScore), 5);
            JTextField geographyScoreField = new JTextField(String.valueOf(geographyScore), 5);
            JTextField frenchScoreField = new JTextField(String.valueOf(frenchScore), 5);
            JTextField englishScoreField = new JTextField(String.valueOf(englishScore), 5);
            JTextField germanScoreField = new JTextField(String.valueOf(germanScore), 5);

            modifyPanel.add(new JLabel("Name:"));
            modifyPanel.add(nameField);
            modifyPanel.add(new JLabel("Surname:"));
            modifyPanel.add(surnameField);
            modifyPanel.add(new JLabel("Date of Birth (dd-MM-yyyy):"));
            modifyPanel.add(dobField);
            modifyPanel.add(new JLabel("Math Score:"));
            modifyPanel.add(mathScoreField);
            modifyPanel.add(new JLabel("Physics Score:"));
            modifyPanel.add(physicsScoreField);
            modifyPanel.add(new JLabel("Litterature Score:"));
            modifyPanel.add(litteratureScoreField);
            modifyPanel.add(new JLabel("Chemistry Score:"));
            modifyPanel.add(chemistryScoreField);
            modifyPanel.add(new JLabel("Science Score:"));
            modifyPanel.add(scienceScoreField);
            modifyPanel.add(new JLabel("History Score:"));
            modifyPanel.add(historyScoreField);
            modifyPanel.add(new JLabel("Geography Score:"));
            modifyPanel.add(geographyScoreField);
            modifyPanel.add(new JLabel("French Score:"));
            modifyPanel.add(frenchScoreField);
            modifyPanel.add(new JLabel("English Score:"));
            modifyPanel.add(englishScoreField);
            modifyPanel.add(new JLabel("German Score:"));
            modifyPanel.add(germanScoreField);

            int result = JOptionPane.showConfirmDialog(this, modifyPanel, "Modify Student",
                    JOptionPane.OK_CANCEL_OPTION);

            // Update student object with modified values
            String newName = nameField.getText();
            String newSurname = surnameField.getText();
            String newDateOfBirth = dobField.getText();
            String newMathScore = mathScoreField.getText();
            String newPhysicsScore = physicsScoreField.getText();
            String newLiterraturescore = litteratureScoreField.getText();
            String newChemistryScore = chemistryScoreField.getText();
            String newScienceScore = scienceScoreField.getText();
            String newHistoryScore = historyScoreField.getText();
            String newGeographyScore = geographyScoreField.getText();
            String newFrenchScore = geographyScoreField.getText();
            String newGermanScore = germanScoreField.getText();
            String newEnglishScore = englishScoreField.getText();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            if (newName != null) {
                selectedEtudiant.setNom(newName);
            }
            if (newSurname != null) {
                selectedEtudiant.setPrenom(newSurname);
            }

            try {
                formatter.parse(newDateOfBirth, LocalDate::from);
            } catch (DateTimeParseException e) {
                error = 1;
                genHtml += "- Date input is incorrect, it needs to follow: dd-MM-yyyy" + "<br>";
            }

            // Validate and update scores

            if (!isvalidScore(newMathScore)) {
                genHtml += "- Invalid Math Score. Please enter a score between 0 and 20. <br>";
                error = 1;
            } else {
                selectedEtudiant.setNoteMath(Double.parseDouble(newMathScore));
            }

            if (!isvalidScore(newPhysicsScore)) {
                genHtml += "- Invalid Physics Score. Please enter a score between 0 and 20. <br>";
                error = 1;
            } else {
                selectedEtudiant.setNotePhysique(Double.parseDouble(newPhysicsScore));
            }

            if (!isvalidScore(newLiterraturescore)) {
                genHtml += "- Invalid Literature Score. Please enter a score between 0 and 20. <br>";
                error = 1;
            } else {
                selectedEtudiant.setNoteLitterature(Double.parseDouble(newLiterraturescore));
            }

            if (!isvalidScore(newChemistryScore)) {
                genHtml += "Invalid Chemistry Score. Please enter a score between 0 and 20.";
                error = 1;
            } else {
                selectedEtudiant.setNoteChimie(Double.parseDouble(newChemistryScore));
            }

            if (!isvalidScore(newScienceScore)) {
                genHtml += "- Invalid Science Score. Please enter a score between 0 and 20.<br>";
                error = 1;
            } else {
                selectedEtudiant.setNoteSvt(Double.parseDouble(newScienceScore)); // Assuming you have a method
                                                                                  // setNoteScience
            }

            if (!isvalidScore(newHistoryScore)) {
                genHtml += "Invalid History Score. Please enter a score between 0 and 20.<br>";
                error = 1;
            } else {
                selectedEtudiant.setNoteHistoire(Double.parseDouble(newHistoryScore));
            }

            if (!isvalidScore(newGeographyScore)) {
                genHtml += "- Invalid Geography Score. Please enter a score between 0 and 20.<br>";
                error = 1;
            } else {
                selectedEtudiant.setNoteGeographie(Double.parseDouble(newGeographyScore));
            }

            if (!isvalidScore(newFrenchScore)) {
                genHtml += "- Invalid French Score. Please enter a score between 0 and 20.<br>";
                error = 1;
            } else {
                selectedEtudiant.setNoteFrancais(Double.parseDouble(newFrenchScore));
            }

            if (!isvalidScore(newEnglishScore)) {
                genHtml += "- Invalid English Score. Please enter a score between 0 and 20.<br>";
                error = 1;
            } else {
                selectedEtudiant.setNoteAnglais(Double.parseDouble(newEnglishScore));
            }

            if (!isvalidScore(newGermanScore)) {
                genHtml += "- Invalid German Score. Please enter a score between 0 and 20.<br>";
                error = 1;
            } else {
                selectedEtudiant.setNoteAllemand(Double.parseDouble(newGermanScore));
            }

            if (result == JOptionPane.CANCEL_OPTION || result == JOptionPane.CLOSED_OPTION) {
                return;
            }

            if (error == 1) {
                genHtml += "</html>";
                Dialogs.writeErr("Invalid input!", genHtml);
                return;
            }

            if (result == JOptionPane.OK_OPTION) {
                // Update database (replace placeholders with actual table and column names)
                try (PreparedStatement ps = connection.prepareStatement(
                        "UPDATE etudiant SET nom = ?, prenom = ?, dateDeNaissance = ?, noteMath = ?, notePhysique = ?, noteLitterature = ?, noteChimie = ?, noteSVT = ?, noteHistoire = ?, noteGeographie = ?, noteFrancais = ?, noteAnglais = ?, noteAllemand = ? , Moyenne= ?, Mention = ? WHERE idEtudiant = ?")) {
                    ps.setString(1, newName);
                    ps.setString(2, newSurname);
                    ps.setString(3, newDateOfBirth);
                    double math = Double.parseDouble(newMathScore);
                    ps.setDouble(4, math);
                    double physics = Double.parseDouble(newPhysicsScore);
                    ps.setDouble(5, physics);
                    double Literature = Double.parseDouble(newLiterraturescore);
                    ps.setDouble(6, Literature);
                    double chemistry = Double.parseDouble(newChemistryScore);
                    ps.setDouble(7, chemistry);
                    double science = Double.parseDouble(newScienceScore);
                    ps.setDouble(8, science);
                    double history = Double.parseDouble(newHistoryScore);
                    ps.setDouble(9, history);
                    double geography = Double.parseDouble(newGeographyScore);
                    ps.setDouble(10, geography);
                    double french = Double.parseDouble(newFrenchScore);
                    ps.setDouble(11, french);
                    double english = Double.parseDouble(newEnglishScore);
                    ps.setDouble(12, english);
                    double german = Double.parseDouble(newGermanScore);
                    ps.setDouble(13, german);
                    ps.setDouble(14, selectedEtudiant.moy.getMoy());
                    ps.setString(15, selectedEtudiant.moy.getMention());

                    ps.setInt(16, selectedEtudiant.getId());
                    ps.executeUpdate();
                    System.out.println("Student with ID " + selectedEtudiant.getId() + " updated in database");
                    Dialogs.SuccessDialog("Success", "Student modified successfully");
                } catch (SQLException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(this, "Error updating student in database", "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
                System.err
                        .println("**********************************************************************************");
                renderDatabase(connection, sortMode);
            }

        } else {
            Dialogs.writeErr("Error", "Select the student you want to modify!");
        }
    }

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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/db_icon.png")));
    }
}