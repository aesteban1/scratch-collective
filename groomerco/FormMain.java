/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package groomerco;

import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import Utils.CompanyData;
import java.awt.Toolkit;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JInternalFrame;

/**
 *
 * @author caniz
 */
public class FormMain extends javax.swing.JFrame {

    /**
     * Creates new form FormMain
     */
    
    NewAppointment NewAppointment = new NewAppointment();
    Login Login = new Login();
    ManageStaff ManageStaff = new ManageStaff();
    ManageAppointments ManageAppointments = new ManageAppointments();
    AddStaff AddStaff = new AddStaff();
    public Map<String, JInternalFrame> Forms = new HashMap<>();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    public FormMain(){
        initComponents();
        Forms.put("Login", Login);
        Forms.put("NewAppointment", NewAppointment);
        Forms.put("ManageAppointments", ManageAppointments);
        Forms.put("ManageStaff", ManageStaff);
        Forms.put("AddStaff", AddStaff);
        Forms.values().forEach((frm)->{jdpContainer.add(frm);});
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpContainer = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuFile = new javax.swing.JMenu();
        mniLogin = new javax.swing.JMenuItem();
        mniClose = new javax.swing.JMenuItem();
        mniLogout = new javax.swing.JMenuItem();
        mnuManage = new javax.swing.JMenu();
        mniStaff = new javax.swing.JMenuItem();
        mniAppointments = new javax.swing.JMenuItem();
        mnuAppointment = new javax.swing.JMenu();
        mniNewAppointment = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jdpContainerLayout = new javax.swing.GroupLayout(jdpContainer);
        jdpContainer.setLayout(jdpContainerLayout);
        jdpContainerLayout.setHorizontalGroup(
            jdpContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jdpContainerLayout.setVerticalGroup(
            jdpContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        getContentPane().add(jdpContainer, java.awt.BorderLayout.CENTER);

        mnuFile.setText("File");

        mniLogin.setText("Login");
        mniLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniLoginActionPerformed(evt);
            }
        });
        mnuFile.add(mniLogin);

        mniClose.setText("Close");
        mniClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniCloseActionPerformed(evt);
            }
        });
        mnuFile.add(mniClose);

        mniLogout.setText("Logout");
        mniLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniLogoutActionPerformed(evt);
            }
        });
        mnuFile.add(mniLogout);

        jMenuBar1.add(mnuFile);

        mnuManage.setText("Manage");

        mniStaff.setText("Staff");
        mniStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniStaffActionPerformed(evt);
            }
        });
        mnuManage.add(mniStaff);

        mniAppointments.setText("Appointments");
        mniAppointments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAppointmentsActionPerformed(evt);
            }
        });
        mnuManage.add(mniAppointments);

        jMenuBar1.add(mnuManage);

        mnuAppointment.setText("Appointment");

        mniNewAppointment.setText("New Appointment");
        mniNewAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniNewAppointmentActionPerformed(evt);
            }
        });
        mnuAppointment.add(mniNewAppointment);

        jMenuBar1.add(mnuAppointment);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniLoginActionPerformed
        showForm("Login", false);
    }//GEN-LAST:event_mniLoginActionPerformed

    private void mniAppointmentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAppointmentsActionPerformed

        showForm("ManageAppointments");
    }//GEN-LAST:event_mniAppointmentsActionPerformed

    private void mniNewAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniNewAppointmentActionPerformed
        showForm("NewAppointment");
    }//GEN-LAST:event_mniNewAppointmentActionPerformed

    private void mniStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniStaffActionPerformed
        showForm("ManageStaff");
    }//GEN-LAST:event_mniStaffActionPerformed

    private void mniCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniCloseActionPerformed
        System.exit(0);    }//GEN-LAST:event_mniCloseActionPerformed

    private void mniLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniLogoutActionPerformed
        CompanyData.stf = null;
        //Close all forms
        for (Map.Entry<String, JInternalFrame> entry : Forms.entrySet()) {
            JInternalFrame value = entry.getValue();
            value.dispose();
        }
    }//GEN-LAST:event_mniLogoutActionPerformed

    /**
     * @param args the command line arguments
     */
    
     
        
        
        public void showForm(String formName){
        showForm(formName, false);
        };
        
        private void showForm (String formName, boolean checkLogin){
        if(checkLogin && CompanyData.stf == null){
            showForm("FormLogin",false);
        }else{        
            try {
                if(Forms.get(formName).isClosed()){
                    Forms.put(formName, Forms.get(formName).getClass().newInstance());
                    jdpContainer.add(Forms.get(formName));       
                }
                Forms.get(formName).show();
                Forms.get(formName).setSelected(true);
            } catch (PropertyVetoException ex) {
                ex.printStackTrace();
            } catch (InstantiationException ex) {
                Logger.getLogger(FormMain.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(FormMain.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
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
            java.util.logging.Logger.getLogger(FormMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run(){
                FormMain formMain = new FormMain();
                formMain.setSize(Toolkit.getDefaultToolkit().getScreenSize());
                formMain.setVisible(true);
            }
        });
        }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JDesktopPane jdpContainer;
    private javax.swing.JMenuItem mniAppointments;
    private javax.swing.JMenuItem mniClose;
    private javax.swing.JMenuItem mniLogin;
    private javax.swing.JMenuItem mniLogout;
    private javax.swing.JMenuItem mniNewAppointment;
    private javax.swing.JMenuItem mniStaff;
    private javax.swing.JMenu mnuAppointment;
    private javax.swing.JMenu mnuFile;
    private javax.swing.JMenu mnuManage;
    // End of variables declaration//GEN-END:variables

}