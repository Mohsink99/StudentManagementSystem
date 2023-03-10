/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package Student_Management;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mohsi
 */
public class Admin_Dash extends javax.swing.JFrame {

    /**
     * Creates new form Admin_Dash
     */
    public Admin_Dash() {
        initComponents();
        show_user();
        show_course();

        try {
            ArrayList<String> strarr = new ArrayList<String>();
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb", "root", "root");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from courses");
            courses.removeAllItems();
            while (rs.next()) {
                String course = rs.getString("course_Name");
                strarr.add(course);
            }
//            DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(yourStringArray);
//            txtcourse1.setModel(model);
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public ArrayList<All_Students> User_data() {
        ArrayList<All_Students> userdata = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb", "root", "root");

            String que = "select *from std_registration";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(que);
            All_Students data;
            while (rs.next()) {
                data = new All_Students(rs.getString("Name"), rs.getString("Mobile"), rs.getString("Email"), rs.getString("StudentID"), rs.getString("Password"), rs.getString("State"), rs.getString("City"), rs.getString("Course"), rs.getString("Fees"), rs.getString("Paid"), rs.getString("Remaining"), rs.getString("Date"));
                userdata.add(data);

            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return userdata;
    }

    private void show_user() {
        ArrayList<All_Students> list = User_data();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object[] row = new Object[12];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getName();
            row[1] = list.get(i).getMobile();
            row[2] = list.get(i).getEmail();
            row[3] = list.get(i).getStudentID();
            row[4] = list.get(i).getPassword();
            row[5] = list.get(i).getState();
            row[6] = list.get(i).getCity();
            row[7] = list.get(i).getCourse();
            row[8] = list.get(i).getFees();
            row[9] = list.get(i).getPaid();
            row[10] = list.get(i).getRemaining();
            row[11] = list.get(i).getDate();
            model.addRow(row);
        }
    }

    public ArrayList<All_courses> Coursedata() {
        ArrayList<All_courses> coursedata = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb", "root", "root");

            String que = "select*from courses";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(que);
            All_courses data;
            while (rs.next()) {
                data = new All_courses(rs.getString("course_name"), rs.getString("Fees"));
                coursedata.add(data);

            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return coursedata;
    }
    


    private void show_course() {
        ArrayList<All_courses> list = Coursedata();
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        Object[] row = new Object[2];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getCourse();
            row[1] = list.get(i).getFees();

            model.addRow(row);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        logout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        corse = new javax.swing.JButton();
        students = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtfees = new javax.swing.JTextField();
        courses = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(162, 173, 183));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(112, 125, 137));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logout.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        logout.setText("LogOut");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jPanel3.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 517, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 62, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(0, 2));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 98, 230, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 102));
        jPanel4.setPreferredSize(new java.awt.Dimension(0, 2));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 197, 230, -1));

        jPanel5.setBackground(new java.awt.Color(255, 255, 102));
        jPanel5.setPreferredSize(new java.awt.Dimension(0, 2));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 307, 230, -1));

        corse.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        corse.setText("Courses");
        corse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corseActionPerformed(evt);
            }
        });
        jPanel3.add(corse, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 138, -1, 30));

        students.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        students.setText("View Students");
        students.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentsActionPerformed(evt);
            }
        });
        jPanel3.add(students, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 26, -1, 30));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton4.setText("Add installment");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 245, -1, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\mohsi\\OneDrive\\Pictures\\Bird.jpg")); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 590));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 620));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 606));

        jPanel8.setBackground(new java.awt.Color(204, 255, 204));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Mobile", "Email", "StudentID", "Password", "State", "City", "Course", "Fees", "Paid", "Remaining", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jScrollPane2.setViewportView(jScrollPane1);

        jPanel8.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 600));

        jLabel7.setText("jLabel7");
        jPanel8.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTabbedPane1.addTab("View Students", jPanel8);

        jPanel9.setBackground(new java.awt.Color(255, 255, 204));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel3.setText("Courses");
        jPanel9.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 21, 82, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        jLabel4.setText("Fees");
        jPanel9.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 144, 46, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        jLabel5.setText("Course Name");
        jPanel9.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 84, 116, 30));

        txtfees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfeesActionPerformed(evt);
            }
        });
        jPanel9.add(txtfees, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 144, 149, 28));

        courses.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        courses.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                coursesItemStateChanged(evt);
            }
        });
        courses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coursesActionPerformed(evt);
            }
        });
        jPanel9.add(courses, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 86, 168, 30));

        jButton5.setBackground(new java.awt.Color(153, 204, 0));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5.setText("Add");
        jPanel9.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 213, -1, -1));

        jButton6.setBackground(new java.awt.Color(153, 204, 0));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton6.setText("Edit");
        jPanel9.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 310, -1, 40));

        jButton9.setBackground(new java.awt.Color(153, 204, 0));
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton9.setText("Delete");
        jPanel9.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 400, -1, 30));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Courses", "Fees"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable2);

        jPanel9.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 510, 330));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\mohsi\\OneDrive\\Pictures\\Bird.jpg")); // NOI18N
        jPanel9.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 590));

        jTabbedPane1.addTab("Course", jPanel9);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, -24, -1, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        LoginFrame lg = new LoginFrame();
        lg.setVisible(true);
    }//GEN-LAST:event_logoutActionPerformed

    private void corseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_corseActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(1);

    }//GEN-LAST:event_corseActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Add_Installment ad = new Add_Installment();
        ad.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void studentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentsActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(0);

    }//GEN-LAST:event_studentsActionPerformed

    private void coursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coursesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_coursesActionPerformed

    private void coursesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_coursesItemStateChanged
        // TODO add your handling code here:
        //        System.out.println(txtcourse.getSelectedItem());
        //        String course = (String) txtcourse.getSelectedItem();
        //        try {
            //            Class.forName("com.mysql.cj.jdbc.Driver");
            //            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb", "root", "root");
            //            Statement st = con.createStatement();
            //            ResultSet rs = st.executeQuery("select * from courses where  course_Name = '" + course + "'");
            //            while (rs.next()) {
                //                String coursefee = rs.getString("Fees");
                //                txtfees.setText(coursefee);
                //            }
            //        } catch (ClassNotFoundException | SQLException e) {
            //            JOptionPane.showMessageDialog(null, e);
            //        }
    }//GEN-LAST:event_coursesItemStateChanged

    private void txtfeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfeesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfeesActionPerformed

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
            java.util.logging.Logger.getLogger(Admin_Dash.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Dash.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Dash.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Dash.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Dash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton corse;
    private javax.swing.JComboBox<String> courses;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton logout;
    private javax.swing.JButton students;
    private javax.swing.JTextField txtfees;
    // End of variables declaration//GEN-END:variables
}
