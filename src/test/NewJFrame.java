/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.awt.Dimension;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.swing.JRViewer;
import net.sf.jasperreports.view.JasperViewer;
import public_access.MC_JavaDataBaseConnection;

/**
 *
 * @author Dineth Jayasekera
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
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

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("jButton1");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(1207, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jButton1)
                .addGap(65, 65, 65)
                .addComponent(jButton2)
                .addContainerGap(501, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

//        try {
//            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
////            String ReportPath_daliyIncome = "src//reports//check_daily_incom_in_courses.jrxml";
//            String ReportPath_daliyIncome = "src//reports//report2.jrxml";
//            JasperReport compileReport = JasperCompileManager.compileReport(ReportPath_daliyIncome);
//
//            JasperPrint jasperPrint = JasperFillManager.fillReport(compileReport, null, MC_JavaDataBaseConnection.myConnection());
////JasperViewer.viewReport(jasperPrint, false);
//            JasperViewer v = new JasperViewer(jasperPrint);
//            JScrollPane jsc = new JScrollPane();
//            jsc.setSize(jPanel1.getSize());
//            jPanel1.add(jsc);
//            jsc.setViewportView(v);
//
////            JFrame jf = new JFrame();
////            jf.getContentPane().add(v);
////            jf.validate();
////            jf.setVisible(true);
////            jf.setSize(new Dimension(800, 600));
////            jf.setLocation(300, 100);
////            jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        } catch (JRException ex) {
//            ex.printStackTrace();
//        }

////////////////////////////////////////////////////////////////////////////////////////
//        //Path to your .jasper file in your package
//        String reportName = "src//reports//report2.jrxml";
//         
//      
// 
//        try {
//     //Fill the report with parameter, connection and the stream reader     
//            JasperPrint jp = JasperFillManager.fillReport(reportName, null, MC_JavaDataBaseConnection.myConnection());
//         
//     //Viewer for JasperReport
//            JRViewer jv = new JRViewer(jp);
//
//            JScrollPane jsc=new JScrollPane();
//            
//            jPanel1.add(jsc);
//            jsc.setViewportView(jv);
//            
////Insert viewer to a JFrame to make it showable
//            JFrame jf = new JFrame();
//            jf.getContentPane().add(jv);
//            jf.validate();
//            jf.setVisible(true);
//            jf.setSize(new Dimension(800,600));
//            jf.setLocation(300,100);
//            jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        } catch (JRException ex) {
//            ex.printStackTrace();
//        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 
//        try {
//            Map parameters = new HashMap();
//            parameters.put("id", 42);
//
//             JasperReport compileReport = JasperCompileManager.compileReport("src//reports//report2.jrxml");
//            JasperReport report = (JasperReport) JRLoader.loadObject("src//reports//report2.jasper");
//
//            JasperPrint jasperPrint = JasperFillManager.fillReport(compileReport, null, MC_JavaDataBaseConnection.myConnection());
//
//     
//            
//           JRViewer v = new JRViewer(jasperPrint);
//            jTabbedPane2.addTab("Date Range", v);
////            this.setVisible(true);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        NewJFrame1 nnn=new NewJFrame1();
        nnn.setVisible(true);
         try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            String ReportPath_daliyIncome = "src//reports//check_daily_incom_in_courses.jrxml";
//String ReportPath_daliyIncome = "src//reports//report2.jrxml";
            JasperReport compileReport = JasperCompileManager.compileReport(ReportPath_daliyIncome);
            Map<String, Object> dailyIncomeMap = new HashMap<String, Object>();

            dailyIncomeMap.put("course", "Diploma in Beauty Therapy");
            dailyIncomeMap.put("date1", "21-01-2016");

            JasperPrint jasperPrint = JasperFillManager.fillReport(compileReport, dailyIncomeMap, MC_JavaDataBaseConnection.myConnection());
//            JasperViewer.viewReport(jasperPrint, false);
//            JasperViewer v = new JasperViewer(jasperPrint);

            JRViewer v = new JRViewer(jasperPrint);
//           reportView.view_reports.addTab(sdf.format(jDateChooser1.getDate())+"Income In"+jc_Check_Daily_Income_In_Course.getSelectedItem().toString(), v);
         nnn.jTabbedPane1.addTab("Date Range", v);
        } catch (JRException ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    // End of variables declaration//GEN-END:variables
}
