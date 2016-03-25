/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fourgenius.www.user_FrontEnd;

import com.fourgenius.www.public_access.user.login.Jf_user_login;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

/**
 *
 * @author Dineth Jayasekera
 */
public class jf_library_main_view extends javax.swing.JFrame {

    /**
     * Creates new form jf_library_main_view
     */
    public jf_library_main_view() {
        initComponents();
    }
    Border borderE = BorderFactory.createLineBorder(new Color(0,153,153), 1);
    Border borderC = BorderFactory.createLineBorder(new Color(240, 240, 240), 1);

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lb_burrow_books = new javax.swing.JLabel();
        lb_return_books = new javax.swing.JLabel();
        lb_manage_books = new javax.swing.JLabel();
        lb_members = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(2, 119, 189));
        jPanel2.setMaximumSize(new java.awt.Dimension(1366, 768));
        jPanel2.setMinimumSize(new java.awt.Dimension(1366, 768));
        jPanel2.setPreferredSize(new java.awt.Dimension(1366, 768));

        jPanel1.setBackground(new java.awt.Color(2, 119, 189));
        jPanel1.setMaximumSize(new java.awt.Dimension(1366, 50));
        jPanel1.setMinimumSize(new java.awt.Dimension(1366, 50));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 50));

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(2, 119, 189));
        jPanel3.setMaximumSize(new java.awt.Dimension(1113, 701));
        jPanel3.setMinimumSize(new java.awt.Dimension(1113, 701));
        jPanel3.setPreferredSize(new java.awt.Dimension(1113, 701));

        lb_burrow_books.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_burrow_books.setForeground(new java.awt.Color(255, 255, 255));
        lb_burrow_books.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_burrow_books.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/public_access/library/burrow_books.png"))); // NOI18N
        lb_burrow_books.setText("Burrow Books");
        lb_burrow_books.setToolTipText("");
        lb_burrow_books.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        lb_burrow_books.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_burrow_books.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lb_burrow_books.setMaximumSize(new java.awt.Dimension(100, 126));
        lb_burrow_books.setMinimumSize(new java.awt.Dimension(100, 126));
        lb_burrow_books.setPreferredSize(new java.awt.Dimension(100, 126));
        lb_burrow_books.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lb_burrow_books.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_burrow_booksMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_burrow_booksMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_burrow_booksMouseExited(evt);
            }
        });

        lb_return_books.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_return_books.setForeground(new java.awt.Color(255, 255, 255));
        lb_return_books.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/public_access/library/Book_Returs.png"))); // NOI18N
        lb_return_books.setText("Return Books");
        lb_return_books.setToolTipText("");
        lb_return_books.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        lb_return_books.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_return_books.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lb_return_books.setMaximumSize(new java.awt.Dimension(100, 126));
        lb_return_books.setMinimumSize(new java.awt.Dimension(100, 126));
        lb_return_books.setPreferredSize(new java.awt.Dimension(100, 126));
        lb_return_books.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lb_return_books.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_return_booksMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_return_booksMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_return_booksMouseExited(evt);
            }
        });

        lb_manage_books.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_manage_books.setForeground(new java.awt.Color(255, 255, 255));
        lb_manage_books.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/public_access/library/Books.png"))); // NOI18N
        lb_manage_books.setText("Add Books");
        lb_manage_books.setToolTipText("");
        lb_manage_books.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        lb_manage_books.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_manage_books.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lb_manage_books.setMaximumSize(new java.awt.Dimension(100, 126));
        lb_manage_books.setMinimumSize(new java.awt.Dimension(100, 126));
        lb_manage_books.setPreferredSize(new java.awt.Dimension(100, 126));
        lb_manage_books.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lb_manage_books.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_manage_booksMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_manage_booksMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_manage_booksMouseExited(evt);
            }
        });

        lb_members.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_members.setForeground(new java.awt.Color(255, 255, 255));
        lb_members.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/public_access/library/Members.png"))); // NOI18N
        lb_members.setText("Members");
        lb_members.setToolTipText("");
        lb_members.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        lb_members.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_members.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lb_members.setMaximumSize(new java.awt.Dimension(100, 126));
        lb_members.setMinimumSize(new java.awt.Dimension(100, 126));
        lb_members.setPreferredSize(new java.awt.Dimension(100, 126));
        lb_members.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lb_members.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_membersMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_membersMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_membersMouseExited(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));
        jPanel4.setPreferredSize(new java.awt.Dimension(100, 50));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Books");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1281, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(0, 153, 153));
        jPanel5.setPreferredSize(new java.awt.Dimension(100, 50));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Member");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/public_access/library/edit_books.png"))); // NOI18N
        jLabel3.setText("Edit Books");
        jLabel3.setToolTipText("");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel3.setMaximumSize(new java.awt.Dimension(100, 126));
        jLabel3.setMinimumSize(new java.awt.Dimension(100, 126));
        jLabel3.setPreferredSize(new java.awt.Dimension(100, 126));
        jLabel3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/public_access/library/search_books.png"))); // NOI18N
        jLabel4.setText("Search Books");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel4.setMaximumSize(new java.awt.Dimension(100, 126));
        jLabel4.setMinimumSize(new java.awt.Dimension(100, 126));
        jLabel4.setPreferredSize(new java.awt.Dimension(100, 126));
        jLabel4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/public_access/library/active_member.png"))); // NOI18N
        jLabel5.setText("Active Members");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel5.setMaximumSize(new java.awt.Dimension(100, 126));
        jLabel5.setMinimumSize(new java.awt.Dimension(100, 126));
        jLabel5.setPreferredSize(new java.awt.Dimension(100, 126));
        jLabel5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/public_access/library/student.png"))); // NOI18N
        jLabel6.setText("Students");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel6.setMaximumSize(new java.awt.Dimension(100, 126));
        jLabel6.setMinimumSize(new java.awt.Dimension(100, 126));
        jLabel6.setPreferredSize(new java.awt.Dimension(100, 126));
        jLabel6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jPanel6.setBackground(new java.awt.Color(0, 153, 153));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Finance");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/public_access/library/payment.png"))); // NOI18N
        jLabel8.setText("Payments");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel8.setMaximumSize(new java.awt.Dimension(100, 126));
        jLabel8.setMinimumSize(new java.awt.Dimension(100, 126));
        jLabel8.setPreferredSize(new java.awt.Dimension(100, 126));
        jLabel8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 1370, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lb_burrow_books, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(100, 100, 100)
                                .addComponent(lb_return_books, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(100, 100, 100)
                                .addComponent(lb_manage_books, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(100, 100, 100)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(100, 100, 100)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lb_members, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(100, 100, 100)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(100, 100, 100)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_return_books, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_burrow_books, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_manage_books, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_members, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 1370, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 1370, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lb_burrow_booksMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_burrow_booksMouseEntered

        lb_burrow_books.setBorder(borderE);
        
    }//GEN-LAST:event_lb_burrow_booksMouseEntered

    private void lb_burrow_booksMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_burrow_booksMouseExited

        lb_burrow_books.setBorder(borderC);
        
    }//GEN-LAST:event_lb_burrow_booksMouseExited

    private void lb_burrow_booksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_burrow_booksMouseClicked

        
        
    }//GEN-LAST:event_lb_burrow_booksMouseClicked

    private void lb_return_booksMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_return_booksMouseEntered
       
        lb_return_books.setBorder(borderE);
        
    }//GEN-LAST:event_lb_return_booksMouseEntered

    private void lb_return_booksMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_return_booksMouseExited

        lb_return_books.setBorder(borderC);
        
    }//GEN-LAST:event_lb_return_booksMouseExited

    private void lb_return_booksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_return_booksMouseClicked
       
        
        
    }//GEN-LAST:event_lb_return_booksMouseClicked

    private void lb_manage_booksMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_manage_booksMouseEntered

        lb_manage_books.setBorder(borderE);
        
    }//GEN-LAST:event_lb_manage_booksMouseEntered

    private void lb_manage_booksMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_manage_booksMouseExited

        lb_manage_books.setBorder(borderC);
        
    }//GEN-LAST:event_lb_manage_booksMouseExited

    private void lb_manage_booksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_manage_booksMouseClicked

        
        
    }//GEN-LAST:event_lb_manage_booksMouseClicked

    private void lb_membersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_membersMouseEntered

        lb_members.setBorder(borderE);
        
    }//GEN-LAST:event_lb_membersMouseEntered

    private void lb_membersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_membersMouseExited

        lb_members.setBorder(borderC);
        
    }//GEN-LAST:event_lb_membersMouseExited

    private void lb_membersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_membersMouseClicked

        
        
    }//GEN-LAST:event_lb_membersMouseClicked
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
            java.util.logging.Logger.getLogger(jf_library_main_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jf_library_main_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jf_library_main_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jf_library_main_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jf_library_main_view().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lb_burrow_books;
    private javax.swing.JLabel lb_manage_books;
    private javax.swing.JLabel lb_members;
    private javax.swing.JLabel lb_return_books;
    // End of variables declaration//GEN-END:variables
}
