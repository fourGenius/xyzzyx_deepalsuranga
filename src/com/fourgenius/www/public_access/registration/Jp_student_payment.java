/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fourgenius.www.public_access.registration;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

/**
 *
 * @author Pamitha Gayashan
 */
public class Jp_student_payment extends javax.swing.JPanel {

    Border border=BorderFactory.createLineBorder(Color.white, 1);
    /**
     * Creates new form Jp_student_payment
     */
    public Jp_student_payment() {
        initComponents();
        _tf_student_payment_paymentDatails_date.setText("2016-01-05");
        _tf_student_payment_paymentDatails_invoiceID.setText("INVO001");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        _pl_registration_lecture_personalInformation_contactDetails = new javax.swing.JPanel();
        _lb_registration_lecture_personalInformation_contactDetails_mobileNumber = new javax.swing.JLabel();
        _tf_student_payment_paymentDatails_invoiceID = new javax.swing.JTextField();
        _lb_registration_lecture_personalInformation_contactDetails_landNumber = new javax.swing.JLabel();
        _tf_student_payment_paymentDatails_studentName = new javax.swing.JTextField();
        _lb_registration_lecture_personalInformation_contactDetails_eMail = new javax.swing.JLabel();
        _tf_student_payment_paymentDatails_course = new javax.swing.JTextField();
        _lb_registration_lecture_personalInformation_address_1stLine = new javax.swing.JLabel();
        _tf_student_payment_paymentDatails_courseFee = new javax.swing.JTextField();
        _lb_registration_lecture_personalInformation_address_2ndLine = new javax.swing.JLabel();
        _tf_student_payment_paymentDatails_payement = new javax.swing.JTextField();
        _lb_registration_lecture_personalInformation_address_city = new javax.swing.JLabel();
        _tf_registration_lecture_personalInformations_contactDetails_duePayment = new javax.swing.JTextField();
        _lb_registration_lecture_personalInformation_contactDetails_mobileNumber1 = new javax.swing.JLabel();
        _tf_student_payment_paymentDatails_date = new javax.swing.JTextField();
        _bt_student_payment_submit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        _bt_student_payment_updatePayment = new javax.swing.JButton();

        setBackground(new java.awt.Color(66, 66, 66));

        _pl_registration_lecture_personalInformation_contactDetails.setBackground(new java.awt.Color(2, 119, 189));
        _pl_registration_lecture_personalInformation_contactDetails.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Payment Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        _lb_registration_lecture_personalInformation_contactDetails_mobileNumber.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _lb_registration_lecture_personalInformation_contactDetails_mobileNumber.setForeground(new java.awt.Color(255, 255, 255));
        _lb_registration_lecture_personalInformation_contactDetails_mobileNumber.setText("Invoice ID");

        _tf_student_payment_paymentDatails_invoiceID.setEditable(false);
        _tf_student_payment_paymentDatails_invoiceID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _tf_student_payment_paymentDatails_invoiceID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _tf_student_payment_paymentDatails_invoiceIDActionPerformed(evt);
            }
        });

        _lb_registration_lecture_personalInformation_contactDetails_landNumber.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _lb_registration_lecture_personalInformation_contactDetails_landNumber.setForeground(new java.awt.Color(255, 255, 255));
        _lb_registration_lecture_personalInformation_contactDetails_landNumber.setText("Student Name");

        _tf_student_payment_paymentDatails_studentName.setEditable(false);
        _tf_student_payment_paymentDatails_studentName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _tf_student_payment_paymentDatails_studentName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _tf_student_payment_paymentDatails_studentNameActionPerformed(evt);
            }
        });

        _lb_registration_lecture_personalInformation_contactDetails_eMail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _lb_registration_lecture_personalInformation_contactDetails_eMail.setForeground(new java.awt.Color(255, 255, 255));
        _lb_registration_lecture_personalInformation_contactDetails_eMail.setText("Course");

        _tf_student_payment_paymentDatails_course.setEditable(false);
        _tf_student_payment_paymentDatails_course.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _tf_student_payment_paymentDatails_course.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _tf_student_payment_paymentDatails_courseActionPerformed(evt);
            }
        });

        _lb_registration_lecture_personalInformation_address_1stLine.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _lb_registration_lecture_personalInformation_address_1stLine.setForeground(new java.awt.Color(255, 255, 255));
        _lb_registration_lecture_personalInformation_address_1stLine.setText("Course Fee");

        _tf_student_payment_paymentDatails_courseFee.setEditable(false);
        _tf_student_payment_paymentDatails_courseFee.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _tf_student_payment_paymentDatails_courseFee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _tf_student_payment_paymentDatails_courseFeeActionPerformed(evt);
            }
        });

        _lb_registration_lecture_personalInformation_address_2ndLine.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _lb_registration_lecture_personalInformation_address_2ndLine.setForeground(new java.awt.Color(255, 255, 255));
        _lb_registration_lecture_personalInformation_address_2ndLine.setText("Payment");

        _tf_student_payment_paymentDatails_payement.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _tf_student_payment_paymentDatails_payement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _tf_student_payment_paymentDatails_payementActionPerformed(evt);
            }
        });

        _lb_registration_lecture_personalInformation_address_city.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _lb_registration_lecture_personalInformation_address_city.setForeground(new java.awt.Color(255, 255, 255));
        _lb_registration_lecture_personalInformation_address_city.setText("Due Payment");

        _tf_registration_lecture_personalInformations_contactDetails_duePayment.setEditable(false);
        _tf_registration_lecture_personalInformations_contactDetails_duePayment.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _tf_registration_lecture_personalInformations_contactDetails_duePayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _tf_registration_lecture_personalInformations_contactDetails_duePaymentActionPerformed(evt);
            }
        });

        _lb_registration_lecture_personalInformation_contactDetails_mobileNumber1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _lb_registration_lecture_personalInformation_contactDetails_mobileNumber1.setForeground(new java.awt.Color(255, 255, 255));
        _lb_registration_lecture_personalInformation_contactDetails_mobileNumber1.setText("Date");

        _tf_student_payment_paymentDatails_date.setEditable(false);
        _tf_student_payment_paymentDatails_date.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _tf_student_payment_paymentDatails_date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _tf_student_payment_paymentDatails_dateActionPerformed(evt);
            }
        });

        _bt_student_payment_submit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _bt_student_payment_submit.setForeground(new java.awt.Color(255, 255, 255));
        _bt_student_payment_submit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/public_access/user/login/images_butons/buton_blue_200x50.png"))); // NOI18N
        _bt_student_payment_submit.setText("Submit");
        _bt_student_payment_submit.setFocusPainted(false);
        _bt_student_payment_submit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _bt_student_payment_submit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                _bt_student_payment_submitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                _bt_student_payment_submitMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                _bt_student_payment_submitMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                _bt_student_payment_submitMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout _pl_registration_lecture_personalInformation_contactDetailsLayout = new javax.swing.GroupLayout(_pl_registration_lecture_personalInformation_contactDetails);
        _pl_registration_lecture_personalInformation_contactDetails.setLayout(_pl_registration_lecture_personalInformation_contactDetailsLayout);
        _pl_registration_lecture_personalInformation_contactDetailsLayout.setHorizontalGroup(
            _pl_registration_lecture_personalInformation_contactDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(_pl_registration_lecture_personalInformation_contactDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(_pl_registration_lecture_personalInformation_contactDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(_lb_registration_lecture_personalInformation_address_1stLine, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(_pl_registration_lecture_personalInformation_contactDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(_lb_registration_lecture_personalInformation_contactDetails_mobileNumber1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(_tf_student_payment_paymentDatails_date, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(_pl_registration_lecture_personalInformation_contactDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(_bt_student_payment_submit, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(_pl_registration_lecture_personalInformation_contactDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(_tf_student_payment_paymentDatails_payement)
                            .addComponent(_tf_student_payment_paymentDatails_courseFee)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, _pl_registration_lecture_personalInformation_contactDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(_pl_registration_lecture_personalInformation_contactDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(_lb_registration_lecture_personalInformation_contactDetails_mobileNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
                                    .addComponent(_tf_student_payment_paymentDatails_invoiceID)
                                    .addComponent(_lb_registration_lecture_personalInformation_contactDetails_landNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(_tf_student_payment_paymentDatails_studentName)
                                    .addComponent(_lb_registration_lecture_personalInformation_contactDetails_eMail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(_tf_student_payment_paymentDatails_course))
                                .addComponent(_lb_registration_lecture_personalInformation_address_2ndLine, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(_lb_registration_lecture_personalInformation_address_city, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(_tf_registration_lecture_personalInformations_contactDetails_duePayment))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        _pl_registration_lecture_personalInformation_contactDetailsLayout.setVerticalGroup(
            _pl_registration_lecture_personalInformation_contactDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(_pl_registration_lecture_personalInformation_contactDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(_lb_registration_lecture_personalInformation_contactDetails_mobileNumber1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_tf_student_payment_paymentDatails_date, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_lb_registration_lecture_personalInformation_contactDetails_mobileNumber)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_tf_student_payment_paymentDatails_invoiceID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_lb_registration_lecture_personalInformation_contactDetails_landNumber)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_tf_student_payment_paymentDatails_studentName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_lb_registration_lecture_personalInformation_contactDetails_eMail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_tf_student_payment_paymentDatails_course, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_lb_registration_lecture_personalInformation_address_1stLine)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_tf_student_payment_paymentDatails_courseFee, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(_lb_registration_lecture_personalInformation_address_2ndLine)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_tf_student_payment_paymentDatails_payement, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_lb_registration_lecture_personalInformation_address_city)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_tf_registration_lecture_personalInformations_contactDetails_duePayment, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(_bt_student_payment_submit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Invoice ID", "Student Name", "Course Name", "Course Fee", "Payment", "Due Payment", "Payment Date", "Complete Payemnt"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        _bt_student_payment_updatePayment.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _bt_student_payment_updatePayment.setForeground(new java.awt.Color(255, 255, 255));
        _bt_student_payment_updatePayment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/public_access/user/login/images_butons/buton_blue_200x50.png"))); // NOI18N
        _bt_student_payment_updatePayment.setText("Update Payment");
        _bt_student_payment_updatePayment.setFocusPainted(false);
        _bt_student_payment_updatePayment.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _bt_student_payment_updatePayment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                _bt_student_payment_updatePaymentMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                _bt_student_payment_updatePaymentMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                _bt_student_payment_updatePaymentMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                _bt_student_payment_updatePaymentMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 965, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_bt_student_payment_updatePayment, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(_pl_registration_lecture_personalInformation_contactDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(_pl_registration_lecture_personalInformation_contactDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(_bt_student_payment_updatePayment, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void _tf_student_payment_paymentDatails_invoiceIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__tf_student_payment_paymentDatails_invoiceIDActionPerformed
        _tf_student_payment_paymentDatails_studentName.grabFocus();
    }//GEN-LAST:event__tf_student_payment_paymentDatails_invoiceIDActionPerformed

    private void _tf_student_payment_paymentDatails_studentNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__tf_student_payment_paymentDatails_studentNameActionPerformed
        _tf_student_payment_paymentDatails_course.grabFocus();
    }//GEN-LAST:event__tf_student_payment_paymentDatails_studentNameActionPerformed

    private void _tf_student_payment_paymentDatails_courseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__tf_student_payment_paymentDatails_courseActionPerformed
        _tf_student_payment_paymentDatails_courseFee.grabFocus();
    }//GEN-LAST:event__tf_student_payment_paymentDatails_courseActionPerformed

    private void _tf_student_payment_paymentDatails_courseFeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__tf_student_payment_paymentDatails_courseFeeActionPerformed
        _tf_student_payment_paymentDatails_payement.grabFocus();
    }//GEN-LAST:event__tf_student_payment_paymentDatails_courseFeeActionPerformed

    private void _tf_student_payment_paymentDatails_payementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__tf_student_payment_paymentDatails_payementActionPerformed
        _tf_registration_lecture_personalInformations_contactDetails_duePayment.grabFocus();
    }//GEN-LAST:event__tf_student_payment_paymentDatails_payementActionPerformed

    private void _tf_registration_lecture_personalInformations_contactDetails_duePaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__tf_registration_lecture_personalInformations_contactDetails_duePaymentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__tf_registration_lecture_personalInformations_contactDetails_duePaymentActionPerformed

    private void _tf_student_payment_paymentDatails_dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__tf_student_payment_paymentDatails_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__tf_student_payment_paymentDatails_dateActionPerformed

    private void _bt_student_payment_updatePaymentMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_student_payment_updatePaymentMouseEntered
        _bt_student_payment_updatePayment.setBorder(border);
    }//GEN-LAST:event__bt_student_payment_updatePaymentMouseEntered

    private void _bt_student_payment_updatePaymentMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_student_payment_updatePaymentMouseExited
        _bt_student_payment_updatePayment.setBorder(null);
    }//GEN-LAST:event__bt_student_payment_updatePaymentMouseExited

    private void _bt_student_payment_updatePaymentMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_student_payment_updatePaymentMousePressed
        _bt_student_payment_updatePayment.setBorder(null);
    }//GEN-LAST:event__bt_student_payment_updatePaymentMousePressed

    private void _bt_student_payment_updatePaymentMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_student_payment_updatePaymentMouseReleased
        _bt_student_payment_updatePayment.setBorder(border);
    }//GEN-LAST:event__bt_student_payment_updatePaymentMouseReleased

    private void _bt_student_payment_submitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_student_payment_submitMouseEntered
        _bt_student_payment_submit.setBorder(border);
    }//GEN-LAST:event__bt_student_payment_submitMouseEntered

    private void _bt_student_payment_submitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_student_payment_submitMouseExited
        _bt_student_payment_submit.setBorder(null);
    }//GEN-LAST:event__bt_student_payment_submitMouseExited

    private void _bt_student_payment_submitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_student_payment_submitMousePressed
        _bt_student_payment_submit.setBorder(null);
    }//GEN-LAST:event__bt_student_payment_submitMousePressed

    private void _bt_student_payment_submitMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_student_payment_submitMouseReleased
        _bt_student_payment_submit.setBorder(border);
    }//GEN-LAST:event__bt_student_payment_submitMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton _bt_student_payment_submit;
    private javax.swing.JButton _bt_student_payment_updatePayment;
    private javax.swing.JLabel _lb_registration_lecture_personalInformation_address_1stLine;
    private javax.swing.JLabel _lb_registration_lecture_personalInformation_address_2ndLine;
    private javax.swing.JLabel _lb_registration_lecture_personalInformation_address_city;
    private javax.swing.JLabel _lb_registration_lecture_personalInformation_contactDetails_eMail;
    private javax.swing.JLabel _lb_registration_lecture_personalInformation_contactDetails_landNumber;
    private javax.swing.JLabel _lb_registration_lecture_personalInformation_contactDetails_mobileNumber;
    private javax.swing.JLabel _lb_registration_lecture_personalInformation_contactDetails_mobileNumber1;
    private javax.swing.JPanel _pl_registration_lecture_personalInformation_contactDetails;
    private javax.swing.JTextField _tf_registration_lecture_personalInformations_contactDetails_duePayment;
    public static javax.swing.JTextField _tf_student_payment_paymentDatails_course;
    public static javax.swing.JTextField _tf_student_payment_paymentDatails_courseFee;
    public static javax.swing.JTextField _tf_student_payment_paymentDatails_date;
    public static javax.swing.JTextField _tf_student_payment_paymentDatails_invoiceID;
    private javax.swing.JTextField _tf_student_payment_paymentDatails_payement;
    public static javax.swing.JTextField _tf_student_payment_paymentDatails_studentName;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
