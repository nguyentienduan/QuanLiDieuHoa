/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlidieuhoa;

/**
 *
 * @author nguye
 */
public class KhoiDong1 extends javax.swing.JFrame {

    /**
     * Creates new form KhoiDong1
     */
    public KhoiDong1() {
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

        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Hello = new javax.swing.JLabel();
        Myprogress = new javax.swing.JProgressBar();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\nguye\\Downloads\\Thiết_kế_chưa_có_tên__1_-removebg-preview.png")); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 340, 250));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\nguye\\Downloads\\startup-removebg-preview.png")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, 80));

        Hello.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        Hello.setForeground(new java.awt.Color(51, 51, 51));
        Hello.setText("%");
        getContentPane().add(Hello, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, -1, -1));

        Myprogress.setBackground(new java.awt.Color(153, 153, 153));
        getContentPane().add(Myprogress, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 580, 23));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\nguye\\Downloads\\pexels-johannes-plenio-1103970.jpg")); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-9, -5, 590, 370));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       KhoiDong1 myKhoiDong = new KhoiDong1();
       myKhoiDong.setVisible(true);
        try {
            for (int i =0;i<=100;i++)
            {
                Thread.sleep(15);
                myKhoiDong.Myprogress.setValue(i);
                myKhoiDong.Hello.setText(Integer.toString(i)+"%");
            }
        } catch (Exception e) {
            
        }
       new DangNhap().setVisible(true);
       myKhoiDong.dispose();
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Hello;
    private javax.swing.JProgressBar Myprogress;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}