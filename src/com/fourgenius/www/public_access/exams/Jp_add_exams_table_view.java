/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fourgenius.www.public_access.exams;

import com.fourgenius.www.public_access.registration.lecture.*;
import com.fourgenius.www.public_access.model.academic_employee.employee_academic_user_info_name;
import static com.fourgenius.www.public_access.registration.lecture.Jp_registration_lecture.Jp_registraion_lecture_main_panel;
import static com.fourgenius.www.public_access.registration.lecture.Jp_registration_lecture._bt_registraion_lecture_buttons_add_lecture;
import static com.fourgenius.www.public_access.registration.lecture.Jp_registration_lecture._bt_registraion_lecture_buttons_preview_lecture;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import net.java.balloontip.BalloonTip;
import public_access.MC_JavaDataBaseConnection;

/**
 *
 * @author Pamitha Gayashan
 */
public class Jp_add_exams_table_view extends javax.swing.JPanel {

    DefaultTableModel dtm;
    TableRowSorter<DefaultTableModel> sorter;
    Border border = BorderFactory.createLineBorder(Color.white, 1);

    /**
     * Creates new form Jp_registration_lecture_table_view
     */
    public Jp_add_exams_table_view() {
        initComponents();
        _sp_registration_student_searchStudent.setVisible(false);
        _bt_update_exam.setEnabled(false);
        _bt_exam_preview.setEnabled(false);
        add_active_table_data();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        _tf_add_exams_searchExams = new javax.swing.JTextField();
        _sp_registration_student_searchStudent = new javax.swing.JScrollPane();
        _li_add_exams_searchExams = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        _tb_add_exams_view_table = new javax.swing.JTable();
        _bt_exam_preview = new javax.swing.JButton();
        _bt_update_exam = new javax.swing.JButton();

        setBackground(new java.awt.Color(66, 66, 66));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        _tf_add_exams_searchExams.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _tf_add_exams_searchExams.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _tf_add_exams_searchExamsActionPerformed(evt);
            }
        });
        _tf_add_exams_searchExams.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                _tf_add_exams_searchExamsKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                _tf_add_exams_searchExamsKeyReleased(evt);
            }
        });
        add(_tf_add_exams_searchExams, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 10, 310, 50));

        _li_add_exams_searchExams.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _li_add_exams_searchExams.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                _li_add_exams_searchExamsMouseClicked(evt);
            }
        });
        _sp_registration_student_searchStudent.setViewportView(_li_add_exams_searchExams);

        add(_sp_registration_student_searchStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 60, 310, 490));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/public_access/user/login/images/search_icon.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 10, -1, -1));

        jPanel1.setLayout(new java.awt.CardLayout());

        _tb_add_exams_view_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Exam ID", "Exam Name", "Course", "Date", "Branch"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        _tb_add_exams_view_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                _tb_add_exams_view_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(_tb_add_exams_view_table);

        jPanel1.add(jScrollPane1, "card2");

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 980, 540));

        _bt_exam_preview.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _bt_exam_preview.setForeground(new java.awt.Color(255, 255, 255));
        _bt_exam_preview.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/public_access/user/login/images_butons/buton_blue_200x50.png"))); // NOI18N
        _bt_exam_preview.setText("Preview");
        _bt_exam_preview.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        _bt_exam_preview.setFocusPainted(false);
        _bt_exam_preview.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _bt_exam_preview.setMaximumSize(new java.awt.Dimension(200, 50));
        _bt_exam_preview.setPreferredSize(new java.awt.Dimension(200, 50));
        _bt_exam_preview.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                _bt_exam_previewMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                _bt_exam_previewMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                _bt_exam_previewMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                _bt_exam_previewMouseReleased(evt);
            }
        });
        _bt_exam_preview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _bt_exam_previewActionPerformed(evt);
            }
        });
        add(_bt_exam_preview, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 560, -1, -1));

        _bt_update_exam.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _bt_update_exam.setForeground(new java.awt.Color(255, 255, 255));
        _bt_update_exam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/public_access/user/login/images_butons/buton_blue_200x50.png"))); // NOI18N
        _bt_update_exam.setText("Update Exam");
        _bt_update_exam.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        _bt_update_exam.setFocusPainted(false);
        _bt_update_exam.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _bt_update_exam.setPreferredSize(new java.awt.Dimension(200, 50));
        _bt_update_exam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                _bt_update_examMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                _bt_update_examMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                _bt_update_examMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                _bt_update_examMouseReleased(evt);
            }
        });
        _bt_update_exam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _bt_update_examActionPerformed(evt);
            }
        });
        add(_bt_update_exam, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 560, 200, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void _tf_add_exams_searchExamsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event__tf_add_exams_searchExamsKeyReleased

        try {
            if (_tf_add_exams_searchExams.getText().isEmpty()) {
                _sp_registration_student_searchStudent.setVisible(false);
            } else {
                String text = _tf_add_exams_searchExams.getText();
                char first = text.charAt(0);
                if (Character.isDigit(first)) {
                    Connection c = MC_JavaDataBaseConnection.myConnection();
                    Statement s = c.createStatement();

                    ResultSet rs = s.executeQuery("SELECT b.stu_info_name_first_name, b.stu_info_name_last_name FROM stu_info_personal a LEFT JOIN stu_info_name b ON a.stu_user_info_id=b.stu_user_info_id LEFT JOIN stu_user_info c ON a.stu_user_info_id=c.stu_user_info_id WHERE a.stu_info_personal_nic like '" + _tf_add_exams_searchExams.getText() + "' AND c.stu_user_info_status='1'");
                    Vector v = new Vector();
                    while (rs.next()) {
                        v.add(rs.getString("stu_info_name_first_name") + " " + rs.getString("stu_info_name_last_name"));
                    }
                    rs.close();
                    _li_add_exams_searchExams.setListData(v);
                    _sp_registration_student_searchStudent.setVisible(false);
                    if (_li_add_exams_searchExams.getModel().getSize() == 0) {
                        _sp_registration_student_searchStudent.setVisible(false);
                    } else {
                        _sp_registration_student_searchStudent.setVisible(true);
                    }
                    if (evt.getKeyCode() == 40) {
                        _sp_registration_student_searchStudent.setVisible(true);
                        _li_add_exams_searchExams.grabFocus();
                    }
                } else {
                    try {

                        if (_tf_add_exams_searchExams.getText().isEmpty()) {
                            _sp_registration_student_searchStudent.setVisible(false);
                        } else {
                            Connection c = MC_JavaDataBaseConnection.myConnection();
                            Statement s = c.createStatement();

                            ResultSet rs = s.executeQuery("SELECT b.stu_info_name_first_name, b.stu_info_name_last_name FROM stu_info_personal a LEFT JOIN stu_info_name b ON a.stu_user_info_id=b.stu_user_info_id LEFT JOIN stu_user_info c ON a.stu_user_info_id=c.stu_user_info_id WHERE CONCAT (b.stu_info_name_first_name, ' ', b.stu_info_name_last_name) like '" + _tf_add_exams_searchExams.getText() + "%' AND c.stu_user_info_status='1'");
                            Vector v = new Vector();
                            while (rs.next()) {
                                v.add(rs.getString("stu_info_name_first_name") + " " + rs.getString("stu_info_name_last_name"));
                            }
                            rs.close();
                            _li_add_exams_searchExams.setListData(v);
                            _sp_registration_student_searchStudent.setVisible(false);
                            if (_li_add_exams_searchExams.getModel().getSize() == 0) {
                                _sp_registration_student_searchStudent.setVisible(false);
                            } else {
                                _sp_registration_student_searchStudent.setVisible(true);
                            }
                        }
                        if (evt.getKeyCode() == 40) {
                            _sp_registration_student_searchStudent.setVisible(true);
                            _li_add_exams_searchExams.grabFocus();
                        }

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event__tf_add_exams_searchExamsKeyReleased

    private void _tf_add_exams_searchExamsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event__tf_add_exams_searchExamsKeyPressed

    }//GEN-LAST:event__tf_add_exams_searchExamsKeyPressed

    private void _tf_add_exams_searchExamsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__tf_add_exams_searchExamsActionPerformed

    }//GEN-LAST:event__tf_add_exams_searchExamsActionPerformed

    private void _li_add_exams_searchExamsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__li_add_exams_searchExamsMouseClicked
        DefaultTableModel dtm = (DefaultTableModel) _tb_add_exams_view_table.getModel();
        _tf_add_exams_searchExams.setText(_li_add_exams_searchExams.getSelectedValue().toString());
        _sp_registration_student_searchStudent.setVisible(false);
        String name = _li_add_exams_searchExams.getSelectedValue().toString();
        for (int row = 0; row < _tb_add_exams_view_table.getRowCount(); row++) {
            String next = _tb_add_exams_view_table.getValueAt(row, 1).toString();
            if (next.equals(name)) {
                _tb_add_exams_view_table.setRowSelectionInterval(row, row);
            }
        }
        search_lecture();
    }//GEN-LAST:event__li_add_exams_searchExamsMouseClicked

    private void _bt_exam_previewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_exam_previewMouseEntered
        _bt_exam_preview.setBorder(border);
    }//GEN-LAST:event__bt_exam_previewMouseEntered

    private void _bt_exam_previewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_exam_previewMouseExited
        _bt_exam_preview.setBorder(null);
    }//GEN-LAST:event__bt_exam_previewMouseExited

    private void _bt_exam_previewMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_exam_previewMousePressed
        _bt_exam_preview.setBorder(null);
    }//GEN-LAST:event__bt_exam_previewMousePressed

    private void _bt_exam_previewMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_exam_previewMouseReleased
        _bt_exam_preview.setBorder(border);
    }//GEN-LAST:event__bt_exam_previewMouseReleased

    private void _bt_exam_previewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__bt_exam_previewActionPerformed
        add_preview_form();
    }//GEN-LAST:event__bt_exam_previewActionPerformed

    private void _bt_update_examMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_update_examMouseEntered
        _bt_update_exam.setBorder(border);
    }//GEN-LAST:event__bt_update_examMouseEntered

    private void _bt_update_examMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_update_examMouseExited
        _bt_update_exam.setBorder(null);
    }//GEN-LAST:event__bt_update_examMouseExited

    private void _bt_update_examMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_update_examMousePressed
        _bt_update_exam.setBorder(null);
    }//GEN-LAST:event__bt_update_examMousePressed

    private void _bt_update_examMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_update_examMouseReleased
        _bt_update_exam.setBorder(border);
    }//GEN-LAST:event__bt_update_examMouseReleased

    private void _bt_update_examActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__bt_update_examActionPerformed
        update_selected_lecture();
    }//GEN-LAST:event__bt_update_examActionPerformed

    private void _tb_add_exams_view_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__tb_add_exams_view_tableMouseClicked
        _bt_update_exam.setEnabled(true);
        _bt_exam_preview.setEnabled(true);
    }//GEN-LAST:event__tb_add_exams_view_tableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton _bt_exam_preview;
    private javax.swing.JButton _bt_update_exam;
    private javax.swing.JList _li_add_exams_searchExams;
    private javax.swing.JScrollPane _sp_registration_student_searchStudent;
    private javax.swing.JTable _tb_add_exams_view_table;
    private javax.swing.JTextField _tf_add_exams_searchExams;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void add_active_table_data() {
//        try {
//            DefaultTableModel dtm = (DefaultTableModel) _tb_registration_lecture_view_active.getModel();
//
//            Connection c = MC_JavaDataBaseConnection.myConnection();
//            Statement s = c.createStatement();
//            String search_query = "SELECT a.employee_academic_user_id, a.employee_academic_user_email, b.employee_academic_user_info_name_first_name, b.employee_academic_user_info_name_last_name, c.employee_academic_user_info_personal_nic, d.employee_academic_user_info_contact_mobile FROM employee_academic_user_info a,   employee_academic_user_info_name b, employee_academic_user_info_personal c, employee_academic_user_info_contact d WHERE a.employee_academic_user_id=b.employee_academic_user_id AND a.employee_academic_user_id=c.employee_academic_user_id AND a.employee_academic_user_id=d.employee_academic_user_id AND a.employee_academic_user_info_status >= '1'";
//            ResultSet rs = s.executeQuery(search_query);
//            while (rs.next()) {
//                Vector v = new Vector();
//                v.add(rs.getString("employee_academic_user_id"));
//                v.add(rs.getString("employee_academic_user_info_name_first_name") + " " + rs.getString("employee_academic_user_info_name_last_name"));
//                v.add(rs.getString("employee_academic_user_info_personal_nic"));
//                v.add(rs.getString("employee_academic_user_email"));
//                v.add(rs.getString("employee_academic_user_info_contact_mobile"));
//                dtm.addRow(v);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }

    private void search_lecture() {
        try {

//            String fullname=_li_registration_student_searchStudent.getSelectedValue().toString();
//            String[] splitname=fullname.split(" ");
//            String fname=splitname[0];
//            String lname=splitname[1];
//            Connection c=MC_JavaDataBaseConnection.myConnection();
//            Statement s=c.createStatement();
//            ResultSet rs=s.executeQuery("SELECT a.employee_academic_user_id, a.employee_academic_user_email, b.employee_academic_user_info_name_first_name, b.employee_academic_user_info_name_last_name, c.employee_academic_user_info_personal_nic, d.employee_academic_user_info_contact_mobile FROM employee_academic_user_info a,   employee_academic_user_info_name b, employee_academic_user_info_personal c, employee_academic_user_info_contact d WHERE a.employee_academic_user_id=b.employee_academic_user_id AND a.employee_academic_user_id=c.employee_academic_user_id AND a.employee_academic_user_id=d.employee_academic_user_id AND a.employee_academic_user_info_status >= '1' AND b.employee_academic_user_info_name_first_name='"+fname+"' and b.employee_academic_user_info_name_last_name='"+lname+"'");
//            while (rs.next()) {
//                Vector v = new Vector();
//                v.add(rs.getString("employee_academic_user_id"));
//                v.add(rs.getString("employee_academic_user_info_name_first_name") + " " + rs.getString("employee_academic_user_info_name_last_name"));
//                v.add(rs.getString("employee_academic_user_info_personal_nic"));
//                v.add(rs.getString("employee_academic_user_email"));
//                v.add(rs.getString("employee_academic_user_info_contact_mobile"));
//                dtm.addRow(v);
//            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void update_selected_lecture() {
//        try {
//            DefaultTableModel dtm = (DefaultTableModel) _tb_registration_lecture_view_active.getModel();
//            int row = _tb_registration_lecture_view_active.getSelectedRow();
//            String lec_id = dtm.getValueAt(row, 0).toString();
//
//            Jp_registration_lecture_informations register_lecture = new Jp_registration_lecture_informations(lec_id);
//            if (register_lecture == null) {
//                Jp_registraion_lecture_main_panel.removeAll();
//                revalidate();
//                register_lecture = new Jp_registration_lecture_informations(lec_id);
//                register_lecture.setVisible(true);
//                Jp_registraion_lecture_main_panel.add(register_lecture);
//                revalidate();
//            } else {
//                Jp_registraion_lecture_main_panel.removeAll();
//                revalidate();
//                register_lecture.setVisible(true);
//                Jp_registraion_lecture_main_panel.add(register_lecture);
//                revalidate();
//            }
//            _bt_registraion_lecture_buttons_add_lecture.setText("Cancel");
//            _bt_registraion_lecture_buttons_preview_lecture.setEnabled(false);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }

    private void add_preview_form() {
//        try {
//            DefaultTableModel dtm = (DefaultTableModel) _tb_registration_lecture_view_active.getModel();
//            int row = _tb_registration_lecture_view_active.getSelectedRow();
//            String lec_id = dtm.getValueAt(row, 0).toString();
//
//            Jp_registration_lecture_preview lecture_preview = new Jp_registration_lecture_preview(lec_id);
//            if (lecture_preview == null) {
//                Jp_registraion_lecture_main_panel.removeAll();
//                revalidate();
//                lecture_preview = new Jp_registration_lecture_preview(lec_id);
//                lecture_preview.setVisible(true);
//                Jp_registraion_lecture_main_panel.add(lecture_preview);
//                revalidate();
//            } else {
//                Jp_registraion_lecture_main_panel.removeAll();
//                revalidate();
//                lecture_preview.setVisible(true);
//                Jp_registraion_lecture_main_panel.add(lecture_preview);
//                revalidate();
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }

}
