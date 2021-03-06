/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg.app;


import java.io.*;
import java.sql.*;
import javax.swing.*;

public class Main_Frame extends javax.swing.JFrame {

    public static Connection con = null;
    public Main_Frame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        connect_btn = new javax.swing.JButton();
        insert_btn = new javax.swing.JButton();
        delete_btn = new javax.swing.JButton();
        update_btn = new javax.swing.JButton();
        report_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alumni Main Page");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg/app/GJU_Logo.png"))); // NOI18N

        connect_btn.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        connect_btn.setText("Connect to Database");
        connect_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connect_btnActionPerformed(evt);
            }
        });

        insert_btn.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        insert_btn.setText("Insert Record");
        insert_btn.setEnabled(false);
        insert_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insert_btnActionPerformed(evt);
            }
        });

        delete_btn.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        delete_btn.setText("Delete Record");
        delete_btn.setEnabled(false);
        delete_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_btnActionPerformed(evt);
            }
        });

        update_btn.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        update_btn.setText("Update Record");
        update_btn.setEnabled(false);
        update_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_btnActionPerformed(evt);
            }
        });

        report_btn.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        report_btn.setText("Show Report");
        report_btn.setEnabled(false);
        report_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                report_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(insert_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(report_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(connect_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                    .addComponent(delete_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(update_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addComponent(connect_btn)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delete_btn)
                    .addComponent(update_btn)
                    .addComponent(insert_btn))
                .addGap(18, 18, 18)
                .addComponent(report_btn)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void connect_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connect_btnActionPerformed
   
        try{
            File f = Login_Frame.filename;
            //System.out.println(f.getAbsolutePath());
            //Class.forName(f.getAbsolutePath());
            con = DriverManager.getConnection("jdbc:ucanaccess://"+f.getAbsoluteFile());
            
            JOptionPane.showMessageDialog(null, "Successfully Connected to the Database!!! ", "Database Connection", JOptionPane.INFORMATION_MESSAGE);
            
            insert_btn.setEnabled(true);
            delete_btn.setEnabled(true);
            update_btn.setEnabled(true);
            report_btn.setEnabled(true);
            connect_btn.setEnabled(false);
            
        }
        catch (Exception ex) {
          JOptionPane.showMessageDialog(null, "Could not connect to database !!","Error",JOptionPane.ERROR_MESSAGE);
          ex.printStackTrace();
        }  
        
    }//GEN-LAST:event_connect_btnActionPerformed

    private void insert_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insert_btnActionPerformed
       
        Insert_Frame insertFrame = new Insert_Frame();
        insertFrame.show();
    }//GEN-LAST:event_insert_btnActionPerformed

    private void delete_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_btnActionPerformed
        Delete_Frame deleteFrame = new Delete_Frame();
        deleteFrame.show();
    }//GEN-LAST:event_delete_btnActionPerformed

    private void update_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_btnActionPerformed
        Update_Frame updateFrame = new Update_Frame();
        updateFrame.show();
    }//GEN-LAST:event_update_btnActionPerformed

    private void report_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_report_btnActionPerformed
        Report_Frame.c = 1;
        Report_Frame reportFrame = new Report_Frame();
        reportFrame.show();
    }//GEN-LAST:event_report_btnActionPerformed

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
            java.util.logging.Logger.getLogger(Main_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton connect_btn;
    private javax.swing.JButton delete_btn;
    private javax.swing.JButton insert_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton report_btn;
    private javax.swing.JButton update_btn;
    // End of variables declaration//GEN-END:variables
}
