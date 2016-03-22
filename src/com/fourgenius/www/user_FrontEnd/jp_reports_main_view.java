/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fourgenius.www.user_FrontEnd;

import com.fourgenius.www.public_access.user.login.Jf_user_login;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.border.Border;
import reports.*;

/**
 *
 * @author Dineth Jayasekera
 */
public class jp_reports_main_view extends javax.swing.JFrame {

    /**
     * Creates new form jp_reports_main_view
     */
    Border border = BorderFactory.createLineBorder(Color.white, 1);

    public jp_reports_main_view() {
        initComponents();
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
        jp_view_reports = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        _bt_UserMain_home = new javax.swing.JButton();
        _bt_UserMain_inventory = new javax.swing.JButton();
        _bt_UserMain_student = new javax.swing.JButton();
        jp_report_change = new javax.swing.JPanel();
        lb_student_reports = new javax.swing.JLabel();
        lb_inventory_reports = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(2, 119, 189));
        jPanel1.setMaximumSize(new java.awt.Dimension(1366, 768));
        jPanel1.setMinimumSize(new java.awt.Dimension(1366, 768));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));

        jp_view_reports.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "View Reports", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jp_view_reports.setMaximumSize(new java.awt.Dimension(609, 686));
        jp_view_reports.setMinimumSize(new java.awt.Dimension(609, 686));
        jp_view_reports.setOpaque(false);
        jp_view_reports.setPreferredSize(new java.awt.Dimension(609, 686));

        javax.swing.GroupLayout jp_view_reportsLayout = new javax.swing.GroupLayout(jp_view_reports);
        jp_view_reports.setLayout(jp_view_reportsLayout);
        jp_view_reportsLayout.setHorizontalGroup(
            jp_view_reportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 597, Short.MAX_VALUE)
        );
        jp_view_reportsLayout.setVerticalGroup(
            jp_view_reportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

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

        _bt_UserMain_home.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _bt_UserMain_home.setForeground(new java.awt.Color(255, 255, 255));
        _bt_UserMain_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/public_access/user/login/images_butons/buton_blue_250x50.png"))); // NOI18N
        _bt_UserMain_home.setText("Home");
        _bt_UserMain_home.setAutoscrolls(true);
        _bt_UserMain_home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        _bt_UserMain_home.setFocusPainted(false);
        _bt_UserMain_home.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _bt_UserMain_home.setMaximumSize(new java.awt.Dimension(200, 50));
        _bt_UserMain_home.setMinimumSize(new java.awt.Dimension(200, 50));
        _bt_UserMain_home.setPreferredSize(new java.awt.Dimension(200, 50));
        _bt_UserMain_home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                _bt_UserMain_homeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                _bt_UserMain_homeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                _bt_UserMain_homeMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                _bt_UserMain_homeMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                _bt_UserMain_homeMouseReleased(evt);
            }
        });
        _bt_UserMain_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _bt_UserMain_homeActionPerformed(evt);
            }
        });

        _bt_UserMain_inventory.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _bt_UserMain_inventory.setForeground(new java.awt.Color(255, 255, 255));
        _bt_UserMain_inventory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/public_access/user/login/images_butons/buton_blue_250x50.png"))); // NOI18N
        _bt_UserMain_inventory.setText("Inventory");
        _bt_UserMain_inventory.setAutoscrolls(true);
        _bt_UserMain_inventory.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        _bt_UserMain_inventory.setFocusPainted(false);
        _bt_UserMain_inventory.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _bt_UserMain_inventory.setMaximumSize(new java.awt.Dimension(200, 50));
        _bt_UserMain_inventory.setMinimumSize(new java.awt.Dimension(200, 50));
        _bt_UserMain_inventory.setPreferredSize(new java.awt.Dimension(200, 50));
        _bt_UserMain_inventory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                _bt_UserMain_inventoryMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                _bt_UserMain_inventoryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                _bt_UserMain_inventoryMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                _bt_UserMain_inventoryMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                _bt_UserMain_inventoryMouseReleased(evt);
            }
        });
        _bt_UserMain_inventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _bt_UserMain_inventoryActionPerformed(evt);
            }
        });

        _bt_UserMain_student.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _bt_UserMain_student.setForeground(new java.awt.Color(255, 255, 255));
        _bt_UserMain_student.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/public_access/user/login/images_butons/buton_blue_250x50.png"))); // NOI18N
        _bt_UserMain_student.setText("Student");
        _bt_UserMain_student.setAutoscrolls(true);
        _bt_UserMain_student.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        _bt_UserMain_student.setFocusPainted(false);
        _bt_UserMain_student.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _bt_UserMain_student.setMaximumSize(new java.awt.Dimension(200, 50));
        _bt_UserMain_student.setMinimumSize(new java.awt.Dimension(200, 50));
        _bt_UserMain_student.setPreferredSize(new java.awt.Dimension(200, 50));
        _bt_UserMain_student.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                _bt_UserMain_studentMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                _bt_UserMain_studentMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                _bt_UserMain_studentMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                _bt_UserMain_studentMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                _bt_UserMain_studentMouseReleased(evt);
            }
        });
        _bt_UserMain_student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _bt_UserMain_studentActionPerformed(evt);
            }
        });

        jp_report_change.setMaximumSize(new java.awt.Dimension(719, 686));
        jp_report_change.setMinimumSize(new java.awt.Dimension(719, 686));
        jp_report_change.setOpaque(false);
        jp_report_change.setPreferredSize(new java.awt.Dimension(719, 686));

        lb_student_reports.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_student_reports.setForeground(new java.awt.Color(255, 255, 255));
        lb_student_reports.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/public_access/user/login/images/report_icon_student.png"))); // NOI18N
        lb_student_reports.setText("Student Reports");
        lb_student_reports.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lb_student_reports.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lb_student_reports.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_student_reportsMouseClicked(evt);
            }
        });

        lb_inventory_reports.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_inventory_reports.setForeground(new java.awt.Color(255, 255, 255));
        lb_inventory_reports.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/public_access/user/login/images/report_icon_inventory.png"))); // NOI18N
        lb_inventory_reports.setText("Inventory Reports");
        lb_inventory_reports.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lb_inventory_reports.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lb_inventory_reports.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_inventory_reportsMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jp_report_changeLayout = new javax.swing.GroupLayout(jp_report_change);
        jp_report_change.setLayout(jp_report_changeLayout);
        jp_report_changeLayout.setHorizontalGroup(
            jp_report_changeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_report_changeLayout.createSequentialGroup()
                .addContainerGap(123, Short.MAX_VALUE)
                .addComponent(lb_inventory_reports, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(lb_student_reports, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124))
        );
        jp_report_changeLayout.setVerticalGroup(
            jp_report_changeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_report_changeLayout.createSequentialGroup()
                .addContainerGap(232, Short.MAX_VALUE)
                .addGroup(jp_report_changeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lb_inventory_reports, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_student_reports, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(233, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(_bt_UserMain_home, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(_bt_UserMain_inventory, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(_bt_UserMain_student, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jp_report_change, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jp_view_reports, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(_bt_UserMain_home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(_bt_UserMain_inventory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(_bt_UserMain_student, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jp_report_change, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jp_view_reports, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(3, 3, 3))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
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

    private void _bt_UserMain_homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_UserMain_homeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event__bt_UserMain_homeMouseClicked

    private void _bt_UserMain_homeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_UserMain_homeMouseEntered
        _bt_UserMain_home.setBorder(border);
    }//GEN-LAST:event__bt_UserMain_homeMouseEntered

    private void _bt_UserMain_homeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_UserMain_homeMouseExited
        _bt_UserMain_home.setBorder(null);
    }//GEN-LAST:event__bt_UserMain_homeMouseExited

    private void _bt_UserMain_homeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_UserMain_homeMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event__bt_UserMain_homeMousePressed

    private void _bt_UserMain_homeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_UserMain_homeMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event__bt_UserMain_homeMouseReleased

    private void _bt_UserMain_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__bt_UserMain_homeActionPerformed

        this.dispose();
        new Jf_UserFront().setVisible(true);

    }//GEN-LAST:event__bt_UserMain_homeActionPerformed

    private void _bt_UserMain_inventoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_UserMain_inventoryMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event__bt_UserMain_inventoryMouseClicked

    private void _bt_UserMain_inventoryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_UserMain_inventoryMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event__bt_UserMain_inventoryMouseEntered

    private void _bt_UserMain_inventoryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_UserMain_inventoryMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event__bt_UserMain_inventoryMouseExited

    private void _bt_UserMain_inventoryMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_UserMain_inventoryMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event__bt_UserMain_inventoryMousePressed

    private void _bt_UserMain_inventoryMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_UserMain_inventoryMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event__bt_UserMain_inventoryMouseReleased

    private void _bt_UserMain_inventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__bt_UserMain_inventoryActionPerformed

          Inventory_reports inventory = new Inventory_reports();

        jp_report_change.removeAll();
        GroupLayout layout = new GroupLayout(jp_report_change);
        jp_report_change.setLayout(layout);

        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(inventory, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(inventory, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        System.gc();
        
    }//GEN-LAST:event__bt_UserMain_inventoryActionPerformed

    private void _bt_UserMain_studentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_UserMain_studentMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event__bt_UserMain_studentMouseClicked

    private void _bt_UserMain_studentMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_UserMain_studentMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event__bt_UserMain_studentMouseEntered

    private void _bt_UserMain_studentMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_UserMain_studentMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event__bt_UserMain_studentMouseExited

    private void _bt_UserMain_studentMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_UserMain_studentMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event__bt_UserMain_studentMousePressed

    private void _bt_UserMain_studentMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__bt_UserMain_studentMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event__bt_UserMain_studentMouseReleased

    private void _bt_UserMain_studentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__bt_UserMain_studentActionPerformed

         Student_reports student = new Student_reports();

        jp_report_change.removeAll();
        GroupLayout layout = new GroupLayout(jp_report_change);
        jp_report_change.setLayout(layout);

        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(student, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(student, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        System.gc();
        
    }//GEN-LAST:event__bt_UserMain_studentActionPerformed

    private void lb_inventory_reportsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_inventory_reportsMouseClicked

        Inventory_reports inventory = new Inventory_reports();

        jp_report_change.removeAll();
        GroupLayout layout = new GroupLayout(jp_report_change);
        jp_report_change.setLayout(layout);

        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(inventory, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(inventory, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        System.gc();

    }//GEN-LAST:event_lb_inventory_reportsMouseClicked

    private void lb_student_reportsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_student_reportsMouseClicked

          Student_reports student = new Student_reports();

        jp_report_change.removeAll();
        GroupLayout layout = new GroupLayout(jp_report_change);
        jp_report_change.setLayout(layout);

        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(student, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(student, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        System.gc();
        
    }//GEN-LAST:event_lb_student_reportsMouseClicked

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
            java.util.logging.Logger.getLogger(jp_reports_main_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jp_reports_main_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jp_reports_main_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jp_reports_main_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jp_reports_main_view().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton _bt_UserMain_home;
    private javax.swing.JButton _bt_UserMain_inventory;
    private javax.swing.JButton _bt_UserMain_student;
    private javax.swing.JButton jButton5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jp_report_change;
    public static javax.swing.JPanel jp_view_reports;
    private javax.swing.JLabel lb_inventory_reports;
    private javax.swing.JLabel lb_student_reports;
    // End of variables declaration//GEN-END:variables
}
