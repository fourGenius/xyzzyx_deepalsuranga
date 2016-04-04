/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fourgenius.www.public_access.library;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import public_access.MC_JavaDataBaseConnection;

/**
 *
 * @author dinet
 */
public class jp_search_books extends javax.swing.JPanel {

    /**
     * Creates new form jp_search_books
     */
    public jp_search_books() {
        initComponents();
        fillAllDetailsToTable();
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
        jc_search = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        tf_search = new javax.swing.JTextField();

        setBackground(new java.awt.Color(2, 119, 189));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Search Keyword");

        jc_search.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jc_search.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Search by ID", "Search by Title", "Search by Author", "Search by ISBN", "Search by Category" }));
        jc_search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jc_search.setPreferredSize(new java.awt.Dimension(56, 35));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/public_access/user/login/images/search_icon.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fourgenius/www/public_access/user/login/images_butons/buton_blue_100x50.png"))); // NOI18N
        jButton1.setText("View All");
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setMaximumSize(new java.awt.Dimension(100, 50));
        jButton1.setMinimumSize(new java.awt.Dimension(100, 50));
        jButton1.setPreferredSize(new java.awt.Dimension(100, 50));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book ID", "Title", "Author", "Category", "ISBN", "Shelf No", "Date Added", "Availability"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        tf_search.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_search.setPreferredSize(new java.awt.Dimension(6, 35));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tf_search, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(jc_search, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 606, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jc_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        
         // TODO add your handling code here:
        try {
           
            //assign jtable to a DefaultTableModel
            DefaultTableModel tb = (DefaultTableModel) jTable1.getModel();
            //zero rows
            tb.setRowCount(0);
            System.out.println("llllllllll");
            String type = (String) jc_search.getSelectedItem();
            String key = tf_search.getText();
            //Check if a category is selected and a keyword is entered
            if (type.equals("Select") || key.equals("")) {
                JOptionPane.showMessageDialog(this, "Please enter a keyword and select a Search by technique!!!", "", JOptionPane.WARNING_MESSAGE);
            }
            else if (type.equals("Search by ID")) {
                //validate if the keyword entered is a book ID
                if (!(key.charAt(0) == 'B')) {
                    JOptionPane.showMessageDialog(this, "Please enter a valid Book ID!!!", "", JOptionPane.WARNING_MESSAGE);
                } else {
                    ResultSet rs = MC_JavaDataBaseConnection.myConnection().createStatement().executeQuery("SELECT * FROM lib_book WHERE BID='" + key + "'");
                    //view all the records for the keywords in the table
                    if (rs.next()) {

                        Vector v = new Vector();

                        v.add(rs.getString("BID"));
                        v.add(rs.getString("title"));
                        v.add(rs.getString("author"));
                        v.add(rs.getString("Category"));
                        v.add(rs.getString("ISBN"));
                        v.add(rs.getString("shelf"));
                        v.add(rs.getDate("Date"));
                        v.add(rs.getString("Availability"));

                        tb.addRow(v);
                    } else {
                        JOptionPane.showMessageDialog(this, "No such Book ID!!!", "", JOptionPane.ERROR_MESSAGE);
                    }
                }
            } else if (type.equals("Search by Title")) {

                ResultSet rs = MC_JavaDataBaseConnection.myConnection().createStatement().executeQuery("SELECT * FROM lib_book WHERE title='" + key + "'");
                //view all the records for the keywords in the table
                while (rs.next()) {
                    Vector v = new Vector();

                    v.add(rs.getString("BID"));
                    v.add(rs.getString("title"));
                    v.add(rs.getString("author"));
                    v.add(rs.getString("Category"));
                    v.add(rs.getString("ISBN"));
                    v.add(rs.getString("shelf"));
                    v.add(rs.getDate("Date"));
                    v.add(rs.getString("Availability"));

                    tb.addRow(v);
                }
            } else if (type.equals("Search by Author")) {

                ResultSet rs = MC_JavaDataBaseConnection.myConnection().createStatement().executeQuery("SELECT * FROM lib_book WHERE author='" + key + "'");
                //view all the records for the keywords in the table
                while (rs.next()) {
                    Vector v = new Vector();

                    v.add(rs.getString("BID"));
                    v.add(rs.getString("title"));
                    v.add(rs.getString("author"));
                    v.add(rs.getString("Category"));
                    v.add(rs.getString("ISBN"));
                    v.add(rs.getString("shelf"));
                    v.add(rs.getDate("Date"));
                    v.add(rs.getString("Availability"));

                    tb.addRow(v);
                }
            } else if (type.equals("Search by ISBN")) {

                ResultSet rs = MC_JavaDataBaseConnection.myConnection().createStatement().executeQuery("SELECT * FROM lib_book WHERE ISBN='" + key + "'");
                //view all the records for the keywords in the table
                while (rs.next()) {
                    Vector v = new Vector();

                    v.add(rs.getString("BID"));
                    v.add(rs.getString("title"));
                    v.add(rs.getString("author"));
                    v.add(rs.getString("Category"));
                    v.add(rs.getString("ISBN"));
                    v.add(rs.getString("shelf"));
                    v.add(rs.getDate("Date"));
                    v.add(rs.getString("Availability"));

                    tb.addRow(v);
                }
            } else if (type.equals("Search by Category")) {

                ResultSet rs = MC_JavaDataBaseConnection.myConnection().createStatement().executeQuery("SELECT * FROM lib_book WHERE Category='" + key + "'");
                //view all the records for the keywords in the table
                while (rs.next()) {
                    Vector v = new Vector();

                    v.add(rs.getString("BID"));
                    v.add(rs.getString("title"));
                    v.add(rs.getString("author"));
                    v.add(rs.getString("Category"));
                    v.add(rs.getString("ISBN"));
                    v.add(rs.getString("shelf"));
                    v.add(rs.getDate("Date"));
                    v.add(rs.getString("Availability"));

                    tb.addRow(v);
                }
            }
            MC_JavaDataBaseConnection.myConnection().close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Database Error", "", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        fillAllDetailsToTable();
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox jc_search;
    private javax.swing.JTextField tf_search;
    // End of variables declaration//GEN-END:variables

    private void fillAllDetailsToTable() {
        
                // TODO add your handling code here:
        try {
           
            //assign jtable to a DefaultTableModel
            DefaultTableModel tb = (DefaultTableModel) jTable1.getModel();
            //zero rows in table
            tb.setRowCount(0);
            ResultSet rs = MC_JavaDataBaseConnection.myConnection().createStatement().executeQuery("SELECT * FROM lib_book");
            //view all the records in book table
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("BID"));
                v.add(rs.getString("title"));
                v.add(rs.getString("author"));
                v.add(rs.getString("Category"));
                v.add(rs.getString("ISBN"));
                v.add(rs.getString("shelf"));
                v.add(rs.getDate("Date"));
                v.add(rs.getString("Availability"));

                tb.addRow(v);
            }
            MC_JavaDataBaseConnection.myConnection().close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Database Error!!", "", JOptionPane.ERROR_MESSAGE);
        }
        
    }
}
