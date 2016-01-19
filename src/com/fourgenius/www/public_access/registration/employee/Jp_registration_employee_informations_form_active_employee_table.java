/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fourgenius.www.public_access.registration.employee;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import public_access.MC_JavaDataBaseConnection;

/**
 *
 * @author Dineth Jayasekera
 */
public class Jp_registration_employee_informations_form_active_employee_table extends javax.swing.JPanel {

    /*
     * Creates new form
     * Jp_registration_lecture_informations_form_active_employee_table
     */
    public Jp_registration_employee_informations_form_active_employee_table() {
        initComponents();
        addToTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.setEditingRow(0);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 970, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

   public void addToTable() {
        try {

            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            Vector id = new Vector();
            Vector name_add = new Vector();
            Vector email = new Vector();
            Vector nic = new Vector();

            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();

            ResultSet info = statement.executeQuery("select * from employee_nonAcademic_administrative_user_info where employee_nonAcademic_administrative_user_info_status='1'");
            while (info.next()) {

                id.add(info.getString("employee_nonAcademic_administrative_user_info_id"));

            }
            dtm.addColumn("Employee ID", id);
            info.close();

            ResultSet name = statement.executeQuery("select b.employee_nonAcademic_user_info_name_first_name,"
                    + "b.employee_nonAcademic_user_info_name_last_name,b.employee_nonAcademic_user_info_name_sirName "
                    + "from employee_nonAcademic_administrative_user_info a"
                    + " left join employee_nonAcademic_user_info_name b on "
                    + "a.employee_nonAcademic_administrative_user_info_id=b.employee_nonAcademic_administrative_user_info_id"
                    + " where a.employee_nonAcademic_administrative_user_info_status='1'");
            while (name.next()) {

                name_add.add(name.getString("employee_nonAcademic_user_info_name_first_name") + " " + name.getString("employee_nonAcademic_user_info_name_last_name") + " " + name.getString("employee_nonAcademic_user_info_name_sirName"));

            }
            dtm.addColumn("Name", name_add);
            name.close();

            info = statement.executeQuery("select * from employee_nonAcademic_administrative_user_info where employee_nonAcademic_administrative_user_info_status='1'");
            while (info.next()) {

                email.add(info.getString("employee_nonAcademic_administrative_user_info_email"));
                nic.add(info.getString("employee_nonAcademic_administrative_user_info_nic"));

            }
            info.close();
            dtm.addColumn("Email", email);
            dtm.addColumn("NIC", nic);
          jTable1.setEnabled(false);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
