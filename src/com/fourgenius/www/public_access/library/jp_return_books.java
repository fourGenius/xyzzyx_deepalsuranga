/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fourgenius.www.public_access.library;

import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import public_access.MC_JavaDataBaseConnection;

/**
 *
 * @author Dineth Jayasekera
 */
public class jp_return_books extends javax.swing.JPanel {

    /**
     * Creates new form jp_return_books
     */
    public jp_return_books() {
        initComponents();
         load_Table();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_show_borrowed_books = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jb_return = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(2, 119, 189));
        setMaximumSize(new java.awt.Dimension(1113, 701));
        setMinimumSize(new java.awt.Dimension(1113, 701));
        setPreferredSize(new java.awt.Dimension(1113, 701));

        jPanel2.setBackground(new java.awt.Color(2, 119, 189));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Borrowed Books", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setMaximumSize(new java.awt.Dimension(671, 500));
        jPanel2.setMinimumSize(new java.awt.Dimension(671, 500));
        jPanel2.setPreferredSize(new java.awt.Dimension(671, 500));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jt_show_borrowed_books.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Member ID", "Boock ID", "Borrowed Date", "Due Date"
            }
        ));
        jt_show_borrowed_books.setMaximumSize(new java.awt.Dimension(488, 0));
        jt_show_borrowed_books.setMinimumSize(new java.awt.Dimension(488, 0));
        jt_show_borrowed_books.setPreferredSize(new java.awt.Dimension(500, 0));
        jScrollPane1.setViewportView(jt_show_borrowed_books);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 19, 710, 660));

        jPanel1.setBackground(new java.awt.Color(2, 119, 189));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Return Books", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setMaximumSize(new java.awt.Dimension(525, 572));
        jPanel1.setMinimumSize(new java.awt.Dimension(525, 572));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Member ID");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Boock ID");

        jb_return.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jb_return.setForeground(new java.awt.Color(255, 255, 255));
        jb_return.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/public_access/user/login/images_butons/buton_blue_100x50.png"))); // NOI18N
        jb_return.setText("Return");
        jb_return.setContentAreaFilled(false);
        jb_return.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb_return.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jb_return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_returnActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/public_access/library/images/bookReturn.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(jb_return, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(28, 28, 28)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(129, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addComponent(jb_return)
                .addGap(81, 81, 81)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 732, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jb_returnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_returnActionPerformed

        
        // TODO add your handling code here:
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal = new GregorianCalendar();
        Date date1,date2;
        //assign date with the current date in foramt yy-mm-dd
        DateFormat df= new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal1= Calendar.getInstance();
        String date= df.format(cal1.getTime());
        //assign the member id and book id to a string array
        String info[]= new String[2];
        info[0]= jTextField1.getText();
        info[1]=jTextField2.getText();
        //check if the fields are empty
        if(info[0].equals("") && info[1].equals("")){
                JOptionPane.showMessageDialog(this, "Please enter data!!!");
            }
        else{
            try{
                
                //check if there is a record in borrowed table for corresponding Book id and memner id
                ResultSet rs= MC_JavaDataBaseConnection.myConnection().createStatement().executeQuery("SELECT * FROM lib_borrowed WHERE MID='"+info[0]+"' AND BID='"+info[1]+"'");
                if(rs.next()){
                    //assign current date to date1 and the due date of the book to date 2
                    date1=sdf.parse(sdf.format(cal.getTime()));
                    date2=sdf.parse(rs.getString("dueDate"));
                    //get the difference of the two times
                    long diff=((date1.getTime() - date2.getTime())/(1000 * 60 * 60 * 24));
                    //if there is a positive difference the book is overdue
                    if(diff>0){
                        float amount=diff*5;
                        //auto-increment primary key
                        int payid=0;
                        String query1="SELECT LastID FROM lib_generateid WHERE raw='PID'";
                        ResultSet rs1 = MC_JavaDataBaseConnection.myConnection().createStatement().executeQuery(query1);
                        while(rs1.next()) {
                            payid = Integer.parseInt(rs1.getString("LastID"));
                        }
                        //add a record to the payment with fine and label it as not paid
                        MC_JavaDataBaseConnection.myConnection().createStatement().executeUpdate("INSERT INTO lib_payment VALUES('P"+payid+"', '"+info[0]+"', '"+date+"', '"+amount+"', 'Not_Paid')");
                        //auto-increment primary key
                        payid=payid+1;
                        String query2="UPDATE lib_generateid SET LastID='"+payid+"' WHERE raw='PID'";
                        MC_JavaDataBaseConnection.myConnection().createStatement().executeUpdate(query2);
                        //pass the member id and book id to the Fine pay GUI's main method as an array
                        Fine_pay.main(info);               
                    }
                    else{
                        //if book is nt overdue update the book as available in book table
                        String query3="UPDATE lib_book SET Availability='Available' WHERE BID='"+info[1]+"'";
                        MC_JavaDataBaseConnection.myConnection().createStatement().executeUpdate(query3);
                        //delete record from borrowed table
                        String query4="DELETE FROM lib_borrowed WHERE MID='"+info[0]+"' AND BID='"+info[1]+"'";
                        MC_JavaDataBaseConnection.myConnection().createStatement().executeUpdate(query4);
                        JOptionPane.showMessageDialog(this,"Book Returned!!!");
                    }
                }
                else{
                    
                    JOptionPane.showMessageDialog(this,"Entry Unavailable!!!", "Error", JOptionPane.ERROR_MESSAGE);
                }
               MC_JavaDataBaseConnection.myConnection().close();
            }
            catch(Exception e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(this,"Book Return Failed!!!"+e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            }
        }
       load_Table();
        
    }//GEN-LAST:event_jb_returnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton jb_return;
    private javax.swing.JTable jt_show_borrowed_books;
    // End of variables declaration//GEN-END:variables

    private void load_Table() {
        
         // TODO add your handling code here:
        try{
            //assign jtable to a DefaultTableModel
            DefaultTableModel tb = (DefaultTableModel) jt_show_borrowed_books.getModel();
            //zero rows in table
            tb.setRowCount(0);
            ResultSet rs= MC_JavaDataBaseConnection.myConnection().createStatement().executeQuery("select * from lib_borrowed");
            //view all the records in book table
            while(rs.next()){
                Vector v=new Vector();
                
                v.add(rs.getString("MID"));
                v.add(rs.getString("BID"));
                v.add(rs.getString("borrowedDate"));
                v.add(rs.getString("dueDate"));
                

                tb.addRow(v);
                
            }
            MC_JavaDataBaseConnection.myConnection().close();
        }
        catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(this,"Table View Error!!!"+e.getMessage() ,"Error",JOptionPane.ERROR_MESSAGE);
        
    }
        
    }
}
