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
public class Jp_registration_lecture_informations_form_deactive_lecture_table extends javax.swing.JPanel {

    /**
     * Creates new form
     * Jp_registration_lecture_informations_form_deactive_lecture_table
     */
    public Jp_registration_lecture_informations_form_deactive_lecture_table() {
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

        jScrollPane5 = new javax.swing.JScrollPane();
        tbl_admin_Administrators4 = new javax.swing.JTable();

        tbl_admin_Administrators4.setBackground(new java.awt.Color(207, 216, 220));
        tbl_admin_Administrators4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        tbl_admin_Administrators4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tbl_admin_Administrators4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Lecture ID", "Name", "Email", "NIC No", "Password"
            }
        ));
        jScrollPane5.setViewportView(tbl_admin_Administrators4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 980, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable tbl_admin_Administrators4;
    // End of variables declaration//GEN-END:variables
}
