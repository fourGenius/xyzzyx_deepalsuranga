/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fourgenius.www.admin_BackEnd;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import public_access.MC_JavaDataBaseConnection;

/**
 *
 * @author deepalsuranga
 */
public class Jp_admin_user extends javax.swing.JPanel {

    /**
     * Creates new form _jp_admin_user
     */
    public Jp_admin_user() {
        initComponents();
        set_email_Comb();
//        load_allData();
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_admin_Administrators = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        tbl_admin_Administrators5 = new javax.swing.JTable();
        _pl_registration_lecture_personalInformation_lectureName = new javax.swing.JPanel();
        _lb_registration_lecture_personalInformation_lectureName_sirName = new javax.swing.JLabel();
        _tf_registration_lecture_personalInformation_lectureName_sirName = new javax.swing.JTextField();
        _lb_registration_lecture_personalInformation_lectureName_firstName = new javax.swing.JLabel();
        _tf_registration_lecture_personalInformation_lectureName_FirstName = new javax.swing.JTextField();
        _lb_registration_lecture_personalInformation_lectureName_lastName = new javax.swing.JLabel();
        _lb_registration_lecture_personalInformation_idInformation_dateOfBirth = new javax.swing.JLabel();
        _tf_registration_lecture_personalInformation_idInformation_nicNumber = new javax.swing.JTextField();
        _tf_registration_lecture_personalInformation_idInformation_dateOfBirth = new javax.swing.JTextField();
        _lb_registration_lecture_personalInformation_idInformation_nicNumber = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        _lb_registration_lecture_personalInformation_idInformation_dateOfBirth1 = new javax.swing.JLabel();
        _tf_registration_lecture_personalInformation_idInformation_dateOfBirth1 = new javax.swing.JTextField();
        changeBtnsss = new javax.swing.JButton();
        _tf_registration_lecture_personalInformation_lectureName_lastName = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 0, 102));
        setMinimumSize(new java.awt.Dimension(1360, 668));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("User");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Update User");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTabbedPane2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTabbedPane3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tbl_admin_Administrators.setBackground(new java.awt.Color(207, 216, 220));
        tbl_admin_Administrators.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        tbl_admin_Administrators.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tbl_admin_Administrators.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Administrator ID", "Name", "Email", "NIC No"
            }
        ));
        jScrollPane1.setViewportView(tbl_admin_Administrators);

        jTabbedPane3.addTab("Active Users", jScrollPane1);

        tbl_admin_Administrators5.setBackground(new java.awt.Color(207, 216, 220));
        tbl_admin_Administrators5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        tbl_admin_Administrators5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tbl_admin_Administrators5.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane6.setViewportView(tbl_admin_Administrators5);

        jTabbedPane3.addTab("De-active User", jScrollPane6);

        jTabbedPane2.addTab("Users", jTabbedPane3);

        _pl_registration_lecture_personalInformation_lectureName.setBackground(new java.awt.Color(0, 102, 102));
        _pl_registration_lecture_personalInformation_lectureName.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "User Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N

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
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("Male");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Gender");

        jRadioButton2.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("Female");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Position Type");

        jRadioButton3.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup2.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton3.setText("Administrator");

        jRadioButton4.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup2.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton4.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton4.setText("Manager");

        _lb_registration_lecture_personalInformation_idInformation_dateOfBirth1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _lb_registration_lecture_personalInformation_idInformation_dateOfBirth1.setForeground(new java.awt.Color(255, 255, 255));
        _lb_registration_lecture_personalInformation_idInformation_dateOfBirth1.setText("Confrm Password");

        _tf_registration_lecture_personalInformation_idInformation_dateOfBirth1.setEditable(false);
        _tf_registration_lecture_personalInformation_idInformation_dateOfBirth1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _tf_registration_lecture_personalInformation_idInformation_dateOfBirth1ActionPerformed(evt);
            }
        });

        changeBtnsss.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        changeBtnsss.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        changeBtnsss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeBtnsssActionPerformed(evt);
            }
        });

        _tf_registration_lecture_personalInformation_lectureName_lastName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout _pl_registration_lecture_personalInformation_lectureNameLayout = new javax.swing.GroupLayout(_pl_registration_lecture_personalInformation_lectureName);
        _pl_registration_lecture_personalInformation_lectureName.setLayout(_pl_registration_lecture_personalInformation_lectureNameLayout);
        _pl_registration_lecture_personalInformation_lectureNameLayout.setHorizontalGroup(
            _pl_registration_lecture_personalInformation_lectureNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(_pl_registration_lecture_personalInformation_lectureNameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(_pl_registration_lecture_personalInformation_lectureNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(_pl_registration_lecture_personalInformation_lectureNameLayout.createSequentialGroup()
                        .addGroup(_pl_registration_lecture_personalInformation_lectureNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(_pl_registration_lecture_personalInformation_lectureNameLayout.createSequentialGroup()
                                .addComponent(jRadioButton3)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton4)
                                .addGap(18, 18, 18)
                                .addComponent(changeBtnsss, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(_pl_registration_lecture_personalInformation_lectureNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(_tf_registration_lecture_personalInformation_lectureName_lastName, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(_lb_registration_lecture_personalInformation_lectureName_sirName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(_lb_registration_lecture_personalInformation_lectureName_firstName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(_tf_registration_lecture_personalInformation_lectureName_FirstName, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(_lb_registration_lecture_personalInformation_lectureName_lastName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(_lb_registration_lecture_personalInformation_idInformation_nicNumber, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
                                .addComponent(_lb_registration_lecture_personalInformation_idInformation_dateOfBirth, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(_tf_registration_lecture_personalInformation_idInformation_nicNumber, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(_tf_registration_lecture_personalInformation_idInformation_dateOfBirth, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(_tf_registration_lecture_personalInformation_lectureName_sirName, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, _pl_registration_lecture_personalInformation_lectureNameLayout.createSequentialGroup()
                                    .addComponent(jRadioButton1)
                                    .addGap(52, 52, 52)
                                    .addComponent(jRadioButton2))
                                .addComponent(_lb_registration_lecture_personalInformation_idInformation_dateOfBirth1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(_tf_registration_lecture_personalInformation_idInformation_dateOfBirth1, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(0, 10, Short.MAX_VALUE)))
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
                .addGroup(_pl_registration_lecture_personalInformation_lectureNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(_pl_registration_lecture_personalInformation_lectureNameLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(_pl_registration_lecture_personalInformation_lectureNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(_pl_registration_lecture_personalInformation_lectureNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton3)
                            .addComponent(jRadioButton4))
                        .addContainerGap(34, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, _pl_registration_lecture_personalInformation_lectureNameLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(changeBtnsss, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Add User");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setText("Disable User");
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
                        .addGap(336, 336, 336)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 866, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(_pl_registration_lecture_personalInformation_lectureName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(_pl_registration_lecture_personalInformation_lectureName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        changeBtnsss.setVisible(true);
        changeBtnsss.setText("Update User");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void _tf_registration_lecture_personalInformation_lectureName_sirNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__tf_registration_lecture_personalInformation_lectureName_sirNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__tf_registration_lecture_personalInformation_lectureName_sirNameActionPerformed

    private void _tf_registration_lecture_personalInformation_lectureName_FirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__tf_registration_lecture_personalInformation_lectureName_FirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__tf_registration_lecture_personalInformation_lectureName_FirstNameActionPerformed

    private void _tf_registration_lecture_personalInformation_idInformation_nicNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__tf_registration_lecture_personalInformation_idInformation_nicNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__tf_registration_lecture_personalInformation_idInformation_nicNumberActionPerformed

    private void _tf_registration_lecture_personalInformation_idInformation_dateOfBirthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__tf_registration_lecture_personalInformation_idInformation_dateOfBirthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__tf_registration_lecture_personalInformation_idInformation_dateOfBirthActionPerformed

    private void _tf_registration_lecture_personalInformation_idInformation_dateOfBirth1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__tf_registration_lecture_personalInformation_idInformation_dateOfBirth1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__tf_registration_lecture_personalInformation_idInformation_dateOfBirth1ActionPerformed

    private void changeBtnsssActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeBtnsssActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_changeBtnsssActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        changeBtnsss.setVisible(true);
        changeBtnsss.setText("Add User");

        //INSERT INTO `g4_2015_java_se_management_ramanifernando`.`admin` (`idadmin`, `admin_email`, `admin_password`, `admin_status`) VALUES ('3', 'a', 'a', '1');

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        changeBtnsss.setVisible(true);
        changeBtnsss.setText("Disable User");

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
    private javax.swing.JComboBox _tf_registration_lecture_personalInformation_lectureName_lastName;
    private javax.swing.JTextField _tf_registration_lecture_personalInformation_lectureName_sirName;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton changeBtnsss;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTable tbl_admin_Administrators;
    private javax.swing.JTable tbl_admin_Administrators5;
    // End of variables declaration//GEN-END:variables

    void set_email_Comb() {

        try {
            ResultSet rs;
            String sql = "SELECT * FROM user";
            rs = MC_JavaDataBaseConnection.myConnection().createStatement().executeQuery(sql);

            while (rs.next()) {
                String name = rs.getString("user_email");
                _tf_registration_lecture_personalInformation_lectureName_lastName.addItem(name);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    private void load_allData() {
//        try {
//
//            DefaultTableModel tableModel_user_active = (DefaultTableModel) tbl_admin_Administrators.getModel();
//            tableModel_user_active.setRowCount(0);
//
//            Connection connection = MC_JavaDataBaseConnection.myConnection();
//            Statement statement = connection.createStatement();
//
//            String sql = "SELECT a.employee_academic_user_id a.employee_academic_user_info_name_surName a.employee_academic_user_info_name_first_name a.employee_academic_user_info_name_last_name b.user_email FROM employee_academic_user_info_name a LEFT JOIN USER b ON a.employee_academic_user_id= b.user_id";
//            ResultSet rs = statement.executeQuery(sql);
//            while (rs.next()) {
//                Vector v = new Vector();
//                v.add(rs.getString("employee_academic_user_id"));
//                v.add(rs.getString("employee_academic_user_info_name_surName") + " " + rs.getString("employee_academic_user_info_name_first_name") + " " + rs.getString("employee_academic_user_info_name_last_name"));
//                v.add(rs.getString("user_email"));
//                tableModel_user_active.addRow(v);
//            }
//        } catch (Exception e) {
//        }
//    }
}
