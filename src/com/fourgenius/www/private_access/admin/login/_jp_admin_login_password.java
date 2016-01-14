/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fourgenius.www.private_access.admin.login;

import com.fourgenius.www.admin_BackEnd.Jf_admin_backend;
import com.fourgenius.www.private_access.admin.method.Md_move_text;
import com.fourgenius.www.qrGenerator.Md_QrCodeGenarater;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import net.java.balloontip.BalloonTip;
import net.java.balloontip.styles.BalloonTipStyle;
import net.java.balloontip.styles.EdgedBalloonStyle;
import public_access.MC_JavaDataBaseConnection;

/**
 *
 * @author Dineth Jayasekera
 */
public class _jp_admin_login_password extends javax.swing.JPanel {

    Border border = BorderFactory.createLineBorder(Color.white, 1);
    /*
     * Creates new form _jp_admin_login_password
     */

    Md_move_text setLableValuesNullAndAdd = new Md_move_text();
    Md_QrCodeGenarater code_Gen = new Md_QrCodeGenarater();

    public _jp_admin_login_password() {
        initComponents();
        code_Gen.load_qr(_lb_user_login_qrCode);
        System.out.println("QR Code is" + code_Gen.getRandom_pin());
        tf_admin_login_pin.grabFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adminLogin_emai = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        bt_admin_login = new javax.swing.JButton();
        tf_admin_login_cancel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lb_admin_login_forgetPassword = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        _lb_admi_login_email = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        pf_admin_login_password = new javax.swing.JPasswordField();
        _lb_user_login_qrCode = new javax.swing.JLabel();
        _lb_user_login_pin = new javax.swing.JLabel();
        tf_admin_login_pin = new javax.swing.JTextField();
        lb_admin_email = new javax.swing.JLabel();
        lb_pin_info = new javax.swing.JLabel();
        lb_password_info = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        _lb_admin_login_close = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        adminLogin_emai.setBackground(new java.awt.Color(61, 61, 61));
        adminLogin_emai.setMinimumSize(new java.awt.Dimension(1366, 768));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(320, 399));

        bt_admin_login.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bt_admin_login.setForeground(new java.awt.Color(255, 255, 255));
        bt_admin_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/public_access/user/login/images_butons/img_btn_adminBackEnd_Black.png"))); // NOI18N
        bt_admin_login.setText("Login");
        bt_admin_login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_admin_login.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_admin_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt_admin_loginMouseExited(evt);
            }
        });
        bt_admin_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_admin_loginActionPerformed(evt);
            }
        });

        tf_admin_login_cancel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_admin_login_cancel.setForeground(new java.awt.Color(255, 255, 255));
        tf_admin_login_cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/public_access/user/login/images_butons/img_btn_adminBackEnd_Black.png"))); // NOI18N
        tf_admin_login_cancel.setText("Cancel");
        tf_admin_login_cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tf_admin_login_cancel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tf_admin_login_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_admin_login_cancelActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Password");

        lb_admin_login_forgetPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_admin_login_forgetPassword.setForeground(new java.awt.Color(255, 255, 255));
        lb_admin_login_forgetPassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_admin_login_forgetPassword.setText("Forgot Password?");
        lb_admin_login_forgetPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_admin_login_forgetPasswordMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_admin_login_forgetPasswordMouseExited(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/public_access/user/login/images/img_AccountCircleGrey192x192.png"))); // NOI18N

        _lb_admi_login_email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _lb_admi_login_email.setForeground(new java.awt.Color(255, 255, 255));
        _lb_admi_login_email.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/public_access/user/login/images_butons/Arrows-Back-icon.png"))); // NOI18N
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        pf_admin_login_password.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pf_admin_login_password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pf_admin_login_password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pf_admin_login_passwordMouseClicked(evt);
            }
        });
        pf_admin_login_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pf_admin_login_passwordKeyPressed(evt);
            }
        });

        _lb_user_login_qrCode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        _lb_user_login_qrCode.setPreferredSize(new java.awt.Dimension(125, 125));

        _lb_user_login_pin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _lb_user_login_pin.setForeground(new java.awt.Color(255, 255, 255));
        _lb_user_login_pin.setText("Enter PIN Code");

        tf_admin_login_pin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_admin_login_pin.setMinimumSize(new java.awt.Dimension(6, 40));
        tf_admin_login_pin.setPreferredSize(new java.awt.Dimension(59, 40));
        tf_admin_login_pin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_admin_login_pinMouseClicked(evt);
            }
        });
        tf_admin_login_pin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf_admin_login_pinKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_admin_login_pinKeyTyped(evt);
            }
        });

        lb_admin_email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_admin_email.setForeground(new java.awt.Color(255, 255, 255));

        lb_pin_info.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_pin_info.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/public_access/user/login/images/img_UsernameInformation.png"))); // NOI18N
        lb_pin_info.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_pin_infoMouseClicked(evt);
            }
        });

        lb_password_info.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_password_info.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/public_access/user/login/images/img_UsernameInformation.png"))); // NOI18N
        lb_password_info.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_password_infoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lb_admin_login_forgetPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tf_admin_login_cancel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(bt_admin_login, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(_lb_user_login_qrCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tf_admin_login_pin, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(_lb_user_login_pin, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lb_pin_info))))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lb_password_info))))
                        .addGap(1, 1, 1))
                    .addComponent(pf_admin_login_password, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_admin_email, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(_lb_admi_login_email, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(_lb_admi_login_email, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(205, 205, 205))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_admin_email, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(_lb_user_login_qrCode, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(_lb_user_login_pin)
                                    .addComponent(lb_pin_info))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_admin_login_pin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(lb_password_info))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pf_admin_login_password, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_admin_login, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_admin_login_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_admin_login_forgetPassword)
                        .addContainerGap(22, Short.MAX_VALUE))))
        );

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("ADMINISTRATOR  BACK-END");

        _lb_admin_login_close.setBackground(new java.awt.Color(61, 61, 61));
        _lb_admin_login_close.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        _lb_admin_login_close.setForeground(new java.awt.Color(255, 255, 255));
        _lb_admin_login_close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        _lb_admin_login_close.setText("X");
        _lb_admin_login_close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        _lb_admin_login_close.setOpaque(true);
        _lb_admin_login_close.setPreferredSize(new java.awt.Dimension(25, 25));
        _lb_admin_login_close.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                _lb_admin_login_closeMouseMoved(evt);
            }
        });
        _lb_admin_login_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                _lb_admin_login_closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                _lb_admin_login_closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                _lb_admin_login_closeMouseExited(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/public_access/user/login/images/img_RamaniAccademyLogo600x200_1.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/public_access/user/login/images_butons/img_poweredBy_4G.png"))); // NOI18N

        javax.swing.GroupLayout adminLogin_emaiLayout = new javax.swing.GroupLayout(adminLogin_emai);
        adminLogin_emai.setLayout(adminLogin_emaiLayout);
        adminLogin_emaiLayout.setHorizontalGroup(
            adminLogin_emaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminLogin_emaiLayout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 1138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(_lb_admin_login_close, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminLogin_emaiLayout.createSequentialGroup()
                .addContainerGap(548, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(518, 518, 518))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminLogin_emaiLayout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        adminLogin_emaiLayout.setVerticalGroup(
            adminLogin_emaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminLogin_emaiLayout.createSequentialGroup()
                .addGroup(adminLogin_emaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(_lb_admin_login_close, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(adminLogin_emaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(adminLogin_emaiLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1387, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(adminLogin_emai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 768, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(adminLogin_emai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bt_admin_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_admin_loginActionPerformed

        login_method();

    }//GEN-LAST:event_bt_admin_loginActionPerformed

    private void _lb_admin_login_closeMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__lb_admin_login_closeMouseMoved

    }//GEN-LAST:event__lb_admin_login_closeMouseMoved

    private void _lb_admin_login_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__lb_admin_login_closeMouseClicked

        System.exit(0);
    }//GEN-LAST:event__lb_admin_login_closeMouseClicked

    private void _lb_admin_login_closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__lb_admin_login_closeMouseEntered

        _lb_admin_login_close.setBorder(border);
        _lb_admin_login_close.setBackground(Color.RED);


    }//GEN-LAST:event__lb_admin_login_closeMouseEntered

    private void _lb_admin_login_closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__lb_admin_login_closeMouseExited
        _lb_admin_login_close.setBorder(null);
        _lb_admin_login_close.setBackground(new Color(61, 61, 61));
    }//GEN-LAST:event__lb_admin_login_closeMouseExited

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked

        _jp_admin_login_email loginEmail = new _jp_admin_login_email();
        if (loginEmail == null) {
            loginEmail = new _jp_admin_login_email();
            Jf_admin_login.main_panel.removeAll();
            Jf_admin_login.main_panel.repaint();
            Jf_admin_login.main_panel.revalidate();
            Jf_admin_login.main_panel.add(loginEmail);
            Jf_admin_login.main_panel.repaint();
            Jf_admin_login.main_panel.revalidate();
        } else {
            Jf_admin_login.main_panel.removeAll();
            Jf_admin_login.main_panel.repaint();
            Jf_admin_login.main_panel.revalidate();
            Jf_admin_login.main_panel.add(loginEmail);
            Jf_admin_login.main_panel.repaint();
            Jf_admin_login.main_panel.revalidate();
        }

    }//GEN-LAST:event_jLabel7MouseClicked

    private void tf_admin_login_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_admin_login_cancelActionPerformed

        System.exit(0);

    }//GEN-LAST:event_tf_admin_login_cancelActionPerformed

    private void tf_admin_login_pinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_admin_login_pinMouseClicked

        setLableValuesNullAndAdd._md_textFiledToLabel(tf_admin_login_pin, _lb_user_login_pin, "Enter PIN Code");
    }//GEN-LAST:event_tf_admin_login_pinMouseClicked

    int y = 0;
    private void tf_admin_login_pinKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_admin_login_pinKeyTyped

        char c = evt.getKeyChar();
        if (tf_admin_login_pin.getText().length() == 4 || Character.isLetter(c)) {
            System.out.println("Comming..!");
            evt.consume();
        }
        if (y < 1) {
            if (!(tf_admin_login_pin.getText().isEmpty())) {
                setLableValuesNullAndAdd._md_textFiledToLabel(tf_admin_login_pin, _lb_user_login_pin, "Enter PIN Code");
                y++;
            }
        }
    }//GEN-LAST:event_tf_admin_login_pinKeyTyped

    private void lb_admin_login_forgetPasswordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_admin_login_forgetPasswordMouseEntered

        lb_admin_login_forgetPassword.setText("<html><u>Forgot Password?</u></html>");

    }//GEN-LAST:event_lb_admin_login_forgetPasswordMouseEntered

    private void tf_admin_login_pinKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_admin_login_pinKeyPressed

        int key = evt.getKeyChar();
        if (key == KeyEvent.VK_ENTER) {
            
            pf_admin_login_password.grabFocus();
            
        }

    }//GEN-LAST:event_tf_admin_login_pinKeyPressed

    private void pf_admin_login_passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pf_admin_login_passwordKeyPressed

        int key = evt.getKeyChar();
        if (key == KeyEvent.VK_ENTER) {
            login_method();
        }

    }//GEN-LAST:event_pf_admin_login_passwordKeyPressed

    private void pf_admin_login_passwordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pf_admin_login_passwordMouseClicked

        try {
            bt_admin_login.setText("Login");
        } catch (Exception e) {
        }


    }//GEN-LAST:event_pf_admin_login_passwordMouseClicked

    private void bt_admin_loginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_admin_loginMouseExited

        try {
            bt_admin_login.setText("Login");
        } catch (Exception e) {
        }

    }//GEN-LAST:event_bt_admin_loginMouseExited

    private void lb_admin_login_forgetPasswordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_admin_login_forgetPasswordMouseExited

        lb_admin_login_forgetPassword.setText("Forgot Password?");

    }//GEN-LAST:event_lb_admin_login_forgetPasswordMouseExited

    private void lb_pin_infoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_pin_infoMouseClicked

       // BalloonTip myBalloonTip = new BalloonTip(jLabel3, "Enter here your email address!");
        BalloonTipStyle edgedLook = new EdgedBalloonStyle(new Color(224,224,224), new Color(61, 61, 61));
        BalloonTip ba=new BalloonTip(lb_pin_info, "Scan Left Side QR CODE & Enter here \n it's embedded random number", edgedLook, true);
    }//GEN-LAST:event_lb_pin_infoMouseClicked

    private void lb_password_infoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_password_infoMouseClicked
        BalloonTipStyle edgedLook = new EdgedBalloonStyle(new Color(224,224,224), new Color(61, 61, 61));
        BalloonTip ba=new BalloonTip(lb_password_info, "Enter here your valid Password", edgedLook, true);
    }//GEN-LAST:event_lb_password_infoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel _lb_admi_login_email;
    private javax.swing.JLabel _lb_admin_login_close;
    private javax.swing.JLabel _lb_user_login_pin;
    private javax.swing.JLabel _lb_user_login_qrCode;
    private javax.swing.JPanel adminLogin_emai;
    private javax.swing.JButton bt_admin_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JLabel lb_admin_email;
    private javax.swing.JLabel lb_admin_login_forgetPassword;
    private javax.swing.JLabel lb_password_info;
    private javax.swing.JLabel lb_pin_info;
    private javax.swing.JPasswordField pf_admin_login_password;
    private javax.swing.JButton tf_admin_login_cancel;
    private javax.swing.JTextField tf_admin_login_pin;
    // End of variables declaration//GEN-END:variables

    private void login_method() {
        try {
            String admin_password = new String(pf_admin_login_password.getPassword());
            System.out.println("Admin password: " + admin_password);
            if (!tf_admin_login_pin.equals("") && pf_admin_login_password.equals("")) {

                if (!tf_admin_login_pin.equals("")) {
                    String pin = tf_admin_login_pin.getText();
                    System.out.println("Admin pin: " + pin);

                    if (pin.equals(code_Gen.getRandom_pin())) {

                        ResultSet resultSet;
                        resultSet = MC_JavaDataBaseConnection.myConnection().createStatement().executeQuery("SELECT * FROM admin WHERE admin_password='" + admin_password + "'");
                        if (resultSet.next()) {
                            Jf_admin_backend jf_admin_backend = new Jf_admin_backend();
                            jf_admin_backend.setVisible(true);

                        } else {
                            pf_admin_login_password.setBackground(new Color(244, 67, 54));
                            JOptionPane.showMessageDialog(this, "Incorrect Password!");

                        }

                    } else {
                        pf_admin_login_password.setBackground(new Color(244, 67, 54));
                        tf_admin_login_pin.setBackground(new Color(244, 67, 54));
                        JOptionPane.showMessageDialog(this, "QR code is incorrect!");
                    }
                }else {
                        pf_admin_login_password.setBackground(new Color(244, 67, 54)); 
                        JOptionPane.showMessageDialog(this, "Password is incorrect!");
                    }

            } else {
                pf_admin_login_password.setBackground(new Color(244, 67, 54));
                tf_admin_login_pin.setBackground(new Color(244, 67, 54));
                JOptionPane.showMessageDialog(this, "Password & Pin is empty!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
