/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fourgenius.www.public_access.user.login;

import com.fourgenius.www.private_access.admin.login.Jf_admin_login;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import com.fourgenius.www.qrGenerator.Md_QrCodeGenarater;
import com.fourgenius.www.private_access.admin.method.Md_move_text;
import com.fourgenius.www.user_FrontEnd.Jf_UserFront;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.UIManager;
import org.apache.log4j.Logger;
import public_access.MC_JavaDataBaseConnection;

/**
 *
 * @author deepal_suranga
 */
public class Jf_user_login extends javax.swing.JFrame {

    Border border = BorderFactory.createLineBorder(Color.white, 1);
    /**
     * Creates new form user_login
     */
    Md_move_text setLableValuesNullAndAdd = new Md_move_text();
    Md_QrCodeGenarater code_Gen = new Md_QrCodeGenarater();
    boolean flag;

    public Jf_user_login() {
        initComponents();
        showDate();;
        showTime();
        _pf_user_login_password.setEditable(false);
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception ex) {
        }

        setLableValuesNullAndAdd._md_setLableValuesNull(_lb_user_login_userName);
        setLableValuesNullAndAdd._md_setLableValuesNull(_lb_user_login_password);
        setLableValuesNullAndAdd._md_setTextFieldValues(_tf_user_loging_userName, "User Name");
        setLableValuesNullAndAdd._md_setPasswordFieldvalues(_pf_user_login_password, "Password");
        _pf_user_login_password.setEchoChar((char) 0);

         
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Middle = new javax.swing.JPanel();
        Top = new javax.swing.JPanel();
        _lb_user_login_close = new javax.swing.JLabel();
        _lb_user_login_minimize = new javax.swing.JLabel();
        _lb_user_login_seperator = new javax.swing.JLabel();
        _lb_user_login_logo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        _lb_user_login_password = new javax.swing.JLabel();
        _bt_Jf_user_login_Login = new javax.swing.JButton();
        _bt_Jf_user_login_Cancel = new javax.swing.JButton();
        _lb_user_login_forgotPassword = new javax.swing.JLabel();
        _lb_user_login_showPassword = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        _pf_user_login_password = new javax.swing.JPasswordField();
        _lb_user_login_dis_username = new javax.swing.JLabel();
        _lb_user_login_userName = new javax.swing.JLabel();
        _tf_user_loging_userName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lb_time_date = new javax.swing.JLabel();
        lb_date_view = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Middle.setBackground(new java.awt.Color(0, 200, 83));
        Middle.setPreferredSize(new java.awt.Dimension(1370, 770));

        Top.setBackground(new java.awt.Color(97, 97, 97));
        Top.setPreferredSize(new java.awt.Dimension(1366, 60));

        _lb_user_login_close.setBackground(new java.awt.Color(25, 118, 210));
        _lb_user_login_close.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        _lb_user_login_close.setForeground(new java.awt.Color(255, 255, 255));
        _lb_user_login_close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        _lb_user_login_close.setText("X");
        _lb_user_login_close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        _lb_user_login_close.setOpaque(true);
        _lb_user_login_close.setPreferredSize(new java.awt.Dimension(25, 25));
        _lb_user_login_close.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                _lb_user_login_closeMouseMoved(evt);
            }
        });
        _lb_user_login_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                _lb_user_login_closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                _lb_user_login_closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                _lb_user_login_closeMouseExited(evt);
            }
        });

        _lb_user_login_minimize.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        _lb_user_login_minimize.setForeground(new java.awt.Color(255, 255, 255));
        _lb_user_login_minimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        _lb_user_login_minimize.setText("-");
        _lb_user_login_minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        _lb_user_login_minimize.setPreferredSize(new java.awt.Dimension(25, 25));
        _lb_user_login_minimize.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                _lb_user_login_minimizeMouseMoved(evt);
            }
        });
        _lb_user_login_minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                _lb_user_login_minimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                _lb_user_login_minimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                _lb_user_login_minimizeMouseExited(evt);
            }
        });

        javax.swing.GroupLayout TopLayout = new javax.swing.GroupLayout(Top);
        Top.setLayout(TopLayout);
        TopLayout.setHorizontalGroup(
            TopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TopLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(_lb_user_login_minimize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_lb_user_login_close, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        TopLayout.setVerticalGroup(
            TopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopLayout.createSequentialGroup()
                .addGroup(TopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(_lb_user_login_close, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_lb_user_login_minimize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 25, Short.MAX_VALUE))
        );

        _lb_user_login_seperator.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/public_access/user/login/images/img_SaperateBar.png"))); // NOI18N

        _lb_user_login_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/public_access/user/login/images/img_RamaniAccademyLogo600x200_1.png"))); // NOI18N
        _lb_user_login_logo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        _lb_user_login_logo.setPreferredSize(new java.awt.Dimension(600, 100));
        _lb_user_login_logo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                _lb_user_login_logoMouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(97, 97, 97));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1380, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 152, 0));

        _lb_user_login_password.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _lb_user_login_password.setForeground(new java.awt.Color(240, 240, 240));
        _lb_user_login_password.setText("Password");

        _bt_Jf_user_login_Login.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _bt_Jf_user_login_Login.setForeground(new java.awt.Color(255, 255, 255));
        _bt_Jf_user_login_Login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/public_access/user/login/images_butons/button_blue_300x50.png"))); // NOI18N
        _bt_Jf_user_login_Login.setText("Login");
        _bt_Jf_user_login_Login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        _bt_Jf_user_login_Login.setFocusPainted(false);
        _bt_Jf_user_login_Login.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _bt_Jf_user_login_Login.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/public_access/user/login/images_butons/button_perpul_300x50.png"))); // NOI18N
        _bt_Jf_user_login_Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                _bt_Jf_user_login_LoginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                _bt_Jf_user_login_LoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                _bt_Jf_user_login_LoginMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                _bt_Jf_user_login_LoginMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                _bt_Jf_user_login_LoginMouseReleased(evt);
            }
        });
        _bt_Jf_user_login_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _bt_Jf_user_login_LoginActionPerformed(evt);
            }
        });

        _bt_Jf_user_login_Cancel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _bt_Jf_user_login_Cancel.setForeground(new java.awt.Color(255, 255, 255));
        _bt_Jf_user_login_Cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/public_access/user/login/images_butons/button_blue_300x50.png"))); // NOI18N
        _bt_Jf_user_login_Cancel.setText("Cancel");
        _bt_Jf_user_login_Cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        _bt_Jf_user_login_Cancel.setFocusPainted(false);
        _bt_Jf_user_login_Cancel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _bt_Jf_user_login_Cancel.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/public_access/user/login/images_butons/button_perpul_300x50.png"))); // NOI18N
        _bt_Jf_user_login_Cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                _bt_Jf_user_login_CancelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                _bt_Jf_user_login_CancelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                _bt_Jf_user_login_CancelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                _bt_Jf_user_login_CancelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                _bt_Jf_user_login_CancelMouseReleased(evt);
            }
        });

        _lb_user_login_forgotPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _lb_user_login_forgotPassword.setForeground(new java.awt.Color(255, 255, 255));
        _lb_user_login_forgotPassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        _lb_user_login_forgotPassword.setText("Forgot Password?");
        _lb_user_login_forgotPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        _lb_user_login_forgotPassword.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        _lb_user_login_forgotPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                _lb_user_login_forgotPasswordMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                _lb_user_login_forgotPasswordMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                _lb_user_login_forgotPasswordMouseExited(evt);
            }
        });

        _lb_user_login_showPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        _lb_user_login_showPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/public_access/user/login/images/img_ShowPassword.png"))); // NOI18N
        _lb_user_login_showPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        _lb_user_login_showPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                _lb_user_login_showPasswordMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                _lb_user_login_showPasswordMouseReleased(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/public_access/user/login/images/img_AccountCircleWhite192x192.png"))); // NOI18N

        _pf_user_login_password.setBackground(new java.awt.Color(255, 183, 77));
        _pf_user_login_password.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _pf_user_login_password.setForeground(new java.awt.Color(0, 204, 51));
        _pf_user_login_password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        _pf_user_login_password.setAutoscrolls(false);
        _pf_user_login_password.setMaximumSize(new java.awt.Dimension(300, 40));
        _pf_user_login_password.setMinimumSize(new java.awt.Dimension(300, 40));
        _pf_user_login_password.setPreferredSize(new java.awt.Dimension(300, 40));
        _pf_user_login_password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                _pf_user_login_passwordMouseClicked(evt);
            }
        });
        _pf_user_login_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _pf_user_login_passwordActionPerformed(evt);
            }
        });
        _pf_user_login_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                _pf_user_login_passwordKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                _pf_user_login_passwordKeyTyped(evt);
            }
        });

        _lb_user_login_dis_username.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        _lb_user_login_dis_username.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/public_access/user/login/images/img_UsernameInformation.png"))); // NOI18N
        _lb_user_login_dis_username.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        _lb_user_login_dis_username.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                _lb_user_login_dis_usernameMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                _lb_user_login_dis_usernameMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                _lb_user_login_dis_usernameMouseReleased(evt);
            }
        });

        _lb_user_login_userName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _lb_user_login_userName.setForeground(new java.awt.Color(255, 255, 255));
        _lb_user_login_userName.setText("User Name");

        _tf_user_loging_userName.setBackground(new java.awt.Color(255, 183, 77));
        _tf_user_loging_userName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _tf_user_loging_userName.setForeground(new java.awt.Color(0, 204, 51));
        _tf_user_loging_userName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        _tf_user_loging_userName.setAutoscrolls(false);
        _tf_user_loging_userName.setMaximumSize(new java.awt.Dimension(300, 40));
        _tf_user_loging_userName.setMinimumSize(new java.awt.Dimension(300, 40));
        _tf_user_loging_userName.setPreferredSize(new java.awt.Dimension(300, 40));
        _tf_user_loging_userName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                _tf_user_loging_userNameMouseClicked(evt);
            }
        });
        _tf_user_loging_userName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _tf_user_loging_userNameActionPerformed(evt);
            }
        });
        _tf_user_loging_userName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                _tf_user_loging_userNameKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(_lb_user_login_userName, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(_lb_user_login_dis_username))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(_tf_user_loging_userName, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(_lb_user_login_password, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(_lb_user_login_showPassword))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(_pf_user_login_password, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(_bt_Jf_user_login_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(_bt_Jf_user_login_Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(_lb_user_login_forgotPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(_lb_user_login_userName)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(_lb_user_login_dis_username)))
                .addGap(5, 5, 5)
                .addComponent(_tf_user_loging_userName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(_lb_user_login_password)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(_lb_user_login_showPassword)))
                .addGap(5, 5, 5)
                .addComponent(_pf_user_login_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(_bt_Jf_user_login_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(_bt_Jf_user_login_Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(_lb_user_login_forgotPassword))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("MANAGMENT");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("System");

        lb_time_date.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_time_date.setForeground(new java.awt.Color(255, 255, 255));
        lb_time_date.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_time_date.setText("Time View");

        lb_date_view.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lb_date_view.setForeground(new java.awt.Color(255, 255, 255));
        lb_date_view.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_date_view.setText("Date View");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Version 2.5.0.4");

        javax.swing.GroupLayout MiddleLayout = new javax.swing.GroupLayout(Middle);
        Middle.setLayout(MiddleLayout);
        MiddleLayout.setHorizontalGroup(
            MiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Top, javax.swing.GroupLayout.DEFAULT_SIZE, 1380, Short.MAX_VALUE)
            .addGroup(MiddleLayout.createSequentialGroup()
                .addGroup(MiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MiddleLayout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(_lb_user_login_logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lb_time_date, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lb_date_view, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(_lb_user_login_seperator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        MiddleLayout.setVerticalGroup(
            MiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MiddleLayout.createSequentialGroup()
                .addComponent(Top, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(MiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MiddleLayout.createSequentialGroup()
                        .addComponent(_lb_user_login_seperator, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(201, 201, 201))
                    .addGroup(MiddleLayout.createSequentialGroup()
                        .addGroup(MiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(MiddleLayout.createSequentialGroup()
                                .addGap(138, 138, 138)
                                .addComponent(_lb_user_login_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lb_date_view, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lb_time_date)))
                        .addGap(108, 108, 108)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(Middle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 770));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void _lb_user_login_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__lb_user_login_closeMouseClicked

        int showConfirmDialog = JOptionPane.showConfirmDialog(this, "You Want Close this Application!","Conformtion" , JOptionPane.YES_NO_OPTION);

        if (showConfirmDialog==JOptionPane.YES_OPTION) {
            System.exit(0);
        }
             
        
    }//GEN-LAST:event__lb_user_login_closeMouseClicked
    Border boder = BorderFactory.createLineBorder(Color.WHITE, 1);
    private void _lb_user_login_closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__lb_user_login_closeMouseEntered

        _lb_user_login_close.setBorder(boder);
        _lb_user_login_close.setBackground(Color.red);

        _lb_user_login_minimize.setToolTipText("Close");


    }//GEN-LAST:event__lb_user_login_closeMouseEntered

    private void _lb_user_login_closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__lb_user_login_closeMouseExited
        _lb_user_login_close.setBorder(null);
        _lb_user_login_close.setBackground(new Color(25, 118, 210));
    }//GEN-LAST:event__lb_user_login_closeMouseExited

    private void _lb_user_login_minimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__lb_user_login_minimizeMouseEntered

        _lb_user_login_minimize.setToolTipText("Minimize");
        _lb_user_login_minimize.setBorder(boder);

    }//GEN-LAST:event__lb_user_login_minimizeMouseEntered

    private void _lb_user_login_minimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__lb_user_login_minimizeMouseExited

        _lb_user_login_minimize.setBorder(null);

    }//GEN-LAST:event__lb_user_login_minimizeMouseExited

    private void _lb_user_login_minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__lb_user_login_minimizeMouseClicked

        this.setState(Jf_user_login.ICONIFIED);

    }//GEN-LAST:event__lb_user_login_minimizeMouseClicked

    private void _lb_user_login_showPasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__lb_user_login_showPasswordMousePressed

        _pf_user_login_password.setEchoChar((char) 0);

    }//GEN-LAST:event__lb_user_login_showPasswordMousePressed

    private void _lb_user_login_showPasswordMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__lb_user_login_showPasswordMouseReleased

        _pf_user_login_password.setEchoChar('*');

    }//GEN-LAST:event__lb_user_login_showPasswordMouseReleased

    private void _lb_user_login_forgotPasswordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__lb_user_login_forgotPasswordMouseEntered

        _lb_user_login_forgotPassword.setText("<html><u>" + _lb_user_login_forgotPassword.getText() + "</u></html>");

    }//GEN-LAST:event__lb_user_login_forgotPasswordMouseEntered

    private void _lb_user_login_forgotPasswordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__lb_user_login_forgotPasswordMouseExited

        _lb_user_login_forgotPassword.setText("Forgot Password?");

    }//GEN-LAST:event__lb_user_login_forgotPasswordMouseExited

    private void _lb_user_login_dis_usernameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__lb_user_login_dis_usernameMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event__lb_user_login_dis_usernameMousePressed

    private void _lb_user_login_dis_usernameMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__lb_user_login_dis_usernameMouseReleased

    }//GEN-LAST:event__lb_user_login_dis_usernameMouseReleased

    private void _tf_user_loging_userNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__tf_user_loging_userNameMouseClicked

        if (_tf_user_loging_userName.getText().equals("User Name")) {
            setLableValuesNullAndAdd._md_textFiledToLabel(_tf_user_loging_userName, _lb_user_login_userName, "User Name");
        }

    }//GEN-LAST:event__tf_user_loging_userNameMouseClicked

    int i = 0;
    private void _tf_user_loging_userNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event__tf_user_loging_userNameKeyTyped
        _tf_user_loging_userName.setBackground(Color.WHITE);
        if (i < 1) {
            if (!(_tf_user_loging_userName.getText().isEmpty() & _tf_user_loging_userName.getText().equals("User Name"))) {
                setLableValuesNullAndAdd._md_textFiledToLabel(_tf_user_loging_userName, _lb_user_login_userName, "User Name");
                i++;
            }
        }

    }//GEN-LAST:event__tf_user_loging_userNameKeyTyped

    private void _tf_user_loging_userNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__tf_user_loging_userNameActionPerformed

        new Thread(() -> {

            try {

                ResultSet rs = MC_JavaDataBaseConnection.myConnection().createStatement().executeQuery("SELECT * FROM `user` WHERE `user_email`='" + _tf_user_loging_userName.getText() + "' and user_status='1'");
                if (!rs.next()) {
                    _tf_user_loging_userName.setBackground(Color.red);
                    JOptionPane.showMessageDialog(this, "User name is Invalide", "Warning", 2);
                    _tf_user_loging_userName.grabFocus();
                    _tf_user_loging_userName.selectAll();

                    flag = false;
                } else {
                    _tf_user_loging_userName.setBackground(Color.WHITE);
                    flag = true;
                    _pf_user_login_password.setEditable(true);
                    _pf_user_login_password.grabFocus();

                }
            } catch (HeadlessException | SQLException e) {
                e.printStackTrace();
            }
        }).start();
    }//GEN-LAST:event__tf_user_loging_userNameActionPerformed

    private void _pf_user_login_passwordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__pf_user_login_passwordMouseClicked

        if (flag) {
            setLableValuesNullAndAdd._md_passwordFiledToLabel(_pf_user_login_password, _lb_user_login_password, "Password");
            _pf_user_login_password.setEchoChar('*');
        }

    }//GEN-LAST:event__pf_user_login_passwordMouseClicked
    int x = 0;
    private void _pf_user_login_passwordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event__pf_user_login_passwordKeyTyped
        _pf_user_login_password.setBackground(Color.WHITE);
        if (_pf_user_login_password.getText().length() == 100) {
            evt.consume();
        }
        if (x < 1) {

            if (!(_pf_user_login_password.getPassword().equals(""))) {

                setLableValuesNullAndAdd._md_passwordFiledToLabel(_pf_user_login_password, _lb_user_login_password, "Password");
                _pf_user_login_password.setEchoChar('*');
                x++;
            }

        }
    }//GEN-LAST:event__pf_user_login_passwordKeyTyped


    private void _pf_user_login_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__pf_user_login_passwordActionPerformed
        try {
            String pass = new String(_pf_user_login_password.getPassword());
            ResultSet rs = MC_JavaDataBaseConnection.myConnection().createStatement().executeQuery("SELECT * FROM user WHERE user_email='" + _tf_user_loging_userName.getText() + "' AND user_password='" + pass + "'");
            if (!rs.next()) {
                _pf_user_login_password.setBackground(Color.red);
                JOptionPane.showMessageDialog(this, "Password is Invalide", "Warning", 2);
                _pf_user_login_password.grabFocus();
                _pf_user_login_password.selectAll();

            } else {

                _bt_Jf_user_login_Login.doClick();

            }

        } catch (Exception e) {
        }
    }//GEN-LAST:event__pf_user_login_passwordActionPerformed

    private void _lb_user_login_closeMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__lb_user_login_closeMouseMoved


    }//GEN-LAST:event__lb_user_login_closeMouseMoved

    private void _lb_user_login_minimizeMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__lb_user_login_minimizeMouseMoved


    }//GEN-LAST:event__lb_user_login_minimizeMouseMoved

    private void _lb_user_login_logoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__lb_user_login_logoMouseClicked

        Jf_admin_login jf_admin_login = new Jf_admin_login();
        jf_admin_login.setVisible(true);
        this.dispose();

    }//GEN-LAST:event__lb_user_login_logoMouseClicked

    private void _bt_Jf_user_login_LoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_Jf_user_login_LoginMouseClicked

    }//GEN-LAST:event__bt_Jf_user_login_LoginMouseClicked

    private void _bt_Jf_user_login_LoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_Jf_user_login_LoginMouseEntered
        _bt_Jf_user_login_Login.setBorder(border);
    }//GEN-LAST:event__bt_Jf_user_login_LoginMouseEntered

    private void _bt_Jf_user_login_LoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_Jf_user_login_LoginMouseExited
        _bt_Jf_user_login_Login.setBorder(null);
    }//GEN-LAST:event__bt_Jf_user_login_LoginMouseExited

    private void _bt_Jf_user_login_LoginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_Jf_user_login_LoginMousePressed
        _bt_Jf_user_login_Login.setBorder(null);
    }//GEN-LAST:event__bt_Jf_user_login_LoginMousePressed

    private void _bt_Jf_user_login_LoginMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_Jf_user_login_LoginMouseReleased
        _bt_Jf_user_login_Login.setBorder(border);
    }//GEN-LAST:event__bt_Jf_user_login_LoginMouseReleased

    private void _bt_Jf_user_login_CancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_Jf_user_login_CancelMouseClicked
        System.exit(0);
    }//GEN-LAST:event__bt_Jf_user_login_CancelMouseClicked

    private void _bt_Jf_user_login_CancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_Jf_user_login_CancelMouseEntered
        _bt_Jf_user_login_Cancel.setBorder(border);
    }//GEN-LAST:event__bt_Jf_user_login_CancelMouseEntered

    private void _bt_Jf_user_login_CancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_Jf_user_login_CancelMouseExited
        _bt_Jf_user_login_Cancel.setBorder(null);
    }//GEN-LAST:event__bt_Jf_user_login_CancelMouseExited

    private void _bt_Jf_user_login_CancelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_Jf_user_login_CancelMousePressed
        _bt_Jf_user_login_Cancel.setBorder(null);
    }//GEN-LAST:event__bt_Jf_user_login_CancelMousePressed

    private void _bt_Jf_user_login_CancelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_Jf_user_login_CancelMouseReleased
        _bt_Jf_user_login_Cancel.setBorder(border);
    }//GEN-LAST:event__bt_Jf_user_login_CancelMouseReleased

    private void _bt_Jf_user_login_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__bt_Jf_user_login_LoginActionPerformed

        new Thread(() -> {

            login_user_method();

        }).start();

    }//GEN-LAST:event__bt_Jf_user_login_LoginActionPerformed

    private void _lb_user_login_dis_usernameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__lb_user_login_dis_usernameMouseEntered

        //_lb_user_login_sh

    }//GEN-LAST:event__lb_user_login_dis_usernameMouseEntered

    private void _pf_user_login_passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event__pf_user_login_passwordKeyPressed

        int key = evt.getKeyChar();
        if (key == KeyEvent.VK_ENTER) {

            login_user_method();

            System.gc();
        }

    }//GEN-LAST:event__pf_user_login_passwordKeyPressed

    private void _lb_user_login_forgotPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__lb_user_login_forgotPasswordMouseClicked

        int i = JOptionPane.showConfirmDialog(this, "Send Password in email", "Request Confirm?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (i == JOptionPane.YES_OPTION) {

        } else if (i == JOptionPane.NO_OPTION) {

        }


    }//GEN-LAST:event__lb_user_login_forgotPasswordMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Jf_user_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jf_user_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jf_user_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jf_user_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jf_user_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Middle;
    private javax.swing.JPanel Top;
    private javax.swing.JButton _bt_Jf_user_login_Cancel;
    private javax.swing.JButton _bt_Jf_user_login_Login;
    private javax.swing.JLabel _lb_user_login_close;
    private javax.swing.JLabel _lb_user_login_dis_username;
    private javax.swing.JLabel _lb_user_login_forgotPassword;
    private javax.swing.JLabel _lb_user_login_logo;
    private javax.swing.JLabel _lb_user_login_minimize;
    private javax.swing.JLabel _lb_user_login_password;
    private javax.swing.JLabel _lb_user_login_seperator;
    private javax.swing.JLabel _lb_user_login_showPassword;
    private javax.swing.JLabel _lb_user_login_userName;
    private javax.swing.JPasswordField _pf_user_login_password;
    private javax.swing.JTextField _tf_user_loging_userName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lb_date_view;
    private javax.swing.JLabel lb_time_date;
    // End of variables declaration//GEN-END:variables

    void showTime() {
        new Timer(0, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {

                Date d = new Date();
                SimpleDateFormat stim = new SimpleDateFormat("hh:mm:ss a");
                String st = stim.format(d);
                lb_time_date.setText(st);

            }
        }).start();
    }

    void showDate() {
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String s = sdf.format(d);
        lb_date_view.setText(s);
        System.out.println(s);

    }

    public void login_user_method() {

        String pass = new String(_pf_user_login_password.getPassword());
        try {
            ResultSet rs;
            rs = MC_JavaDataBaseConnection.myConnection().createStatement().executeQuery("SELECT * FROM user WHERE user_email='" + _tf_user_loging_userName.getText() + "' AND user_password='" + pass + "'");
            if (rs.next()) {
                System.out.println("User Quer ok!");

                Jf_UserFront user_menu = new Jf_UserFront(_tf_user_loging_userName.getText());
                user_menu.setVisible(true);

//                new Thread(() -> {
//                    User_SendMailSSL usmssl = new User_SendMailSSL();
//                    usmssl.sendingSSL(_tf_user_loging_userName.getText().trim(), "User", "Login Status:System Entered!\n\n" + "Username:" + _tf_user_loging_userName.getText() + "\n\n" + "Time:" + lb_time_date.getText() + "\n\n" + "Date:" + lb_date_view.getText() + "\n\n\n \t Thank you for using FourGenius System.");
//
//                    Admin_SendMailSSL asmssl = new Admin_SendMailSSL();
//                    asmssl.sendingSSL("User", "Login Status:System Entered!\n\n" + "Username:" + _tf_user_loging_userName.getText() + "\n\n" + "Time:" + lb_time_date.getText() + "\n\n" + "Date:" + lb_date_view.getText() + "\n\n\n \t Thank you for using FourGenius System.");
//                }).start();
//                Logger log  = Logger.getLogger("myFirstLog");
//        log.info(_tf_user_loging_userName.getText().trim()+" user login");

                this.dispose();
                System.gc();

            }

            rs.close();
        } catch (Exception e) {

            e.printStackTrace();

        }

    }

}
