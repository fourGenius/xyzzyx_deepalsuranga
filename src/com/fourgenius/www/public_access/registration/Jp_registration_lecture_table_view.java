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

    Jp_registration_lecture_informations_form_active_lectures_table active_lecture=new Jp_registration_lecture_informations_form_active_lectures_table();
    Jp_registration_lecture_informations_form_deactive_lecture_table deactive_lecture=new Jp_registration_lecture_informations_form_deactive_lecture_table();
    /**
     * Creates new form Jp_registration_lecture_table_view
     */
    public Jp_registration_lecture_table_view() {
        initComponents();
        _tp_registration_lecture_tables.add("Active Lectures", active_lecture);
        _tp_registration_lecture_tables.add("Deactive Lectures", deactive_lecture);
        
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
        _tp_registration_lecture_tables = new javax.swing.JTabbedPane();

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

        _tp_registration_lecture_tables.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(_tp_registration_lecture_tables, "card2");

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 990, 620));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList _li_registration_student_searchStudent;
    private javax.swing.JTextField _tf_registration_student_searchStudent;
    private javax.swing.JTabbedPane _tp_registration_lecture_tables;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane sp_registration_student_searchStudent;
    // End of variables declaration//GEN-END:variables
}
