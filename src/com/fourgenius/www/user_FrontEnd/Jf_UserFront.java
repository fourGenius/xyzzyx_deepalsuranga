/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fourgenius.www.user_FrontEnd;

import com.fourgenius.www.public_access.exams.Jf_Exams;
import com.fourgenius.www.public_access.practicals.Jf_practicals;
import com.fourgenius.www.public_access.registration.student.Jp_registration_student;
import com.fourgenius.www.public_access.user.login.Jf_user_login;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.Timer;
import javax.swing.border.Border;

/**
 *
 * @author Dineth Jayasekera
 */
public class Jf_UserFront extends javax.swing.JFrame {

    /**
     * Creates new form Jf_UserFront
     */
    
      Border borderE = BorderFactory.createLineBorder(new Color(244, 67, 54), 1);
    Border borderC = BorderFactory.createLineBorder(new Color(255, 255, 255), 1);
   String email;
    public Jf_UserFront(String userEmail) {
        initComponents();
        showTime();
        showDate();
        email=userEmail;
        lb_welcome_note.setText(email);
        
    }

    public Jf_UserFront() {
        super();
        initComponents();
        showTime();
        showDate();
        lb_welcome_note.setText(email);
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
        lb_branch1 = new javax.swing.JLabel();
        lb_branch2 = new javax.swing.JLabel();
        lb_dhas = new javax.swing.JLabel();
        lb_main_pic = new javax.swing.JLabel();
        lb_h2 = new javax.swing.JLabel();
        bt_homeAutomation = new javax.swing.JButton();
        bt_libray = new javax.swing.JButton();
        bt_practicals = new javax.swing.JButton();
        bt_exam = new javax.swing.JButton();
        bt_onlineExam = new javax.swing.JButton();
        bt_inventory = new javax.swing.JButton();
        bt_registration = new javax.swing.JButton();
        bt_viewReport = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lb_welcome_note = new javax.swing.JLabel();
        bt_logout = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lb_time_date = new javax.swing.JLabel();
        lb_date_view = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(66, 66, 66));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1366, 768));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setForeground(new java.awt.Color(66, 66, 66));
        jPanel1.setPreferredSize(new java.awt.Dimension(1237, 481));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_branch1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_branch1.setForeground(new java.awt.Color(255, 255, 255));
        lb_branch1.setText("Colombo");
        jPanel1.add(lb_branch1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 620, -1, -1));

        lb_branch2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_branch2.setForeground(new java.awt.Color(255, 255, 255));
        lb_branch2.setText("Kandy");
        jPanel1.add(lb_branch2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 640, -1, -1));

        lb_dhas.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lb_dhas.setForeground(new java.awt.Color(255, 255, 255));
        lb_dhas.setText("Managmet System");
        jPanel1.add(lb_dhas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 590, 490, 50));

        lb_main_pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/user_FrontEnd/images/management-System.png"))); // NOI18N
        jPanel1.add(lb_main_pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 540, 480));

        lb_h2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lb_h2.setForeground(new java.awt.Color(255, 255, 255));
        lb_h2.setText("Ramani Fernando Sunsilik Academy");
        jPanel1.add(lb_h2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 640, 290, -1));

        bt_homeAutomation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/user_FrontEnd/images/homeAutomation.png"))); // NOI18N
        bt_homeAutomation.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        bt_homeAutomation.setContentAreaFilled(false);
        bt_homeAutomation.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_homeAutomation.setFocusPainted(false);
        bt_homeAutomation.setMaximumSize(new java.awt.Dimension(230, 150));
        bt_homeAutomation.setMinimumSize(new java.awt.Dimension(230, 150));
        bt_homeAutomation.setPreferredSize(new java.awt.Dimension(230, 150));
        bt_homeAutomation.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/user_FrontEnd/images/autoMationR.png"))); // NOI18N
        bt_homeAutomation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bt_homeAutomationMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt_homeAutomationMouseExited(evt);
            }
        });
        bt_homeAutomation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_homeAutomationActionPerformed(evt);
            }
        });
        jPanel1.add(bt_homeAutomation, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 490, -1, -1));

        bt_libray.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/user_FrontEnd/images/libray.png"))); // NOI18N
        bt_libray.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        bt_libray.setContentAreaFilled(false);
        bt_libray.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_libray.setFocusPainted(false);
        bt_libray.setMaximumSize(new java.awt.Dimension(230, 150));
        bt_libray.setMinimumSize(new java.awt.Dimension(230, 150));
        bt_libray.setPreferredSize(new java.awt.Dimension(230, 150));
        bt_libray.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bt_librayMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt_librayMouseExited(evt);
            }
        });
        bt_libray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_librayActionPerformed(evt);
            }
        });
        jPanel1.add(bt_libray, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 330, -1, -1));

        bt_practicals.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/user_FrontEnd/images/practical.png"))); // NOI18N
        bt_practicals.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        bt_practicals.setContentAreaFilled(false);
        bt_practicals.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_practicals.setFocusPainted(false);
        bt_practicals.setMaximumSize(new java.awt.Dimension(230, 150));
        bt_practicals.setMinimumSize(new java.awt.Dimension(230, 150));
        bt_practicals.setPreferredSize(new java.awt.Dimension(230, 150));
        bt_practicals.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bt_practicalsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt_practicalsMouseExited(evt);
            }
        });
        bt_practicals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_practicalsActionPerformed(evt);
            }
        });
        jPanel1.add(bt_practicals, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 170, -1, -1));

        bt_exam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/user_FrontEnd/images/exam.png"))); // NOI18N
        bt_exam.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        bt_exam.setContentAreaFilled(false);
        bt_exam.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_exam.setFocusPainted(false);
        bt_exam.setMaximumSize(new java.awt.Dimension(230, 150));
        bt_exam.setMinimumSize(new java.awt.Dimension(230, 150));
        bt_exam.setPreferredSize(new java.awt.Dimension(230, 150));
        bt_exam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bt_examMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt_examMouseExited(evt);
            }
        });
        bt_exam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_examActionPerformed(evt);
            }
        });
        jPanel1.add(bt_exam, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 330, -1, -1));

        bt_onlineExam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/user_FrontEnd/images/onlineExam.png"))); // NOI18N
        bt_onlineExam.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        bt_onlineExam.setContentAreaFilled(false);
        bt_onlineExam.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_onlineExam.setFocusPainted(false);
        bt_onlineExam.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_onlineExam.setMaximumSize(new java.awt.Dimension(230, 150));
        bt_onlineExam.setMinimumSize(new java.awt.Dimension(230, 150));
        bt_onlineExam.setPreferredSize(new java.awt.Dimension(230, 150));
        bt_onlineExam.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        bt_onlineExam.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bt_onlineExam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bt_onlineExamMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt_onlineExamMouseExited(evt);
            }
        });
        bt_onlineExam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_onlineExamActionPerformed(evt);
            }
        });
        jPanel1.add(bt_onlineExam, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 490, -1, -1));

        bt_inventory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/public_access/user/login/images/INVENTORY.PNG"))); // NOI18N
        bt_inventory.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        bt_inventory.setContentAreaFilled(false);
        bt_inventory.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_inventory.setFocusPainted(false);
        bt_inventory.setMaximumSize(new java.awt.Dimension(230, 150));
        bt_inventory.setMinimumSize(new java.awt.Dimension(230, 150));
        bt_inventory.setPreferredSize(new java.awt.Dimension(230, 150));
        bt_inventory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bt_inventoryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt_inventoryMouseExited(evt);
            }
        });
        bt_inventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_inventoryActionPerformed(evt);
            }
        });
        jPanel1.add(bt_inventory, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 170, -1, -1));

        bt_registration.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/public_access/user/login/images/REGISTRATION.PNG"))); // NOI18N
        bt_registration.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        bt_registration.setContentAreaFilled(false);
        bt_registration.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_registration.setFocusPainted(false);
        bt_registration.setMaximumSize(new java.awt.Dimension(230, 150));
        bt_registration.setMinimumSize(new java.awt.Dimension(230, 150));
        bt_registration.setPreferredSize(new java.awt.Dimension(230, 150));
        bt_registration.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bt_registrationMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt_registrationMouseExited(evt);
            }
        });
        bt_registration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_registrationActionPerformed(evt);
            }
        });
        jPanel1.add(bt_registration, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 332, -1, -1));

        bt_viewReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/public_access/user/login/images/VIEW REPORTS.PNG"))); // NOI18N
        bt_viewReport.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        bt_viewReport.setContentAreaFilled(false);
        bt_viewReport.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_viewReport.setFocusPainted(false);
        bt_viewReport.setMaximumSize(new java.awt.Dimension(230, 150));
        bt_viewReport.setMinimumSize(new java.awt.Dimension(230, 150));
        bt_viewReport.setPreferredSize(new java.awt.Dimension(230, 150));
        bt_viewReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bt_viewReportMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt_viewReportMouseExited(evt);
            }
        });
        bt_viewReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_viewReportActionPerformed(evt);
            }
        });
        jPanel1.add(bt_viewReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 492, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));

        lb_welcome_note.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_welcome_note.setForeground(new java.awt.Color(255, 255, 255));
        lb_welcome_note.setText("Welcome, FRONT-END USER:");

        bt_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PowerLock.png"))); // NOI18N
        bt_logout.setContentAreaFilled(false);
        bt_logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_logout.setFocusPainted(false);
        bt_logout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_logout.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/PowerLockR.png"))); // NOI18N
        bt_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_welcome_note)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1127, Short.MAX_VALUE)
                .addComponent(bt_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_welcome_note, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bt_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 50));

        jPanel3.setBackground(new java.awt.Color(0, 153, 204));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/user_FrontEnd/images/logoA.png"))); // NOI18N

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/user_FrontEnd/images/Sunsilk-Logo mini.png"))); // NOI18N

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/user_FrontEnd/images/unilever-logo-500x500.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 952, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 4, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 670, 1370, 100));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("|");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 600, -1, -1));

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));

        lb_time_date.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lb_time_date.setForeground(new java.awt.Color(255, 255, 255));
        lb_time_date.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_time_date.setText("Date:");

        lb_date_view.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_date_view.setForeground(new java.awt.Color(255, 255, 255));
        lb_date_view.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_date_view.setText("Time:");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/user_FrontEnd/images/Feedbin-Icon-clock.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_date_view, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lb_time_date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(11, 11, 11))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_time_date, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lb_date_view, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(52, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 170, 230, 150));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1370, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 770, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
Jf_user_login jf_user_login = new Jf_user_login();
    private void bt_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_logoutActionPerformed

        if (jf_user_login == null) {
            jf_user_login = new Jf_user_login();
            jf_user_login.setVisible(true);
            this.dispose();
        } else {
            jf_user_login.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_bt_logoutActionPerformed

    private void bt_viewReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_viewReportActionPerformed
        
        new jp_reports_main_view().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_bt_viewReportActionPerformed

    private void bt_inventoryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_inventoryMouseEntered
bt_inventory.setBorder(borderE);
    }//GEN-LAST:event_bt_inventoryMouseEntered

    private void bt_inventoryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_inventoryMouseExited
        bt_inventory.setBorder(borderC);
    }//GEN-LAST:event_bt_inventoryMouseExited

    private void bt_registrationMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_registrationMouseEntered
       bt_registration.setBorder(borderE);
    }//GEN-LAST:event_bt_registrationMouseEntered

    private void bt_registrationMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_registrationMouseExited
        bt_registration.setBorder(borderC);
    }//GEN-LAST:event_bt_registrationMouseExited

    private void bt_viewReportMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_viewReportMouseEntered
        bt_viewReport.setBorder(borderE);
    }//GEN-LAST:event_bt_viewReportMouseEntered

    private void bt_viewReportMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_viewReportMouseExited
        bt_viewReport.setBorder(borderC);
    }//GEN-LAST:event_bt_viewReportMouseExited

    private void bt_inventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_inventoryActionPerformed
        new Inventory_home().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bt_inventoryActionPerformed

    private void bt_registrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_registrationActionPerformed
        new Jf_UserRegistration().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bt_registrationActionPerformed

    private void bt_homeAutomationMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_homeAutomationMouseEntered
       
        bt_homeAutomation.setBorder(borderE);
        
    }//GEN-LAST:event_bt_homeAutomationMouseEntered

    private void bt_homeAutomationMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_homeAutomationMouseExited
       
        bt_homeAutomation.setBorder(borderC);
        
    }//GEN-LAST:event_bt_homeAutomationMouseExited

    private void bt_homeAutomationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_homeAutomationActionPerformed
    
        new Jf_autoMation().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_bt_homeAutomationActionPerformed

    private void bt_onlineExamMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_onlineExamMouseEntered
       
        bt_onlineExam.setBorder(borderE);
        
    }//GEN-LAST:event_bt_onlineExamMouseEntered

    private void bt_onlineExamMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_onlineExamMouseExited
       
        bt_onlineExam.setBorder(borderC);
        
    }//GEN-LAST:event_bt_onlineExamMouseExited

    private void bt_onlineExamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_onlineExamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_onlineExamActionPerformed

    private void bt_examMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_examMouseEntered
      
        bt_exam.setBorder(borderE);
        
    }//GEN-LAST:event_bt_examMouseEntered

    private void bt_examMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_examMouseExited
       
        bt_exam.setBorder(borderC);
        
    }//GEN-LAST:event_bt_examMouseExited

    private void bt_examActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_examActionPerformed
        new Jf_Exams().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bt_examActionPerformed

    private void bt_practicalsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_practicalsMouseEntered
        
        bt_practicals.setBorder(borderE);
        
    }//GEN-LAST:event_bt_practicalsMouseEntered

    private void bt_practicalsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_practicalsMouseExited
        
        bt_practicals.setBorder(borderC);
        
    }//GEN-LAST:event_bt_practicalsMouseExited

    private void bt_practicalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_practicalsActionPerformed
        new Jf_practicals().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bt_practicalsActionPerformed

    private void bt_librayMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_librayMouseEntered

        bt_libray.setBorder(borderE);
        
    }//GEN-LAST:event_bt_librayMouseEntered

    private void bt_librayMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_librayMouseExited
       
        bt_libray.setBorder(borderC);
        
    }//GEN-LAST:event_bt_librayMouseExited

    private void bt_librayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_librayActionPerformed

       new jf_library_main_view().setVisible(true);
       this.dispose();
        
    }//GEN-LAST:event_bt_librayActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Jf_UserFront.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jf_UserFront.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jf_UserFront.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jf_UserFront.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jf_UserFront().setVisible(true);
            }
        });
    }
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_exam;
    private javax.swing.JButton bt_homeAutomation;
    private javax.swing.JButton bt_inventory;
    private javax.swing.JButton bt_libray;
    private javax.swing.JButton bt_logout;
    private javax.swing.JButton bt_onlineExam;
    private javax.swing.JButton bt_practicals;
    private javax.swing.JButton bt_registration;
    private javax.swing.JButton bt_viewReport;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lb_branch1;
    private javax.swing.JLabel lb_branch2;
    private javax.swing.JLabel lb_date_view;
    private javax.swing.JLabel lb_dhas;
    private javax.swing.JLabel lb_h2;
    private javax.swing.JLabel lb_main_pic;
    private javax.swing.JLabel lb_time_date;
    public static javax.swing.JLabel lb_welcome_note;
    // End of variables declaration//GEN-END:variables
}
