/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fourgenius.www.public_access.registration;

/**
 *
 * @author Pamitha Gayashan
 */
public class Jp_registration_lecture_table_view extends javax.swing.JPanel {

    /**
     * Creates new form Jp_registration_lecture_table_view
     */
    public Jp_registration_lecture_table_view() {
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

        _tf_registration_student_searchStudent = new javax.swing.JTextField();
        sp_registration_student_searchStudent = new javax.swing.JScrollPane();
        _li_registration_student_searchStudent = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        aca_emp = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbl_admin_Administrators4 = new javax.swing.JTable();

        setBackground(new java.awt.Color(66, 66, 66));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(_tf_registration_student_searchStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 10, 300, 50));

        sp_registration_student_searchStudent.setViewportView(_li_registration_student_searchStudent);

        add(sp_registration_student_searchStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 60, 300, 570));

        jLabel1.setText("jLabel1");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel1.setPreferredSize(new java.awt.Dimension(50, 50));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 10, -1, -1));

        jPanel1.setLayout(new java.awt.CardLayout());

        jTabbedPane2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTabbedPane1.setFocusable(false);
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        aca_emp.setBackground(new java.awt.Color(207, 216, 220));
        aca_emp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        aca_emp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        aca_emp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Lecture ID", "Name", "Email", "NIC No", "Password"
            }
        ));
        aca_emp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane2.setViewportView(aca_emp);

        jTabbedPane1.addTab("Active Lecture", jScrollPane2);

        tbl_admin_Administrators4.setBackground(new java.awt.Color(207, 216, 220));
        tbl_admin_Administrators4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        tbl_admin_Administrators4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tbl_admin_Administrators4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Lecture ID", "Name", "Email", "NIC No", "Password"
            }
        ));
        jScrollPane5.setViewportView(tbl_admin_Administrators4);

        jTabbedPane1.addTab("De-active Lecture", jScrollPane5);

        jTabbedPane2.addTab("Lecture", jTabbedPane1);

        jPanel1.add(jTabbedPane2, "card2");

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 990, 620));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList _li_registration_student_searchStudent;
    private javax.swing.JTextField _tf_registration_student_searchStudent;
    private javax.swing.JTable aca_emp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JScrollPane sp_registration_student_searchStudent;
    private javax.swing.JTable tbl_admin_Administrators4;
    // End of variables declaration//GEN-END:variables
}