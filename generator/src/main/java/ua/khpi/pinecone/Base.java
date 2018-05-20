/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.khpi.pinecone;

import org.apache.log4j.Logger;
import ua.khpi.pinecone.polynomial.PolynomialEntity;
import ua.khpi.pinecone.polynomial.PolynomialGenerator;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.List;
import java.util.Map;

/**
 * @author inc_f
 */
public class Base extends javax.swing.JFrame {

    private static final Logger LOG = Logger.getLogger(Base.class);

    /**
     * Creates new form base
     */
    public Base() {
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

        choosePolynomialA = new javax.swing.JComboBox<>();
        degreePolynomialA = new javax.swing.JComboBox<>();
        polynomialALabel = new javax.swing.JLabel();
        polynomialAScroll = new javax.swing.JScrollPane();
        outPolynomialA = new javax.swing.JTextArea();
        periodPolynomialALabel = new JLabel();

        choosePolynomialB = new javax.swing.JComboBox<>();
        polynomialBScroll = new javax.swing.JScrollPane();
        outPolynomialB = new javax.swing.JTextArea();
        polynomialBLabel = new javax.swing.JLabel();
        periodPolynomialBLabel = new JLabel();

        polynomialGenerator = new PolynomialGenerator();

        Map<String, List<PolynomialEntity>> polynomials = polynomialGenerator.getPolynomials();


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(800, 400));
        setSize(800,400);

        degreePolynomialA.setModel(new javax.swing.DefaultComboBoxModel<>(polynomials.keySet().toArray(new String[polynomials.size()])));

        degreePolynomialA.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                degreePolynomialAItemStateChanged(e);
            }
        });

        choosePolynomialA.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent evt) {
                choosePolynomialAItemStateChanged(evt);
            }
        });

        polynomialALabel.setText("Polynomial A");
        periodPolynomialALabel.setText("Ta = ");

        outPolynomialA.setColumns(20);
        outPolynomialA.setRows(5);
        polynomialAScroll.setViewportView(outPolynomialA);

        // POLYNOMIAL B

        outPolynomialB.setColumns(20);
        outPolynomialB.setRows(5);
        polynomialBScroll.setViewportView(outPolynomialB);

        choosePolynomialB.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent evt) {
                choosePolynomialBItemStateChanged(evt);
            }
        });

        polynomialBLabel.setText("Polynomial B");
        periodPolynomialBLabel.setText("Tb = ");


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(degreePolynomialA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(polynomialALabel, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(choosePolynomialA, 0, 150, Short.MAX_VALUE)
                                        .addComponent(polynomialAScroll))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                        .addComponent(choosePolynomialB, 0, 150, Short.MAX_VALUE)
                                                        .addComponent(polynomialBScroll))
                                                .addGap(824, 824, 824))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(polynomialBLabel)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(polynomialALabel)
                                        .addComponent(polynomialBLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(degreePolynomialA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(choosePolynomialA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(choosePolynomialB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(polynomialAScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(polynomialBScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(168, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void degreePolynomialAItemStateChanged(ItemEvent evt) {
        LOG.info(evt.getItem());
        Map<String, List<PolynomialEntity>> polynomials = polynomialGenerator.getPolynomials();
        List<PolynomialEntity> list = polynomials.get(evt.getItem().toString());
        String[] stringList = new String[list.size()];
        int counter = 0;
        for (PolynomialEntity polynomialEntity : list) {
            stringList[counter++] = polynomialEntity.toString();
        }
        choosePolynomialA.setModel(new javax.swing.DefaultComboBoxModel<>(stringList));
        choosePolynomialB.setModel(new javax.swing.DefaultComboBoxModel<>(stringList));
        outPolynomialA.setText("");
        outPolynomialB.setText("");
    }

    private void choosePolynomialAItemStateChanged(ItemEvent evt) {
        List<List<Integer>> polynomialA = polynomialGenerator.generatePolynomialA(degreePolynomialA.getSelectedItem().toString(), evt.getItem().toString());
        StringBuilder text = new StringBuilder();
        for (List<Integer> list : polynomialA) {
            for (Integer integer : list) {
                text.append(integer).append(" ");
            }
            text.append(System.lineSeparator());
        }
        outPolynomialA.setText(text.toString());
    }


    private void choosePolynomialBItemStateChanged(ItemEvent evt) {
        LOG.info("GET SELECTED ITEM = " + evt.getItem());
        if (!evt.getItem().equals(" ")) {
            List<List<Integer>> polynomialB = polynomialGenerator.generatePolynomialB(degreePolynomialA.getSelectedItem().toString(), evt.getItem().toString());
            StringBuilder text = new StringBuilder();
            for (List<Integer> list : polynomialB) {
                for (Integer integer : list) {
                    text.append(integer).append(" ");
                }
                text.append(System.lineSeparator());
            }
            outPolynomialB.setText(text.toString());
        }
    }


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
            java.util.logging.Logger.getLogger(Base.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Base.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Base.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Base.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Base().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> degreePolynomialA;
    private javax.swing.JComboBox<String> choosePolynomialA;
    private javax.swing.JComboBox<String> choosePolynomialB;
    private javax.swing.JScrollPane polynomialAScroll;
    private javax.swing.JTextArea outPolynomialA;
    private javax.swing.JTextArea outPolynomialB;
    private javax.swing.JLabel polynomialALabel;
    private javax.swing.JLabel polynomialBLabel;
    private javax.swing.JScrollPane polynomialBScroll;


    private javax.swing.JLabel periodPolynomialALabel;
    private javax.swing.JLabel periodPolynomialBLabel;
    // End of variables declaration//GEN-END:variables

    private PolynomialGenerator polynomialGenerator;
}
