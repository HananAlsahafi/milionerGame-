/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wLottery;

import java.awt.Color;
import static java.awt.Color.WHITE;
//import java.awt.Color.Black;
//import java.awt.Color.WHITE;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author user
 */
public class qLottery extends javax.swing.JFrame {
      int callqu;
     public void init (){
     callqu=0;
     
     } 
    
    public qLottery() {
        initComponents();
    }
    int count=0;
    String []imagenames={"p0.jpg"};
    int people=0;
    String[]imagepeop={"helx.jpg"};
    int fif50=0;
    String []imfift50={"50x.jpg"};
    int phone=0;
    String []imphone={"tex.jpg"};
    int correct0=0;
    String []imcorrect0={"p0.jpg"};
    int correct1=0;
    String []imcorrect1={"p1.jpg"};
    int correct2=0;
    String []imcorrect2={"p2.jpg"};
   int correct3=0;
    String []imcorrect3={"p3.jpg"};
    int correct4=0;
    String []imcorrect4={"p4.jpg"};
    int correct5=0;
    String []imcorrect5={"p5.jpg"};
    int correct6=0;
    String []imcorrect6={"p6.jpg"};
    int correct7=0;
    String []imcorrect7={"p7.jpg"};
    int correct8=0;
    String []imcorrect8={"p8.jpg"};
    int correct9=0;
    String []imcorrect9={"p9.jpg"};
    int correct15=0;
    String []imcorrect15={"p15.jpg"};
    
    
    
    
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1019, 900));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wLottery/p0.jpg"))); // NOI18N

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wLottery/unnamed.png"))); // NOI18N
        jButton1.setToolTipText("");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.setBackground(new java.awt.Color(0, 0, 0));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setToolTipText("");
        jTextField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 4, true));

        jTextField2.setBackground(new java.awt.Color(0, 0, 0));
        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 4, true));
        jTextField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField2MouseClicked(evt);
            }
        });
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.setBackground(new java.awt.Color(0, 0, 0));
        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 255), 4, true));
        jTextField3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField3MouseClicked(evt);
            }
        });

        jTextField4.setBackground(new java.awt.Color(0, 0, 0));
        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(255, 255, 255));
        jTextField4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 255), 4, true));
        jTextField4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField4MouseClicked(evt);
            }
        });

        jTextField5.setBackground(new java.awt.Color(0, 0, 0));
        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(255, 255, 255));
        jTextField5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 4, true));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wLottery/50.jpg"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wLottery/te.jpg"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wLottery/hel.jpg"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(117, 117, 117)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(566, 566, 566)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(141, 141, 141)
                        .addComponent(jLabel3)
                        .addGap(132, 132, 132)
                        .addComponent(jLabel2)
                        .addGap(266, 266, 266)))
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 724, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(174, 174, 174))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 1148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(778, 778, 778)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE)
                            .addComponent(jTextField5))))
                .addGap(90, 90, 90))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 914, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(147, 147, 147)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(194, 194, 194))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
         this.getContentPane().setBackground(Color.BLACK);
    }//GEN-LAST:event_formMouseMoved

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
      ImageIcon []imagelist1=new ImageIcon[1];
      for(int i=0;i<imagelist1.length;i++){
      imagelist1[i]=new ImageIcon(getClass().getResource("/wLottery/imeges/" +imagepeop[i]));
      }
      if (people<0)people=1;
      if(people>=0 && people<imagepeop.length){
      jLabel4.setIcon(imagelist1[people]);
      people++;
      
      }
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
     ImageIcon []imagelist1=new ImageIcon[1];
       
      for(int i=0;i<imagelist1.length;i++){
      imagelist1[i]=new ImageIcon(getClass().getResource("/wLottery/imeges/" +imfift50[i]));
      }
      if (fif50<0)fif50=1;
      if(fif50>=0 && fif50<imfift50.length){
      jLabel2.setIcon(imagelist1[fif50]);
      fif50++;
      
      }
      if (callqu==1 && jLabel2.isFocusable() ||callqu==2 && jLabel2.isFocusable() ){
       jTextField4.setForeground(Color.BLACK);
       jTextField5.setForeground(Color.BLACK);
      
      }
      
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
      
         ImageIcon []imagelist1=new ImageIcon[1];
       
      for(int i=0;i<imagelist1.length;i++){
      imagelist1[i]=new ImageIcon(getClass().getResource("/wLottery/imeges/" +imphone[i]));
      }
      if (phone<0)phone=1;
      if(phone>=0 && phone<imphone.length){
      jLabel3.setIcon(imagelist1[phone]);
      phone++;
      
      }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        jTextField1.setText("\t\t\t\t\t\t من سيربح المليون \t\t\t\t\t\t");
        jTextField2.setText("                   ");
        jTextField3.setText("                   ");
        jTextField4.setText("                   ");
        jTextField5.setText("                   ");
    }//GEN-LAST:event_formWindowActivated

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        callqu = callqu + 1;
         jTextField1.setForeground(WHITE);
         jTextField2.setForeground(WHITE);
         jTextField3.setForeground(WHITE);
         jTextField4.setForeground(WHITE);
         jTextField5.setForeground(WHITE); 
          jTextField1.setBackground(Color.BLACK);
         jTextField2.setBackground(Color.BLACK);
         jTextField3.setBackground(Color.BLACK);
         jTextField4.setBackground(Color.BLACK);
         jTextField5.setBackground(Color.BLACK);
         
        
        if (callqu == 1) {
            jTextField1.setText("\t\t\t\t\t ماهي أصغر دوله عربيه مساحه ؟ \t\t\t\t\t");
            jTextField2.setText("A) البحرين");
            jTextField3.setText("B) قطر");
            jTextField4.setText("C) الكويت");
            jTextField5.setText("D) جميع ما سبق");

        }
        if (callqu == 2) {
            jTextField1.setText("\t\t\t\t\t ماهي أكبر دوله عربيه مساحه ؟\t\t\t\t\t");
            jTextField2.setText("A) المملكة العربية السعودية");
            jTextField3.setText("B) السودان");
            jTextField4.setText("C) الكويت");
            jTextField5.setText("D) جميع ما سبق");

        }
        if (callqu == 3) {
            jTextField1.setText("\t أكثر سورة ورد فيها أسم مريم هي سورة؟ \t\t\t\t\t");
            jTextField2.setText("A) مريم");
            jTextField3.setText("B) ال عمران");
            jTextField4.setText("C) المائدة");
            jTextField5.setText("D) القصص");

        }
        if (callqu == 4) {
             
            jTextField1.setText("البترول أهم سلعه فما هي السلعه الثانيه من حيث الاهميه ؟");
            jTextField3.setText("A) الذرة");
            jTextField2.setText("B) البن");
            jTextField4.setText("C)القمح");
            jTextField5.setText("D) الارز");

        }
        if (callqu == 5) {
            jTextField1.setText("\t\t\t\t\t  كم عين للنحلة؟ \t\t\t\t\t");
            jTextField2.setText("A) 2");
            jTextField3.setText("B) 3");
            jTextField4.setText("C) 5) ");
            jTextField5.setText("D) 4");

        }
        if (callqu == 6) {
            jTextField1.setText("\t\t\t\t\t ماهي أصغر دوله عربيه مساحه ؟ \t\t\t\t\t");
            jTextField2.setText("A) البحرين");
            jTextField3.setText("B) قطر");
            jTextField4.setText("C) الكويت");
            jTextField5.setText("D) جميع ما سبق");

        }

      
      
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void jTextField2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField2MouseClicked
       if (callqu ==1 && jTextField2.isFocusable()|| callqu ==4 && jTextField2.isFocusable()){
       jTextField2.setOpaque(true);
      jTextField2.setForeground(Color.BLACK);
       jTextField2.setBackground(Color.GREEN);
       
          jTextField3.setOpaque(true);
      jTextField3.setForeground(Color.WHITE);
       jTextField3.setBackground(Color.BLACK);
       
          jTextField4.setOpaque(true);
        jTextField4.setForeground(Color.WHITE);
       jTextField4.setBackground(Color.BLACK);
       
       
          jTextField5.setOpaque(true);
       jTextField5.setForeground(Color.WHITE);
       jTextField5.setBackground(Color.BLACK);
       if (callqu ==1 && jTextField2.isFocusable()){
         ImageIcon []imagelist1=new ImageIcon[1];
       
      for(int i=0;i<imagelist1.length;i++){
      imagelist1[i]=new ImageIcon(getClass().getResource("/wLottery/imeges/" +imcorrect1[i]));
      }
      if (correct1<0)correct1=1;
      if(correct1>=0 && correct1<imcorrect1.length){
      jLabel1.setIcon(imagelist1[correct1]);
      correct1++;
      
      }}
          if (callqu ==4 && jTextField2.isFocusable()){
         ImageIcon []imagelist1=new ImageIcon[1];
       
      for(int i=0;i<imagelist1.length;i++){
      imagelist1[i]=new ImageIcon(getClass().getResource("/wLottery/imeges/" +imcorrect4[i]));
      }
      if (correct4<0)correct4=1;
      if(correct4>=0 && correct4<imcorrect4.length){
      jLabel1.setIcon(imagelist1[correct4]);
      correct4++;
      
      }}
        
       
       }
       
         if (callqu ==2 && jTextField3.isFocusable()){
       jTextField3.setOpaque(true);
      jTextField3.setForeground(Color.BLACK);
       jTextField3.setBackground(Color.GREEN);
       
          jTextField2.setOpaque(true);
      jTextField2.setForeground(Color.WHITE);
       jTextField2.setBackground(Color.RED);
       
          jTextField4.setOpaque(true);
        jTextField4.setForeground(Color.WHITE);
       jTextField4.setBackground(Color.RED);
       
       
          jTextField5.setOpaque(true);
       jTextField5.setForeground(Color.WHITE);
       jTextField5.setBackground(Color.RED);
   
       
       }
       
    }//GEN-LAST:event_jTextField2MouseClicked

    private void jTextField3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField3MouseClicked
          if (callqu ==2 && jTextField3.isFocusable()){
       jTextField3.setOpaque(true);
      jTextField3.setForeground(Color.BLACK);
       jTextField3.setBackground(Color.GREEN);
       
          jTextField2.setOpaque(true);
      jTextField2.setForeground(Color.WHITE);
       jTextField2.setBackground(Color.RED);
       
          jTextField4.setOpaque(true);
        jTextField4.setForeground(Color.WHITE);
       jTextField4.setBackground(Color.RED);
       
       
          jTextField5.setOpaque(true);
       jTextField5.setForeground(Color.WHITE);
       jTextField5.setBackground(Color.RED);
       if (callqu ==2 && jTextField3.isFocusable()){
         ImageIcon []imagelist1=new ImageIcon[1];
       
      for(int i=0;i<imagelist1.length;i++){
      imagelist1[i]=new ImageIcon(getClass().getResource("/wLottery/imeges/" +imcorrect2[i]));
      }
      if (correct2<0)correct2=1;
      if(correct2>=0 && correct2<imcorrect2.length){
      jLabel1.setIcon(imagelist1[correct2]);
      correct2++;
      
      }}
       
       }
    }//GEN-LAST:event_jTextField3MouseClicked

    private void jTextField4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField4MouseClicked
           if (callqu ==3 && jTextField4.isFocusable()||callqu ==5 && jTextField4.isFocusable() ){
       jTextField4.setOpaque(true);
      jTextField4.setForeground(Color.BLACK);
       jTextField4.setBackground(Color.GREEN);
       
          jTextField2.setOpaque(true);
      jTextField2.setForeground(Color.WHITE);
       jTextField2.setBackground(Color.RED);
       
          jTextField3.setOpaque(true);
        jTextField3.setForeground(Color.WHITE);
       jTextField3.setBackground(Color.RED);
       
       
          jTextField5.setOpaque(true);
       jTextField5.setForeground(Color.WHITE);
       jTextField5.setBackground(Color.RED);
       if (callqu ==3 && jTextField4.isFocusable()){
         ImageIcon []imagelist1=new ImageIcon[1];
       
      for(int i=0;i<imagelist1.length;i++){
      imagelist1[i]=new ImageIcon(getClass().getResource("/wLottery/imeges/" +imcorrect3[i]));
      }
      if (correct3<0)correct3=1;
      if(correct3>=0 && correct3<imcorrect3.length){
      jLabel1.setIcon(imagelist1[correct3]);
      correct3++;
      
      }}
         if (callqu ==5 && jTextField4.isFocusable()){
         ImageIcon []imagelist1=new ImageIcon[1];
       
      for(int i=0;i<imagelist1.length;i++){
      imagelist1[i]=new ImageIcon(getClass().getResource("/wLottery/imeges/" +imcorrect5[i]));
      }
      if (correct5<0)correct5=1;
      if(correct5>=0 && correct5<imcorrect5.length){
      jLabel1.setIcon(imagelist1[correct5]);
      correct5++;
      
      }}
       
       }
    }//GEN-LAST:event_jTextField4MouseClicked

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
            java.util.logging.Logger.getLogger(qLottery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(qLottery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(qLottery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(qLottery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new qLottery().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
