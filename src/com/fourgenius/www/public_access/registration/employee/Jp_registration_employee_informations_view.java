/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fourgenius.www.public_access.registration.employee;

import com.fourgenius.www.public_access.registration.employee.Jp_registration_employee_informations_form_deactive_employee_table;
import com.fourgenius.www.public_access.registration.employee.Jp_registration_employee_informations_form_active_employee_table;
import com.fourgenius.www.private_access.admin.method.*;
import com.fourgenius.www.public_access.model.nonacademic_employee.*;
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
public class Jp_registration_employee_informations_view extends javax.swing.JPanel {

    /*
     * Creates new form Jp_registration_employee_informations_view
     */
    public Jp_registration_employee_informations_view() {
        initComponents();

        Jp_registration_employee_informations_form_active_employee_table active_employee = new Jp_registration_employee_informations_form_active_employee_table();
        Jp_registration_employee_informations_form_deactive_employee_table deactive_employee = new Jp_registration_employee_informations_form_deactive_employee_table();
        jTabbedPane1.add("Active Employee", active_employee);
        jTabbedPane1.add("De-active Employee", deactive_employee);
        jScrollPane1.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        _tf_registration_employee_informations_view_searchStudent = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        _li_registration_employee_informations_view_searchStudent = new javax.swing.JList();
        _bt_registration_employee_informations_view_search = new javax.swing.JButton();

        setBackground(new java.awt.Color(66, 66, 66));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setFocusable(false);
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 18, 980, 620));

        _tf_registration_employee_informations_view_searchStudent.setMaximumSize(new java.awt.Dimension(300, 50));
        _tf_registration_employee_informations_view_searchStudent.setMinimumSize(new java.awt.Dimension(300, 50));
        _tf_registration_employee_informations_view_searchStudent.setPreferredSize(new java.awt.Dimension(300, 50));
        _tf_registration_employee_informations_view_searchStudent.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                _tf_registration_employee_informations_view_searchStudentKeyReleased(evt);
            }
        });
        add(_tf_registration_employee_informations_view_searchStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(992, 38, -1, -1));

        _li_registration_employee_informations_view_searchStudent.setAlignmentX(1.0F);
        _li_registration_employee_informations_view_searchStudent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        _li_registration_employee_informations_view_searchStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                _li_registration_employee_informations_view_searchStudentMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(_li_registration_employee_informations_view_searchStudent);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(992, 88, 300, 540));

        _bt_registration_employee_informations_view_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/public_access/user/login/images/search_icon.png"))); // NOI18N
        _bt_registration_employee_informations_view_search.setContentAreaFilled(false);
        _bt_registration_employee_informations_view_search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        _bt_registration_employee_informations_view_search.setFocusPainted(false);
        _bt_registration_employee_informations_view_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _bt_registration_employee_informations_view_searchActionPerformed(evt);
            }
        });
        add(_bt_registration_employee_informations_view_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 38, 50, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void _tf_registration_employee_informations_view_searchStudentKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event__tf_registration_employee_informations_view_searchStudentKeyReleased
 if (_tf_registration_employee_informations_view_searchStudent.getText().isEmpty()) {
                jScrollPane1.setVisible(false);

            }

    }//GEN-LAST:event__tf_registration_employee_informations_view_searchStudentKeyReleased

    private void _bt_registration_employee_informations_view_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__bt_registration_employee_informations_view_searchActionPerformed
        try {
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
             ResultSet rs=statement.executeQuery("select employee_nonAcademic_administrative_user_info_nic from employee_nonAcademic_administrative_user_info where employee_nonAcademic_administrative_user_info_nic ='"+_tf_registration_employee_informations_view_searchStudent.getText()+"' ");
            Vector v = new Vector();

           
                while (rs.next()) {
                    v.add(rs.getString("employee_nonAcademic_administrative_user_info_nic"));

                

                _li_registration_employee_informations_view_searchStudent.setListData(v);

                if (_li_registration_employee_informations_view_searchStudent.getModel().getSize() == 0) {
                    jScrollPane1.setVisible(false);

                } else {
                    jScrollPane1.setVisible(true);
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event__bt_registration_employee_informations_view_searchActionPerformed

    private void _li_registration_employee_informations_view_searchStudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__li_registration_employee_informations_view_searchStudentMouseClicked
        String selection = _li_registration_employee_informations_view_searchStudent.getSelectedValue().toString();
        try {
            Connection connection = MC_JavaDataBaseConnection.myConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select b.employee_nonAcademic_user_info_name_first_name,b.employee_nonAcademic_user_info_name_last_name,b.employee_nonAcademic_user_info_name_sirName, a.employee_nonAcademic_administrative_user_info_id, a.employee_nonAcademic_administrative_user_info_email, a.employee_nonAcademic_administrative_user_info_status from employee_nonAcademic_administrative_user_info a left join employee_nonAcademic_user_info_name b on a.employee_nonAcademic_administrative_user_info_id=b.employee_nonAcademic_administrative_user_info_id where a.employee_nonAcademic_administrative_user_info_nic='" + selection + "'");

            if (rs.next()) {
                String state = rs.getString("employee_nonAcademic_administrative_user_info_status");
                if (state.equals("1")) {
                    jTabbedPane1.setSelectedIndex(0);
                    Jp_registration_employee_informations_form_active_employee_table active_table = new Jp_registration_employee_informations_form_active_employee_table();

                    DefaultTableModel dtm = (DefaultTableModel) active_table.jTable1.getModel();
                    dtm.setRowCount(0);
                    rs.close();
                    Vector v = new Vector();
                    ResultSet rs1 = statement.executeQuery("select b.employee_nonAcademic_user_info_name_first_name,b.employee_nonAcademic_user_info_name_last_name,b.employee_nonAcademic_user_info_name_sirName, a.employee_nonAcademic_administrative_user_info_id, a.employee_nonAcademic_administrative_user_info_email from employee_nonAcademic_administrative_user_info a left join employee_nonAcademic_user_info_name b on a.employee_nonAcademic_administrative_user_info_id=b.employee_nonAcademic_administrative_user_info_id where a.employee_nonAcademic_administrative_user_info_nic='" + selection + "' and a.employee_nonAcademic_administrative_user_info_status='1'");
                    if (rs1.next()) {
                        v.add(rs.getString("employee_nonAcademic_administrative_user_info_id"));
                        v.add(rs.getString("employee_nonAcademic_user_info_name_first_name") + " " + rs.getString("employee_nonAcademic_user_info_name_last_name") + " " + rs.getString("employee_nonAcademic_user_info_name_sirName"));
                        v.add(rs.getString("employee_nonAcademic_administrative_user_info_email"));

                    }
                    dtm.addRow(v);
                    dtm.setValueAt(selection, 0, 3);
                    rs1.close();
                } else {
                    jTabbedPane1.setSelectedIndex(1);
                    Jp_registration_employee_informations_form_deactive_employee_table deactive_employee = new Jp_registration_employee_informations_form_deactive_employee_table();
                    DefaultTableModel dtm = (DefaultTableModel) deactive_employee.jTable2.getModel();
                    deactive_employee.set_row_count();
                    
                    Vector v = new Vector();
                    ResultSet rs2 = statement.executeQuery("select b.employee_nonAcademic_user_info_name_first_name,b.employee_nonAcademic_user_info_name_last_name,b.employee_nonAcademic_user_info_name_sirName, a.employee_nonAcademic_administrative_user_info_id, a.employee_nonAcademic_administrative_user_info_email from employee_nonAcademic_administrative_user_info a left join employee_nonAcademic_user_info_name b on a.employee_nonAcademic_administrative_user_info_id=b.employee_nonAcademic_administrative_user_info_id where a.employee_nonAcademic_administrative_user_info_nic='" + selection + "' and a.employee_nonAcademic_administrative_user_info_status='0'");
                    if (rs2.next()) {
                        v.add(rs2.getString("employee_nonAcademic_administrative_user_info_id"));
                        v.add(rs2.getString("employee_nonAcademic_user_info_name_first_name") + " " + rs.getString("employee_nonAcademic_user_info_name_last_name") + " " + rs.getString("employee_nonAcademic_user_info_name_sirName"));
                        v.add(rs2.getString("employee_nonAcademic_administrative_user_info_email"));

                    }
                    dtm.addRow(v);
                    dtm.setValueAt(selection, 0, 3);
                    
                    rs2.close();
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event__li_registration_employee_informations_view_searchStudentMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton _bt_registration_employee_informations_view_search;
    private javax.swing.JList _li_registration_employee_informations_view_searchStudent;
    private javax.swing.JTextField _tf_registration_employee_informations_view_searchStudent;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
