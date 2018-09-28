/*
 * Last Updated: 0/0/2017
 * Class description:
 */
package rickandbrandongame;

import java.awt.event.ActionListener;

/**
 *
 * @author Pussy Whisperer
 */
public class MainGameFrame extends javax.swing.JFrame implements ActionListener {

    GameController control;
    
    public MainGameFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gameBoardPanel = new javax.swing.JPanel();
        gameButton1 = new javax.swing.JButton();
        gameButton4 = new javax.swing.JButton();
        gameButton5 = new javax.swing.JButton();
        gameButton2 = new javax.swing.JButton();
        gameButton6 = new javax.swing.JButton();
        gameButton7 = new javax.swing.JButton();
        gameButton3 = new javax.swing.JButton();
        gameButton9 = new javax.swing.JButton();
        gameButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        gameButton1.setMaximumSize(new java.awt.Dimension(125, 125));
        gameButton1.setMinimumSize(new java.awt.Dimension(125, 125));
        gameButton1.setPreferredSize(new java.awt.Dimension(125, 125));
        gameButton1.addActionListener(this);

        gameButton4.setMaximumSize(new java.awt.Dimension(125, 125));
        gameButton4.setMinimumSize(new java.awt.Dimension(125, 125));
        gameButton4.setPreferredSize(new java.awt.Dimension(125, 125));
        gameButton4.addActionListener(this);

        gameButton5.setMaximumSize(new java.awt.Dimension(125, 125));
        gameButton5.setMinimumSize(new java.awt.Dimension(125, 125));
        gameButton5.setPreferredSize(new java.awt.Dimension(125, 125));
        gameButton5.addActionListener(this);

        gameButton2.setMaximumSize(new java.awt.Dimension(125, 125));
        gameButton2.setMinimumSize(new java.awt.Dimension(125, 125));
        gameButton2.setPreferredSize(new java.awt.Dimension(125, 125));
        gameButton2.addActionListener(this);

        gameButton6.setMaximumSize(new java.awt.Dimension(125, 125));
        gameButton6.setMinimumSize(new java.awt.Dimension(125, 125));
        gameButton6.setPreferredSize(new java.awt.Dimension(125, 125));
        gameButton6.addActionListener(this);

        gameButton7.setMaximumSize(new java.awt.Dimension(125, 125));
        gameButton7.setMinimumSize(new java.awt.Dimension(125, 125));
        gameButton7.setPreferredSize(new java.awt.Dimension(125, 125));
        gameButton7.addActionListener(this);

        gameButton3.setMaximumSize(new java.awt.Dimension(125, 125));
        gameButton3.setMinimumSize(new java.awt.Dimension(125, 125));
        gameButton3.setPreferredSize(new java.awt.Dimension(125, 125));
        gameButton3.addActionListener(this);

        gameButton9.setMaximumSize(new java.awt.Dimension(125, 125));
        gameButton9.setMinimumSize(new java.awt.Dimension(125, 125));
        gameButton9.setPreferredSize(new java.awt.Dimension(125, 125));
        gameButton9.addActionListener(this);

        gameButton8.setMaximumSize(new java.awt.Dimension(125, 125));
        gameButton8.setMinimumSize(new java.awt.Dimension(125, 125));
        gameButton8.setPreferredSize(new java.awt.Dimension(125, 125));
        gameButton8.addActionListener(this);

        javax.swing.GroupLayout gameBoardPanelLayout = new javax.swing.GroupLayout(gameBoardPanel);
        gameBoardPanel.setLayout(gameBoardPanelLayout);
        gameBoardPanelLayout.setHorizontalGroup(
            gameBoardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gameBoardPanelLayout.createSequentialGroup()
                .addGroup(gameBoardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gameBoardPanelLayout.createSequentialGroup()
                        .addComponent(gameButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addComponent(gameButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(gameBoardPanelLayout.createSequentialGroup()
                        .addGroup(gameBoardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gameButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gameButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(gameBoardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gameButton8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gameButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(gameBoardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gameButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gameButton9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gameButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        gameBoardPanelLayout.setVerticalGroup(
            gameBoardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gameBoardPanelLayout.createSequentialGroup()
                .addGroup(gameBoardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gameBoardPanelLayout.createSequentialGroup()
                        .addComponent(gameButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(gameButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(gameBoardPanelLayout.createSequentialGroup()
                        .addComponent(gameButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(gameButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(gameBoardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gameButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gameButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(gameBoardPanelLayout.createSequentialGroup()
                .addComponent(gameButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(gameButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(gameButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gameBoardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addComponent(gameBoardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }

    // Code for dispatching events from components to event handlers.

    public void actionPerformed(java.awt.event.ActionEvent evt) {
        if (evt.getSource() == gameButton1) {
            MainGameFrame.this.gameButton1ActionPerformed(evt);
        }
        else if (evt.getSource() == gameButton5) {
            MainGameFrame.this.gameButton5ActionPerformed(evt);
        }
        else if (evt.getSource() == gameButton4) {
            MainGameFrame.this.gameButton4ActionPerformed(evt);
        }
        else if (evt.getSource() == gameButton2) {
            MainGameFrame.this.gameButton2ActionPerformed(evt);
        }
        else if (evt.getSource() == gameButton6) {
            MainGameFrame.this.gameButton6ActionPerformed(evt);
        }
        else if (evt.getSource() == gameButton7) {
            MainGameFrame.this.gameButton7ActionPerformed(evt);
        }
        else if (evt.getSource() == gameButton3) {
            MainGameFrame.this.gameButton3ActionPerformed(evt);
        }
        else if (evt.getSource() == gameButton9) {
            MainGameFrame.this.gameButton9ActionPerformed(evt);
        }
        else if (evt.getSource() == gameButton8) {
            MainGameFrame.this.gameButton8ActionPerformed(evt);
        }
    }// </editor-fold>//GEN-END:initComponents

    private void gameButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gameButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gameButton1ActionPerformed

    private void gameButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gameButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gameButton5ActionPerformed

    private void gameButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gameButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gameButton4ActionPerformed

    private void gameButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gameButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gameButton2ActionPerformed

    private void gameButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gameButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gameButton6ActionPerformed

    private void gameButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gameButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gameButton7ActionPerformed

    private void gameButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gameButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gameButton3ActionPerformed

    private void gameButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gameButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gameButton9ActionPerformed

    private void gameButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gameButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gameButton8ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel gameBoardPanel;
    private javax.swing.JButton gameButton1;
    private javax.swing.JButton gameButton2;
    private javax.swing.JButton gameButton3;
    private javax.swing.JButton gameButton4;
    private javax.swing.JButton gameButton5;
    private javax.swing.JButton gameButton6;
    private javax.swing.JButton gameButton7;
    private javax.swing.JButton gameButton8;
    private javax.swing.JButton gameButton9;
    // End of variables declaration//GEN-END:variables
}
