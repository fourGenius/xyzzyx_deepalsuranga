/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fourgenius.www.user_FrontEnd;

import com.fourgenius.www.public_access.library.jp_payments;
import com.fourgenius.www.public_access.registration.employee.Jp_registration_employee;
import com.fourgenius.www.public_access.registration.lecture.Jp_registration_lecture;
import com.fourgenius.www.public_access.registration.student.Jp_registration_student;
import com.fourgenius.www.public_access.registration.student.Jp_student_payment1;
import com.fourgenius.www.public_access.registration.user.Jp_registration_user;

import com.fourgenius.www.public_access.user.login.Jf_user_login;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.border.Border;

/**
 *
 * @author thilina_deepal
 */
public class Jf_UserMain extends javax.swing.JFrame {

    Border border = BorderFactory.createLineBorder(Color.white, 1);

    /**
     * Creates new form main_frame
     */
    public Jf_UserMain() {
        initComponents();
        showTime();
        try {
            initComponents();
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception ex) {

        }
        loadFrame();

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
        jPanel3 = new javax.swing.JPanel();
        _bt_UserMain_StudentRegistration = new javax.swing.JButton();
        _bt_UserMain_LectureRegistration = new javax.swing.JButton();
        _bt_UserMain_EmployeeRegistration = new javax.swing.JButton();
        _bt_UserMain_payments = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lb_time_date = new javax.swing.JLabel();
        Jp_userMain_main_panel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(66, 66, 66));
        jPanel1.setMinimumSize(new java.awt.Dimension(1366, 768));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(18, 75, 163));
        jPanel3.setMinimumSize(new java.awt.Dimension(1368, 50));
        jPanel3.setPreferredSize(new java.awt.Dimension(1368, 50));

        _bt_UserMain_StudentRegistration.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _bt_UserMain_StudentRegistration.setForeground(new java.awt.Color(255, 255, 255));
        _bt_UserMain_StudentRegistration.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/public_access/user/login/images_butons/button_LightBlue_200x50.png"))); // NOI18N
        _bt_UserMain_StudentRegistration.setText("Student Registration");
        _bt_UserMain_StudentRegistration.setAutoscrolls(true);
        _bt_UserMain_StudentRegistration.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        _bt_UserMain_StudentRegistration.setFocusPainted(false);
        _bt_UserMain_StudentRegistration.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _bt_UserMain_StudentRegistration.setMaximumSize(new java.awt.Dimension(200, 50));
        _bt_UserMain_StudentRegistration.setMinimumSize(new java.awt.Dimension(200, 50));
        _bt_UserMain_StudentRegistration.setPreferredSize(new java.awt.Dimension(200, 50));
        _bt_UserMain_StudentRegistration.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                _bt_UserMain_StudentRegistrationMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                _bt_UserMain_StudentRegistrationMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                _bt_UserMain_StudentRegistrationMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                _bt_UserMain_StudentRegistrationMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                _bt_UserMain_StudentRegistrationMouseReleased(evt);
            }
        });
        _bt_UserMain_StudentRegistration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _bt_UserMain_StudentRegistrationActionPerformed(evt);
            }
        });

        _bt_UserMain_LectureRegistration.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _bt_UserMain_LectureRegistration.setForeground(new java.awt.Color(255, 255, 255));
        _bt_UserMain_LectureRegistration.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/public_access/user/login/images_butons/button_LightBlue_200x50.png"))); // NOI18N
        _bt_UserMain_LectureRegistration.setText("Lecture Registration");
        _bt_UserMain_LectureRegistration.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        _bt_UserMain_LectureRegistration.setFocusPainted(false);
        _bt_UserMain_LectureRegistration.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _bt_UserMain_LectureRegistration.setMaximumSize(new java.awt.Dimension(200, 50));
        _bt_UserMain_LectureRegistration.setMinimumSize(new java.awt.Dimension(200, 50));
        _bt_UserMain_LectureRegistration.setPreferredSize(new java.awt.Dimension(200, 50));
        _bt_UserMain_LectureRegistration.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                _bt_UserMain_LectureRegistrationMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                _bt_UserMain_LectureRegistrationMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                _bt_UserMain_LectureRegistrationMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                _bt_UserMain_LectureRegistrationMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                _bt_UserMain_LectureRegistrationMouseReleased(evt);
            }
        });
        _bt_UserMain_LectureRegistration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _bt_UserMain_LectureRegistrationActionPerformed(evt);
            }
        });

        _bt_UserMain_EmployeeRegistration.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _bt_UserMain_EmployeeRegistration.setForeground(new java.awt.Color(255, 255, 255));
        _bt_UserMain_EmployeeRegistration.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/public_access/user/login/images_butons/button_LightBlue_200x50.png"))); // NOI18N
        _bt_UserMain_EmployeeRegistration.setText("Employee Registration");
        _bt_UserMain_EmployeeRegistration.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        _bt_UserMain_EmployeeRegistration.setFocusPainted(false);
        _bt_UserMain_EmployeeRegistration.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _bt_UserMain_EmployeeRegistration.setMaximumSize(new java.awt.Dimension(200, 50));
        _bt_UserMain_EmployeeRegistration.setMinimumSize(new java.awt.Dimension(200, 50));
        _bt_UserMain_EmployeeRegistration.setPreferredSize(new java.awt.Dimension(200, 50));
        _bt_UserMain_EmployeeRegistration.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                _bt_UserMain_EmployeeRegistrationMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                _bt_UserMain_EmployeeRegistrationMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                _bt_UserMain_EmployeeRegistrationMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                _bt_UserMain_EmployeeRegistrationMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                _bt_UserMain_EmployeeRegistrationMouseReleased(evt);
            }
        });
        _bt_UserMain_EmployeeRegistration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _bt_UserMain_EmployeeRegistrationActionPerformed(evt);
            }
        });

        _bt_UserMain_payments.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _bt_UserMain_payments.setForeground(new java.awt.Color(255, 255, 255));
        _bt_UserMain_payments.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/public_access/user/login/images_butons/button_LightBlue_200x50.png"))); // NOI18N
        _bt_UserMain_payments.setText("Payments");
        _bt_UserMain_payments.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        _bt_UserMain_payments.setFocusPainted(false);
        _bt_UserMain_payments.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _bt_UserMain_payments.setMaximumSize(new java.awt.Dimension(200, 50));
        _bt_UserMain_payments.setMinimumSize(new java.awt.Dimension(200, 50));
        _bt_UserMain_payments.setPreferredSize(new java.awt.Dimension(200, 50));
        _bt_UserMain_payments.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                _bt_UserMain_paymentsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                _bt_UserMain_paymentsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                _bt_UserMain_paymentsMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                _bt_UserMain_paymentsMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                _bt_UserMain_paymentsMouseReleased(evt);
            }
        });
        _bt_UserMain_payments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _bt_UserMain_paymentsActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/power off.png"))); // NOI18N
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setFocusPainted(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        lb_time_date.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_time_date.setForeground(new java.awt.Color(255, 255, 255));
        lb_time_date.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_time_date.setText("jLabel2");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(_bt_UserMain_StudentRegistration, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_bt_UserMain_LectureRegistration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_bt_UserMain_EmployeeRegistration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_bt_UserMain_payments, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 304, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_time_date, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(_bt_UserMain_LectureRegistration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(_bt_UserMain_StudentRegistration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(_bt_UserMain_EmployeeRegistration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(_bt_UserMain_payments, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lb_time_date))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, -1));

        Jp_userMain_main_panel.setBackground(new java.awt.Color(66, 66, 66));
        Jp_userMain_main_panel.setDoubleBuffered(false);
        Jp_userMain_main_panel.setMaximumSize(new java.awt.Dimension(1368, 718));
        Jp_userMain_main_panel.setMinimumSize(new java.awt.Dimension(1368, 718));
        Jp_userMain_main_panel.setPreferredSize(new java.awt.Dimension(1366, 718));
        Jp_userMain_main_panel.setLayout(new java.awt.CardLayout());
        jPanel1.add(Jp_userMain_main_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1366, 718));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1366, 768));

        setSize(new java.awt.Dimension(1366, 768));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void _bt_UserMain_StudentRegistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__bt_UserMain_StudentRegistrationActionPerformed
        Jp_registration_student add_student = new Jp_registration_student();

        _bt_UserMain_StudentRegistration.setEnabled(false);
        _bt_UserMain_EmployeeRegistration.setEnabled(true);
        _bt_UserMain_LectureRegistration.setEnabled(true);
        _bt_UserMain_payments.setEnabled(true);

        if (add_student == null) {
            add_student = new Jp_registration_student();
            Jp_userMain_main_panel.removeAll();
            Jp_userMain_main_panel.repaint();
            Jp_userMain_main_panel.revalidate();
            Jp_userMain_main_panel.add(add_student);
            Jp_userMain_main_panel.repaint();
            Jp_userMain_main_panel.revalidate();
        } else {
            Jp_userMain_main_panel.removeAll();
            Jp_userMain_main_panel.repaint();
            Jp_userMain_main_panel.revalidate();
            Jp_userMain_main_panel.add(add_student);
            Jp_userMain_main_panel.repaint();
            Jp_userMain_main_panel.revalidate();
        }


    }//GEN-LAST:event__bt_UserMain_StudentRegistrationActionPerformed

    
    private void _bt_UserMain_LectureRegistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__bt_UserMain_LectureRegistrationActionPerformed
        Jp_registration_lecture add_lecture = new Jp_registration_lecture();
        
        _bt_UserMain_StudentRegistration.setEnabled(true);
        _bt_UserMain_EmployeeRegistration.setEnabled(true);
        _bt_UserMain_LectureRegistration.setEnabled(false);
        _bt_UserMain_payments.setEnabled(true);

        if (add_lecture == null) {
            add_lecture = new Jp_registration_lecture();
            Jp_userMain_main_panel.removeAll();
            Jp_userMain_main_panel.repaint();
            Jp_userMain_main_panel.revalidate();
            Jp_userMain_main_panel.add(add_lecture);
            Jp_userMain_main_panel.repaint();
            Jp_userMain_main_panel.revalidate();
        } else {
            Jp_userMain_main_panel.removeAll();
            Jp_userMain_main_panel.repaint();
            Jp_userMain_main_panel.revalidate();
            Jp_userMain_main_panel.add(add_lecture);
            Jp_userMain_main_panel.repaint();
            Jp_userMain_main_panel.revalidate();
        }

        if (add_lecture.isVisible()) {

        }

    }//GEN-LAST:event__bt_UserMain_LectureRegistrationActionPerformed

    
    private void _bt_UserMain_EmployeeRegistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__bt_UserMain_EmployeeRegistrationActionPerformed
        Jp_registration_employee add_employee = new Jp_registration_employee();
        
        _bt_UserMain_StudentRegistration.setEnabled(true);
        _bt_UserMain_EmployeeRegistration.setEnabled(false);
        _bt_UserMain_LectureRegistration.setEnabled(true);
        _bt_UserMain_payments.setEnabled(true);

        if (add_employee == null) {
            add_employee = new Jp_registration_employee();
            Jp_userMain_main_panel.removeAll();
            Jp_userMain_main_panel.repaint();
            Jp_userMain_main_panel.revalidate();
            Jp_userMain_main_panel.add(add_employee);
            Jp_userMain_main_panel.repaint();
            Jp_userMain_main_panel.revalidate();
        } else {
            Jp_userMain_main_panel.removeAll();
            Jp_userMain_main_panel.repaint();
            Jp_userMain_main_panel.revalidate();
            Jp_userMain_main_panel.add(add_employee);
            Jp_userMain_main_panel.repaint();
            Jp_userMain_main_panel.revalidate();
        }

    }//GEN-LAST:event__bt_UserMain_EmployeeRegistrationActionPerformed

    
    private void _bt_UserMain_paymentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__bt_UserMain_paymentsActionPerformed
        Jp_student_payment1 student_payment=new Jp_student_payment1();
        
        _bt_UserMain_StudentRegistration.setEnabled(true);
        _bt_UserMain_EmployeeRegistration.setEnabled(true);
        _bt_UserMain_LectureRegistration.setEnabled(true);
        _bt_UserMain_payments.setEnabled(false);

        if (student_payment == null) {
            student_payment = new Jp_student_payment1();
            Jp_userMain_main_panel.removeAll();
            Jp_userMain_main_panel.repaint();
            Jp_userMain_main_panel.revalidate();
            Jp_userMain_main_panel.add(student_payment);
            Jp_userMain_main_panel.repaint();
            Jp_userMain_main_panel.revalidate();
        } else {
            Jp_userMain_main_panel.removeAll();
            Jp_userMain_main_panel.repaint();
            Jp_userMain_main_panel.revalidate();
            Jp_userMain_main_panel.add(student_payment);
            Jp_userMain_main_panel.repaint();
            Jp_userMain_main_panel.revalidate();
        }

    }//GEN-LAST:event__bt_UserMain_paymentsActionPerformed

    Jf_user_login jf_user_login = new Jf_user_login();
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        if (jf_user_login == null) {
            jf_user_login = new Jf_user_login();
            jf_user_login.setVisible(true);
            this.dispose();
        } else {
            jf_user_login.setVisible(true);
            this.dispose();
        }

    }//GEN-LAST:event_jButton5ActionPerformed

    private void _bt_UserMain_StudentRegistrationMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_UserMain_StudentRegistrationMouseEntered
        _bt_UserMain_StudentRegistration.setBorder(border);
    }//GEN-LAST:event__bt_UserMain_StudentRegistrationMouseEntered

    private void _bt_UserMain_StudentRegistrationMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_UserMain_StudentRegistrationMouseExited
        _bt_UserMain_StudentRegistration.setBorder(null);
    }//GEN-LAST:event__bt_UserMain_StudentRegistrationMouseExited

    private void _bt_UserMain_StudentRegistrationMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_UserMain_StudentRegistrationMousePressed
        _bt_UserMain_StudentRegistration.setBorder(null);
    }//GEN-LAST:event__bt_UserMain_StudentRegistrationMousePressed

    private void _bt_UserMain_StudentRegistrationMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_UserMain_StudentRegistrationMouseReleased
        _bt_UserMain_StudentRegistration.setBorder(border);
    }//GEN-LAST:event__bt_UserMain_StudentRegistrationMouseReleased

    private void _bt_UserMain_LectureRegistrationMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_UserMain_LectureRegistrationMouseEntered
        _bt_UserMain_LectureRegistration.setBorder(border);
    }//GEN-LAST:event__bt_UserMain_LectureRegistrationMouseEntered

    private void _bt_UserMain_LectureRegistrationMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_UserMain_LectureRegistrationMouseExited
        _bt_UserMain_LectureRegistration.setBorder(null);
    }//GEN-LAST:event__bt_UserMain_LectureRegistrationMouseExited

    private void _bt_UserMain_LectureRegistrationMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_UserMain_LectureRegistrationMousePressed
        _bt_UserMain_LectureRegistration.setBorder(null);
    }//GEN-LAST:event__bt_UserMain_LectureRegistrationMousePressed

    private void _bt_UserMain_LectureRegistrationMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_UserMain_LectureRegistrationMouseReleased
        _bt_UserMain_LectureRegistration.setBorder(border);
    }//GEN-LAST:event__bt_UserMain_LectureRegistrationMouseReleased

    private void _bt_UserMain_EmployeeRegistrationMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_UserMain_EmployeeRegistrationMouseEntered
        _bt_UserMain_EmployeeRegistration.setBorder(border);
    }//GEN-LAST:event__bt_UserMain_EmployeeRegistrationMouseEntered

    private void _bt_UserMain_EmployeeRegistrationMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_UserMain_EmployeeRegistrationMouseExited
        _bt_UserMain_EmployeeRegistration.setBorder(null);
    }//GEN-LAST:event__bt_UserMain_EmployeeRegistrationMouseExited

    private void _bt_UserMain_EmployeeRegistrationMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_UserMain_EmployeeRegistrationMousePressed
        _bt_UserMain_EmployeeRegistration.setBorder(null);
    }//GEN-LAST:event__bt_UserMain_EmployeeRegistrationMousePressed

    private void _bt_UserMain_EmployeeRegistrationMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_UserMain_EmployeeRegistrationMouseReleased
        _bt_UserMain_EmployeeRegistration.setBorder(border);
    }//GEN-LAST:event__bt_UserMain_EmployeeRegistrationMouseReleased

    private void _bt_UserMain_paymentsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_UserMain_paymentsMouseEntered
        _bt_UserMain_payments.setBorder(border);
    }//GEN-LAST:event__bt_UserMain_paymentsMouseEntered

    private void _bt_UserMain_paymentsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_UserMain_paymentsMouseExited
        _bt_UserMain_payments.setBorder(null);
    }//GEN-LAST:event__bt_UserMain_paymentsMouseExited

    private void _bt_UserMain_paymentsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_UserMain_paymentsMousePressed
        _bt_UserMain_payments.setBorder(null);
    }//GEN-LAST:event__bt_UserMain_paymentsMousePressed

    private void _bt_UserMain_paymentsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_UserMain_paymentsMouseReleased
        _bt_UserMain_payments.setBorder(border);
    }//GEN-LAST:event__bt_UserMain_paymentsMouseReleased

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        payment();

//        Jp_student_payment._tf_student_payment_paymentDatails_studentName.setText(Jp_registration_student._lb_registration_student_preview_name.getText());
//        Jp_student_payment._tf_student_payment_paymentDatails_course.setText(Jp_registration_student._lb_registration_student_preview_course.getText());
//        Jp_student_payment._tf_student_payment_paymentDatails_courseFee.setText("70000");
    }//GEN-LAST:event_jLabel1MouseClicked

    private void _bt_UserMain_StudentRegistrationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_UserMain_StudentRegistrationMouseClicked

    }//GEN-LAST:event__bt_UserMain_StudentRegistrationMouseClicked

    private void _bt_UserMain_LectureRegistrationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_UserMain_LectureRegistrationMouseClicked

    }//GEN-LAST:event__bt_UserMain_LectureRegistrationMouseClicked

    private void _bt_UserMain_EmployeeRegistrationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_UserMain_EmployeeRegistrationMouseClicked

    }//GEN-LAST:event__bt_UserMain_EmployeeRegistrationMouseClicked

    private void _bt_UserMain_paymentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_UserMain_paymentsMouseClicked

    }//GEN-LAST:event__bt_UserMain_paymentsMouseClicked

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
            java.util.logging.Logger.getLogger(Jf_UserMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jf_UserMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jf_UserMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jf_UserMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jf_UserMain().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Jp_userMain_main_panel;
    private javax.swing.JButton _bt_UserMain_EmployeeRegistration;
    public javax.swing.JButton _bt_UserMain_LectureRegistration;
    private javax.swing.JButton _bt_UserMain_StudentRegistration;
    private javax.swing.JButton _bt_UserMain_payments;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lb_time_date;
    // End of variables declaration//GEN-END:variables

    public void payment() {

        Jp_student_payment1 student_payment=new Jp_student_payment1();
        if (student_payment == null) {
            student_payment = new Jp_student_payment1();
            Jp_userMain_main_panel.removeAll();
            Jp_userMain_main_panel.repaint();
            Jp_userMain_main_panel.revalidate();
            Jp_userMain_main_panel.add(student_payment);
            Jp_userMain_main_panel.repaint();
            Jp_userMain_main_panel.revalidate();
        } else {
            Jp_userMain_main_panel.removeAll();
            Jp_userMain_main_panel.repaint();
            Jp_userMain_main_panel.revalidate();
            Jp_userMain_main_panel.add(student_payment);
            Jp_userMain_main_panel.repaint();
            Jp_userMain_main_panel.revalidate();
        }

    }

    private void loadFrame() {
        _bt_UserMain_StudentRegistration.setEnabled(false);
        Jp_registration_student add_student = new Jp_registration_student();

        if (add_student == null) {
            add_student = new Jp_registration_student();
            Jp_userMain_main_panel.removeAll();
            Jp_userMain_main_panel.repaint();
            Jp_userMain_main_panel.revalidate();
            Jp_userMain_main_panel.add(add_student);
            Jp_userMain_main_panel.repaint();
            Jp_userMain_main_panel.revalidate();
        } else {
            Jp_userMain_main_panel.removeAll();
            Jp_userMain_main_panel.repaint();
            Jp_userMain_main_panel.revalidate();
            Jp_userMain_main_panel.add(add_student);
            Jp_userMain_main_panel.repaint();
            Jp_userMain_main_panel.revalidate();
        }
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
}
