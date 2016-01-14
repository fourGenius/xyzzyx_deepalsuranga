/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fourgenius.www.public_access.registration;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.border.Border;

/**
 *
 * @author thilina
 */
public class Jp_registration_employee extends javax.swing.JPanel {

    Border border = BorderFactory.createLineBorder(Color.white, 1);
    String path, newpath;

    /**
     * Creates new form registration_employee
     */
    public Jp_registration_employee() {
        initComponents();
        try {
            _bt_view_employeeActionPerformed(null);
          
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

        _bg_registration_employee_personalInformations_employeeDetails_gender = new javax.swing.ButtonGroup();
        main = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        _bt_view_employee = new javax.swing.JButton();
        _bt_add_employee = new javax.swing.JButton();

        setBackground(new java.awt.Color(66, 66, 66));
        setMaximumSize(new java.awt.Dimension(1366, 718));
        setMinimumSize(new java.awt.Dimension(1366, 718));
        setPreferredSize(new java.awt.Dimension(1366, 718));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        main.setBackground(new java.awt.Color(66, 66, 66));

        javax.swing.GroupLayout mainLayout = new javax.swing.GroupLayout(main);
        main.setLayout(mainLayout);
        mainLayout.setHorizontalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1360, Short.MAX_VALUE)
        );
        mainLayout.setVerticalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );

        add(main, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 630));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));

        _bt_view_employee.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _bt_view_employee.setForeground(new java.awt.Color(255, 255, 255));
        _bt_view_employee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/public_access/user/login/images_butons/buton_blue_200x50.png"))); // NOI18N
        _bt_view_employee.setText("View Employee");
        _bt_view_employee.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        _bt_view_employee.setFocusPainted(false);
        _bt_view_employee.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _bt_view_employee.setPreferredSize(new java.awt.Dimension(300, 50));
        _bt_view_employee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                _bt_view_employeeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                _bt_view_employeeMouseExited(evt);
            }
        });
        _bt_view_employee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _bt_view_employeeActionPerformed(evt);
            }
        });

        _bt_add_employee.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _bt_add_employee.setForeground(new java.awt.Color(255, 255, 255));
        _bt_add_employee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/public_access/user/login/images_butons/buton_blue_200x50.png"))); // NOI18N
        _bt_add_employee.setText("Add Employee");
        _bt_add_employee.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        _bt_add_employee.setFocusPainted(false);
        _bt_add_employee.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _bt_add_employee.setPreferredSize(new java.awt.Dimension(200, 50));
        _bt_add_employee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                _bt_add_employeeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                _bt_add_employeeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                _bt_add_employeeMouseExited(evt);
            }
        });
        _bt_add_employee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _bt_add_employeeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(_bt_view_employee, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(_bt_add_employee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 930, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(_bt_view_employee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_bt_add_employee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 640, 1340, 70));
    }// </editor-fold>//GEN-END:initComponents

    int i = 0;
    private void _bt_view_employeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__bt_view_employeeActionPerformed

      
        main.removeAll();
            GroupLayout layout = new GroupLayout(main);
            main.setLayout(layout);

              Jp_registration_employee_informations_view view_employee = new Jp_registration_employee_informations_view();
            layout.setHorizontalGroup(
                    layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(view_employee, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
            layout.setVerticalGroup(
                    layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(view_employee, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

            System.gc();
    }//GEN-LAST:event__bt_view_employeeActionPerformed

    private void _bt_view_employeeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_view_employeeMouseEntered
        _bt_view_employee.setBorder(border);
    }//GEN-LAST:event__bt_view_employeeMouseEntered

    private void _bt_view_employeeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_view_employeeMouseExited
        _bt_view_employee.setBorder(null);
    }//GEN-LAST:event__bt_view_employeeMouseExited

    private void _bt_add_employeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__bt_add_employeeActionPerformed
        
        try {
            
           
            main.removeAll();
            GroupLayout layout = new GroupLayout(main);
            main.setLayout(layout);

            Jp_registration_employee_informations_add add_employee = new Jp_registration_employee_informations_add();
           
            layout.setHorizontalGroup(
                    layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(add_employee, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
            layout.setVerticalGroup(
                    layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(add_employee, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

            System.gc();

            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event__bt_add_employeeActionPerformed

    private void _bt_add_employeeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_add_employeeMouseEntered
       
        _bt_add_employee.setBorder(border);
        
    }//GEN-LAST:event__bt_add_employeeMouseEntered

    private void _bt_add_employeeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_add_employeeMouseExited
        _bt_add_employee.setBorder(null);
    }//GEN-LAST:event__bt_add_employeeMouseExited

    private void _bt_add_employeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_add_employeeMouseClicked
        
        
        
         if (_bt_add_employee.getText().equals("Finish")) {
                _bt_view_employee.setEnabled(true);
                _bt_add_employee.setText("Add Employee");
                
                 main.removeAll();
            GroupLayout layout = new GroupLayout(main);
            main.setLayout(layout);

            Jp_registration_employee_informations_add add_employee = new Jp_registration_employee_informations_add();
           
            layout.setHorizontalGroup(
                    layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(add_employee, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
            layout.setVerticalGroup(
                    layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(add_employee, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

            System.gc();
            }else{_bt_add_employee.setText("Finish");
         _bt_view_employee.setEnabled(false);}
    }//GEN-LAST:event__bt_add_employeeMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup _bg_registration_employee_personalInformations_employeeDetails_gender;
    private javax.swing.JButton _bt_add_employee;
    private javax.swing.JButton _bt_view_employee;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel main;
    // End of variables declaration//GEN-END:variables
}
