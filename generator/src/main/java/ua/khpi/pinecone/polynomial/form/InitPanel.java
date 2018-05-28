/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.khpi.pinecone.polynomial.form;

import org.apache.log4j.Logger;
import ua.khpi.pinecone.answer.Report;
import ua.khpi.pinecone.answer.ResultSSequenceForm;
import ua.khpi.pinecone.polynomial.GenerateInvertible;
import ua.khpi.pinecone.polynomial.PolynomialEntity;
import ua.khpi.pinecone.polynomial.PolynomialGenerator;
import ua.khpi.pinecone.sequence.SequenceForm;
import ua.khpi.pinecone.utils.ArithmeticsUtils;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.List;
import java.util.Map;

/**
 * @author inc_f
 */
public class InitPanel extends javax.swing.JFrame {

    private static final Logger LOG = Logger.getLogger(InitPanel.class);
    private Report report;

    /**
     * Creates new form InitPanel
     */
    public InitPanel(Report report) {
        this.report = report;
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

        polynomialAScroll = new javax.swing.JScrollPane();
        outPolynomialA = new javax.swing.JTextArea();
        degreePolynomialA = new javax.swing.JComboBox<>();
        polynomialALabel = new javax.swing.JLabel();
        choosePolynomialA = new javax.swing.JComboBox<>();
        polynomialBLabel = new javax.swing.JLabel();
//        choosePolynomialB = new javax.swing.JComboBox<>();
        polynomialBScroll = new javax.swing.JScrollPane();
        outPolynomialB = new javax.swing.JTextArea();
        nextStep = new javax.swing.JButton();
        periodPolynomialA = new javax.swing.JLabel();
        periodPolynomialALabel = new javax.swing.JLabel();
        periodPolynomialB = new javax.swing.JLabel();
//        periodPolynomialBLabel = new javax.swing.JLabel();

        polynomialGenerator = new PolynomialGenerator();

        Map<String, List<PolynomialEntity>> polynomials = polynomialGenerator.getPolynomials();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        outPolynomialA.setEditable(false);
        outPolynomialA.setColumns(20);
        outPolynomialA.setRows(5);
        polynomialAScroll.setViewportView(outPolynomialA);

        degreePolynomialA.setModel(new javax.swing.DefaultComboBoxModel<>(polynomials.keySet().toArray(new String[polynomials.size()])));

        polynomialALabel.setText("Polynomial A");


        polynomialBLabel.setText("Invertible A");

        outPolynomialB.setEditable(false);
        outPolynomialB.setColumns(20);
        outPolynomialB.setRows(5);
        polynomialBScroll.setViewportView(outPolynomialB);

        nextStep.setText("NEXT");

        periodPolynomialA.setText("");

        periodPolynomialALabel.setText("Ta =");

        periodPolynomialB.setText("");

//        periodPolynomialBLabel.setText("Tb =");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(polynomialAScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(choosePolynomialA, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addComponent(polynomialALabel)
                                                                .addGap(26, 26, 26)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(10, 10, 10)
                                                                .addComponent(degreePolynomialA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(31, 31, 31)
                                                                .addComponent(polynomialBLabel))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(68, 68, 68)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(polynomialBScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                                                        .addComponent(choosePolynomialB, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(layout.createSequentialGroup()
//                                                                                .addGap(10, 10, 10)
//                                                                                .addComponent(periodPolynomialBLabel)
                                                                                .addGap(30, 30, 30)
                                                                                .addComponent(periodPolynomialB))))))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(periodPolynomialALabel)
                                                .addGap(30, 30, 30)
                                                .addComponent(periodPolynomialA)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                                .addComponent(nextStep)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(layout.createSequentialGroup()
//                                                        .addComponent(choosePolynomialB, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(polynomialBScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(polynomialBLabel)
                                                                .addComponent(degreePolynomialA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(polynomialALabel))
                                                        .addGap(20, 20, 20)
                                                        .addComponent(choosePolynomialA, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(polynomialAScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(nextStep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(periodPolynomialA)
                                        .addComponent(periodPolynomialALabel)
                                        .addComponent(periodPolynomialB))
//                                        .addComponent(periodPolynomialBLabel))
                                .addContainerGap(26, Short.MAX_VALUE))
        );

        //Listeners
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

//        choosePolynomialB.addItemListener(new ItemListener() {
//            public void itemStateChanged(ItemEvent evt) {
//                choosePolynomialBItemStateChanged(evt);
//            }
//        });

        nextStep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sequenceNextMouseClicked(evt);
            }
        });


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
//        choosePolynomialB.setModel(new javax.swing.DefaultComboBoxModel<>(stringList));
        outPolynomialA.setText("");
        outPolynomialB.setText("");
    }

    private void choosePolynomialAItemStateChanged(ItemEvent evt) {
        List<List<Integer>> polynomialA = polynomialGenerator.generatePolynomialA(degreePolynomialA.getSelectedItem().toString(), evt.getItem().toString());
        StringBuilder text = new StringBuilder();
        if (!evt.getItem().equals(" ")) {

            outPolynomialA.setText(listPolynomialToString(polynomialA));

            PolynomialEntity polynomialEntity = PolynomialEntity.parsePolynomialEntity(evt.getItem().toString());
            Integer period = (ArithmeticsUtils.pow(2, Integer.parseInt(degreePolynomialA.getSelectedItem().toString()))-1) / ArithmeticsUtils.gcd(ArithmeticsUtils.pow(2, Integer.parseInt(degreePolynomialA.getSelectedItem().toString())-1), Integer.parseInt(polynomialEntity.getJ()));
            periodPolynomialA.setText(period.toString());


            report.setPeriodA(period);
            report.setPeriodB(period);

            List<List<Integer>> polynomialB = new GenerateInvertible(report).generateInvertible(polynomialA);
            outPolynomialB.setText(listPolynomialToString(polynomialB));

            report.setA(polynomialA);
            report.setB(polynomialB);
        }
    }

    private String listPolynomialToString(List<List<Integer>> polynomialA) {
        StringBuilder text = new StringBuilder();
        for (List<Integer> list : polynomialA) {
            for (Integer integer : list) {
                text.append(integer).append(" ");
            }
            text.append(System.lineSeparator());
        }
        return text.toString();
    }


//    private void choosePolynomialBItemStateChanged(ItemEvent evt) {
//        LOG.info("GET SELECTED ITEM = " + evt.getItem());
//        if (!evt.getItem().equals(" ")) {
//            List<List<Integer>> polynomialB = polynomialGenerator.generatePolynomialB(degreePolynomialA.getSelectedItem().toString(), evt.getItem().toString());
//            StringBuilder text = new StringBuilder();
//            for (List<Integer> list : polynomialB) {
//                for (Integer integer : list) {
//                    text.append(integer).append(" ");
//                }
//                text.append(System.lineSeparator());
//            }
//            outPolynomialB.setText(text.toString());
//            PolynomialEntity polynomialEntity = PolynomialEntity.parsePolynomialEntity(evt.getItem().toString());
//
//            Integer period = (ArithmeticsUtils.pow(2, Integer.parseInt(degreePolynomialA.getSelectedItem().toString()))-1) / ArithmeticsUtils.gcd(ArithmeticsUtils.pow(2, Integer.parseInt(degreePolynomialA.getSelectedItem().toString())-1), Integer.parseInt(polynomialEntity.getJ()));
//            periodPolynomialB.setText(period.toString());
//            report.setPeriodB(period);
//            report.setB(polynomialB);
//        }
//    }

    private void sequenceNextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sequenceNextMouseClicked
        sequenceForm.setVisible(true);
        initPanel.setVisible(false);
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
            java.util.logging.Logger.getLogger(InitPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InitPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InitPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InitPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        Report report = new Report();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                initPanel = new InitPanel(report);
                initPanel.setVisible(true);
            }
        });

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                sequenceForm = new SequenceForm(report);
                sequenceForm.setVisible(false);
            }
        });

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                resultSSequenceForm = new ResultSSequenceForm(report);
                resultSSequenceForm.setVisible(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> choosePolynomialA;
//    public javax.swing.JComboBox<String> choosePolynomialB;
    public javax.swing.JComboBox<String> degreePolynomialA;
    private javax.swing.JButton nextStep;
    private javax.swing.JTextArea outPolynomialA;
    private javax.swing.JTextArea outPolynomialB;
    private javax.swing.JLabel periodPolynomialA;
    private javax.swing.JLabel periodPolynomialALabel;
    private javax.swing.JLabel periodPolynomialB;
//    private javax.swing.JLabel periodPolynomialBLabel;
    private javax.swing.JLabel polynomialALabel;
    private javax.swing.JScrollPane polynomialAScroll;
    private javax.swing.JLabel polynomialBLabel;
    private javax.swing.JScrollPane polynomialBScroll;
    // End of variables declaration//GEN-END:variables

    private PolynomialGenerator polynomialGenerator;
    public static SequenceForm sequenceForm;
    public static InitPanel initPanel;
    public static ResultSSequenceForm resultSSequenceForm;
}
