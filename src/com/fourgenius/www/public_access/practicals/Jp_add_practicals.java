/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fourgenius.www.public_access.practicals;

import com.fourgenius.www.public_access.exams.*;
import static com.fourgenius.www.public_access.practicals.Jf_practicals._bt_UserMain_home;
import com.fourgenius.www.public_access.registration.lecture.*;
import static com.fourgenius.www.public_access.registration.lecture.Jp_registration_lecture_informations._tf_registration_lecture_information_form_sur_name;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

/**
 *
 * @author Pamitha Gayashan
 */
public class Jp_add_practicals extends javax.swing.JPanel {

    Border border = BorderFactory.createLineBorder(Color.white, 1);

    /**
     * Creates new form Jp_registration_lecture
     */
    public Jp_add_practicals() {
        initComponents();

        load_table_exams_view();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Jp_add_exams_buttons = new javax.swing.JPanel();
        _bt_add_practical_AddPractical = new javax.swing.JButton();
        _bt_add_practical_practicalDetails = new javax.swing.JButton();
        Jp_add_practical_main_panel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(66, 66, 66));
        setVerifyInputWhenFocusTarget(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Jp_add_exams_buttons.setBackground(new java.awt.Color(102, 102, 102));

        _bt_add_practical_AddPractical.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _bt_add_practical_AddPractical.setForeground(new java.awt.Color(255, 255, 255));
        _bt_add_practical_AddPractical.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/public_access/user/login/images_butons/buton_blue_200x50.png"))); // NOI18N
        _bt_add_practical_AddPractical.setText("Add Practical");
        _bt_add_practical_AddPractical.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        _bt_add_practical_AddPractical.setFocusPainted(false);
        _bt_add_practical_AddPractical.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _bt_add_practical_AddPractical.setPreferredSize(new java.awt.Dimension(300, 50));
        _bt_add_practical_AddPractical.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                _bt_add_practical_AddPracticalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                _bt_add_practical_AddPracticalMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                _bt_add_practical_AddPracticalMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                _bt_add_practical_AddPracticalMouseReleased(evt);
            }
        });
        _bt_add_practical_AddPractical.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _bt_add_practical_AddPracticalActionPerformed(evt);
            }
        });

        _bt_add_practical_practicalDetails.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _bt_add_practical_practicalDetails.setForeground(new java.awt.Color(255, 255, 255));
        _bt_add_practical_practicalDetails.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/public_access/user/login/images_butons/buton_blue_200x50.png"))); // NOI18N
        _bt_add_practical_practicalDetails.setText("Practical Details");
        _bt_add_practical_practicalDetails.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        _bt_add_practical_practicalDetails.setFocusPainted(false);
        _bt_add_practical_practicalDetails.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _bt_add_practical_practicalDetails.setPreferredSize(new java.awt.Dimension(300, 50));
        _bt_add_practical_practicalDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                _bt_add_practical_practicalDetailsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                _bt_add_practical_practicalDetailsMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                _bt_add_practical_practicalDetailsMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                _bt_add_practical_practicalDetailsMouseReleased(evt);
            }
        });
        _bt_add_practical_practicalDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _bt_add_practical_practicalDetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Jp_add_exams_buttonsLayout = new javax.swing.GroupLayout(Jp_add_exams_buttons);
        Jp_add_exams_buttons.setLayout(Jp_add_exams_buttonsLayout);
        Jp_add_exams_buttonsLayout.setHorizontalGroup(
            Jp_add_exams_buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Jp_add_exams_buttonsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(_bt_add_practical_practicalDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(_bt_add_practical_AddPractical, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(912, Short.MAX_VALUE))
        );
        Jp_add_exams_buttonsLayout.setVerticalGroup(
            Jp_add_exams_buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Jp_add_exams_buttonsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Jp_add_exams_buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(_bt_add_practical_AddPractical, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_bt_add_practical_practicalDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(Jp_add_exams_buttons, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 638, 1340, -1));

        Jp_add_practical_main_panel.setBackground(new java.awt.Color(66, 66, 66));
        Jp_add_practical_main_panel.setLayout(new java.awt.CardLayout());
        add(Jp_add_practical_main_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1366, 630));
    }// </editor-fold>//GEN-END:initComponents

    private void _bt_add_practical_AddPracticalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_add_practical_AddPracticalMouseEntered
        _bt_add_practical_AddPractical.setBorder(border);
    }//GEN-LAST:event__bt_add_practical_AddPracticalMouseEntered

    private void _bt_add_practical_AddPracticalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_add_practical_AddPracticalMouseExited
        _bt_add_practical_AddPractical.setBorder(null);
    }//GEN-LAST:event__bt_add_practical_AddPracticalMouseExited

    private void _bt_add_practical_AddPracticalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_add_practical_AddPracticalMousePressed
        _bt_add_practical_AddPractical.setBorder(null);
    }//GEN-LAST:event__bt_add_practical_AddPracticalMousePressed

    private void _bt_add_practical_AddPracticalMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_add_practical_AddPracticalMouseReleased
        _bt_add_practical_AddPractical.setBorder(border);
    }//GEN-LAST:event__bt_add_practical_AddPracticalMouseReleased

    private void _bt_add_practical_AddPracticalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__bt_add_practical_AddPracticalActionPerformed
        String button_name = _bt_add_practical_AddPractical.getText();
        if (button_name.equals("Add Practical")) {
            load_exam_information_form();
            buttons_enable(_bt_add_practical_AddPractical.getText());
            _bt_add_practical_AddPractical.setText("Cancel");
            _bt_UserMain_home.setEnabled(false);
        } else {
            int option = JOptionPane.showConfirmDialog(this, "All Data You Didn't Save is Lost", "Are You Sure?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (option == JOptionPane.YES_OPTION) {
                load_table_exams_view();
                _bt_add_practical_AddPractical.setText("Add Practical");
                _bt_add_practical_practicalDetails.setEnabled(true);
                _bt_UserMain_home.setEnabled(true);
            }

        }
    }//GEN-LAST:event__bt_add_practical_AddPracticalActionPerformed


    private void _bt_add_practical_practicalDetailsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_add_practical_practicalDetailsMouseEntered
        _bt_add_practical_practicalDetails.setBorder(border);
    }//GEN-LAST:event__bt_add_practical_practicalDetailsMouseEntered

    private void _bt_add_practical_practicalDetailsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_add_practical_practicalDetailsMouseExited
        _bt_add_practical_practicalDetails.setBorder(null);
    }//GEN-LAST:event__bt_add_practical_practicalDetailsMouseExited

    private void _bt_add_practical_practicalDetailsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_add_practical_practicalDetailsMousePressed
        _bt_add_practical_practicalDetails.setBorder(null);
    }//GEN-LAST:event__bt_add_practical_practicalDetailsMousePressed

    private void _bt_add_practical_practicalDetailsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_add_practical_practicalDetailsMouseReleased
        _bt_add_practical_practicalDetails.setBorder(border);
    }//GEN-LAST:event__bt_add_practical_practicalDetailsMouseReleased

    private void _bt_add_practical_practicalDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__bt_add_practical_practicalDetailsActionPerformed
        load_table_exams_view();

        buttons_enable(_bt_add_practical_practicalDetails.getText());
    }//GEN-LAST:event__bt_add_practical_practicalDetailsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Jp_add_exams_buttons;
    public static javax.swing.JPanel Jp_add_practical_main_panel;
    public static javax.swing.JButton _bt_add_practical_AddPractical;
    public static javax.swing.JButton _bt_add_practical_practicalDetails;
    // End of variables declaration//GEN-END:variables

    private void load_table_exams_view() {
        try {
            Jp_add_practicals_table_view view_exams_table = new Jp_add_practicals_table_view();

            if (view_exams_table == null) {
                view_exams_table = new Jp_add_practicals_table_view();
                Jp_add_practical_main_panel.removeAll();
                Jp_add_practical_main_panel.repaint();
                Jp_add_practical_main_panel.revalidate();
                Jp_add_practical_main_panel.add(view_exams_table);
                Jp_add_practical_main_panel.repaint();
                Jp_add_practical_main_panel.revalidate();
            } else {
                Jp_add_practical_main_panel.removeAll();
                Jp_add_practical_main_panel.repaint();
                Jp_add_practical_main_panel.revalidate();
                Jp_add_practical_main_panel.add(view_exams_table);
                Jp_add_practical_main_panel.repaint();
                Jp_add_practical_main_panel.revalidate();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void buttons_enable(String button_name) {
        try {
            if (button_name.equals(_bt_add_practical_practicalDetails.getText())) {
                _bt_add_practical_AddPractical.setEnabled(true);
            } else if (button_name.equals(_bt_add_practical_AddPractical.getText())) {
                _bt_add_practical_practicalDetails.setEnabled(false);
            } else {
                _bt_add_practical_practicalDetails.setEnabled(false);
                _bt_add_practical_AddPractical.setEnabled(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void load_exam_information_form() {
        try {
            Jp_add_practical_informations add_exam = new Jp_add_practical_informations();
            if (add_exam == null) {
                add_exam = new Jp_add_practical_informations();
                Jp_add_practical_main_panel.removeAll();
                Jp_add_practical_main_panel.repaint();
                Jp_add_practical_main_panel.revalidate();
                Jp_add_practical_main_panel.add(add_exam);
                Jp_add_practical_main_panel.repaint();
                Jp_add_practical_main_panel.revalidate();
            } else {
                Jp_add_practical_main_panel.removeAll();
                Jp_add_practical_main_panel.repaint();
                Jp_add_practical_main_panel.revalidate();
                Jp_add_practical_main_panel.add(add_exam);
                Jp_add_practical_main_panel.repaint();
                Jp_add_practical_main_panel.revalidate();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void call_action() {

        load_table_exams_view();
    }
}
