/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fourgenius.www.public_access.registration.student;

import com.fourgenius.www.public_access.registration.lecture.*;
import java.awt.Image;
import java.io.File;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
import public_access.MC_JavaDataBaseConnection;
/**
 *
 * @author Dineth Jayasekera
 */
public class Jp_registration_student_privew extends javax.swing.JPanel {

    /*
     * Creates new form Jp_registration_lecture_privew
     */
    public Jp_registration_student_privew() {
        initComponents();
        
        
    }
    String path;
  static  Map<String, Object> m = new HashMap<String, Object>();
    public Jp_registration_student_privew(String id) {
        this();
        loadForm(id);
        m.put("sid", id);
       
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        _lb_dob = new javax.swing.JLabel();
        _lb_branch = new javax.swing.JLabel();
        _lb_address_line = new javax.swing.JLabel();
        _lb_gender = new javax.swing.JLabel();
        _lb_nic = new javax.swing.JLabel();
        _lb_name = new javax.swing.JLabel();
        _lb_id = new javax.swing.JLabel();
        _lb_city = new javax.swing.JLabel();
        _lb_cuntry = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        _lb_mobile = new javax.swing.JLabel();
        _lb_land = new javax.swing.JLabel();
        _lb_email = new javax.swing.JLabel();
        _lb_picture = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(2, 119, 189));
        setForeground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(500, 25));
        setMinimumSize(new java.awt.Dimension(500, 25));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NIC");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Gender");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Date Of Birth");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Branch");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Address");

        _lb_dob.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _lb_dob.setForeground(new java.awt.Color(255, 255, 255));
        _lb_dob.setMaximumSize(new java.awt.Dimension(500, 25));
        _lb_dob.setMinimumSize(new java.awt.Dimension(500, 25));
        _lb_dob.setPreferredSize(new java.awt.Dimension(500, 25));

        _lb_branch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _lb_branch.setForeground(new java.awt.Color(255, 255, 255));
        _lb_branch.setMaximumSize(new java.awt.Dimension(500, 25));
        _lb_branch.setMinimumSize(new java.awt.Dimension(500, 25));
        _lb_branch.setPreferredSize(new java.awt.Dimension(500, 25));

        _lb_address_line.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _lb_address_line.setForeground(new java.awt.Color(255, 255, 255));
        _lb_address_line.setMaximumSize(new java.awt.Dimension(500, 25));
        _lb_address_line.setMinimumSize(new java.awt.Dimension(500, 25));
        _lb_address_line.setPreferredSize(new java.awt.Dimension(500, 25));

        _lb_gender.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _lb_gender.setForeground(new java.awt.Color(255, 255, 255));
        _lb_gender.setMaximumSize(new java.awt.Dimension(500, 25));
        _lb_gender.setMinimumSize(new java.awt.Dimension(500, 25));
        _lb_gender.setPreferredSize(new java.awt.Dimension(500, 25));

        _lb_nic.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _lb_nic.setForeground(new java.awt.Color(255, 255, 255));
        _lb_nic.setMaximumSize(new java.awt.Dimension(500, 25));
        _lb_nic.setMinimumSize(new java.awt.Dimension(500, 25));
        _lb_nic.setPreferredSize(new java.awt.Dimension(500, 25));

        _lb_name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _lb_name.setForeground(new java.awt.Color(255, 255, 255));
        _lb_name.setMaximumSize(new java.awt.Dimension(500, 25));
        _lb_name.setMinimumSize(new java.awt.Dimension(500, 25));
        _lb_name.setPreferredSize(new java.awt.Dimension(500, 25));

        _lb_id.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _lb_id.setForeground(new java.awt.Color(255, 255, 255));
        _lb_id.setMaximumSize(new java.awt.Dimension(500, 17));
        _lb_id.setMinimumSize(new java.awt.Dimension(500, 17));
        _lb_id.setPreferredSize(new java.awt.Dimension(500, 17));

        _lb_city.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _lb_city.setForeground(new java.awt.Color(255, 255, 255));
        _lb_city.setMaximumSize(new java.awt.Dimension(500, 25));
        _lb_city.setMinimumSize(new java.awt.Dimension(500, 25));
        _lb_city.setPreferredSize(new java.awt.Dimension(500, 25));

        _lb_cuntry.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _lb_cuntry.setForeground(new java.awt.Color(255, 255, 255));
        _lb_cuntry.setMaximumSize(new java.awt.Dimension(500, 25));
        _lb_cuntry.setMinimumSize(new java.awt.Dimension(500, 25));
        _lb_cuntry.setPreferredSize(new java.awt.Dimension(500, 25));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Mobile Number");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Land Number");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("E-mail");

        _lb_mobile.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _lb_mobile.setForeground(new java.awt.Color(255, 255, 255));
        _lb_mobile.setMaximumSize(new java.awt.Dimension(500, 25));
        _lb_mobile.setMinimumSize(new java.awt.Dimension(500, 25));
        _lb_mobile.setPreferredSize(new java.awt.Dimension(500, 25));

        _lb_land.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _lb_land.setForeground(new java.awt.Color(255, 255, 255));
        _lb_land.setMaximumSize(new java.awt.Dimension(500, 25));
        _lb_land.setMinimumSize(new java.awt.Dimension(500, 25));
        _lb_land.setPreferredSize(new java.awt.Dimension(500, 25));

        _lb_email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _lb_email.setForeground(new java.awt.Color(255, 255, 255));
        _lb_email.setMaximumSize(new java.awt.Dimension(500, 25));
        _lb_email.setMinimumSize(new java.awt.Dimension(500, 25));
        _lb_email.setPreferredSize(new java.awt.Dimension(500, 25));

        _lb_picture.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        _lb_picture.setMaximumSize(new java.awt.Dimension(178, 150));
        _lb_picture.setMinimumSize(new java.awt.Dimension(178, 150));
        _lb_picture.setPreferredSize(new java.awt.Dimension(178, 150));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/public_access/user/login/images_butons/buton_blue_250x50.png"))); // NOI18N
        jButton1.setText("Print Report");
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(_lb_picture, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(_lb_email, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(_lb_land, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_lb_mobile, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(_lb_dob, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(_lb_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(_lb_nic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(_lb_gender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(_lb_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(_lb_branch, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(_lb_address_line, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(_lb_city, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(_lb_cuntry, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(735, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(_lb_picture, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(_lb_id, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(_lb_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(_lb_nic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(_lb_gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(_lb_dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(_lb_branch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(_lb_address_line, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(_lb_city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(_lb_cuntry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(_lb_mobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(_lb_land, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(_lb_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         try {

            String is = "src/reports/student_reg.jrxml";
            JasperReport jr = JasperCompileManager.compileReport(is);
            Jp_registration_student_informations info = new Jp_registration_student_informations();

            System.out.println("ok2");
           m.put("pic", path);

            JasperPrint jp1 = JasperFillManager.fillReport(jr, m, MC_JavaDataBaseConnection.myConnection());
            JasperViewer.viewReport(jp1, false);
            JasperPrintManager.printReport(jp1, false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel _lb_address_line;
    private javax.swing.JLabel _lb_branch;
    private javax.swing.JLabel _lb_city;
    private javax.swing.JLabel _lb_cuntry;
    private javax.swing.JLabel _lb_dob;
    private javax.swing.JLabel _lb_email;
    private javax.swing.JLabel _lb_gender;
    private javax.swing.JLabel _lb_id;
    private javax.swing.JLabel _lb_land;
    private javax.swing.JLabel _lb_mobile;
    private javax.swing.JLabel _lb_name;
    private javax.swing.JLabel _lb_nic;
    private javax.swing.JLabel _lb_picture;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables

    private void loadForm(String id) {
        _lb_id.setText(id);
        loadname(id);
        loadpersonal(id);
        loadContact(id);
        loadAddress(id);
    }

    private void loadname(String id) {
        try {
            ResultSet rs=MC_JavaDataBaseConnection.myConnection().createStatement().executeQuery("select * from stu_info_name where stu_user_info_id='"+id+"'");
            if (rs.next()) {
                _lb_name.setText(rs.getString("stu_info_name_first_name")+" "+rs.getString("stu_info_name_last_name")+" "+rs.getString("stu_info_name_sirName"));
            }
        rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void loadpersonal(String id) {
        try {
            ResultSet rs=MC_JavaDataBaseConnection.myConnection().createStatement().executeQuery("select * from stu_info_personal where stu_user_info_id='"+id+"'");
            if (rs.next()) {
                _lb_nic.setText(rs.getString("stu_info_personal_nic"));
                _lb_dob.setText(rs.getString("stu_info_personal_dob"));
                _lb_branch.setText(rs.getString("stu_info_personal_branch"));
                _lb_gender.setText(rs.getString("stu_info_personal_gender"));
                path=rs.getString("stu_info_personal_profile_image"); 
                File f = new File(path);
                    Image img = ImageIO.read(f);
                    img = img.getScaledInstance(_lb_picture.getWidth(), _lb_picture.getHeight(), Image.SCALE_SMOOTH);
                    _lb_picture.setIcon(new ImageIcon(img));
            }
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void loadContact(String id) {
        try {
             ResultSet rs=MC_JavaDataBaseConnection.myConnection().createStatement().executeQuery("select * from stu_info_contact where stu_user_info_id='"+id+"'");
            if (rs.next()) {
                _lb_mobile.setText(rs.getString("stu_info_telephone_mobile"));
                _lb_land.setText(rs.getString("stu_info_telephone_land"));
                _lb_email.setText(rs.getString("stu_info_contact_email"));
            }
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void loadAddress(String id) {
         try {
             ResultSet rs=MC_JavaDataBaseConnection.myConnection().createStatement().executeQuery("select * from stu_info_address where stu_user_info_id='"+id+"'");
            if (rs.next()) {
               _lb_address_line.setText(rs.getString("stu_info_address_lane1"));
               _lb_city.setText(rs.getString("stu_info_address_city"));
               _lb_cuntry.setText(rs.getString("stu_info_address_cuntry"));
            }
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}