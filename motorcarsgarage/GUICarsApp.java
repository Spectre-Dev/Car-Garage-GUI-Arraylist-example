package motorcarsgarage;

import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rich
 */
public class GUICarsApp extends javax.swing.JFrame {
    String make, model;
    int year;
    
        ArrayList<Object> aList;
        Cars car = new Cars();

    /**
     * Creates new form GUICarsApp
     */
    public GUICarsApp() {
        initComponents();
        
        aList = new ArrayList<Object>();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        headerLbl = new javax.swing.JLabel();
        detailsLbl = new javax.swing.JLabel();
        makeLbl = new javax.swing.JLabel();
        modelLbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        makeTf = new javax.swing.JTextField();
        modelTf = new javax.swing.JTextField();
        yearTf = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        removeBtn = new javax.swing.JButton();
        listBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        detailsTa = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        headerLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        headerLbl.setText("Richie's ChopShop");
        jPanel1.add(headerLbl);
        headerLbl.setBounds(120, 10, 160, 30);

        detailsLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        detailsLbl.setText("Car Details");
        jPanel1.add(detailsLbl);
        detailsLbl.setBounds(10, 40, 100, 17);

        makeLbl.setText("Make:");
        jPanel1.add(makeLbl);
        makeLbl.setBounds(40, 60, 50, 14);

        modelLbl.setText("Model:");
        jPanel1.add(modelLbl);
        modelLbl.setBounds(40, 100, 60, 14);

        jLabel1.setText("Year:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(40, 140, 60, 14);

        makeTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                makeTfActionPerformed(evt);
            }
        });
        jPanel1.add(makeTf);
        makeTf.setBounds(150, 60, 180, 20);
        jPanel1.add(modelTf);
        modelTf.setBounds(150, 100, 180, 20);
        jPanel1.add(yearTf);
        yearTf.setBounds(150, 140, 180, 20);

        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        jPanel1.add(addBtn);
        addBtn.setBounds(10, 160, 70, 23);

        removeBtn.setText("Remove");
        jPanel1.add(removeBtn);
        removeBtn.setBounds(10, 190, 71, 23);

        listBtn.setText("List");
        listBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listBtnActionPerformed(evt);
            }
        });
        jPanel1.add(listBtn);
        listBtn.setBounds(10, 220, 70, 23);

        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });
        jPanel1.add(clearBtn);
        clearBtn.setBounds(10, 250, 70, 23);

        detailsTa.setColumns(20);
        detailsTa.setRows(5);
        jScrollPane1.setViewportView(detailsTa);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(150, 170, 180, 120);

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

        setSize(new java.awt.Dimension(416, 338));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void makeTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_makeTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_makeTfActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed

        if (! (makeTf.equals(" "))) {
            car.make = makeTf.getText();
            car.model = modelTf.getText();
            car.year = Integer.parseInt(yearTf.getText());

            aList.add(car);

            makeTf.setText("");
            modelTf.setText("");
            yearTf.setText("");
        }
        else{
            detailsTa.setText("Please enter details: ");
        }
    }//GEN-LAST:event_addBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clearBtnActionPerformed

    private void listBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listBtnActionPerformed
        // TODO add your handling code here:
        Iterator i;
        i = aList.iterator();
        while(i.hasNext())
        {
            
        }
            
    }//GEN-LAST:event_listBtnActionPerformed

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
            java.util.logging.Logger.getLogger(GUICarsApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUICarsApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUICarsApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUICarsApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUICarsApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton clearBtn;
    private javax.swing.JLabel detailsLbl;
    private javax.swing.JTextArea detailsTa;
    private javax.swing.JLabel headerLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton listBtn;
    private javax.swing.JLabel makeLbl;
    private javax.swing.JTextField makeTf;
    private javax.swing.JLabel modelLbl;
    private javax.swing.JTextField modelTf;
    private javax.swing.JButton removeBtn;
    private javax.swing.JTextField yearTf;
    // End of variables declaration//GEN-END:variables
}
