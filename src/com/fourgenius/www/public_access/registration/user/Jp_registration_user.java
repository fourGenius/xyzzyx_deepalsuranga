/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fourgenius.www.public_access.registration.user;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.Border;

/**
 *
 * @author Dineth Jayasekera
 */
public class Jp_registration_user extends javax.swing.JPanel {

    Border border=BorderFactory.createLineBorder(Color.white, 1);
    /*
     * Creates new form registration_user
     */
    public Jp_registration_user() {
        initComponents();
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception ex) {
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

        _pl_registration_user_personal = new javax.swing.JPanel();
        _pl_registration_user_personal_name = new javax.swing.JPanel();
        _lb_registration_user_personal_name_firstName = new javax.swing.JLabel();
        _lb_registration_user_personal_name_sirName = new javax.swing.JLabel();
        _tf_registration_user_personal_name_sirName = new javax.swing.JTextField();
        _tf_registration_user_personal_name_firstName = new javax.swing.JTextField();
        _lb_registration_user_personal_name_secondName = new javax.swing.JLabel();
        _tf_registration_user_personal_name_secondName = new javax.swing.JTextField();
        _lb_registration_user_personal_name_lastName = new javax.swing.JLabel();
        _tf_registration_user_personal_name_lastName = new javax.swing.JTextField();
        _tf_registration_user_personal_contact_mobile = new javax.swing.JTextField();
        _lb_registration_user_personal_contact_mobile = new javax.swing.JLabel();
        _pl_registration_user_personal_contact = new javax.swing.JPanel();
        _lb_registration_user_personal_contact_land = new javax.swing.JLabel();
        _lb_registration_user_personal_contact_email = new javax.swing.JLabel();
        _tf_registration_user_personal_contact_email = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        _bt_registration_user_personalInformation_registerLecture = new javax.swing.JButton();
        _tf_registration_lecture_personalInformation_browsePhoto_browseFile1 = new javax.swing.JTextField();
        _bt_registration_user_personalInformation_browsePhoto_browser = new javax.swing.JButton();
        _pl_registration_user_preview = new javax.swing.JPanel();

        setBackground(new java.awt.Color(66, 66, 66));
        setMaximumSize(new java.awt.Dimension(1366, 718));
        setMinimumSize(new java.awt.Dimension(1366, 718));
        setPreferredSize(new java.awt.Dimension(1366, 718));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        _pl_registration_user_personal.setBackground(new java.awt.Color(2, 119, 189));
        _pl_registration_user_personal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Personal", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        _pl_registration_user_personal.setPreferredSize(new java.awt.Dimension(810, 695));

        _pl_registration_user_personal_name.setBackground(new java.awt.Color(2, 119, 189));
        _pl_registration_user_personal_name.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "User Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        _lb_registration_user_personal_name_firstName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _lb_registration_user_personal_name_firstName.setForeground(new java.awt.Color(255, 255, 255));
        _lb_registration_user_personal_name_firstName.setText("First Name");

        _lb_registration_user_personal_name_sirName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _lb_registration_user_personal_name_sirName.setForeground(new java.awt.Color(255, 255, 255));
        _lb_registration_user_personal_name_sirName.setText("Sir Name");

        _tf_registration_user_personal_name_sirName.setPreferredSize(new java.awt.Dimension(6, 40));

        _tf_registration_user_personal_name_firstName.setPreferredSize(new java.awt.Dimension(6, 40));

        _lb_registration_user_personal_name_secondName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _lb_registration_user_personal_name_secondName.setForeground(new java.awt.Color(255, 255, 255));
        _lb_registration_user_personal_name_secondName.setText("Second Name");

        _tf_registration_user_personal_name_secondName.setPreferredSize(new java.awt.Dimension(6, 40));

        _lb_registration_user_personal_name_lastName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _lb_registration_user_personal_name_lastName.setForeground(new java.awt.Color(255, 255, 255));
        _lb_registration_user_personal_name_lastName.setText("Last Name");

        _tf_registration_user_personal_name_lastName.setPreferredSize(new java.awt.Dimension(6, 40));

        _tf_registration_user_personal_contact_mobile.setPreferredSize(new java.awt.Dimension(6, 40));

        _lb_registration_user_personal_contact_mobile.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _lb_registration_user_personal_contact_mobile.setForeground(new java.awt.Color(255, 255, 255));
        _lb_registration_user_personal_contact_mobile.setText("Mobile Number");

        javax.swing.GroupLayout _pl_registration_user_personal_nameLayout = new javax.swing.GroupLayout(_pl_registration_user_personal_name);
        _pl_registration_user_personal_name.setLayout(_pl_registration_user_personal_nameLayout);
        _pl_registration_user_personal_nameLayout.setHorizontalGroup(
            _pl_registration_user_personal_nameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, _pl_registration_user_personal_nameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(_pl_registration_user_personal_nameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(_tf_registration_user_personal_name_sirName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(_tf_registration_user_personal_name_firstName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(_tf_registration_user_personal_name_secondName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(_tf_registration_user_personal_name_lastName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, _pl_registration_user_personal_nameLayout.createSequentialGroup()
                        .addGroup(_pl_registration_user_personal_nameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(_lb_registration_user_personal_name_sirName)
                            .addComponent(_lb_registration_user_personal_name_firstName)
                            .addComponent(_lb_registration_user_personal_name_secondName)
                            .addComponent(_lb_registration_user_personal_name_lastName)
                            .addComponent(_lb_registration_user_personal_contact_mobile))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(_tf_registration_user_personal_contact_mobile, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        _pl_registration_user_personal_nameLayout.setVerticalGroup(
            _pl_registration_user_personal_nameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(_pl_registration_user_personal_nameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(_lb_registration_user_personal_name_sirName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_tf_registration_user_personal_name_sirName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_lb_registration_user_personal_name_firstName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_tf_registration_user_personal_name_firstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_lb_registration_user_personal_name_secondName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_tf_registration_user_personal_name_secondName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_lb_registration_user_personal_name_lastName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_tf_registration_user_personal_name_lastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_lb_registration_user_personal_contact_mobile)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_tf_registration_user_personal_contact_mobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        _pl_registration_user_personal_contact.setBackground(new java.awt.Color(2, 119, 189));
        _pl_registration_user_personal_contact.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Login Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        _lb_registration_user_personal_contact_land.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _lb_registration_user_personal_contact_land.setForeground(new java.awt.Color(255, 255, 255));
        _lb_registration_user_personal_contact_land.setText("Password");

        _lb_registration_user_personal_contact_email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _lb_registration_user_personal_contact_email.setForeground(new java.awt.Color(255, 255, 255));
        _lb_registration_user_personal_contact_email.setText("E-mail");

        _tf_registration_user_personal_contact_email.setPreferredSize(new java.awt.Dimension(6, 40));

        javax.swing.GroupLayout _pl_registration_user_personal_contactLayout = new javax.swing.GroupLayout(_pl_registration_user_personal_contact);
        _pl_registration_user_personal_contact.setLayout(_pl_registration_user_personal_contactLayout);
        _pl_registration_user_personal_contactLayout.setHorizontalGroup(
            _pl_registration_user_personal_contactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(_pl_registration_user_personal_contactLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(_pl_registration_user_personal_contactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(_tf_registration_user_personal_contact_email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(_pl_registration_user_personal_contactLayout.createSequentialGroup()
                        .addGroup(_pl_registration_user_personal_contactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(_lb_registration_user_personal_contact_land)
                            .addComponent(_lb_registration_user_personal_contact_email))
                        .addGap(0, 289, Short.MAX_VALUE))
                    .addComponent(jPasswordField1))
                .addContainerGap())
        );
        _pl_registration_user_personal_contactLayout.setVerticalGroup(
            _pl_registration_user_personal_contactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(_pl_registration_user_personal_contactLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(_lb_registration_user_personal_contact_land)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_lb_registration_user_personal_contact_email)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_tf_registration_user_personal_contact_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        _bt_registration_user_personalInformation_registerLecture.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _bt_registration_user_personalInformation_registerLecture.setForeground(new java.awt.Color(255, 255, 255));
        _bt_registration_user_personalInformation_registerLecture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/public_access/user/login/images_butons/button_blue_300x50.png"))); // NOI18N
        _bt_registration_user_personalInformation_registerLecture.setText("Add User");
        _bt_registration_user_personalInformation_registerLecture.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        _bt_registration_user_personalInformation_registerLecture.setFocusPainted(false);
        _bt_registration_user_personalInformation_registerLecture.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _bt_registration_user_personalInformation_registerLecture.setPreferredSize(new java.awt.Dimension(300, 50));
        _bt_registration_user_personalInformation_registerLecture.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                _bt_registration_user_personalInformation_registerLectureMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                _bt_registration_user_personalInformation_registerLectureMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                _bt_registration_user_personalInformation_registerLectureMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                _bt_registration_user_personalInformation_registerLectureMouseReleased(evt);
            }
        });

        _tf_registration_lecture_personalInformation_browsePhoto_browseFile1.setText("Broswe File");

        _bt_registration_user_personalInformation_browsePhoto_browser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _bt_registration_user_personalInformation_browsePhoto_browser.setForeground(new java.awt.Color(255, 255, 255));
        _bt_registration_user_personalInformation_browsePhoto_browser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/public_access/user/login/images_butons/button_blue_300x50.png"))); // NOI18N
        _bt_registration_user_personalInformation_browsePhoto_browser.setText("Browse");
        _bt_registration_user_personalInformation_browsePhoto_browser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        _bt_registration_user_personalInformation_browsePhoto_browser.setFocusPainted(false);
        _bt_registration_user_personalInformation_browsePhoto_browser.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _bt_registration_user_personalInformation_browsePhoto_browser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                _bt_registration_user_personalInformation_browsePhoto_browserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                _bt_registration_user_personalInformation_browsePhoto_browserMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                _bt_registration_user_personalInformation_browsePhoto_browserMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                _bt_registration_user_personalInformation_browsePhoto_browserMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout _pl_registration_user_personalLayout = new javax.swing.GroupLayout(_pl_registration_user_personal);
        _pl_registration_user_personal.setLayout(_pl_registration_user_personalLayout);
        _pl_registration_user_personalLayout.setHorizontalGroup(
            _pl_registration_user_personalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(_pl_registration_user_personalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(_pl_registration_user_personalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(_pl_registration_user_personalLayout.createSequentialGroup()
                        .addGap(0, 93, Short.MAX_VALUE)
                        .addComponent(_bt_registration_user_personalInformation_registerLecture, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(_pl_registration_user_personal_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(_pl_registration_user_personalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(_pl_registration_user_personal_contact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_bt_registration_user_personalInformation_browsePhoto_browser, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_tf_registration_lecture_personalInformation_browsePhoto_browseFile1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        _pl_registration_user_personalLayout.setVerticalGroup(
            _pl_registration_user_personalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(_pl_registration_user_personalLayout.createSequentialGroup()
                .addGroup(_pl_registration_user_personalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(_pl_registration_user_personalLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(_pl_registration_user_personal_contact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(_tf_registration_lecture_personalInformation_browsePhoto_browseFile1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_bt_registration_user_personalInformation_browsePhoto_browser, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, _pl_registration_user_personalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(_pl_registration_user_personal_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_bt_registration_user_personalInformation_registerLecture, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(_pl_registration_user_personal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 810, 690));

        _pl_registration_user_preview.setBackground(new java.awt.Color(117, 117, 117));
        _pl_registration_user_preview.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Preview", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(255, 255, 255)))); // NOI18N
        _pl_registration_user_preview.setFocusable(false);
        _pl_registration_user_preview.setMaximumSize(new java.awt.Dimension(32767, 695));
        _pl_registration_user_preview.setMinimumSize(new java.awt.Dimension(525, 695));
        _pl_registration_user_preview.setPreferredSize(new java.awt.Dimension(525, 695));

        javax.swing.GroupLayout _pl_registration_user_previewLayout = new javax.swing.GroupLayout(_pl_registration_user_preview);
        _pl_registration_user_preview.setLayout(_pl_registration_user_previewLayout);
        _pl_registration_user_previewLayout.setHorizontalGroup(
            _pl_registration_user_previewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 514, Short.MAX_VALUE)
        );
        _pl_registration_user_previewLayout.setVerticalGroup(
            _pl_registration_user_previewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 669, Short.MAX_VALUE)
        );

        add(_pl_registration_user_preview, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, 526, 695));
    }// </editor-fold>//GEN-END:initComponents

    private void _bt_registration_user_personalInformation_browsePhoto_browserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_registration_user_personalInformation_browsePhoto_browserMouseEntered
        _bt_registration_user_personalInformation_browsePhoto_browser.setBorder(border);
    }//GEN-LAST:event__bt_registration_user_personalInformation_browsePhoto_browserMouseEntered

    private void _bt_registration_user_personalInformation_browsePhoto_browserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_registration_user_personalInformation_browsePhoto_browserMouseExited
        _bt_registration_user_personalInformation_browsePhoto_browser.setBorder(null);
    }//GEN-LAST:event__bt_registration_user_personalInformation_browsePhoto_browserMouseExited

    private void _bt_registration_user_personalInformation_browsePhoto_browserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_registration_user_personalInformation_browsePhoto_browserMousePressed
        _bt_registration_user_personalInformation_browsePhoto_browser.setBorder(null);
    }//GEN-LAST:event__bt_registration_user_personalInformation_browsePhoto_browserMousePressed

    private void _bt_registration_user_personalInformation_browsePhoto_browserMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_registration_user_personalInformation_browsePhoto_browserMouseReleased
        _bt_registration_user_personalInformation_browsePhoto_browser.setBorder(border);
    }//GEN-LAST:event__bt_registration_user_personalInformation_browsePhoto_browserMouseReleased

    private void _bt_registration_user_personalInformation_registerLectureMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_registration_user_personalInformation_registerLectureMousePressed
        _bt_registration_user_personalInformation_registerLecture.setBorder(null);
    }//GEN-LAST:event__bt_registration_user_personalInformation_registerLectureMousePressed

    private void _bt_registration_user_personalInformation_registerLectureMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_registration_user_personalInformation_registerLectureMouseEntered
        _bt_registration_user_personalInformation_registerLecture.setBorder(border);
    }//GEN-LAST:event__bt_registration_user_personalInformation_registerLectureMouseEntered

    private void _bt_registration_user_personalInformation_registerLectureMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_registration_user_personalInformation_registerLectureMouseExited
        _bt_registration_user_personalInformation_registerLecture.setBorder(null);
    }//GEN-LAST:event__bt_registration_user_personalInformation_registerLectureMouseExited

    private void _bt_registration_user_personalInformation_registerLectureMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_registration_user_personalInformation_registerLectureMouseReleased
        _bt_registration_user_personalInformation_registerLecture.setBorder(border);
    }//GEN-LAST:event__bt_registration_user_personalInformation_registerLectureMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton _bt_registration_user_personalInformation_browsePhoto_browser;
    private javax.swing.JButton _bt_registration_user_personalInformation_registerLecture;
    private javax.swing.JLabel _lb_registration_user_personal_contact_email;
    private javax.swing.JLabel _lb_registration_user_personal_contact_land;
    private javax.swing.JLabel _lb_registration_user_personal_contact_mobile;
    private javax.swing.JLabel _lb_registration_user_personal_name_firstName;
    private javax.swing.JLabel _lb_registration_user_personal_name_lastName;
    private javax.swing.JLabel _lb_registration_user_personal_name_secondName;
    private javax.swing.JLabel _lb_registration_user_personal_name_sirName;
    private javax.swing.JPanel _pl_registration_user_personal;
    private javax.swing.JPanel _pl_registration_user_personal_contact;
    private javax.swing.JPanel _pl_registration_user_personal_name;
    private javax.swing.JPanel _pl_registration_user_preview;
    private javax.swing.JTextField _tf_registration_lecture_personalInformation_browsePhoto_browseFile1;
    private javax.swing.JTextField _tf_registration_user_personal_contact_email;
    private javax.swing.JTextField _tf_registration_user_personal_contact_mobile;
    private javax.swing.JTextField _tf_registration_user_personal_name_firstName;
    private javax.swing.JTextField _tf_registration_user_personal_name_lastName;
    private javax.swing.JTextField _tf_registration_user_personal_name_secondName;
    private javax.swing.JTextField _tf_registration_user_personal_name_sirName;
    private javax.swing.JPasswordField jPasswordField1;
    // End of variables declaration//GEN-END:variables
}
