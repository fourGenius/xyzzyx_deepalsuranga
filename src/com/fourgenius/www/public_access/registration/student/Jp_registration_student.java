/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fourgenius.www.public_access.registration.student;

import static com.fourgenius.www.public_access.registration.student.Jp_registration_student_informations._tf_registration_student_personalInformations_studentDetails_surName;
import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.border.Border;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Shadow®
 */
public class Jp_registration_student extends javax.swing.JPanel {

    //set border color for buttons
    Border border = BorderFactory.createLineBorder(Color.white, 1);

    //set variables for add picture
    String path, newpath;

    /**
     * Creates new form registration_student
     */
    public Jp_registration_student() {

        initComponents();
        
        //Load table view for main panel
        load_table_student_view();
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception ex) {
            ex.printStackTrace();
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
        _bt_add_student = new javax.swing.JButton();
        _bt_student_details = new javax.swing.JButton();
        Jp_registraion_stu_main_panel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(66, 66, 66));
        setForeground(new java.awt.Color(66, 66, 66));
        setMinimumSize(new java.awt.Dimension(1360, 718));
        setPreferredSize(new java.awt.Dimension(1360, 718));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        _bt_add_student.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _bt_add_student.setForeground(new java.awt.Color(255, 255, 255));
        _bt_add_student.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/public_access/user/login/images_butons/buton_blue_200x50.png"))); // NOI18N
        _bt_add_student.setText("Add Student");
        _bt_add_student.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        _bt_add_student.setFocusPainted(false);
        _bt_add_student.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _bt_add_student.setPreferredSize(new java.awt.Dimension(300, 50));
        _bt_add_student.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                _bt_add_studentMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                _bt_add_studentMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                _bt_add_studentMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                _bt_add_studentMouseReleased(evt);
            }
        });
        _bt_add_student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _bt_add_studentActionPerformed(evt);
            }
        });

        _bt_student_details.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _bt_student_details.setForeground(new java.awt.Color(255, 255, 255));
        _bt_student_details.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/public_access/user/login/images_butons/buton_blue_200x50.png"))); // NOI18N
        _bt_student_details.setText("Students Details");
        _bt_student_details.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        _bt_student_details.setFocusPainted(false);
        _bt_student_details.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _bt_student_details.setPreferredSize(new java.awt.Dimension(300, 50));
        _bt_student_details.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                _bt_student_detailsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                _bt_student_detailsMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                _bt_student_detailsMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                _bt_student_detailsMouseReleased(evt);
            }
        });
        _bt_student_details.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _bt_student_detailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(_bt_student_details, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(_bt_add_student, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(912, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(_bt_add_student, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_bt_student_details, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 638, 1340, -1));

        Jp_registraion_stu_main_panel.setBackground(new java.awt.Color(66, 66, 66));
        Jp_registraion_stu_main_panel.setLayout(new java.awt.CardLayout());
        add(Jp_registraion_stu_main_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1366, 630));
    }// </editor-fold>//GEN-END:initComponents

    private void _bt_add_studentMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_add_studentMouseEntered
        _bt_add_student.setBorder(border);
    }//GEN-LAST:event__bt_add_studentMouseEntered

    private void _bt_add_studentMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_add_studentMouseExited
        _bt_add_student.setBorder(null);
    }//GEN-LAST:event__bt_add_studentMouseExited

    private void _bt_add_studentMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_add_studentMousePressed
        _bt_add_student.setBorder(null);
    }//GEN-LAST:event__bt_add_studentMousePressed

    private void _bt_add_studentMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_add_studentMouseReleased
        _bt_add_student.setBorder(border);
    }//GEN-LAST:event__bt_add_studentMouseReleased

    private void _bt_add_studentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__bt_add_studentActionPerformed
        try {
            String button_name = _bt_add_student.getText();
            if (button_name.equals("Add Student")) {
                load_student_information_form();
                buttons_enable(_bt_add_student.getText());
                _bt_add_student.setText("Cancel");
            } else {
                int option = JOptionPane.showConfirmDialog(this, "All Data You Didn't Save is Lost", "Are You Sure?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (option == JOptionPane.YES_OPTION) {
                    load_table_student_view();
                    _bt_add_student.setText("Add Student");
                    _bt_student_details.setEnabled(true);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event__bt_add_studentActionPerformed

    private void _bt_student_detailsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_student_detailsMouseEntered
        _bt_student_details.setBorder(border);
    }//GEN-LAST:event__bt_student_detailsMouseEntered

    private void _bt_student_detailsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_student_detailsMouseExited
        _bt_student_details.setBorder(null);
    }//GEN-LAST:event__bt_student_detailsMouseExited

    private void _bt_student_detailsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_student_detailsMousePressed
        _bt_student_details.setBorder(null);
    }//GEN-LAST:event__bt_student_detailsMousePressed

    private void _bt_student_detailsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_student_detailsMouseReleased
        _bt_student_details.setBorder(border);
    }//GEN-LAST:event__bt_student_detailsMouseReleased

    private void _bt_student_detailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__bt_student_detailsActionPerformed
        try {
            load_table_student_view();

            buttons_enable(_bt_student_details.getText());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event__bt_student_detailsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel Jp_registraion_stu_main_panel;
    public static javax.swing.JButton _bt_add_student;
    public static javax.swing.JButton _bt_student_details;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    public void printReport() {

        try {
            String report_path = "‪src\\reports\\student_reg.jrxml";
            InputStream in = new FileInputStream(new File(report_path));
            System.out.println("oooo");
            Jp_registration_student_informations info = new Jp_registration_student_informations();
            JasperReport compileReport = JasperCompileManager.compileReport(report_path);
            System.out.println("ok1");
            Map<String, Object> m = new HashMap<String, Object>();
            System.out.println("ok2");
//            m.put("course", info._lb_registration_student_preview_course.getText());
//            m.put("name", info._lb_registration_student_preview_name.getText());
//            m.put("address", info._lb_registration_student_preview_lane1.getText());
//            m.put("telePhone", info._lb_registration_student_preview_homeNumber.getText());
//            m.put("mobilePhone", info._lb_registration_student_preview_mobileNumber.getText());
//            m.put("email", info._lb_registration_student_preview_eMail.getText());
//            m.put("dob", info._lb_registration_student_preview_dateOfBirth.getText());
//
//            m.put("nic", info._lb_registration_student_preview_nic.getText());
            m.put("sid", info._lb_registration_student_preview_studentID.getText());
//            m.put("pic", info.newpath);
            System.out.println("ok3");
            JasperPrint jp = JasperFillManager.fillReport(compileReport, m);
            System.out.println("ok4");
            JasperViewer.viewReport(jp, false);
            System.out.println("ok5");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void load_table_student_view() {
        try {
            Jp_registration_student_c_layout cl = new Jp_registration_student_c_layout();

            if (cl == null) {
                cl = new Jp_registration_student_c_layout();
                Jp_registraion_stu_main_panel.removeAll();
                Jp_registraion_stu_main_panel.repaint();
                Jp_registraion_stu_main_panel.revalidate();
                Jp_registraion_stu_main_panel.add(cl);
                Jp_registraion_stu_main_panel.repaint();
                Jp_registraion_stu_main_panel.revalidate();
            } else {
                Jp_registraion_stu_main_panel.removeAll();
                Jp_registraion_stu_main_panel.repaint();
                Jp_registraion_stu_main_panel.revalidate();
                Jp_registraion_stu_main_panel.add(cl);
                Jp_registraion_stu_main_panel.repaint();
                Jp_registraion_stu_main_panel.revalidate();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void buttons_enable(String button_name) {
        try {
            if (button_name.equals(_bt_student_details.getText())) {
                _bt_student_details.setEnabled(true);
                _bt_add_student.setEnabled(true);
            } else {
                _bt_add_student.setEnabled(true);
                _bt_student_details.setEnabled(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void load_student_information_form() {
        try {
            Jp_registration_student_informations reg_student = new Jp_registration_student_informations();
            if (_bt_add_student == null) {
                reg_student = new Jp_registration_student_informations();
                Jp_registraion_stu_main_panel.removeAll();
                Jp_registraion_stu_main_panel.repaint();
                Jp_registraion_stu_main_panel.revalidate();
                Jp_registraion_stu_main_panel.add(reg_student);
                Jp_registraion_stu_main_panel.repaint();
                Jp_registraion_stu_main_panel.revalidate();
            } else {
                Jp_registraion_stu_main_panel.removeAll();
                Jp_registraion_stu_main_panel.repaint();
                Jp_registraion_stu_main_panel.revalidate();
                Jp_registraion_stu_main_panel.add(reg_student);
                Jp_registraion_stu_main_panel.repaint();
                Jp_registraion_stu_main_panel.revalidate();
            }
            _tf_registration_student_personalInformations_studentDetails_surName.grabFocus();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
