/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fourgenius.www.public_access.registration.student;

import com.fourgenius.www.user_FrontEnd.Jf_UserMain;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
import public_access.MC_JavaDataBaseConnection;

/**
 *
 * @author Shadow®
 */
public class Jp_registration_student extends javax.swing.JPanel {

    Border border = BorderFactory.createLineBorder(Color.white, 1);
    String path, newpath;
    boolean b;
    Jp_registration_student_c_layout table = new Jp_registration_student_c_layout();
    DefaultTableModel dtm = (DefaultTableModel) table._tb_registration_student_view_active.getModel();

    /**
     * Creates new form registration_student
     */
    public Jp_registration_student() {

        initComponents();
        load_table_stu_view();
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception ex) {
        }
        update_stu.setVisible(false);
        remove_stu.setVisible(false);
        print_stu.setVisible(false);
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
        add_stu = new javax.swing.JButton();
        update_stu = new javax.swing.JButton();
        remove_stu = new javax.swing.JButton();
        print_stu = new javax.swing.JButton();
        preview_stu = new javax.swing.JButton();
        Jp_registraion_stu_main_panel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(66, 66, 66));
        setForeground(new java.awt.Color(66, 66, 66));
        setMinimumSize(new java.awt.Dimension(1360, 718));
        setPreferredSize(new java.awt.Dimension(1360, 718));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        add_stu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add_stu.setForeground(new java.awt.Color(255, 255, 255));
        add_stu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/public_access/user/login/images_butons/buton_blue_200x50.png"))); // NOI18N
        add_stu.setText("Add Student");
        add_stu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add_stu.setFocusPainted(false);
        add_stu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add_stu.setPreferredSize(new java.awt.Dimension(300, 50));
        add_stu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_stuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                add_stuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                add_stuMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                add_stuMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                add_stuMouseReleased(evt);
            }
        });
        add_stu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_stuActionPerformed(evt);
            }
        });

        update_stu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        update_stu.setForeground(new java.awt.Color(255, 255, 255));
        update_stu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/public_access/user/login/images_butons/buton_blue_200x50.png"))); // NOI18N
        update_stu.setText("Update Student");
        update_stu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        update_stu.setFocusPainted(false);
        update_stu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        update_stu.setPreferredSize(new java.awt.Dimension(200, 50));
        update_stu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                update_stuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                update_stuMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                update_stuMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                update_stuMouseReleased(evt);
            }
        });
        update_stu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_stuActionPerformed(evt);
            }
        });

        remove_stu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        remove_stu.setForeground(new java.awt.Color(255, 255, 255));
        remove_stu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/public_access/user/login/images_butons/buton_blue_200x50.png"))); // NOI18N
        remove_stu.setText("Remove Student");
        remove_stu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        remove_stu.setFocusPainted(false);
        remove_stu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        remove_stu.setPreferredSize(new java.awt.Dimension(300, 50));
        remove_stu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                remove_stuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                remove_stuMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                remove_stuMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                remove_stuMouseReleased(evt);
            }
        });
        remove_stu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remove_stuActionPerformed(evt);
            }
        });

        print_stu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        print_stu.setForeground(new java.awt.Color(255, 255, 255));
        print_stu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/public_access/user/login/images_butons/button_blue_300x50.png"))); // NOI18N
        print_stu.setText("Print Report");
        print_stu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        print_stu.setFocusPainted(false);
        print_stu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        print_stu.setPreferredSize(new java.awt.Dimension(300, 50));
        print_stu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                print_stuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                print_stuMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                print_stuMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                print_stuMouseReleased(evt);
            }
        });
        print_stu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                print_stuActionPerformed(evt);
            }
        });

        preview_stu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        preview_stu.setForeground(new java.awt.Color(255, 255, 255));
        preview_stu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/public_access/user/login/images_butons/buton_blue_200x50.png"))); // NOI18N
        preview_stu.setText("Preview Student");
        preview_stu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        preview_stu.setFocusPainted(false);
        preview_stu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        preview_stu.setPreferredSize(new java.awt.Dimension(300, 50));
        preview_stu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                preview_stuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                preview_stuMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                preview_stuMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                preview_stuMouseReleased(evt);
            }
        });
        preview_stu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preview_stuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(preview_stu, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(add_stu, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(update_stu, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(remove_stu, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 166, Short.MAX_VALUE)
                .addComponent(print_stu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add_stu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update_stu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(remove_stu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(print_stu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(preview_stu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 638, 1340, -1));

        Jp_registraion_stu_main_panel.setBackground(new java.awt.Color(66, 66, 66));
        Jp_registraion_stu_main_panel.setLayout(new java.awt.CardLayout());
        add(Jp_registraion_stu_main_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1366, 630));
    }// </editor-fold>//GEN-END:initComponents
    int i = 0;

    private void add_stuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_stuMouseEntered
        add_stu.setBorder(border);
    }//GEN-LAST:event_add_stuMouseEntered

    private void add_stuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_stuMouseExited
        add_stu.setBorder(null);
    }//GEN-LAST:event_add_stuMouseExited

    private void add_stuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_stuMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_add_stuMousePressed

    private void add_stuMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_stuMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_add_stuMouseReleased

    private void add_stuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_stuActionPerformed
        String button_name = add_stu.getText();
        if (button_name.equals("Add Student")) {
            load_stu_information_form();
            buttons_enable(add_stu.getText());
            add_stu.setText("Finish");
        } else {
            int option = JOptionPane.showConfirmDialog(this, "Are You Sure?", "Confirm?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (option == JOptionPane.YES_OPTION) {
                load_table_stu_view();
                add_stu.setText("Add Student");
                preview_stu.setEnabled(true);
                update_stu.setEnabled(true);
                remove_stu.setEnabled(true);
            }

        }


    }//GEN-LAST:event_add_stuActionPerformed

    private void update_stuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update_stuMouseEntered
        update_stu.setBorder(border);
    }//GEN-LAST:event_update_stuMouseEntered

    private void update_stuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update_stuMouseExited
        update_stu.setBorder(null);
    }//GEN-LAST:event_update_stuMouseExited

    private void update_stuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update_stuMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_update_stuMousePressed

    private void update_stuMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update_stuMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_update_stuMouseReleased

    private void update_stuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_stuActionPerformed

        buttons_enable(update_stu.getText());
    }//GEN-LAST:event_update_stuActionPerformed

    private void remove_stuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_remove_stuMouseEntered

        remove_stu.setBorder(border);

    }//GEN-LAST:event_remove_stuMouseEntered

    private void remove_stuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_remove_stuMouseExited

        remove_stu.setBorder(null);

    }//GEN-LAST:event_remove_stuMouseExited

    private void remove_stuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_remove_stuMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_remove_stuMousePressed

    private void remove_stuMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_remove_stuMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_remove_stuMouseReleased

    private void remove_stuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remove_stuActionPerformed
        buttons_enable(remove_stu.getText());
    }//GEN-LAST:event_remove_stuActionPerformed

    private void print_stuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_print_stuMouseEntered
        print_stu.setBorder(border);
    }//GEN-LAST:event_print_stuMouseEntered

    private void print_stuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_print_stuMouseExited
        print_stu.setBorder(null);
    }//GEN-LAST:event_print_stuMouseExited

    private void print_stuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_print_stuMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_print_stuMousePressed

    private void print_stuMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_print_stuMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_print_stuMouseReleased

    private void print_stuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_print_stuActionPerformed
        printReport();
    }//GEN-LAST:event_print_stuActionPerformed

    private void preview_stuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_preview_stuMouseEntered
        preview_stu.setBorder(border);
    }//GEN-LAST:event_preview_stuMouseEntered

    private void preview_stuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_preview_stuMouseExited
        preview_stu.setBorder(null);
    }//GEN-LAST:event_preview_stuMouseExited

    private void preview_stuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_preview_stuMousePressed
        preview_stu.setBorder(null);
    }//GEN-LAST:event_preview_stuMousePressed

    private void preview_stuMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_preview_stuMouseReleased
        preview_stu.setBorder(border);
    }//GEN-LAST:event_preview_stuMouseReleased

    private void preview_stuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preview_stuActionPerformed
        load_table_stu_view();

        buttons_enable(preview_stu.getText());
    }//GEN-LAST:event_preview_stuActionPerformed

    private void add_stuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_stuMouseClicked


    }//GEN-LAST:event_add_stuMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Jp_registraion_stu_main_panel;
    private javax.swing.JButton add_stu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton preview_stu;
    private javax.swing.JButton print_stu;
    private javax.swing.JButton remove_stu;
    private javax.swing.JButton update_stu;
    // End of variables declaration//GEN-END:variables

    public void printReport() {

        try {
            String report_path = "‪src\\reports\\student_reg.jrxml";
            InputStream in = new FileInputStream(new File(report_path));
            System.out.println("oooo");
            Jp_registration_student_informations info = new Jp_registration_student_informations();
            JasperReport compileReport = JasperCompileManager.compileReport(report_path);
            System.out.println("ok1");
            Map<String, Object> m = new HashMap<String, Object>();
            System.out.println("ok2");
            m.put("course", info._lb_registration_student_preview_course.getText());
            m.put("name", info._lb_registration_student_preview_name.getText());
            m.put("address", info._lb_registration_student_preview_lane1.getText());
            m.put("telePhone", info._lb_registration_student_preview_homeNumber.getText());
            m.put("mobilePhone", info._lb_registration_student_preview_mobileNumber.getText());
            m.put("email", info._lb_registration_student_preview_eMail.getText());
            m.put("dob", info._lb_registration_student_preview_dateOfBirth.getText());

            m.put("nic", info._lb_registration_student_preview_nic.getText());
            m.put("sid", info._lb_registration_student_preview_studentID.getText());
            m.put("pic", info.newpath);
            System.out.println("ok3");
            JasperPrint jp = JasperFillManager.fillReport(compileReport, m);
            System.out.println("ok4");
            JasperViewer.viewReport(jp, false);
            System.out.println("ok5");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void load_table_stu_view() {
        Jp_registration_student_c_layout cl = new Jp_registration_student_c_layout();

        if (cl == null) {
            cl = new Jp_registration_student_c_layout();
            Jp_registraion_stu_main_panel.removeAll();
            Jp_registraion_stu_main_panel.repaint();
            Jp_registraion_stu_main_panel.revalidate();
            Jp_registraion_stu_main_panel.add(cl);
            Jp_registraion_stu_main_panel.repaint();
            Jp_registraion_stu_main_panel.revalidate();
        } else {
            Jp_registraion_stu_main_panel.removeAll();
            Jp_registraion_stu_main_panel.repaint();
            Jp_registraion_stu_main_panel.revalidate();
            Jp_registraion_stu_main_panel.add(cl);
            Jp_registraion_stu_main_panel.repaint();
            Jp_registraion_stu_main_panel.revalidate();
        }
    }

    private void buttons_enable(String button_name) {
        if (button_name.equals(preview_stu.getText())) {
            preview_stu.setEnabled(true);
            add_stu.setEnabled(true);
            remove_stu.setEnabled(true);
            update_stu.setEnabled(true);
        } else if (button_name.equals(add_stu.getText())) {
            add_stu.setEnabled(true);
            remove_stu.setEnabled(false);
            update_stu.setEnabled(false);
            preview_stu.setEnabled(false);
        } else if (button_name.equals(update_stu.getText())) {
            update_stu.setEnabled(true);
            preview_stu.setEnabled(false);
            remove_stu.setEnabled(false);
            add_stu.setEnabled(false);
        } else {
            remove_stu.setEnabled(true);
            add_stu.setEnabled(true);
            preview_stu.setEnabled(true);
            update_stu.setEnabled(true);
        }
    }

    private void load_stu_information_form() {
        Jp_registration_student_informations reg_student = new Jp_registration_student_informations();
        if (add_stu == null) {
            reg_student = new Jp_registration_student_informations();
            Jp_registraion_stu_main_panel.removeAll();
            Jp_registraion_stu_main_panel.repaint();
            Jp_registraion_stu_main_panel.revalidate();
            Jp_registraion_stu_main_panel.add(reg_student);
            Jp_registraion_stu_main_panel.repaint();
            Jp_registraion_stu_main_panel.revalidate();
        } else {
            Jp_registraion_stu_main_panel.removeAll();
            Jp_registraion_stu_main_panel.repaint();
            Jp_registraion_stu_main_panel.revalidate();
            Jp_registraion_stu_main_panel.add(reg_student);
            Jp_registraion_stu_main_panel.repaint();
            Jp_registraion_stu_main_panel.revalidate();
        }
    }
}
