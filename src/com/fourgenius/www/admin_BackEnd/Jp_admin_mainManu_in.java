/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fourgenius.www.admin_BackEnd;

import static com.fourgenius.www.admin_BackEnd.Jf_admin_backend.admin_mainPanel;
import static com.fourgenius.www.admin_BackEnd.Jf_admin_backend.bt_admin_bE_administrator;
import static com.fourgenius.www.admin_BackEnd.Jf_admin_backend.bt_admin_bE_employees;
import static com.fourgenius.www.admin_BackEnd.Jf_admin_backend.bt_admin_bE_exams;
import static com.fourgenius.www.admin_BackEnd.Jf_admin_backend.bt_admin_bE_home;
import static com.fourgenius.www.admin_BackEnd.Jf_admin_backend.bt_admin_bE_payments;
import static com.fourgenius.www.admin_BackEnd.Jf_admin_backend.bt_admin_bE_practicals;
import static com.fourgenius.www.admin_BackEnd.Jf_admin_backend.bt_admin_bE_students;
import static com.fourgenius.www.admin_BackEnd.Jf_admin_backend.bt_admin_bE_users;
import static com.fourgenius.www.admin_BackEnd.Jf_admin_backend.md_setvisible_true;


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
public class Jp_admin_mainManu_in extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    public Jp_admin_mainManu_in() {
        initComponents();
        showTime();
        //user alert
        String user_mail = lb_welcome_note.getText().trim();
        //SendMailSSL sslsendSL=new SendMailSSL();
        //sslsendSL.sendingSSL(user_mail, "acedamymanager69@gmail.com", "manager@admin", "Login Alert Your Account", "Login Status: System Is Access!\n\n Username:" + lb_welcome_note.getText() + "\n\n" , "Time:" + lb_time_date.getText() + "\n\n" + "Date:" + lb_date_view.getText() + "\n\n\n \t Thank you for using FourGenius System.");
        
        System.out.println("user mail:" + user_mail);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        workArea = new javax.swing.JLabel();
        lb_student_information = new javax.swing.JLabel();
        lb_lecture_information = new javax.swing.JLabel();
        lb_user_information = new javax.swing.JLabel();
        lb_employee_information = new javax.swing.JLabel();
        lb_exam_information = new javax.swing.JLabel();
        lb_payments_infromation = new javax.swing.JLabel();
        lb_administration_information = new javax.swing.JLabel();
        lb_practical_information = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lb_time_date = new javax.swing.JLabel();
        lb_welcome_note = new javax.swing.JLabel();
        lb_date_view = new javax.swing.JLabel();

        setBackground(new java.awt.Color(66, 66, 66));
        setPreferredSize(new java.awt.Dimension(1360, 668));

        lb_student_information.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_student_information.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/private_access/admin_menu/src/admin_menu_student.png"))); // NOI18N
        lb_student_information.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        lb_student_information.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_student_informationMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_student_informationMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_student_informationMouseExited(evt);
            }
        });

        lb_lecture_information.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_lecture_information.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/private_access/admin_menu/src/admin_menu_lecture.png"))); // NOI18N
        lb_lecture_information.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        lb_lecture_information.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_lecture_informationMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_lecture_informationMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_lecture_informationMouseExited(evt);
            }
        });

        lb_user_information.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_user_information.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/private_access/admin_menu/src/admin_menu_user.png"))); // NOI18N
        lb_user_information.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        lb_user_information.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_user_informationMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_user_informationMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_user_informationMouseExited(evt);
            }
        });

        lb_employee_information.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_employee_information.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/private_access/admin_menu/src/admin_menu_employee.png"))); // NOI18N
        lb_employee_information.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        lb_employee_information.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_employee_informationMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_employee_informationMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_employee_informationMouseExited(evt);
            }
        });

        lb_exam_information.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_exam_information.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/private_access/admin_menu/src/admin_menu_exam.png"))); // NOI18N
        lb_exam_information.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        lb_exam_information.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_exam_informationMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_exam_informationMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_exam_informationMouseExited(evt);
            }
        });

        lb_payments_infromation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_payments_infromation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/private_access/admin_menu/src/admin_menu_payments.png"))); // NOI18N
        lb_payments_infromation.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        lb_payments_infromation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_payments_infromationMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_payments_infromationMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_payments_infromationMouseExited(evt);
            }
        });

        lb_administration_information.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_administration_information.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/private_access/admin_menu/src/admin_menu_adminstration.png"))); // NOI18N
        lb_administration_information.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        lb_administration_information.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_administration_informationMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_administration_informationMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_administration_informationMouseExited(evt);
            }
        });

        lb_practical_information.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_practical_information.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/private_access/admin_menu/src/admin_menu_Practical.png"))); // NOI18N
        lb_practical_information.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        lb_practical_information.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_practical_informationMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_practical_informationMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_practical_informationMouseExited(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1366, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        lb_welcome_note.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_welcome_note.setForeground(new java.awt.Color(255, 255, 255));
        lb_welcome_note.setText("deepalsuranga@live.com");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_payments_infromation, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_student_information, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_lecture_information, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_administration_information, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lb_user_information, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addComponent(lb_employee_information, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lb_practical_information, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lb_exam_information, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lb_welcome_note, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lb_date_view, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lb_time_date, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(workArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_time_date, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                    .addComponent(lb_welcome_note, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_date_view, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_user_information, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_employee_information, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_practical_information, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_exam_information, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lb_lecture_information, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lb_administration_information, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lb_student_information, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95)
                        .addComponent(lb_payments_infromation, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(108, 108, 108)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(workArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    Border borderE = BorderFactory.createLineBorder(new Color(244, 67, 54), 1);
    Border borderC = BorderFactory.createLineBorder(new Color(255, 255, 255), 1);
    private void lb_student_informationMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_student_informationMouseEntered

        lb_student_information.setBorder(borderE);
        //jLabel4.setBorder(borderC);
    }//GEN-LAST:event_lb_student_informationMouseEntered


    private void lb_student_informationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_student_informationMouseClicked

        try {
            md_setvisible_true(bt_admin_bE_home);
            md_setvisible_true(bt_admin_bE_students);
            md_setvisible_true(bt_admin_bE_users);
            md_setvisible_true(bt_admin_bE_employees);
            md_setvisible_true(bt_admin_bE_exams);
            md_setvisible_true(bt_admin_bE_payments);
            md_setvisible_true(bt_admin_bE_practicals);
            md_setvisible_true(bt_admin_bE_administrator);

            //jLabel4.setBorder(borderC);
            Jp_admin_student studentPanelM = new Jp_admin_student();
            if (studentPanelM == null) {
                admin_mainPanel.removeAll();
                revalidate();
                studentPanelM = new Jp_admin_student();
                studentPanelM.setVisible(true);
                admin_mainPanel.add(studentPanelM);
                revalidate();
            } else {
                admin_mainPanel.removeAll();
                revalidate();
                studentPanelM.setVisible(true);
                admin_mainPanel.add(studentPanelM);
                revalidate();
            }
        } catch (Exception e) {
        }


    }//GEN-LAST:event_lb_student_informationMouseClicked

    private void lb_payments_infromationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_payments_infromationMouseClicked
        try {
            md_setvisible_true(bt_admin_bE_home);
            md_setvisible_true(bt_admin_bE_students);
            md_setvisible_true(bt_admin_bE_users);
            md_setvisible_true(bt_admin_bE_employees);
            md_setvisible_true(bt_admin_bE_exams);
            md_setvisible_true(bt_admin_bE_payments);
            md_setvisible_true(bt_admin_bE_practicals);
            md_setvisible_true(bt_admin_bE_administrator);

            //jLabel4.setBorder(borderC);
            Jp_admin_payment M = new Jp_admin_payment();
            if (M == null) {
                admin_mainPanel.removeAll();
                revalidate();
                M = new Jp_admin_payment();
                M.setVisible(true);
                admin_mainPanel.add(M);
                revalidate();
            } else {
                admin_mainPanel.removeAll();
                revalidate();
                M.setVisible(true);
                admin_mainPanel.add(M);
                revalidate();
            }
            lb_payments_infromation.setBorder(borderC);
        } catch (Exception e) {
        }
        //jLabel9.setBorder(borderE);


    }//GEN-LAST:event_lb_payments_infromationMouseClicked

    private void lb_payments_infromationMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_payments_infromationMouseEntered

        lb_payments_infromation.setBorder(borderE);
        //jLabel4.setBorder(borderC);

    }//GEN-LAST:event_lb_payments_infromationMouseEntered

    private void lb_administration_informationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_administration_informationMouseClicked
        try {
            md_setvisible_true(bt_admin_bE_home);
            md_setvisible_true(bt_admin_bE_students);
            md_setvisible_true(bt_admin_bE_users);
            md_setvisible_true(bt_admin_bE_employees);
            md_setvisible_true(bt_admin_bE_exams);
            md_setvisible_true(bt_admin_bE_payments);
            md_setvisible_true(bt_admin_bE_practicals);
            md_setvisible_true(bt_admin_bE_administrator);

            //jLabel4.setBorder(borderC);
            Jp_admin_admins M = new Jp_admin_admins();
            if (M == null) {
                admin_mainPanel.removeAll();
                revalidate();
                M = new Jp_admin_admins();
                M.setVisible(true);
                admin_mainPanel.add(M);
                revalidate();
            } else {
                admin_mainPanel.removeAll();
                revalidate();
                M.setVisible(true);
                admin_mainPanel.add(M);
                revalidate();
            }
            lb_administration_information.setBorder(borderC);
        } catch (Exception e) {
        }
        //jLabel4.setBorder(borderE);


    }//GEN-LAST:event_lb_administration_informationMouseClicked

    private void lb_administration_informationMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_administration_informationMouseEntered

        lb_administration_information.setBorder(borderE);
        //jLabel4.setBorder(borderC);

    }//GEN-LAST:event_lb_administration_informationMouseEntered

    private void lb_practical_informationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_practical_informationMouseClicked

        pro.setVisible(true);

        try {
//            md_setvisible_true(bt_admin_bE_home);
//            md_setvisible_true(bt_admin_bE_students);
//            md_setvisible_true(bt_admin_bE_users);
//            md_setvisible_true(bt_admin_bE_employees);
            //md_setvisible_true(bt_admin_bE_exams);
//            md_setvisible_true(bt_admin_bE_payments);
            //md_setvisible_true(bt_admin_bE_practicals);
//            md_setvisible_true(bt_admin_bE_administrator);

            //jLabel4.setBorder(borderC);
//            Jp_admin_practical M = new Jp_admin_practical();
//            if (M == null) {
//                admin_mainPanel.removeAll();
//                revalidate();
//                M = new Jp_admin_practical();
//                M.setVisible(true);
//                admin_mainPanel.add(M);
//                revalidate();
//            } else {
//                admin_mainPanel.removeAll();
//                revalidate();
//                M.setVisible(true);
//                admin_mainPanel.add(M);
//                revalidate();
//            }
            //jLabel4.setBorder(borderE);
            lb_practical_information.setBorder(borderC);
        } catch (Exception e) {
        }

    }//GEN-LAST:event_lb_practical_informationMouseClicked

    private void lb_practical_informationMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_practical_informationMouseEntered

        lb_practical_information.setBorder(borderE);
        //jLabel4.setBorder(borderC);

    }//GEN-LAST:event_lb_practical_informationMouseEntered

    private void lb_lecture_informationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_lecture_informationMouseClicked

        //pro.setVisible(true);

        try {
            md_setvisible_true(bt_admin_bE_home);
            md_setvisible_true(bt_admin_bE_students);
            md_setvisible_true(bt_admin_bE_users);
            md_setvisible_true(bt_admin_bE_employees);
            //md_setvisible_true(bt_admin_bE_exams);
            md_setvisible_true(bt_admin_bE_payments);
            //md_setvisible_true(bt_admin_bE_practicals);
            md_setvisible_true(bt_admin_bE_administrator);

            //jLabel4.setBorder(borderC);
//            Jp_admin_employee_ac M = new Jp_admin_employee_ac();
//            if (M == null) {
//                admin_mainPanel.removeAll();
//                revalidate();
//                M = new Jp_admin_employee_ac();
//                M.setVisible(true);
//                admin_mainPanel.add(M);
//                revalidate();
//            } else {
//                admin_mainPanel.removeAll();
//                revalidate();
//                M.setVisible(true);
//                admin_mainPanel.add(M);
//                revalidate();
//            }
            //jLabel5.setBorder(borderE);
            lb_lecture_information.setBorder(borderC);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_lb_lecture_informationMouseClicked

    private void lb_lecture_informationMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_lecture_informationMouseEntered

        try {
            lb_lecture_information.setBorder(borderE);
            //jLabel5.setBorder(borderC);
        } catch (Exception e) {
        }

    }//GEN-LAST:event_lb_lecture_informationMouseEntered


    private void lb_user_informationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_user_informationMouseClicked

        try {
            //jLabel6.setBorder(borderE);

            Jp_admin_user M = new Jp_admin_user();

            md_setvisible_true(bt_admin_bE_home);
            md_setvisible_true(bt_admin_bE_students);
            md_setvisible_true(bt_admin_bE_users);
            md_setvisible_true(bt_admin_bE_employees);
            //md_setvisible_true(bt_admin_bE_exams);
            md_setvisible_true(bt_admin_bE_payments);
            //md_setvisible_true(bt_admin_bE_practicals);
            md_setvisible_true(bt_admin_bE_administrator);

            //jLabel4.setBorder(borderC);
            if (M == null) {
                admin_mainPanel.removeAll();
                revalidate();
                M = new Jp_admin_user();
                M.setVisible(true);
                admin_mainPanel.add(M);
                revalidate();
            } else {
                admin_mainPanel.removeAll();
                revalidate();
                M.setVisible(true);
                admin_mainPanel.add(M);
                revalidate();
            }
            lb_user_information.setBorder(borderC);
        } catch (Exception e) {
        }

    }//GEN-LAST:event_lb_user_informationMouseClicked

    private void lb_user_informationMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_user_informationMouseEntered

        try {
            lb_user_information.setBorder(borderE);
            //jLabel6.setBorder(borderC);

        } catch (Exception e) {
        }
    }//GEN-LAST:event_lb_user_informationMouseEntered
    jf_pro_version pro = new jf_pro_version();
    private void lb_employee_informationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_employee_informationMouseClicked

        pro.setVisible(true);

        try {
            md_setvisible_true(bt_admin_bE_home);
            md_setvisible_true(bt_admin_bE_students);
            md_setvisible_true(bt_admin_bE_users);
            md_setvisible_true(bt_admin_bE_employees);
            md_setvisible_true(bt_admin_bE_exams);
            md_setvisible_true(bt_admin_bE_payments);
            md_setvisible_true(bt_admin_bE_practicals);
            md_setvisible_true(bt_admin_bE_administrator);

            //jLabel4.setBorder(borderC);
            Jp_admin_employee_non_ac M = new Jp_admin_employee_non_ac();
            if (M == null) {
                admin_mainPanel.removeAll();
                revalidate();
                M = new Jp_admin_employee_non_ac();
                M.setVisible(true);
                admin_mainPanel.add(M);
                revalidate();
            } else {
                admin_mainPanel.removeAll();
                revalidate();
                M.setVisible(true);
                admin_mainPanel.add(M);
                revalidate();
            }
            //jLabel7.setBorder(borderE);
            lb_employee_information.setBorder(borderC);

        } catch (Exception e) {
        }
    }//GEN-LAST:event_lb_employee_informationMouseClicked

    private void lb_exam_informationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_exam_informationMouseClicked
        jf_pro_version pro = new jf_pro_version();
        pro.setVisible(true);
        try {
//            md_setvisible_true(bt_admin_bE_home);
//            md_setvisible_true(bt_admin_bE_students);
//            md_setvisible_true(bt_admin_bE_users);
//            md_setvisible_true(bt_admin_bE_employees);
//            md_setvisible_true(bt_admin_bE_exams);
//            md_setvisible_true(bt_admin_bE_payments);
//            md_setvisible_true(bt_admin_bE_practicals);
//            md_setvisible_true(bt_admin_bE_administrator);

            //jLabel4.setBorder(borderC);
//            Jp_admin_exam M = new Jp_admin_exam();
//            if (M == null) {
//                admin_mainPanel.removeAll();
//                revalidate();
//                M = new Jp_admin_exam();
//                M.setVisible(true);
//                admin_mainPanel.add(M);
//                revalidate();
//            } else {
//                admin_mainPanel.removeAll();
//                revalidate();
//                M.setVisible(true);
//                admin_mainPanel.add(M);
//                revalidate();
//            }
            //jLabel4.setBorder(borderE);
            lb_exam_information.setBorder(borderC);

        } catch (Exception e) {
        }
    }//GEN-LAST:event_lb_exam_informationMouseClicked

    private void lb_exam_informationMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_exam_informationMouseEntered

        try {
            lb_exam_information.setBorder(borderE);
            //jLabel4.setBorder(borderC);

        } catch (Exception e) {
        }
    }//GEN-LAST:event_lb_exam_informationMouseEntered

    private void lb_student_informationMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_student_informationMouseExited

        try {
            lb_student_information.setBorder(borderC);

        } catch (Exception e) {
        }
    }//GEN-LAST:event_lb_student_informationMouseExited

    private void lb_user_informationMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_user_informationMouseExited

        try {
            lb_user_information.setBorder(borderC);

        } catch (Exception e) {
        }
    }//GEN-LAST:event_lb_user_informationMouseExited

    private void lb_lecture_informationMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_lecture_informationMouseExited

        try {
            lb_lecture_information.setBorder(borderC);

        } catch (Exception e) {
        }

    }//GEN-LAST:event_lb_lecture_informationMouseExited

    private void lb_employee_informationMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_employee_informationMouseExited

        try {
            lb_employee_information.setBorder(borderC);

        } catch (Exception e) {
        }
    }//GEN-LAST:event_lb_employee_informationMouseExited

    private void lb_payments_infromationMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_payments_infromationMouseExited

        try {
            lb_payments_infromation.setBorder(borderC);

        } catch (Exception e) {
        }
    }//GEN-LAST:event_lb_payments_infromationMouseExited

    private void lb_administration_informationMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_administration_informationMouseExited

        try {
            lb_administration_information.setBorder(borderC);

        } catch (Exception e) {
        }
    }//GEN-LAST:event_lb_administration_informationMouseExited

    private void lb_practical_informationMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_practical_informationMouseExited

        try {
            lb_practical_information.setBorder(borderC);

        } catch (Exception e) {
        }
    }//GEN-LAST:event_lb_practical_informationMouseExited

    private void lb_exam_informationMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_exam_informationMouseExited

        try {
            lb_exam_information.setBorder(borderC);

        } catch (Exception e) {
        }
    }//GEN-LAST:event_lb_exam_informationMouseExited

    private void lb_employee_informationMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_employee_informationMouseEntered

        try {
            lb_employee_information.setBorder(borderE);

        } catch (Exception e) {
        }
    }//GEN-LAST:event_lb_employee_informationMouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb_administration_information;
    private javax.swing.JLabel lb_date_view;
    private javax.swing.JLabel lb_employee_information;
    private javax.swing.JLabel lb_exam_information;
    private javax.swing.JLabel lb_lecture_information;
    private javax.swing.JLabel lb_payments_infromation;
    private javax.swing.JLabel lb_practical_information;
    private javax.swing.JLabel lb_student_information;
    private javax.swing.JLabel lb_time_date;
    private javax.swing.JLabel lb_user_information;
    public static javax.swing.JLabel lb_welcome_note;
    private javax.swing.JLabel workArea;
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

}
