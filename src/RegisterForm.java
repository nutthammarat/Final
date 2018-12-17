
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Choppy
 */
public class RegisterForm extends javax.swing.JFrame {

    /**
     * Creates new form RegisterForm
     */
    public RegisterForm() {
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

        txt_Username = new javax.swing.JTextField();
        btn_Register = new javax.swing.JButton();
        btn_Cancel = new javax.swing.JButton();
        txt_Confirmpassword = new javax.swing.JPasswordField();
        txt_Password = new javax.swing.JPasswordField();
        lbl_icon = new javax.swing.JLabel();
        lbl_username = new javax.swing.JLabel();
        lbl_password = new javax.swing.JLabel();
        lbl_conpass = new javax.swing.JLabel();
        bgRegister = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(null);

        txt_Username.setBackground(new java.awt.Color(255, 204, 204));
        txt_Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_UsernameActionPerformed(evt);
            }
        });
        getContentPane().add(txt_Username);
        txt_Username.setBounds(270, 120, 360, 56);

        btn_Register.setBackground(new java.awt.Color(102, 102, 255));
        btn_Register.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_Register.setForeground(new java.awt.Color(255, 255, 255));
        btn_Register.setText("สมัครสมาชิก");
        btn_Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegisterActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Register);
        btn_Register.setBounds(290, 370, 146, 54);

        btn_Cancel.setBackground(new java.awt.Color(255, 0, 0));
        btn_Cancel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_Cancel.setForeground(new java.awt.Color(255, 255, 255));
        btn_Cancel.setText("ยกเลิก");
        btn_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Cancel);
        btn_Cancel.setBounds(470, 370, 147, 50);

        txt_Confirmpassword.setBackground(new java.awt.Color(255, 204, 204));
        getContentPane().add(txt_Confirmpassword);
        txt_Confirmpassword.setBounds(270, 270, 360, 60);

        txt_Password.setBackground(new java.awt.Color(255, 204, 204));
        txt_Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_PasswordActionPerformed(evt);
            }
        });
        getContentPane().add(txt_Password);
        txt_Password.setBounds(270, 190, 360, 60);

        lbl_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/iconregister.png"))); // NOI18N
        getContentPane().add(lbl_icon);
        lbl_icon.setBounds(400, 30, 70, 70);

        lbl_username.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbl_username.setText("ชื่อผู้ใช้ :");
        getContentPane().add(lbl_username);
        lbl_username.setBounds(160, 110, 100, 60);

        lbl_password.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbl_password.setText("รหัสผ่าน :");
        getContentPane().add(lbl_password);
        lbl_password.setBounds(150, 190, 110, 60);

        lbl_conpass.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbl_conpass.setText("ยืนยันรหัสผ่าน :");
        getContentPane().add(lbl_conpass);
        lbl_conpass.setBounds(90, 280, 170, 47);

        bgRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/bgRegister.jpg"))); // NOI18N
        getContentPane().add(bgRegister);
        bgRegister.setBounds(0, 0, 790, 600);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_UsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_UsernameActionPerformed

    private void btn_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelActionPerformed
       goToLogin();
        setVisible(false);
    }//GEN-LAST:event_btn_CancelActionPerformed

    private void btn_RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegisterActionPerformed
        addDataUser();
        setVisible(false);
    }//GEN-LAST:event_btn_RegisterActionPerformed

    public void addDataUser() {
        if(RegisterService.addDataUser(txt_Username.getText(),txt_Password.getText(),txt_Confirmpassword.getText())){
            JOptionPane.showMessageDialog(null,"สมัครสมาชิกเรียบร้อย","Register message",JOptionPane.PLAIN_MESSAGE);
             goToLogin();
        }else{
            JOptionPane.showMessageDialog(null,"กรุณากรอก username , password ,passwordcomfirm ให้ถูกต้อง และpassกรอกห้ามน้อยกว่า5ตัว ","แจ้งเตือน",0);
            new RegisterForm().setVisible(true);
           
            
        
        }
    }

    private void txt_PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_PasswordActionPerformed
    public static void goToLogin(){
        LoginForm login = new LoginForm();
        login.setVisible(true);
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgRegister;
    private javax.swing.JButton btn_Cancel;
    private javax.swing.JButton btn_Register;
    private javax.swing.JLabel lbl_conpass;
    private javax.swing.JLabel lbl_icon;
    private javax.swing.JLabel lbl_password;
    private javax.swing.JLabel lbl_username;
    private javax.swing.JPasswordField txt_Confirmpassword;
    private javax.swing.JPasswordField txt_Password;
    private javax.swing.JTextField txt_Username;
    // End of variables declaration//GEN-END:variables
}