
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mohsi
 */
public class Add_Installment extends javax.swing.JFrame {

    private String Name;

    /**
     * Creates new form Add_Installment
     */
    public Add_Installment() {
        initComponents();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb", "root", "root");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from std_Registration");
            while (rs.next()) {
                String std_Registration = rs.getString("Name");
                students.addItem(std_Registration);
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

        try {
            ArrayList<String> strarr = new ArrayList<String>();
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb", "root", "root");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from std_Registration");
            students.removeAllItems();
            while (rs.next()) {
                String courses = rs.getString("Name");
                students.addItem(courses);
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

        jPanel1 = new javax.swing.JPanel();
        installment = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        students = new javax.swing.JComboBox<>();
        amountpaid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(115, 130, 135));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        installment.setBackground(new java.awt.Color(162, 173, 185));
        installment.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        installment.setText("Add Installment");
        installment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                installmentActionPerformed(evt);
            }
        });
        jPanel1.add(installment, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 298, 187, 31));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Amount Paid      :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 184, 139, 23));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Select Student    :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 76, 147, 23));

        students.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        students.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                studentsItemStateChanged(evt);
            }
        });
        jPanel1.add(students, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 75, 189, 29));

        amountpaid.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                amountpaidComponentMoved(evt);
            }
        });
        jPanel1.add(amountpaid, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 183, 161, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\mohsi\\OneDrive\\Pictures\\Bird.jpg")); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 410));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void studentsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_studentsItemStateChanged
        // TODO add your handling code here:
//        System.out.println(students.getSelectedItem());
//        String Student = (String) students.getSelectedItem();
////        
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb", "root", "root");
//            Statement st = con.createStatement();
//            ResultSet rs = st.executeQuery("select * from std_registration where name = '" + Name + "'");
////            while (rs.next()) {
////                String coursefee = rs.getString("Fees");
////                students.setText(coursefee);
////            }
//        } catch (ClassNotFoundException | SQLException e) {
//            JOptionPane.showMessageDialog(null, e);
//        }
    }//GEN-LAST:event_studentsItemStateChanged

    private void amountpaidComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_amountpaidComponentMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_amountpaidComponentMoved

    private void installmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_installmentActionPerformed
        // TODO add your handling code here:
        //    update std_regis set paid = paid + txtamt.getText() where name = txtname.getText();
        String studname = students.getSelectedItem().toString();
        double amountpaid = 0.0;
        amountpaid = Double.parseDouble(this.amountpaid.getText());
        
         try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb", "root", "root");
            Statement st = con.createStatement();
            int x = st.executeUpdate("UPDATE std_Registration SET paid = paid +" +amountpaid+" WHERE name = '" + studname + "'");
            if(x == 1){
                JOptionPane.showMessageDialog(rootPane, "Updated successfully... " + x);
            }else{
                JOptionPane.showMessageDialog(rootPane, "Cannot Update successfully... " + x);
            }            
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_installmentActionPerformed

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
            java.util.logging.Logger.getLogger(Add_Installment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_Installment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_Installment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Installment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_Installment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amountpaid;
    private javax.swing.JButton installment;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> students;
    // End of variables declaration//GEN-END:variables
}
