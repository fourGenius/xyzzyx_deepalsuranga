/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fourgenius.www.private_access.admin.login;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

/**
 *
 * @author Dineth Jayasekera
 */
public class _jp_admin_login_email extends javax.swing.JPanel {
Border border=BorderFactory.createLineBorder(Color.white, 1);
    /*
     * Creates new form _jp_admin_login_email
     */
    public _jp_admin_login_email() {
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

        _jp_admin_login_email = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        bt_next = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        _lb_admi_login_email = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        _lb_admin_login_close = new javax.swing.JLabel();
        _lb_admin_login_minimize = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        _jp_admin_login_email.setBackground(new java.awt.Color(61, 61, 61));
        _jp_admin_login_email.setMinimumSize(new java.awt.Dimension(1366, 768));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(320, 399));

        bt_next.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bt_next.setForeground(new java.awt.Color(255, 255, 255));
        bt_next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/public_access/user/login/images_butons/img_btn_adminBackEnd_Black.png"))); // NOI18N
        bt_next.setText("Next");
        bt_next.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_next.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_nextActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/public_access/user/login/images_butons/img_btn_adminBackEnd_Black.png"))); // NOI18N
        jButton2.setText("Cancel");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Username");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Forgot Username?");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/public_access/user/login/images/img_AccountCircleGrey192x192.png"))); // NOI18N

        _lb_admi_login_email.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 299, Short.MAX_VALUE)
                                .addComponent(bt_next, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(_lb_admi_login_email, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(_lb_admi_login_email, javax.swing.GroupLayout.DEFAULT_SIZE, 12, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_next, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addContainerGap())
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

        _lb_admin_login_minimize.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        _lb_admin_login_minimize.setForeground(new java.awt.Color(255, 255, 255));
        _lb_admin_login_minimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        _lb_admin_login_minimize.setText("-");
        _lb_admin_login_minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        _lb_admin_login_minimize.setPreferredSize(new java.awt.Dimension(25, 25));
        _lb_admin_login_minimize.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                _lb_admin_login_minimizeMouseMoved(evt);
            }
        });
        _lb_admin_login_minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                _lb_admin_login_minimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                _lb_admin_login_minimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                _lb_admin_login_minimizeMouseExited(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/public_access/user/login/images/img_RamaniAccademyLogo600x200_1.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/public_access/user/login/images_butons/img_poweredBy_4G.png"))); // NOI18N

        javax.swing.GroupLayout _jp_admin_login_emailLayout = new javax.swing.GroupLayout(_jp_admin_login_email);
        _jp_admin_login_email.setLayout(_jp_admin_login_emailLayout);
        _jp_admin_login_emailLayout.setHorizontalGroup(
            _jp_admin_login_emailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(_jp_admin_login_emailLayout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 1138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(_lb_admin_login_minimize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_lb_admin_login_close, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, _jp_admin_login_emailLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(518, 518, 518))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, _jp_admin_login_emailLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        _jp_admin_login_emailLayout.setVerticalGroup(
            _jp_admin_login_emailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, _jp_admin_login_emailLayout.createSequentialGroup()
                .addGroup(_jp_admin_login_emailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(_jp_admin_login_emailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(_lb_admin_login_close, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(_lb_admin_login_minimize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                .addGroup(_jp_admin_login_emailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1366, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(_jp_admin_login_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 768, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(_jp_admin_login_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bt_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_nextActionPerformed

        _jp_admin_login_password adminLoginPassword=new _jp_admin_login_password();

        if (adminLoginPassword == null) {
            adminLoginPassword = new _jp_admin_login_password();
            Jf_admin_login.main_panel.removeAll();
            Jf_admin_login.main_panel.repaint();
            Jf_admin_login.main_panel.revalidate();
            Jf_admin_login.main_panel.add(adminLoginPassword);
            Jf_admin_login.main_panel.repaint();
            Jf_admin_login.main_panel.revalidate();
        } else {
            Jf_admin_login.main_panel.removeAll();
            Jf_admin_login.main_panel.repaint();
            Jf_admin_login.main_panel.revalidate();
            Jf_admin_login.main_panel.add(adminLoginPassword);
            Jf_admin_login.main_panel.repaint();
           Jf_admin_login.main_panel.revalidate();
        }
    }//GEN-LAST:event_bt_nextActionPerformed

    private void _lb_admin_login_closeMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__lb_admin_login_closeMouseMoved

    }//GEN-LAST:event__lb_admin_login_closeMouseMoved

    private void _lb_admin_login_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__lb_admin_login_closeMouseClicked

        System.exit(0);
    }//GEN-LAST:event__lb_admin_login_closeMouseClicked

    private void _lb_admin_login_closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__lb_admin_login_closeMouseEntered

        _lb_admin_login_close.setBorder(border);
        _lb_admin_login_close.setBackground(Color.RED);

        _lb_admin_login_minimize.setToolTipText("Close");
    }//GEN-LAST:event__lb_admin_login_closeMouseEntered

    private void _lb_admin_login_closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__lb_admin_login_closeMouseExited
        _lb_admin_login_close.setBorder(null);
        _lb_admin_login_close.setBackground(new Color(61,61,61));
    }//GEN-LAST:event__lb_admin_login_closeMouseExited

    private void _lb_admin_login_minimizeMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__lb_admin_login_minimizeMouseMoved

    }//GEN-LAST:event__lb_admin_login_minimizeMouseMoved

    private void _lb_admin_login_minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__lb_admin_login_minimizeMouseClicked

        
    }//GEN-LAST:event__lb_admin_login_minimizeMouseClicked

    private void _lb_admin_login_minimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__lb_admin_login_minimizeMouseEntered

        _lb_admin_login_minimize.setToolTipText("Minimize");
        _lb_admin_login_minimize.setBorder(border);
    }//GEN-LAST:event__lb_admin_login_minimizeMouseEntered

    private void _lb_admin_login_minimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__lb_admin_login_minimizeMouseExited

        _lb_admin_login_minimize.setBorder(null);
    }//GEN-LAST:event__lb_admin_login_minimizeMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel _jp_admin_login_email;
    private javax.swing.JLabel _lb_admi_login_email;
    private javax.swing.JLabel _lb_admin_login_close;
    private javax.swing.JLabel _lb_admin_login_minimize;
    private javax.swing.JButton bt_next;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}