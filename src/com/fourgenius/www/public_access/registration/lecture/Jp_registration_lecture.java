/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fourgenius.www.public_access.registration.lecture;

import static com.fourgenius.www.public_access.registration.lecture.Jp_registration_lecture_informations._tf_registration_lecture_information_form_sur_name;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

/**
 *
 * @author Pamitha Gayashan
 */
public class Jp_registration_lecture extends javax.swing.JPanel {

    Border border = BorderFactory.createLineBorder(Color.white, 1);

    /**
     * Creates new form Jp_registration_lecture
     */
    public Jp_registration_lecture() {
        initComponents();

        load_table_lecture_view();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Jp_registraion_lecture_buttons = new javax.swing.JPanel();
        _bt_registraion_lecture_buttons_add_lecture = new javax.swing.JButton();
        _bt_registraion_lecture_buttons_preview_lecture = new javax.swing.JButton();
        Jp_registraion_lecture_main_panel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(66, 66, 66));
        setVerifyInputWhenFocusTarget(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Jp_registraion_lecture_buttons.setBackground(new java.awt.Color(102, 102, 102));

        _bt_registraion_lecture_buttons_add_lecture.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _bt_registraion_lecture_buttons_add_lecture.setForeground(new java.awt.Color(255, 255, 255));
        _bt_registraion_lecture_buttons_add_lecture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/public_access/user/login/images_butons/buton_blue_200x50.png"))); // NOI18N
        _bt_registraion_lecture_buttons_add_lecture.setText("Add Lecture");
        _bt_registraion_lecture_buttons_add_lecture.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        _bt_registraion_lecture_buttons_add_lecture.setFocusPainted(false);
        _bt_registraion_lecture_buttons_add_lecture.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _bt_registraion_lecture_buttons_add_lecture.setPreferredSize(new java.awt.Dimension(300, 50));
        _bt_registraion_lecture_buttons_add_lecture.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                _bt_registraion_lecture_buttons_add_lectureMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                _bt_registraion_lecture_buttons_add_lectureMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                _bt_registraion_lecture_buttons_add_lectureMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                _bt_registraion_lecture_buttons_add_lectureMouseReleased(evt);
            }
        });
        _bt_registraion_lecture_buttons_add_lecture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _bt_registraion_lecture_buttons_add_lectureActionPerformed(evt);
            }
        });

        _bt_registraion_lecture_buttons_preview_lecture.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _bt_registraion_lecture_buttons_preview_lecture.setForeground(new java.awt.Color(255, 255, 255));
        _bt_registraion_lecture_buttons_preview_lecture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/public_access/user/login/images_butons/buton_blue_200x50.png"))); // NOI18N
        _bt_registraion_lecture_buttons_preview_lecture.setText("Lectures Details");
        _bt_registraion_lecture_buttons_preview_lecture.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        _bt_registraion_lecture_buttons_preview_lecture.setFocusPainted(false);
        _bt_registraion_lecture_buttons_preview_lecture.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _bt_registraion_lecture_buttons_preview_lecture.setPreferredSize(new java.awt.Dimension(300, 50));
        _bt_registraion_lecture_buttons_preview_lecture.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                _bt_registraion_lecture_buttons_preview_lectureMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                _bt_registraion_lecture_buttons_preview_lectureMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                _bt_registraion_lecture_buttons_preview_lectureMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                _bt_registraion_lecture_buttons_preview_lectureMouseReleased(evt);
            }
        });
        _bt_registraion_lecture_buttons_preview_lecture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _bt_registraion_lecture_buttons_preview_lectureActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Jp_registraion_lecture_buttonsLayout = new javax.swing.GroupLayout(Jp_registraion_lecture_buttons);
        Jp_registraion_lecture_buttons.setLayout(Jp_registraion_lecture_buttonsLayout);
        Jp_registraion_lecture_buttonsLayout.setHorizontalGroup(
            Jp_registraion_lecture_buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Jp_registraion_lecture_buttonsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(_bt_registraion_lecture_buttons_preview_lecture, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(_bt_registraion_lecture_buttons_add_lecture, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(912, Short.MAX_VALUE))
        );
        Jp_registraion_lecture_buttonsLayout.setVerticalGroup(
            Jp_registraion_lecture_buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Jp_registraion_lecture_buttonsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Jp_registraion_lecture_buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(_bt_registraion_lecture_buttons_add_lecture, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_bt_registraion_lecture_buttons_preview_lecture, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(Jp_registraion_lecture_buttons, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 638, 1340, -1));

        Jp_registraion_lecture_main_panel.setBackground(new java.awt.Color(66, 66, 66));
        Jp_registraion_lecture_main_panel.setLayout(new java.awt.CardLayout());
        add(Jp_registraion_lecture_main_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1366, 630));
    }// </editor-fold>//GEN-END:initComponents

    private void _bt_registraion_lecture_buttons_add_lectureMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_registraion_lecture_buttons_add_lectureMouseEntered
        _bt_registraion_lecture_buttons_add_lecture.setBorder(border);
    }//GEN-LAST:event__bt_registraion_lecture_buttons_add_lectureMouseEntered

    private void _bt_registraion_lecture_buttons_add_lectureMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_registraion_lecture_buttons_add_lectureMouseExited
        _bt_registraion_lecture_buttons_add_lecture.setBorder(null);
    }//GEN-LAST:event__bt_registraion_lecture_buttons_add_lectureMouseExited

    private void _bt_registraion_lecture_buttons_add_lectureMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_registraion_lecture_buttons_add_lectureMousePressed
        _bt_registraion_lecture_buttons_add_lecture.setBorder(null);
    }//GEN-LAST:event__bt_registraion_lecture_buttons_add_lectureMousePressed

    private void _bt_registraion_lecture_buttons_add_lectureMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_registraion_lecture_buttons_add_lectureMouseReleased
        _bt_registraion_lecture_buttons_add_lecture.setBorder(border);
    }//GEN-LAST:event__bt_registraion_lecture_buttons_add_lectureMouseReleased

    private void _bt_registraion_lecture_buttons_add_lectureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__bt_registraion_lecture_buttons_add_lectureActionPerformed
        String button_name = _bt_registraion_lecture_buttons_add_lecture.getText();
        if (button_name.equals("Add Lecture")) {
            load_lecture_information_form();
            buttons_enable(_bt_registraion_lecture_buttons_add_lecture.getText());
            _bt_registraion_lecture_buttons_add_lecture.setText("Cancel");
        } else {
            int option = JOptionPane.showConfirmDialog(this, "All Data You Didn't Save is Lost", "Are You Sure?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (option == JOptionPane.YES_OPTION) {
                load_table_lecture_view();
                _bt_registraion_lecture_buttons_add_lecture.setText("Add Lecture");
                _bt_registraion_lecture_buttons_preview_lecture.setEnabled(true);
            }

        }
    }//GEN-LAST:event__bt_registraion_lecture_buttons_add_lectureActionPerformed


    private void _bt_registraion_lecture_buttons_preview_lectureMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_registraion_lecture_buttons_preview_lectureMouseEntered
        _bt_registraion_lecture_buttons_preview_lecture.setBorder(border);
    }//GEN-LAST:event__bt_registraion_lecture_buttons_preview_lectureMouseEntered

    private void _bt_registraion_lecture_buttons_preview_lectureMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_registraion_lecture_buttons_preview_lectureMouseExited
        _bt_registraion_lecture_buttons_preview_lecture.setBorder(null);
    }//GEN-LAST:event__bt_registraion_lecture_buttons_preview_lectureMouseExited

    private void _bt_registraion_lecture_buttons_preview_lectureMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_registraion_lecture_buttons_preview_lectureMousePressed
        _bt_registraion_lecture_buttons_preview_lecture.setBorder(null);
    }//GEN-LAST:event__bt_registraion_lecture_buttons_preview_lectureMousePressed

    private void _bt_registraion_lecture_buttons_preview_lectureMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_registraion_lecture_buttons_preview_lectureMouseReleased
        _bt_registraion_lecture_buttons_preview_lecture.setBorder(border);
    }//GEN-LAST:event__bt_registraion_lecture_buttons_preview_lectureMouseReleased

    private void _bt_registraion_lecture_buttons_preview_lectureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__bt_registraion_lecture_buttons_preview_lectureActionPerformed
        load_table_lecture_view();

        buttons_enable(_bt_registraion_lecture_buttons_preview_lecture.getText());
    }//GEN-LAST:event__bt_registraion_lecture_buttons_preview_lectureActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Jp_registraion_lecture_buttons;
    public static javax.swing.JPanel Jp_registraion_lecture_main_panel;
    public static javax.swing.JButton _bt_registraion_lecture_buttons_add_lecture;
    public static javax.swing.JButton _bt_registraion_lecture_buttons_preview_lecture;
    // End of variables declaration//GEN-END:variables

    private void load_table_lecture_view() {
        try {
            Jp_registration_lecture_table_view view_lecture_table = new Jp_registration_lecture_table_view();

            if (view_lecture_table == null) {
                view_lecture_table = new Jp_registration_lecture_table_view();
                Jp_registraion_lecture_main_panel.removeAll();
                Jp_registraion_lecture_main_panel.repaint();
                Jp_registraion_lecture_main_panel.revalidate();
                Jp_registraion_lecture_main_panel.add(view_lecture_table);
                Jp_registraion_lecture_main_panel.repaint();
                Jp_registraion_lecture_main_panel.revalidate();
            } else {
                Jp_registraion_lecture_main_panel.removeAll();
                Jp_registraion_lecture_main_panel.repaint();
                Jp_registraion_lecture_main_panel.revalidate();
                Jp_registraion_lecture_main_panel.add(view_lecture_table);
                Jp_registraion_lecture_main_panel.repaint();
                Jp_registraion_lecture_main_panel.revalidate();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void buttons_enable(String button_name) {
        try {
            if (button_name.equals(_bt_registraion_lecture_buttons_preview_lecture.getText())) {
                _bt_registraion_lecture_buttons_add_lecture.setEnabled(true);
            } else if (button_name.equals(_bt_registraion_lecture_buttons_add_lecture.getText())) {
                _bt_registraion_lecture_buttons_preview_lecture.setEnabled(false);
            } else {
                _bt_registraion_lecture_buttons_preview_lecture.setEnabled(false);
                _bt_registraion_lecture_buttons_add_lecture.setEnabled(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void load_lecture_information_form() {
        try {
            Jp_registration_lecture_informations add_lecture = new Jp_registration_lecture_informations();
            if (add_lecture == null) {
                add_lecture = new Jp_registration_lecture_informations();
                Jp_registraion_lecture_main_panel.removeAll();
                Jp_registraion_lecture_main_panel.repaint();
                Jp_registraion_lecture_main_panel.revalidate();
                Jp_registraion_lecture_main_panel.add(add_lecture);
                Jp_registraion_lecture_main_panel.repaint();
                Jp_registraion_lecture_main_panel.revalidate();
            } else {
                Jp_registraion_lecture_main_panel.removeAll();
                Jp_registraion_lecture_main_panel.repaint();
                Jp_registraion_lecture_main_panel.revalidate();
                Jp_registraion_lecture_main_panel.add(add_lecture);
                Jp_registraion_lecture_main_panel.repaint();
                Jp_registraion_lecture_main_panel.revalidate();
            }
            _tf_registration_lecture_information_form_sur_name.grabFocus();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void call_action() {

        load_table_lecture_view();
    }
}
