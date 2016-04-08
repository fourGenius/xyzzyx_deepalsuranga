/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fourgenius.www.public_access.registration.lecture;

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
public class Jp_registration_lecture_table_view extends javax.swing.JPanel {

    DefaultTableModel dtm;
    TableRowSorter<DefaultTableModel> sorter;
    Border border = BorderFactory.createLineBorder(Color.white, 1);

    /**
     * Creates new form Jp_registration_lecture_table_view
     */
    public Jp_registration_lecture_table_view() {
        initComponents();
        _sp_registration_lecture_searchLecture.setVisible(false);
        _bt_registraion_lecture_buttons_update_lecture.setEnabled(false);
        _bt_preview_table_lecture_buttons_preview_lecture.setEnabled(false);
        _bt_preview_table_lecture_buttons_delete_lecture.setEnabled(false);
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

        _tf_registration_lecture_searchLecture = new javax.swing.JTextField();
        _sp_registration_lecture_searchLecture = new javax.swing.JScrollPane();
        _li_registration_lecture_searchLecture = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        _tb_registration_lecture_view_active = new javax.swing.JTable();
        _bt_preview_table_lecture_buttons_preview_lecture = new javax.swing.JButton();
        _bt_registraion_lecture_buttons_update_lecture = new javax.swing.JButton();
        _bt_preview_table_lecture_buttons_delete_lecture = new javax.swing.JButton();

        setBackground(new java.awt.Color(66, 66, 66));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        _tf_registration_lecture_searchLecture.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _tf_registration_lecture_searchLecture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _tf_registration_lecture_searchLectureActionPerformed(evt);
            }
        });
        _tf_registration_lecture_searchLecture.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                _tf_registration_lecture_searchLectureKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                _tf_registration_lecture_searchLectureKeyReleased(evt);
            }
        });
        add(_tf_registration_lecture_searchLecture, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 10, 310, 50));

        _li_registration_lecture_searchLecture.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _li_registration_lecture_searchLecture.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                _li_registration_lecture_searchLectureMouseClicked(evt);
            }
        });
        _sp_registration_lecture_searchLecture.setViewportView(_li_registration_lecture_searchLecture);

        add(_sp_registration_lecture_searchLecture, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 60, 310, 490));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/public_access/user/login/images/search_icon.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 10, -1, -1));

        jPanel1.setLayout(new java.awt.CardLayout());

        _tb_registration_lecture_view_active.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Lecture ID", "Name", "NIC", "Email", "Mobile No"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        _tb_registration_lecture_view_active.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                _tb_registration_lecture_view_activeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(_tb_registration_lecture_view_active);

        jPanel1.add(jScrollPane1, "card2");

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 980, 540));

        _bt_preview_table_lecture_buttons_preview_lecture.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _bt_preview_table_lecture_buttons_preview_lecture.setForeground(new java.awt.Color(255, 255, 255));
        _bt_preview_table_lecture_buttons_preview_lecture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/public_access/user/login/images_butons/buton_blue_200x50.png"))); // NOI18N
        _bt_preview_table_lecture_buttons_preview_lecture.setText("Preview");
        _bt_preview_table_lecture_buttons_preview_lecture.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        _bt_preview_table_lecture_buttons_preview_lecture.setFocusPainted(false);
        _bt_preview_table_lecture_buttons_preview_lecture.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _bt_preview_table_lecture_buttons_preview_lecture.setMaximumSize(new java.awt.Dimension(200, 50));
        _bt_preview_table_lecture_buttons_preview_lecture.setPreferredSize(new java.awt.Dimension(200, 50));
        _bt_preview_table_lecture_buttons_preview_lecture.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                _bt_preview_table_lecture_buttons_preview_lectureMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                _bt_preview_table_lecture_buttons_preview_lectureMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                _bt_preview_table_lecture_buttons_preview_lectureMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                _bt_preview_table_lecture_buttons_preview_lectureMouseReleased(evt);
            }
        });
        _bt_preview_table_lecture_buttons_preview_lecture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _bt_preview_table_lecture_buttons_preview_lectureActionPerformed(evt);
            }
        });
        add(_bt_preview_table_lecture_buttons_preview_lecture, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 560, -1, -1));

        _bt_registraion_lecture_buttons_update_lecture.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _bt_registraion_lecture_buttons_update_lecture.setForeground(new java.awt.Color(255, 255, 255));
        _bt_registraion_lecture_buttons_update_lecture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/public_access/user/login/images_butons/buton_blue_200x50.png"))); // NOI18N
        _bt_registraion_lecture_buttons_update_lecture.setText("Update Lecture");
        _bt_registraion_lecture_buttons_update_lecture.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        _bt_registraion_lecture_buttons_update_lecture.setFocusPainted(false);
        _bt_registraion_lecture_buttons_update_lecture.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _bt_registraion_lecture_buttons_update_lecture.setPreferredSize(new java.awt.Dimension(200, 50));
        _bt_registraion_lecture_buttons_update_lecture.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                _bt_registraion_lecture_buttons_update_lectureMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                _bt_registraion_lecture_buttons_update_lectureMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                _bt_registraion_lecture_buttons_update_lectureMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                _bt_registraion_lecture_buttons_update_lectureMouseReleased(evt);
            }
        });
        _bt_registraion_lecture_buttons_update_lecture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _bt_registraion_lecture_buttons_update_lectureActionPerformed(evt);
            }
        });
        add(_bt_registraion_lecture_buttons_update_lecture, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 560, 200, -1));

        _bt_preview_table_lecture_buttons_delete_lecture.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _bt_preview_table_lecture_buttons_delete_lecture.setForeground(new java.awt.Color(255, 255, 255));
        _bt_preview_table_lecture_buttons_delete_lecture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/public_access/user/login/images_butons/buton_blue_200x50.png"))); // NOI18N
        _bt_preview_table_lecture_buttons_delete_lecture.setText("Delete");
        _bt_preview_table_lecture_buttons_delete_lecture.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        _bt_preview_table_lecture_buttons_delete_lecture.setFocusPainted(false);
        _bt_preview_table_lecture_buttons_delete_lecture.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _bt_preview_table_lecture_buttons_delete_lecture.setMaximumSize(new java.awt.Dimension(200, 50));
        _bt_preview_table_lecture_buttons_delete_lecture.setPreferredSize(new java.awt.Dimension(200, 50));
        _bt_preview_table_lecture_buttons_delete_lecture.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                _bt_preview_table_lecture_buttons_delete_lectureMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                _bt_preview_table_lecture_buttons_delete_lectureMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                _bt_preview_table_lecture_buttons_delete_lectureMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                _bt_preview_table_lecture_buttons_delete_lectureMouseReleased(evt);
            }
        });
        _bt_preview_table_lecture_buttons_delete_lecture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _bt_preview_table_lecture_buttons_delete_lectureActionPerformed(evt);
            }
        });
        add(_bt_preview_table_lecture_buttons_delete_lecture, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void _tf_registration_lecture_searchLectureKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event__tf_registration_lecture_searchLectureKeyReleased

        try {
            if (_tf_registration_lecture_searchLecture.getText().isEmpty()) {
                _sp_registration_lecture_searchLecture.setVisible(false);
            } else {
                String text = _tf_registration_lecture_searchLecture.getText();
                char first = text.charAt(0);
                if (Character.isDigit(first)) {
                    Connection c = MC_JavaDataBaseConnection.myConnection();
                    Statement s = c.createStatement();

                    ResultSet rs = s.executeQuery("SELECT b.employee_academic_user_info_name_first_name, b.employee_academic_user_info_name_last_name FROM employee_academic_user_info_personal a LEFT JOIN employee_academic_user_info_name b ON a.employee_academic_user_id=b.employee_academic_user_id LEFT JOIN employee_academic_user_info c ON a.employee_academic_user_id=c.employee_academic_user_id WHERE a.employee_academic_user_info_personal_nic like '" + _tf_registration_lecture_searchLecture.getText() + "' AND c.employee_academic_user_info_status='1'");
                    Vector v = new Vector();
                    while (rs.next()) {
                        v.add(rs.getString("employee_academic_user_info_name_first_name") + " " + rs.getString("employee_academic_user_info_name_last_name"));
                    }
                    rs.close();
                    _li_registration_lecture_searchLecture.setListData(v);
                    _sp_registration_lecture_searchLecture.setVisible(false);
                    if (_li_registration_lecture_searchLecture.getModel().getSize() == 0) {
                        _sp_registration_lecture_searchLecture.setVisible(false);
                    } else {
                        _sp_registration_lecture_searchLecture.setVisible(true);
                    }
                    if (evt.getKeyCode() == 40) {
                        _sp_registration_lecture_searchLecture.setVisible(true);
                        _li_registration_lecture_searchLecture.grabFocus();
                    }
                } else {
                    try {

                        if (_tf_registration_lecture_searchLecture.getText().isEmpty()) {
                            _sp_registration_lecture_searchLecture.setVisible(false);
                        } else {
                            Connection c = MC_JavaDataBaseConnection.myConnection();
                            Statement s = c.createStatement();

                            ResultSet rs = s.executeQuery("SELECT b.employee_academic_user_info_name_first_name, b.employee_academic_user_info_name_last_name FROM employee_academic_user_info_personal a LEFT JOIN employee_academic_user_info_name b ON a.employee_academic_user_id=b.employee_academic_user_id LEFT JOIN employee_academic_user_info c ON a.employee_academic_user_id=c.employee_academic_user_id WHERE CONCAT (b.employee_academic_user_info_name_first_name, ' ', b.employee_academic_user_info_name_last_name) like '" + _tf_registration_lecture_searchLecture.getText() + "%' AND c.employee_academic_user_info_status='1'");
                            Vector v = new Vector();
                            while (rs.next()) {
                                v.add(rs.getString("employee_academic_user_info_name_first_name") + " " + rs.getString("employee_academic_user_info_name_last_name"));
                            }
                            rs.close();
                            _li_registration_lecture_searchLecture.setListData(v);
                            _sp_registration_lecture_searchLecture.setVisible(false);
                            if (_li_registration_lecture_searchLecture.getModel().getSize() == 0) {
                                _sp_registration_lecture_searchLecture.setVisible(false);
                            } else {
                                _sp_registration_lecture_searchLecture.setVisible(true);
                            }
                        }
                        if (evt.getKeyCode() == 40) {
                            _sp_registration_lecture_searchLecture.setVisible(true);
                            _li_registration_lecture_searchLecture.grabFocus();
                        }

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event__tf_registration_lecture_searchLectureKeyReleased

    private void _tf_registration_lecture_searchLectureKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event__tf_registration_lecture_searchLectureKeyPressed

    }//GEN-LAST:event__tf_registration_lecture_searchLectureKeyPressed

    private void _tf_registration_lecture_searchLectureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__tf_registration_lecture_searchLectureActionPerformed

    }//GEN-LAST:event__tf_registration_lecture_searchLectureActionPerformed

    private void _li_registration_lecture_searchLectureMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__li_registration_lecture_searchLectureMouseClicked
        DefaultTableModel dtm = (DefaultTableModel) _tb_registration_lecture_view_active.getModel();
        _tf_registration_lecture_searchLecture.setText(_li_registration_lecture_searchLecture.getSelectedValue().toString());
        _sp_registration_lecture_searchLecture.setVisible(false);
        String name = _li_registration_lecture_searchLecture.getSelectedValue().toString();
        for (int row = 0; row < _tb_registration_lecture_view_active.getRowCount(); row++) {
            String next = _tb_registration_lecture_view_active.getValueAt(row, 1).toString();
            if (next.equals(name)) {
                _tb_registration_lecture_view_active.setRowSelectionInterval(row, row);
            }
        }
        search_lecture();
    }//GEN-LAST:event__li_registration_lecture_searchLectureMouseClicked

    private void _bt_preview_table_lecture_buttons_preview_lectureMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_preview_table_lecture_buttons_preview_lectureMouseEntered
        _bt_preview_table_lecture_buttons_preview_lecture.setBorder(border);
    }//GEN-LAST:event__bt_preview_table_lecture_buttons_preview_lectureMouseEntered

    private void _bt_preview_table_lecture_buttons_preview_lectureMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_preview_table_lecture_buttons_preview_lectureMouseExited
        _bt_preview_table_lecture_buttons_preview_lecture.setBorder(null);
    }//GEN-LAST:event__bt_preview_table_lecture_buttons_preview_lectureMouseExited

    private void _bt_preview_table_lecture_buttons_preview_lectureMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_preview_table_lecture_buttons_preview_lectureMousePressed
        _bt_preview_table_lecture_buttons_preview_lecture.setBorder(null);
    }//GEN-LAST:event__bt_preview_table_lecture_buttons_preview_lectureMousePressed

    private void _bt_preview_table_lecture_buttons_preview_lectureMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_preview_table_lecture_buttons_preview_lectureMouseReleased
        _bt_preview_table_lecture_buttons_preview_lecture.setBorder(border);
    }//GEN-LAST:event__bt_preview_table_lecture_buttons_preview_lectureMouseReleased

    private void _bt_preview_table_lecture_buttons_preview_lectureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__bt_preview_table_lecture_buttons_preview_lectureActionPerformed
        add_preview_form();
    }//GEN-LAST:event__bt_preview_table_lecture_buttons_preview_lectureActionPerformed

    private void _bt_registraion_lecture_buttons_update_lectureMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_registraion_lecture_buttons_update_lectureMouseEntered
        _bt_registraion_lecture_buttons_update_lecture.setBorder(border);
    }//GEN-LAST:event__bt_registraion_lecture_buttons_update_lectureMouseEntered

    private void _bt_registraion_lecture_buttons_update_lectureMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_registraion_lecture_buttons_update_lectureMouseExited
        _bt_registraion_lecture_buttons_update_lecture.setBorder(null);
    }//GEN-LAST:event__bt_registraion_lecture_buttons_update_lectureMouseExited

    private void _bt_registraion_lecture_buttons_update_lectureMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_registraion_lecture_buttons_update_lectureMousePressed
        _bt_registraion_lecture_buttons_update_lecture.setBorder(null);
    }//GEN-LAST:event__bt_registraion_lecture_buttons_update_lectureMousePressed

    private void _bt_registraion_lecture_buttons_update_lectureMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_registraion_lecture_buttons_update_lectureMouseReleased
        _bt_registraion_lecture_buttons_update_lecture.setBorder(border);
    }//GEN-LAST:event__bt_registraion_lecture_buttons_update_lectureMouseReleased

    private void _bt_registraion_lecture_buttons_update_lectureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__bt_registraion_lecture_buttons_update_lectureActionPerformed
        update_selected_lecture();
    }//GEN-LAST:event__bt_registraion_lecture_buttons_update_lectureActionPerformed

    private void _tb_registration_lecture_view_activeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__tb_registration_lecture_view_activeMouseClicked
        _bt_registraion_lecture_buttons_update_lecture.setEnabled(true);
        _bt_preview_table_lecture_buttons_preview_lecture.setEnabled(true);
        _bt_preview_table_lecture_buttons_delete_lecture.setEnabled(true);
    }//GEN-LAST:event__tb_registration_lecture_view_activeMouseClicked

    private void _bt_preview_table_lecture_buttons_delete_lectureMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_preview_table_lecture_buttons_delete_lectureMouseEntered
        _bt_preview_table_lecture_buttons_delete_lecture.setBorder(border);
    }//GEN-LAST:event__bt_preview_table_lecture_buttons_delete_lectureMouseEntered

    private void _bt_preview_table_lecture_buttons_delete_lectureMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_preview_table_lecture_buttons_delete_lectureMouseExited
        _bt_preview_table_lecture_buttons_delete_lecture.setBorder(null);
    }//GEN-LAST:event__bt_preview_table_lecture_buttons_delete_lectureMouseExited

    private void _bt_preview_table_lecture_buttons_delete_lectureMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_preview_table_lecture_buttons_delete_lectureMousePressed
        _bt_preview_table_lecture_buttons_delete_lecture.setBorder(border);
    }//GEN-LAST:event__bt_preview_table_lecture_buttons_delete_lectureMousePressed

    private void _bt_preview_table_lecture_buttons_delete_lectureMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_preview_table_lecture_buttons_delete_lectureMouseReleased
        _bt_preview_table_lecture_buttons_delete_lecture.setBorder(null);
    }//GEN-LAST:event__bt_preview_table_lecture_buttons_delete_lectureMouseReleased

    private void _bt_preview_table_lecture_buttons_delete_lectureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__bt_preview_table_lecture_buttons_delete_lectureActionPerformed
        try {
            DefaultTableModel dtm = (DefaultTableModel) _tb_registration_lecture_view_active.getModel();
            int raw = _tb_registration_lecture_view_active.getSelectedRow();
            String lec_id = dtm.getValueAt(raw, 0).toString();

            int i = JOptionPane.showConfirmDialog(this, "Are You Sure?", "Confirm?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (i == JOptionPane.YES_OPTION) {
                Connection connection = MC_JavaDataBaseConnection.myConnection();
                Statement statement = connection.createStatement();
                statement.executeUpdate("UPDATE employee_academic_user_info SET employee_academic_user_info_status='0' WHERE employee_academic_user_id='" + lec_id + "'");
                dtm.setRowCount(0);
                add_active_table_data();
                _bt_preview_table_lecture_buttons_preview_lecture.setEnabled(false);
                _bt_registraion_lecture_buttons_update_lecture.setEnabled(false);
                _bt_preview_table_lecture_buttons_delete_lecture.setEnabled(false);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event__bt_preview_table_lecture_buttons_delete_lectureActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton _bt_preview_table_lecture_buttons_delete_lecture;
    private javax.swing.JButton _bt_preview_table_lecture_buttons_preview_lecture;
    private javax.swing.JButton _bt_registraion_lecture_buttons_update_lecture;
    private javax.swing.JList _li_registration_lecture_searchLecture;
    private javax.swing.JScrollPane _sp_registration_lecture_searchLecture;
    private javax.swing.JTable _tb_registration_lecture_view_active;
    private javax.swing.JTextField _tf_registration_lecture_searchLecture;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void add_active_table_data() {
        try {
            DefaultTableModel dtm = (DefaultTableModel) _tb_registration_lecture_view_active.getModel();

            Connection c = MC_JavaDataBaseConnection.myConnection();
            Statement s = c.createStatement();
            String search_query = "SELECT a.employee_academic_user_id, a.employee_academic_user_email, b.employee_academic_user_info_name_first_name, b.employee_academic_user_info_name_last_name, c.employee_academic_user_info_personal_nic, d.employee_academic_user_info_contact_mobile FROM employee_academic_user_info a,   employee_academic_user_info_name b, employee_academic_user_info_personal c, employee_academic_user_info_contact d WHERE a.employee_academic_user_id=b.employee_academic_user_id AND a.employee_academic_user_id=c.employee_academic_user_id AND a.employee_academic_user_id=d.employee_academic_user_id AND a.employee_academic_user_info_status >= '1'";
            ResultSet rs = s.executeQuery(search_query);
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("employee_academic_user_id"));
                v.add(rs.getString("employee_academic_user_info_name_first_name") + " " + rs.getString("employee_academic_user_info_name_last_name"));
                v.add(rs.getString("employee_academic_user_info_personal_nic"));
                v.add(rs.getString("employee_academic_user_email"));
                v.add(rs.getString("employee_academic_user_info_contact_mobile"));
                dtm.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
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
        try {
            DefaultTableModel dtm = (DefaultTableModel) _tb_registration_lecture_view_active.getModel();
            int row = _tb_registration_lecture_view_active.getSelectedRow();
            String lec_id = dtm.getValueAt(row, 0).toString();

            Jp_registration_lecture_informations register_lecture = new Jp_registration_lecture_informations(lec_id);
            if (register_lecture == null) {
                Jp_registraion_lecture_main_panel.removeAll();
                revalidate();
                register_lecture = new Jp_registration_lecture_informations(lec_id);
                register_lecture.setVisible(true);
                Jp_registraion_lecture_main_panel.add(register_lecture);
                revalidate();
            } else {
                Jp_registraion_lecture_main_panel.removeAll();
                revalidate();
                register_lecture.setVisible(true);
                Jp_registraion_lecture_main_panel.add(register_lecture);
                revalidate();
            }
            _bt_registraion_lecture_buttons_add_lecture.setText("Cancel");
            _bt_registraion_lecture_buttons_preview_lecture.setEnabled(false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void add_preview_form() {
        try {
            DefaultTableModel dtm = (DefaultTableModel) _tb_registration_lecture_view_active.getModel();
            int row = _tb_registration_lecture_view_active.getSelectedRow();
            String lec_id = dtm.getValueAt(row, 0).toString();

            Jp_registration_lecture_preview lecture_preview = new Jp_registration_lecture_preview(lec_id);
            if (lecture_preview == null) {
                Jp_registraion_lecture_main_panel.removeAll();
                revalidate();
                lecture_preview = new Jp_registration_lecture_preview(lec_id);
                lecture_preview.setVisible(true);
                Jp_registraion_lecture_main_panel.add(lecture_preview);
                revalidate();
            } else {
                Jp_registraion_lecture_main_panel.removeAll();
                revalidate();
                lecture_preview.setVisible(true);
                Jp_registraion_lecture_main_panel.add(lecture_preview);
                revalidate();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
