
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 59161088
 */
public class ProductDetailForm extends javax.swing.JFrame {

    /**
     * Creates new form ProductDetailFrame
     */
        
    public ProductDetailForm() {
        initComponents();
        pIdtxt.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pic1 = new javax.swing.JLabel();
        btn_back = new javax.swing.JButton();
        nameproduct = new javax.swing.JLabel();
        sizetxt = new javax.swing.JLabel();
        bandtxt = new javax.swing.JLabel();
        colortxt = new javax.swing.JLabel();
        addtocart = new javax.swing.JButton();
        pricetxt = new javax.swing.JLabel();
        plusbtn = new javax.swing.JButton();
        minusbtn = new javax.swing.JButton();
        numtxt = new javax.swing.JTextField();
        lbl_ProDe = new javax.swing.JLabel();
        lbl_brand = new javax.swing.JLabel();
        lbl_color = new javax.swing.JLabel();
        lbl_size = new javax.swing.JLabel();
        lbl_price = new javax.swing.JLabel();
        lbl_namePro = new javax.swing.JLabel();
        lbl_addtocart = new javax.swing.JLabel();
        lbl_icon = new javax.swing.JLabel();
        bgProDe = new javax.swing.JLabel();
        pIdtxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Product Detail");
        setMinimumSize(new java.awt.Dimension(800, 600));
        setSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(null);

        pic1.setMaximumSize(new java.awt.Dimension(90, 90));
        pic1.setMinimumSize(new java.awt.Dimension(90, 90));
        pic1.setPreferredSize(new java.awt.Dimension(90, 90));
        getContentPane().add(pic1);
        pic1.setBounds(90, 190, 90, 90);

        btn_back.setBackground(new java.awt.Color(255, 0, 0));
        btn_back.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_back.setForeground(new java.awt.Color(255, 255, 255));
        btn_back.setText("กลับ");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        getContentPane().add(btn_back);
        btn_back.setBounds(40, 490, 90, 30);

        nameproduct.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nameproduct.setText("...");
        getContentPane().add(nameproduct);
        nameproduct.setBounds(70, 330, 260, 30);

        sizetxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sizetxt.setText("...");
        getContentPane().add(sizetxt);
        sizetxt.setBounds(420, 290, 310, 40);

        bandtxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bandtxt.setText("...");
        getContentPane().add(bandtxt);
        bandtxt.setBounds(420, 140, 310, 40);

        colortxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        colortxt.setText("...");
        getContentPane().add(colortxt);
        colortxt.setBounds(420, 220, 310, 40);

        addtocart.setBackground(new java.awt.Color(153, 0, 255));
        addtocart.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addtocart.setForeground(new java.awt.Color(255, 255, 255));
        addtocart.setText("ใส่ตะกร้า");
        addtocart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addtocartActionPerformed(evt);
            }
        });
        getContentPane().add(addtocart);
        addtocart.setBounds(620, 490, 100, 30);

        pricetxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pricetxt.setText("...");
        getContentPane().add(pricetxt);
        pricetxt.setBounds(420, 370, 310, 40);

        plusbtn.setBackground(new java.awt.Color(153, 0, 255));
        plusbtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        plusbtn.setForeground(new java.awt.Color(255, 255, 255));
        plusbtn.setText("+");
        plusbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusbtnActionPerformed(evt);
            }
        });
        getContentPane().add(plusbtn);
        plusbtn.setBounds(570, 490, 50, 30);

        minusbtn.setBackground(new java.awt.Color(153, 0, 255));
        minusbtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        minusbtn.setForeground(new java.awt.Color(255, 255, 255));
        minusbtn.setText("-");
        minusbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusbtnActionPerformed(evt);
            }
        });
        getContentPane().add(minusbtn);
        minusbtn.setBounds(500, 490, 40, 30);

        numtxt.setBackground(new java.awt.Color(153, 0, 255));
        numtxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        numtxt.setForeground(new java.awt.Color(255, 255, 255));
        numtxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numtxt.setText("1");
        numtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numtxtActionPerformed(evt);
            }
        });
        getContentPane().add(numtxt);
        numtxt.setBounds(540, 490, 30, 30);

        lbl_ProDe.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbl_ProDe.setText("รายละเอียดสินค้า");
        getContentPane().add(lbl_ProDe);
        lbl_ProDe.setBounds(280, 30, 250, 50);

        lbl_brand.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_brand.setText("ยี่ห้อ :");
        getContentPane().add(lbl_brand);
        lbl_brand.setBounds(350, 150, 60, 30);

        lbl_color.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_color.setText("สี :");
        getContentPane().add(lbl_color);
        lbl_color.setBounds(370, 220, 30, 40);

        lbl_size.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_size.setText("ขนาด :");
        getContentPane().add(lbl_size);
        lbl_size.setBounds(340, 290, 60, 30);

        lbl_price.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_price.setText("ราคา :");
        getContentPane().add(lbl_price);
        lbl_price.setBounds(350, 370, 60, 30);

        lbl_namePro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_namePro.setText("ชื่อสินค้า :");
        getContentPane().add(lbl_namePro);
        lbl_namePro.setBounds(90, 290, 90, 30);

        lbl_addtocart.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_addtocart.setText("เพิ่มจำนวนสินค้า :");
        getContentPane().add(lbl_addtocart);
        lbl_addtocart.setBounds(390, 480, 110, 50);

        lbl_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/iconbrand.png"))); // NOI18N
        getContentPane().add(lbl_icon);
        lbl_icon.setBounds(670, -10, 130, 150);

        bgProDe.setBackground(new java.awt.Color(255, 204, 204));
        bgProDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/bgProDe.jpg"))); // NOI18N
        getContentPane().add(bgProDe);
        bgProDe.setBounds(0, 0, 800, 600);

        pIdtxt.setEditable(false);
        pIdtxt.setEnabled(false);
        getContentPane().add(pIdtxt);
        pIdtxt.setBounds(40, 40, 70, 30);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
       dispose();
    }//GEN-LAST:event_btn_backActionPerformed

    private void numtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numtxtActionPerformed

    private void plusbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusbtnActionPerformed
        ProductDetailService.increaseNumofProduct();
    }//GEN-LAST:event_plusbtnActionPerformed

    private void minusbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusbtnActionPerformed
        ProductDetailService.decreaseNumofProduct();
    }//GEN-LAST:event_minusbtnActionPerformed

    private void addtocartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addtocartActionPerformed
        ProductDetailService.addProductToCart();
        showComfirmProductToCart();
//        ProductDetailService.addCartToDB();
        setVisible(false);
        
    }//GEN-LAST:event_addtocartActionPerformed

    public static void showProductDetail() {
        ProductDetailForm productdetail = new ProductDetailForm();
        productdetail.setVisible(true);
    }
    public static void showCartPage(int index) {
        if (index == 0) {
            MainPage.showCartPage();
            CartService.showList();
        }

    }
    public static void showComfirmProductToCart() {
        JOptionPane.showMessageDialog(null, "คุณได้ทำการเพิ่มสินค้าไปยังตะกร้าเรียบร้อยแล้ว");
        int index = JOptionPane.showConfirmDialog(null,
                "คุณต้องการไปยังหน้าตะกร้าสินค้าเลยหรือไม่ ??", "Go to Cart or Not?",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
        showCartPage(index);
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addtocart;
    public static javax.swing.JLabel bandtxt;
    private javax.swing.JLabel bgProDe;
    private javax.swing.JButton btn_back;
    public static javax.swing.JLabel colortxt;
    private javax.swing.JLabel lbl_ProDe;
    private javax.swing.JLabel lbl_addtocart;
    private javax.swing.JLabel lbl_brand;
    private javax.swing.JLabel lbl_color;
    private javax.swing.JLabel lbl_icon;
    private javax.swing.JLabel lbl_namePro;
    private javax.swing.JLabel lbl_price;
    private javax.swing.JLabel lbl_size;
    public static javax.swing.JButton minusbtn;
    public static javax.swing.JLabel nameproduct;
    public static javax.swing.JTextField numtxt;
    public static javax.swing.JTextField pIdtxt;
    public static javax.swing.JLabel pic1;
    public static javax.swing.JButton plusbtn;
    public static javax.swing.JLabel pricetxt;
    public static javax.swing.JLabel sizetxt;
    // End of variables declaration//GEN-END:variables
}
