/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fourgenius.www.admin_BackEnd;

import com.fourgenius.www.public_access.model.academic_employee.employee_academic_user_info;
import java.util.Vector;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author deepalsuranga
 */
public class Jp_admin_employee_non_ac extends javax.swing.JPanel {

    /*
     * Creates new form _jp_admin_employee
     */
    public Jp_admin_employee_non_ac() {
        initComponents();
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception ex) {
        }
        ///////////////////////////////////////////////////////////////////////
        DefaultTableModel defaultTableModel = (DefaultTableModel) tbl_admin_n_ac_active.getModel();
        defaultTableModel.setRowCount(0);
        employee_academic_user_info in = new employee_academic_user_info();
        int mass = in.max;
        Vector v = new Vector();
        v.add(in.getEmployee_academic_user_id_s("0"));

        defaultTableModel.addRow(v);
        ////////////////////////////////////////////////////////////////////////
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_admin_n_ac_active = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        tbl_admin_ac_deactive = new javax.swing.JTable();
        _pl_registration_lecture_personalInformation_lectureName = new javax.swing.JPanel();
        _lb_registration_lecture_personalInformation_lectureName_sirName = new javax.swing.JLabel();
        _tf_registration_lecture_personalInformation_lectureName_sirName = new javax.swing.JTextField();
        _lb_registration_lecture_personalInformation_lectureName_firstName = new javax.swing.JLabel();
        _tf_registration_lecture_personalInformation_lectureName_FirstName = new javax.swing.JTextField();
        _lb_registration_lecture_personalInformation_lectureName_lastName = new javax.swing.JLabel();
        _tf_registration_lecture_personalInformation_lectureName_lastName = new javax.swing.JTextField();
        _lb_registration_lecture_personalInformation_idInformation_dateOfBirth = new javax.swing.JLabel();
        _tf_registration_lecture_personalInformation_idInformation_nicNumber = new javax.swing.JTextField();
        _tf_registration_lecture_personalInformation_idInformation_dateOfBirth = new javax.swing.JTextField();
        _lb_registration_lecture_personalInformation_idInformation_nicNumber = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        _lb_registration_lecture_personalInformation_idInformation_dateOfBirth1 = new javax.swing.JLabel();
        _tf_registration_lecture_personalInformation_idInformation_dateOfBirth1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 102, 64));
        setMinimumSize(new java.awt.Dimension(1360, 668));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Non-Academic Employee");

        jTabbedPane2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTabbedPane3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tbl_admin_n_ac_active.setBackground(new java.awt.Color(207, 216, 220));
        tbl_admin_n_ac_active.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        tbl_admin_n_ac_active.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tbl_admin_n_ac_active.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Administrator ID", "Name", "Email", "NIC No", "Password"
            }
        ));
        jScrollPane1.setViewportView(tbl_admin_n_ac_active);

        jTabbedPane3.addTab("Active Employee", jScrollPane1);

        tbl_admin_ac_deactive.setBackground(new java.awt.Color(207, 216, 220));
        tbl_admin_ac_deactive.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        tbl_admin_ac_deactive.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tbl_admin_ac_deactive.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "User ID", "Name", "Email", "NIC No", "Password"
            }
        ));
        jScrollPane6.setViewportView(tbl_admin_ac_deactive);

        jTabbedPane3.addTab("De-active Employee", jScrollPane6);

        jTabbedPane2.addTab("Non Academic Employee", jTabbedPane3);

        _pl_registration_lecture_personalInformation_lectureName.setBackground(new java.awt.Color(0, 102, 102));
        _pl_registration_lecture_personalInformation_lectureName.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Non Academic Employee Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        _lb_registration_lecture_personalInformation_lectureName_sirName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _lb_registration_lecture_personalInformation_lectureName_sirName.setForeground(new java.awt.Color(255, 255, 255));
        _lb_registration_lecture_personalInformation_lectureName_sirName.setText("First Name");

        _tf_registration_lecture_personalInformation_lectureName_sirName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _tf_registration_lecture_personalInformation_lectureName_sirNameActionPerformed(evt);
            }
        });

        _lb_registration_lecture_personalInformation_lectureName_firstName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _lb_registration_lecture_personalInformation_lectureName_firstName.setForeground(new java.awt.Color(255, 255, 255));
        _lb_registration_lecture_personalInformation_lectureName_firstName.setText("Last Name");

        _tf_registration_lecture_personalInformation_lectureName_FirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _tf_registration_lecture_personalInformation_lectureName_FirstNameActionPerformed(evt);
            }
        });

        _lb_registration_lecture_personalInformation_lectureName_lastName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _lb_registration_lecture_personalInformation_lectureName_lastName.setForeground(new java.awt.Color(255, 255, 255));
        _lb_registration_lecture_personalInformation_lectureName_lastName.setText("Email");

        _tf_registration_lecture_personalInformation_lectureName_lastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _tf_registration_lecture_personalInformation_lectureName_lastNameActionPerformed(evt);
            }
        });

        _lb_registration_lecture_personalInformation_idInformation_dateOfBirth.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _lb_registration_lecture_personalInformation_idInformation_dateOfBirth.setForeground(new java.awt.Color(255, 255, 255));
        _lb_registration_lecture_personalInformation_idInformation_dateOfBirth.setText("Password");

        _tf_registration_lecture_personalInformation_idInformation_nicNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _tf_registration_lecture_personalInformation_idInformation_nicNumberActionPerformed(evt);
            }
        });

        _tf_registration_lecture_personalInformation_idInformation_dateOfBirth.setEditable(false);
        _tf_registration_lecture_personalInformation_idInformation_dateOfBirth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _tf_registration_lecture_personalInformation_idInformation_dateOfBirthActionPerformed(evt);
            }
        });

        _lb_registration_lecture_personalInformation_idInformation_nicNumber.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _lb_registration_lecture_personalInformation_idInformation_nicNumber.setForeground(new java.awt.Color(255, 255, 255));
        _lb_registration_lecture_personalInformation_idInformation_nicNumber.setText("NIC Number");

        jRadioButton1.setBackground(new java.awt.Color(0, 102, 102));
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("Male");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Gender");

        jRadioButton2.setBackground(new java.awt.Color(0, 102, 102));
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("Female");

        _lb_registration_lecture_personalInformation_idInformation_dateOfBirth1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _lb_registration_lecture_personalInformation_idInformation_dateOfBirth1.setForeground(new java.awt.Color(255, 255, 255));
        _lb_registration_lecture_personalInformation_idInformation_dateOfBirth1.setText("Confirm Password");

        _tf_registration_lecture_personalInformation_idInformation_dateOfBirth1.setEditable(false);
        _tf_registration_lecture_personalInformation_idInformation_dateOfBirth1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _tf_registration_lecture_personalInformation_idInformation_dateOfBirth1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout _pl_registration_lecture_personalInformation_lectureNameLayout = new javax.swing.GroupLayout(_pl_registration_lecture_personalInformation_lectureName);
        _pl_registration_lecture_personalInformation_lectureName.setLayout(_pl_registration_lecture_personalInformation_lectureNameLayout);
        _pl_registration_lecture_personalInformation_lectureNameLayout.setHorizontalGroup(
            _pl_registration_lecture_personalInformation_lectureNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(_pl_registration_lecture_personalInformation_lectureNameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(_pl_registration_lecture_personalInformation_lectureNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(_pl_registration_lecture_personalInformation_lectureNameLayout.createSequentialGroup()
                        .addGroup(_pl_registration_lecture_personalInformation_lectureNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(_lb_registration_lecture_personalInformation_lectureName_sirName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(_lb_registration_lecture_personalInformation_lectureName_firstName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(_tf_registration_lecture_personalInformation_lectureName_FirstName)
                            .addComponent(_lb_registration_lecture_personalInformation_lectureName_lastName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(_lb_registration_lecture_personalInformation_idInformation_nicNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
                            .addComponent(_lb_registration_lecture_personalInformation_idInformation_dateOfBirth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(_tf_registration_lecture_personalInformation_idInformation_nicNumber)
                            .addComponent(_tf_registration_lecture_personalInformation_idInformation_dateOfBirth)
                            .addComponent(_tf_registration_lecture_personalInformation_lectureName_lastName)
                            .addComponent(_tf_registration_lecture_personalInformation_lectureName_sirName)
                            .addGroup(_pl_registration_lecture_personalInformation_lectureNameLayout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addGap(52, 52, 52)
                                .addComponent(jRadioButton2))
                            .addComponent(_lb_registration_lecture_personalInformation_idInformation_dateOfBirth1)
                            .addComponent(_tf_registration_lecture_personalInformation_idInformation_dateOfBirth1))
                        .addGap(0, 82, Short.MAX_VALUE)))
                .addContainerGap())
        );
        _pl_registration_lecture_personalInformation_lectureNameLayout.setVerticalGroup(
            _pl_registration_lecture_personalInformation_lectureNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(_pl_registration_lecture_personalInformation_lectureNameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(_lb_registration_lecture_personalInformation_lectureName_sirName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_tf_registration_lecture_personalInformation_lectureName_sirName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_lb_registration_lecture_personalInformation_lectureName_firstName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_tf_registration_lecture_personalInformation_lectureName_FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_lb_registration_lecture_personalInformation_lectureName_lastName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_tf_registration_lecture_personalInformation_lectureName_lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_lb_registration_lecture_personalInformation_idInformation_nicNumber)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_tf_registration_lecture_personalInformation_idInformation_nicNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_lb_registration_lecture_personalInformation_idInformation_dateOfBirth)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_tf_registration_lecture_personalInformation_idInformation_dateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_lb_registration_lecture_personalInformation_idInformation_dateOfBirth1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_tf_registration_lecture_personalInformation_idInformation_dateOfBirth1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(_pl_registration_lecture_personalInformation_lectureNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Add Employee");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("Update Employee");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setText("Disable Employee");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(281, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTabbedPane2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(_pl_registration_lecture_personalInformation_lectureName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(_pl_registration_lecture_personalInformation_lectureName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void _tf_registration_lecture_personalInformation_lectureName_sirNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__tf_registration_lecture_personalInformation_lectureName_sirNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__tf_registration_lecture_personalInformation_lectureName_sirNameActionPerformed

    private void _tf_registration_lecture_personalInformation_lectureName_FirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__tf_registration_lecture_personalInformation_lectureName_FirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__tf_registration_lecture_personalInformation_lectureName_FirstNameActionPerformed

    private void _tf_registration_lecture_personalInformation_lectureName_lastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__tf_registration_lecture_personalInformation_lectureName_lastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__tf_registration_lecture_personalInformation_lectureName_lastNameActionPerformed

    private void _tf_registration_lecture_personalInformation_idInformation_nicNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__tf_registration_lecture_personalInformation_idInformation_nicNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__tf_registration_lecture_personalInformation_idInformation_nicNumberActionPerformed

    private void _tf_registration_lecture_personalInformation_idInformation_dateOfBirthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__tf_registration_lecture_personalInformation_idInformation_dateOfBirthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__tf_registration_lecture_personalInformation_idInformation_dateOfBirthActionPerformed

    private void _tf_registration_lecture_personalInformation_idInformation_dateOfBirth1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__tf_registration_lecture_personalInformation_idInformation_dateOfBirth1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__tf_registration_lecture_personalInformation_idInformation_dateOfBirth1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        

        //INSERT INTO `g4_2015_java_se_management_ramanifernando`.`admin` (`idadmin`, `admin_email`, `admin_password`, `admin_status`) VALUES ('3', 'a', 'a', '1');
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel _lb_registration_lecture_personalInformation_idInformation_dateOfBirth;
    private javax.swing.JLabel _lb_registration_lecture_personalInformation_idInformation_dateOfBirth1;
    private javax.swing.JLabel _lb_registration_lecture_personalInformation_idInformation_nicNumber;
    private javax.swing.JLabel _lb_registration_lecture_personalInformation_lectureName_firstName;
    private javax.swing.JLabel _lb_registration_lecture_personalInformation_lectureName_lastName;
    private javax.swing.JLabel _lb_registration_lecture_personalInformation_lectureName_sirName;
    private javax.swing.JPanel _pl_registration_lecture_personalInformation_lectureName;
    private javax.swing.JTextField _tf_registration_lecture_personalInformation_idInformation_dateOfBirth;
    private javax.swing.JTextField _tf_registration_lecture_personalInformation_idInformation_dateOfBirth1;
    private javax.swing.JTextField _tf_registration_lecture_personalInformation_idInformation_nicNumber;
    private javax.swing.JTextField _tf_registration_lecture_personalInformation_lectureName_FirstName;
    private javax.swing.JTextField _tf_registration_lecture_personalInformation_lectureName_lastName;
    private javax.swing.JTextField _tf_registration_lecture_personalInformation_lectureName_sirName;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTable tbl_admin_ac_deactive;
    private javax.swing.JTable tbl_admin_n_ac_active;
    // End of variables declaration//GEN-END:variables
}
