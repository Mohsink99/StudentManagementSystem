/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package student_management;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author mohsi
 */
public class Student_Registration extends javax.swing.JFrame {
   
    /**
     * Creates new form Student_Registration
     */
    public Student_Registration() {
        initComponents();
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        txtdate.setText(sdf.format(date));

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb", "root", "root");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from std_Registration");
            while (rs.next()) {
                String std_Registration = rs.getString("Name");
                txtstate.addItem(std_Registration);
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

        try {
            ArrayList<String> strarr = new ArrayList<String>();
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb", "root", "root");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from courses");
            txtcourse1.removeAllItems();
            while (rs.next()) {
                String courses = rs.getString("course_Name");
                txtcourse1.addItem(courses);
                strarr.add(courses);
            }
//            DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(yourStringArray);
//            txtcourse1.setModel(model);
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
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

        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtmob = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txtfees = new javax.swing.JTextField();
        txtpaid = new javax.swing.JTextField();
        txtremaining = new javax.swing.JTextField();
        txtcity1 = new javax.swing.JComboBox<>();
        txtcourse1 = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();
        btnlogin = new javax.swing.JButton();
        btnregister = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();
        txtpass = new javax.swing.JPasswordField();
        jLabel29 = new javax.swing.JLabel();
        txtdate = new javax.swing.JTextField();
        txtstate = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        jLabel14.setText("jLabel14");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(218, 245, 128));
        jPanel2.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Segoe UI Black", 3, 24)); // NOI18N
        jLabel16.setText("Student Registration");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 11, -1, 43));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setText("Name");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 82, 95, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setText("Mobile");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 158, 95, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel19.setText("Email");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 219, 95, -1));
        jPanel2.add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 84, 219, 30));
        jPanel2.add(txtmob, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 158, 219, 30));
        jPanel2.add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 221, 219, 30));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel20.setText("Student_ID");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 295, -1, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel21.setText("Password");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 375, -1, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel22.setText("State");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 451, 95, 34));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel23.setText("City");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 538, -1, -1));
        jPanel2.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 297, 219, 30));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel24.setText("Course");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 613, 95, -1));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel25.setText("Fees");
        jLabel25.setToolTipText("");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 688, -1, -1));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel26.setText("Paid");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 765, 47, -1));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel27.setText("Remaining");
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 852, -1, -1));
        jPanel2.add(txtfees, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 688, 219, 30));
        jPanel2.add(txtpaid, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 767, 219, 30));

        txtremaining.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtremainingActionPerformed(evt);
            }
        });
        jPanel2.add(txtremaining, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 854, 219, 30));

        txtcity1.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        txtcity1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ahmednagar ", "Akola ", "Amravati ", "Aurangabad ", "Beed ", "Bhandara ", "Buldhana ", "Chandrapur ", "Dhule ", "Gadchiroli ", "Gondia ", "Hingoli ", "Jalgaon ", "Jalna ", "Kolhapur ", "Latur ", "1Mumbai City ", "Mumbai Suburban", "Nagpur ", "Nanded ", "Nandurbar ", "Nashik ", "Osmanabad", "Palghar ", "Parbhani ", "Pune ", "Raigad ", "Ratnagiri ", "Sangli ", "Satara ", "Sindhudurg", "Solapur ", "Thane ", "Wardha ", "Washim ", "Yavatmal ", " " }));
        jPanel2.add(txtcity1, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 538, 219, 30));

        txtcourse1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtcourse1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                txtcourse1ItemStateChanged(evt);
            }
        });
        txtcourse1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcourse1ActionPerformed(evt);
            }
        });
        jPanel2.add(txtcourse1, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 613, 219, 30));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel28.setText("Already Registered");
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 1135, -1, 29));

        btnlogin.setBackground(new java.awt.Color(102, 255, 102));
        btnlogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnlogin.setText("LOGIN");
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });
        jPanel2.add(btnlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 1137, -1, -1));

        btnregister.setBackground(new java.awt.Color(153, 255, 153));
        btnregister.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnregister.setText("Register");
        btnregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregisterActionPerformed(evt);
            }
        });
        jPanel2.add(btnregister, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 1039, -1, 37));

        btncancel.setBackground(new java.awt.Color(255, 51, 51));
        btncancel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btncancel.setText("Cancel");
        btncancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncancelMouseClicked(evt);
            }
        });
        btncancel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btncancelKeyPressed(evt);
            }
        });
        jPanel2.add(btncancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 1137, 91, -1));
        jPanel2.add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 375, 219, 30));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel29.setText("Date");
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 942, -1, -1));

        txtdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdateActionPerformed(evt);
            }
        });
        jPanel2.add(txtdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 945, 114, 28));

        txtstate.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        txtstate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AP|Andhra Pradesh", "AR|Arunachal Pradesh", "AS|Assam", "BR|Bihar", "CT|Chhattisgarh", "GA|Goa", "GJ|Gujarat", "HR|Haryana", "HP|Himachal Pradesh", "JK|Jammu and Kashmir", "JH|Jharkhand", "KA|Karnataka", "KL|Kerala", "MP|Madhya Pradesh", "MH|Maharashtra", "MN|Manipur", "ML|Meghalaya", "MZ|Mizoram", "NL|Nagaland", "OR|Odisha", "PB|Punjab", "RJ|Rajasthan", "SK|Sikkim", "TN|Tamil Nadu", "TG|Telangana", "TR|Tripura", "UT|Uttarakhand", "UP|Uttar Pradesh", "WB|West Bengal", "AN|Andaman and Nicobar Islands", "CH|Chandigarh", "DN|Dadra and Nagar Haveli", "DD|Daman and Diu", "DL|Delhi", "LD|Lakshadweep", "PY|Puducherry" }));
        txtstate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstateActionPerformed(evt);
            }
        });
        jPanel2.add(txtstate, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 454, -1, 34));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\mohsi\\OneDrive\\Pictures\\Bird.jpg")); // NOI18N
        jLabel1.setVerifyInputWhenFocusTarget(false);
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 1220));

        jScrollPane1.setViewportView(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1234, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
        this.setVisible(false);
        LoginFrame lg = new LoginFrame();
        lg.setVisible(true);

    }//GEN-LAST:event_btnloginActionPerformed

    private void btnregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregisterActionPerformed
        // TODO add your handling code here:
        String Name = txtname.getText();
        String Mobile = txtmob.getText();
        String Email = txtemail.getText();
        String Student_ID;
        Student_ID = txtid.getText();
        String Password = txtpass.getText();
        String State = txtstate.getEditor().getItem().toString();
        String City = txtcity1.getEditor().getItem().toString();
        String Course = txtcourse1.getEditor().getItem().toString();
        String Fees = txtfees.getText();
        String Paid = txtpaid.getText();
        String Remaining = txtremaining.getText();
        String Date = txtdate.getText();

        try {
            if (txtname.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "please Enter Name");
            } else if (txtemail.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "Email is empty");
            } else if (txtpass.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "Password is empty");
            } else if (txtmob.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "Mobile no  is empty");

            } else if (txtid.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "please write StudentID ");

            } else if (txtstate.getEditor().getItem().toString().length() == 0) {
                JOptionPane.showMessageDialog(null, "please Enter state Name");
            } else if (txtcity1.getEditor().getItem().toString().length() == 0) {
                JOptionPane.showMessageDialog(null, "please Enter city Name");
            } else if (txtcourse1.getEditor().getItem().toString().length() == 0) {
                JOptionPane.showMessageDialog(null, "please Enter course");
            } else if (txtfees.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "please Enter fees amount");
            } else if (txtpaid.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "please Enter paid amount");
//            } else if (txtremaining.getText().length() == 0) {
//                JOptionPane.showMessageDialog(null, "please Enter remaining amount");
                
                //System.out.println(" txtpaid  " + txtpaid);
                
            } else if (txtdate.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "please enter date");

            } else {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb", "root", "root");
                Statement st = con.createStatement();
                int x = st.executeUpdate("insert into std_registration values('" + Name + "','" + Mobile + "','" + Email + "','" + Student_ID + "','" + Password + "','" + State + "','" + City + "','" + Course + "','" + Fees + "','" + Paid + "','" + Remaining + "','" + Date + "')");

                JOptionPane.showMessageDialog(null, "Register successfull");
            }

        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnregisterActionPerformed

    private void txtstateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstateActionPerformed

    private void txtdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdateActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtdateActionPerformed

    private void btncancelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btncancelKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_btncancelKeyPressed

    private void btncancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncancelMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btncancelMouseClicked

    private void txtcourse1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcourse1ActionPerformed

    }//GEN-LAST:event_txtcourse1ActionPerformed

    private void txtcourse1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_txtcourse1ItemStateChanged
        System.out.println(txtcourse1.getSelectedItem());
        String course = (String) txtcourse1.getSelectedItem();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb", "root", "root");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from courses where course_Name = '" + course + "'");
            while (rs.next()) {
                String coursefee = rs.getString("Fees");
                txtfees.setText(coursefee);
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }


    }//GEN-LAST:event_txtcourse1ItemStateChanged

    private void txtremainingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtremainingActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtremainingActionPerformed

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
            java.util.logging.Logger.getLogger(Student_Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student_Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student_Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student_Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Student_Registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btnlogin;
    private javax.swing.JButton btnregister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> txtcity1;
    private javax.swing.JComboBox<String> txtcourse1;
    private javax.swing.JTextField txtdate;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtfees;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtmob;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtpaid;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txtremaining;
    private javax.swing.JComboBox<String> txtstate;
    // End of variables declaration//GEN-END:variables

    private void initComponent() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Object getEditor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
