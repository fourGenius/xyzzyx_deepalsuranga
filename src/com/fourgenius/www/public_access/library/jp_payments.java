/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fourgenius.www.public_access.library;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import public_access.MC_JavaDataBaseConnection;

/**
 *
 * @author dinet
 */
public class jp_payments extends javax.swing.JPanel {

    /**
     * Creates new form jp_payments
     */
    int monthValue;
    int year;
       
    public float amount=1000;
    public jp_payments() {
        initComponents();
        try {
      
               ResultSet rs= MC_JavaDataBaseConnection.myConnection().createStatement().executeQuery("select * from lib_membership_fee");
           
            if (rs.next()) {
                System.out.println("awaaaaaa");
                amount=rs.getFloat("fee");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        lb_member_ship_fee.setText("Rs."+amount+"/=");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        swingCellAppearanceDescriptor1 = new datechooser.beans.editor.descriptor.SwingCellAppearanceDescriptor();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lb_member_ship_fee = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        payment_table = new javax.swing.JTable();
        mc_member_ship_payment = new com.toedter.calendar.JMonthChooser();
        jLabel4 = new javax.swing.JLabel();
        bt_member_payment_view = new javax.swing.JButton();
        yc_member_ship_payment = new com.toedter.calendar.JYearChooser();

        setBackground(new java.awt.Color(2, 119, 189));
        setMaximumSize(new java.awt.Dimension(1366, 701));
        setMinimumSize(new java.awt.Dimension(1366, 701));
        setPreferredSize(new java.awt.Dimension(1366, 701));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Member ID");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 286, -1, -1));

        jTextField1.setMaximumSize(new java.awt.Dimension(35, 250));
        jTextField1.setMinimumSize(new java.awt.Dimension(35, 250));
        jTextField1.setPreferredSize(new java.awt.Dimension(35, 250));
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 279, 250, 35));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Membership Fee");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 332, -1, -1));

        lb_member_ship_fee.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_member_ship_fee.setForeground(new java.awt.Color(255, 255, 255));
        lb_member_ship_fee.setText("Rs.1000/=");
        add(lb_member_ship_fee, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 332, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/public_access/user/login/images_butons/buton_blue_100x50.png"))); // NOI18N
        jButton1.setText("Pay");
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setMaximumSize(new java.awt.Dimension(50, 100));
        jButton1.setMinimumSize(new java.awt.Dimension(50, 100));
        jButton1.setPreferredSize(new java.awt.Dimension(50, 100));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 100, 50));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Membership Payments", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setOpaque(false);

        payment_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Invoice ID", "Member ID", "Date", "Fee"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(payment_table);

        mc_member_ship_payment.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                mc_member_ship_paymentPropertyChange(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Select Month");

        bt_member_payment_view.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bt_member_payment_view.setForeground(new java.awt.Color(255, 255, 255));
        bt_member_payment_view.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/public_access/user/login/images_butons/buton_blue_100x50.png"))); // NOI18N
        bt_member_payment_view.setText("View");
        bt_member_payment_view.setContentAreaFilled(false);
        bt_member_payment_view.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_member_payment_view.setFocusPainted(false);
        bt_member_payment_view.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_member_payment_view.setMaximumSize(new java.awt.Dimension(100, 50));
        bt_member_payment_view.setMinimumSize(new java.awt.Dimension(100, 50));
        bt_member_payment_view.setPreferredSize(new java.awt.Dimension(100, 50));
        bt_member_payment_view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_member_payment_viewActionPerformed(evt);
            }
        });

        yc_member_ship_payment.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                yc_member_ship_paymentPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 865, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(mc_member_ship_payment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(yc_member_ship_payment, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(bt_member_payment_view, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(mc_member_ship_payment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(yc_member_ship_payment, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(bt_member_payment_view, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(451, 11, -1, 679));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

                // TODO add your handling code here:
        //get present date
        Date date = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        //get present year
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int year = cal.get(Calendar.YEAR);
        String tyear = "" + year;
        String memid = jTextField1.getText();
        //assign the fee to amount variable
        
        try {
            //check if the field is empty
            if (memid.equals("")) {
                JOptionPane.showMessageDialog(this, "Please fill in the Member ID", "", JOptionPane.WARNING_MESSAGE);
            } 
            else {
                
              
                //check if the current member has already paid the membership for this year
                String query2 = "SELECT YEAR(date) FROM lib_membership WHERE MID='" + memid + "' AND YEAR(date)='" + tyear + "'";
                ResultSet rs1 = MC_JavaDataBaseConnection.myConnection().createStatement().executeQuery(query2);
                if (rs1.next()) {
                    JOptionPane.showMessageDialog(this, "Already paid membership payment", "Error!!", JOptionPane.ERROR_MESSAGE);
                } 
                //if not paid
                else {
                    //auto-increment primary id
                    int invoice = 0;
                    String query = "SELECT LastID FROM lib_generateid WHERE raw='SID'";
                    ResultSet rs = MC_JavaDataBaseConnection.myConnection().createStatement().executeQuery(query);
                    while (rs.next()) {
                        invoice = Integer.parseInt(rs.getString("LastID"));
                    }
                    //record the payment details in the membership table
                    String query1 = "INSERT INTO lib_membership VALUES('S" + invoice + "','" + memid + "','" + df.format(date) + "','" + amount + "')";
                    MC_JavaDataBaseConnection.myConnection().createStatement() .executeUpdate(query1);
                    JOptionPane.showMessageDialog(this, "Payment was successful; Invoice = S" + invoice);
                    //auto-increment primary id
                    invoice = invoice + 1;
                    String qry = "UPDATE lib_generateid SET LastID='" + invoice + "' WHERE raw='SID'";
                    MC_JavaDataBaseConnection.myConnection().createStatement().executeUpdate(qry);
                }
                 MC_JavaDataBaseConnection.myConnection().createStatement().close();
                 
                 new Thread(() -> {
                     loadTable();
                }).start();
             
            }
        }
       
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, "" + e.getMessage() + " Error,  Recheck inputs!!", "Error", JOptionPane.ERROR_MESSAGE);

        }

        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void mc_member_ship_paymentPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_mc_member_ship_paymentPropertyChange

        
        int month = mc_member_ship_payment.getMonth();

       switch (month) {
            case 0:
                monthValue = 1;
                
                break;
            case 1:
                monthValue = 2;
                
                break;
            case 2:
                monthValue = 3;
                 
                break;
            case 3:
                monthValue = 4;
                
                break;
            case 4:
                monthValue = 5;
                
                break;
            case 5:
                monthValue = 6;
                 
                break;
            case 6:
                monthValue = 7;
                
                break;
            case 7:
                monthValue = 8;
                
                break;
            case 8:
                monthValue = 9;
                
                break;
            case 9:
                monthValue = 10;
                 
                break;
            case 10:
                monthValue = 11;
               
                break;
            case 11:
                monthValue = 12;
                 
                break;

        }
        
    }//GEN-LAST:event_mc_member_ship_paymentPropertyChange

    private void yc_member_ship_paymentPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_yc_member_ship_paymentPropertyChange

          year = yc_member_ship_payment.getYear();
        
    }//GEN-LAST:event_yc_member_ship_paymentPropertyChange

    private void bt_member_payment_viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_member_payment_viewActionPerformed

        loadTable();
        
    }//GEN-LAST:event_bt_member_payment_viewActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_member_payment_view;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lb_member_ship_fee;
    private com.toedter.calendar.JMonthChooser mc_member_ship_payment;
    private javax.swing.JTable payment_table;
    private datechooser.beans.editor.descriptor.SwingCellAppearanceDescriptor swingCellAppearanceDescriptor1;
    private com.toedter.calendar.JYearChooser yc_member_ship_payment;
    // End of variables declaration//GEN-END:variables

    private void loadTable() {
        
        String date1, date2;
         if (monthValue < 10) {
            date1 = year + "-0" + monthValue + "-01";
            date2 = year + "-0" + monthValue + "-31";

        } else {

            date1 = year + "-" + monthValue + "-01";
            date2 = year + "-" + monthValue + "-31";
        }
         
                 // TODO add your handling code here:
        try {
          
            //assign jtable to a DefaultTableModel
            DefaultTableModel tb = (DefaultTableModel) payment_table.getModel();
            //zero rows in table
            tb.setRowCount(0);
            ResultSet rs = MC_JavaDataBaseConnection.myConnection().createStatement().executeQuery("SELECT * FROM lib_membership WHERE date BETWEEN date '"+date1+"' AND '"+date2+"'");
            //view all the records in membership table
            while (rs.next()) {
                Vector v = new Vector();

                v.add(rs.getString("SID"));
                v.add(rs.getString("MID"));
                v.add(rs.getString("date"));
                v.add(rs.getFloat("amount"));


                tb.addRow(v);

            }
            MC_JavaDataBaseConnection.myConnection().createStatement().close();
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Table View Error!!!" + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        
    }
}
