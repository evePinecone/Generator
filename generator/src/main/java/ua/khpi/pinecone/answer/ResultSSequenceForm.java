/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.khpi.pinecone.answer;

import static ua.khpi.pinecone.polynomial.form.InitPanel.resultSSequenceForm;
import static ua.khpi.pinecone.polynomial.form.InitPanel.sequenceForm;

/**
 *
 * @author inc_f
 */
public class ResultSSequenceForm extends javax.swing.JFrame {

//    private static ReportEntity reportEntity;

    /**
     * Creates new form ResultSSequence
     */
    public ResultSSequenceForm(Report report) {
        this.reportEntity = report;
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

        jScrollPane1 = new javax.swing.JScrollPane();
        outResultSequence = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        weightHamming = new javax.swing.JLabel();
        theoreticalPeriod = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        estimatedPeriodLabel = new javax.swing.JLabel();
        stepCounter = new javax.swing.JLabel();
        nextStepGeneration = new javax.swing.JButton();
        resultExit = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        theoreticalPeriod1 = new javax.swing.JLabel();
        generateAll = new javax.swing.JButton();
        saveResult = new javax.swing.JButton();
        resultPrev = new javax.swing.JButton();
        sequenceGeneratedSuccesfully = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        outResultSequence.setEditable(false);
        outResultSequence.setColumns(20);
        outResultSequence.setRows(5);
        jScrollPane1.setViewportView(outResultSequence);

        jLabel1.setText("Hamming weight");

        weightHamming.setText("0");

        theoreticalPeriod.setText("0");

        jLabel4.setText("Theoretical period");

        estimatedPeriodLabel.setText("Step No");

        stepCounter.setText("steps");

        nextStepGeneration.setText("Step");
        nextStepGeneration.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextStepGenerationMouseClicked(evt);
            }
        });

        resultExit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        resultExit.setText("EXIT");
        resultExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resultExitMouseClicked(evt);
            }
        });

        jLabel5.setText("Estimated period");

        theoreticalPeriod1.setText("0");

        generateAll.setText("Generate all");
        generateAll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                generateAllMouseClicked(evt);
            }
        });

        saveResult.setText("Save result to file");
        saveResult.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveResultMouseClicked(evt);
            }
        });

        resultPrev.setText("PREV");
        resultPrev.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resultPrevMouseClicked(evt);
            }
        });

        sequenceGeneratedSuccesfully.setText("Sequence generated!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(theoreticalPeriod))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(weightHamming))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(theoreticalPeriod1)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(generateAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(saveResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(estimatedPeriodLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(stepCounter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(nextStepGeneration, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(resultPrev, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(resultExit, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addComponent(sequenceGeneratedSuccesfully)
                        .addGap(52, 52, 52))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(weightHamming))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(theoreticalPeriod))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(theoreticalPeriod1))
                        .addGap(0, 25, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(estimatedPeriodLabel)
                            .addComponent(stepCounter))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nextStepGeneration)
                        .addGap(2, 2, 2)
                        .addComponent(generateAll)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sequenceGeneratedSuccesfully)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(saveResult)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(resultExit, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                            .addComponent(resultPrev, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resultExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resultExitMouseClicked
        System.exit(1);
    }//GEN-LAST:event_resultExitMouseClicked

    private void resultPrevMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resultPrevMouseClicked
        sequenceForm.setVisible(true);
        resultSSequenceForm.setVisible(false);
    }//GEN-LAST:event_resultPrevMouseClicked

    private void nextStepGenerationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextStepGenerationMouseClicked
//        theoreticalPeriod1.setText(reportEntity.getPeriodA().toString());
//        Integer est = ArithmeticsUtils.lcm(reportEntity.getPeriodA(), reportEntity.getPeriodB());
//        reportEntity.setEstimatedPeriod(est);
//        theoreticalPeriod1.setText(est.toString());
    }//GEN-LAST:event_nextStepGenerationMouseClicked

    private void generateAllMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generateAllMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_generateAllMouseClicked

    private void saveResultMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveResultMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_saveResultMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel estimatedPeriodLabel;
    private javax.swing.JButton generateAll;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton nextStepGeneration;
    private javax.swing.JTextArea outResultSequence;
    private javax.swing.JButton resultExit;
    private javax.swing.JButton resultPrev;
    private javax.swing.JButton saveResult;
    private javax.swing.JLabel sequenceGeneratedSuccesfully;
    private javax.swing.JLabel stepCounter;
    private javax.swing.JLabel theoreticalPeriod;
    private javax.swing.JLabel theoreticalPeriod1;
    private javax.swing.JLabel weightHamming;
    // End of variables declaration//GEN-END:variables

    private Report reportEntity;
}
