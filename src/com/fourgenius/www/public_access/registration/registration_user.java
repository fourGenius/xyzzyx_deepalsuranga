/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fourgenius.www.public_access.registration;

/**
 *
 * @author Dineth Jayasekera
 */
public class registration_user extends javax.swing.JPanel {

    /*
     * Creates new form registration_user
     */
    public registration_user() {
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

        _pl_registration_user_personal = new javax.swing.JPanel();
        _pl_registration_user_personal_name = new javax.swing.JPanel();
        _lb_registration_user_personal_name_firstName = new javax.swing.JLabel();
        _lb_registration_user_personal_name_sirName = new javax.swing.JLabel();
        _tf_registration_user_personal_name_sirName = new javax.swing.JTextField();
        _tf_registration_user_personal_name_firstName = new javax.swing.JTextField();
        _lb_registration_user_personal_name_secondName = new javax.swing.JLabel();
        _tf_registration_user_personal_name_secondName = new javax.swing.JTextField();
        _lb_registration_user_personal_name_lastName = new javax.swing.JLabel();
        _tf_registration_user_personal_name_lastName = new javax.swing.JTextField();
        _pl_registration_user_personal_contact = new javax.swing.JPanel();
        _lb_registration_user_personal_contact_mobile = new javax.swing.JLabel();
        _tf_registration_user_personal_contact_mobile = new javax.swing.JTextField();
        _lb_registration_user_personal_contact_land = new javax.swing.JLabel();
        _tf_registration_user_personal_contact_land = new javax.swing.JTextField();
        _lb_registration_user_personal_contact_email = new javax.swing.JLabel();
        _tf_registration_user_personal_contact_email = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(21, 21, 21));
        setMinimumSize(new java.awt.Dimension(1366, 718));
        setPreferredSize(new java.awt.Dimension(1366, 718));

        _pl_registration_user_personal.setBackground(new java.awt.Color(52, 152, 219));
        _pl_registration_user_personal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Personal", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        _pl_registration_user_personal_name.setBackground(new java.awt.Color(52, 152, 219));
        _pl_registration_user_personal_name.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        _lb_registration_user_personal_name_firstName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _lb_registration_user_personal_name_firstName.setForeground(new java.awt.Color(255, 255, 255));
        _lb_registration_user_personal_name_firstName.setText("First Name");

        _lb_registration_user_personal_name_sirName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _lb_registration_user_personal_name_sirName.setForeground(new java.awt.Color(255, 255, 255));
        _lb_registration_user_personal_name_sirName.setText("Sir Name");

        _tf_registration_user_personal_name_sirName.setPreferredSize(new java.awt.Dimension(6, 40));

        _tf_registration_user_personal_name_firstName.setPreferredSize(new java.awt.Dimension(6, 40));

        _lb_registration_user_personal_name_secondName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _lb_registration_user_personal_name_secondName.setForeground(new java.awt.Color(255, 255, 255));
        _lb_registration_user_personal_name_secondName.setText("Second Name");

        _tf_registration_user_personal_name_secondName.setPreferredSize(new java.awt.Dimension(6, 40));

        _lb_registration_user_personal_name_lastName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _lb_registration_user_personal_name_lastName.setForeground(new java.awt.Color(255, 255, 255));
        _lb_registration_user_personal_name_lastName.setText("Last Name");

        _tf_registration_user_personal_name_lastName.setPreferredSize(new java.awt.Dimension(6, 40));

        javax.swing.GroupLayout _pl_registration_user_personal_nameLayout = new javax.swing.GroupLayout(_pl_registration_user_personal_name);
        _pl_registration_user_personal_name.setLayout(_pl_registration_user_personal_nameLayout);
        _pl_registration_user_personal_nameLayout.setHorizontalGroup(
            _pl_registration_user_personal_nameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(_pl_registration_user_personal_nameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(_pl_registration_user_personal_nameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(_tf_registration_user_personal_name_sirName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(_pl_registration_user_personal_nameLayout.createSequentialGroup()
                        .addGroup(_pl_registration_user_personal_nameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(_lb_registration_user_personal_name_sirName)
                            .addComponent(_lb_registration_user_personal_name_firstName)
                            .addComponent(_lb_registration_user_personal_name_secondName)
                            .addComponent(_lb_registration_user_personal_name_lastName))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(_tf_registration_user_personal_name_firstName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(_tf_registration_user_personal_name_secondName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(_tf_registration_user_personal_name_lastName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        _pl_registration_user_personal_nameLayout.setVerticalGroup(
            _pl_registration_user_personal_nameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(_pl_registration_user_personal_nameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(_lb_registration_user_personal_name_sirName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_tf_registration_user_personal_name_sirName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_lb_registration_user_personal_name_firstName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_tf_registration_user_personal_name_firstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_lb_registration_user_personal_name_secondName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_tf_registration_user_personal_name_secondName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_lb_registration_user_personal_name_lastName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_tf_registration_user_personal_name_lastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        _pl_registration_user_personal_contact.setBackground(new java.awt.Color(52, 152, 219));
        _pl_registration_user_personal_contact.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contact", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        _lb_registration_user_personal_contact_mobile.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _lb_registration_user_personal_contact_mobile.setForeground(new java.awt.Color(255, 255, 255));
        _lb_registration_user_personal_contact_mobile.setText("Mobile");

        _tf_registration_user_personal_contact_mobile.setPreferredSize(new java.awt.Dimension(6, 40));

        _lb_registration_user_personal_contact_land.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _lb_registration_user_personal_contact_land.setForeground(new java.awt.Color(255, 255, 255));
        _lb_registration_user_personal_contact_land.setText("Land");

        _tf_registration_user_personal_contact_land.setPreferredSize(new java.awt.Dimension(6, 40));

        _lb_registration_user_personal_contact_email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _lb_registration_user_personal_contact_email.setForeground(new java.awt.Color(255, 255, 255));
        _lb_registration_user_personal_contact_email.setText("E-mail");

        _tf_registration_user_personal_contact_email.setPreferredSize(new java.awt.Dimension(6, 40));

        javax.swing.GroupLayout _pl_registration_user_personal_contactLayout = new javax.swing.GroupLayout(_pl_registration_user_personal_contact);
        _pl_registration_user_personal_contact.setLayout(_pl_registration_user_personal_contactLayout);
        _pl_registration_user_personal_contactLayout.setHorizontalGroup(
            _pl_registration_user_personal_contactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(_pl_registration_user_personal_contactLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(_pl_registration_user_personal_contactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(_tf_registration_user_personal_contact_mobile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(_tf_registration_user_personal_contact_land, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(_pl_registration_user_personal_contactLayout.createSequentialGroup()
                        .addGroup(_pl_registration_user_personal_contactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(_lb_registration_user_personal_contact_mobile)
                            .addComponent(_lb_registration_user_personal_contact_land)
                            .addComponent(_lb_registration_user_personal_contact_email))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(_tf_registration_user_personal_contact_email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        _pl_registration_user_personal_contactLayout.setVerticalGroup(
            _pl_registration_user_personal_contactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(_pl_registration_user_personal_contactLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(_lb_registration_user_personal_contact_mobile)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_tf_registration_user_personal_contact_mobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_lb_registration_user_personal_contact_land)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_tf_registration_user_personal_contact_land, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_lb_registration_user_personal_contact_email)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_tf_registration_user_personal_contact_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout _pl_registration_user_personalLayout = new javax.swing.GroupLayout(_pl_registration_user_personal);
        _pl_registration_user_personal.setLayout(_pl_registration_user_personalLayout);
        _pl_registration_user_personalLayout.setHorizontalGroup(
            _pl_registration_user_personalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(_pl_registration_user_personalLayout.createSequentialGroup()
                .addGroup(_pl_registration_user_personalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(_pl_registration_user_personal_contact, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(_pl_registration_user_personal_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(287, 287, 287))
        );
        _pl_registration_user_personalLayout.setVerticalGroup(
            _pl_registration_user_personalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(_pl_registration_user_personalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(_pl_registration_user_personal_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_pl_registration_user_personal_contact, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(136, 136, 136))
        );

        jPanel1.setBackground(new java.awt.Color(117, 117, 117));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Preview", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(255, 255, 255)))); // NOI18N
        jPanel1.setMinimumSize(new java.awt.Dimension(525, 685));
        jPanel1.setPreferredSize(new java.awt.Dimension(525, 685));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 513, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 659, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(_pl_registration_user_personal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(405, 405, 405)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(_pl_registration_user_personal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel _lb_registration_user_personal_contact_email;
    private javax.swing.JLabel _lb_registration_user_personal_contact_land;
    private javax.swing.JLabel _lb_registration_user_personal_contact_mobile;
    private javax.swing.JLabel _lb_registration_user_personal_name_firstName;
    private javax.swing.JLabel _lb_registration_user_personal_name_lastName;
    private javax.swing.JLabel _lb_registration_user_personal_name_secondName;
    private javax.swing.JLabel _lb_registration_user_personal_name_sirName;
    private javax.swing.JPanel _pl_registration_user_personal;
    private javax.swing.JPanel _pl_registration_user_personal_contact;
    private javax.swing.JPanel _pl_registration_user_personal_name;
    private javax.swing.JTextField _tf_registration_user_personal_contact_email;
    private javax.swing.JTextField _tf_registration_user_personal_contact_land;
    private javax.swing.JTextField _tf_registration_user_personal_contact_mobile;
    private javax.swing.JTextField _tf_registration_user_personal_name_firstName;
    private javax.swing.JTextField _tf_registration_user_personal_name_lastName;
    private javax.swing.JTextField _tf_registration_user_personal_name_secondName;
    private javax.swing.JTextField _tf_registration_user_personal_name_sirName;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
