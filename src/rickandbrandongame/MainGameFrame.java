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
        control = new GameController();
        
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
        winnerLabel = new javax.swing.JLabel();
        xWinLabel = new javax.swing.JLabel();
        xWinCountLabel = new javax.swing.JLabel();
        yWinLabel1 = new javax.swing.JLabel();
        yWinCountLabel = new javax.swing.JLabel();
        resetButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(500, 500, 500, 500));
        setSize(new java.awt.Dimension(500, 500));

        gameBoardPanel.setBackground(new java.awt.Color(43, 43, 43));

        gameButton1.setBackground(new java.awt.Color(255, 255, 255));
        gameButton1.setFont(new java.awt.Font("Impact", 0, 48)); // NOI18N
        gameButton1.setForeground(new java.awt.Color(0, 0, 0));
        gameButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        gameButton1.setMaximumSize(new java.awt.Dimension(125, 125));
        gameButton1.setMinimumSize(new java.awt.Dimension(125, 125));
        gameButton1.setPreferredSize(new java.awt.Dimension(125, 125));
        gameButton1.addActionListener(this);

        gameButton4.setBackground(new java.awt.Color(255, 255, 255));
        gameButton4.setFont(new java.awt.Font("Impact", 0, 48)); // NOI18N
        gameButton4.setForeground(new java.awt.Color(0, 0, 0));
        gameButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        gameButton4.setMaximumSize(new java.awt.Dimension(125, 125));
        gameButton4.setMinimumSize(new java.awt.Dimension(125, 125));
        gameButton4.setPreferredSize(new java.awt.Dimension(125, 125));
        gameButton4.addActionListener(this);

        gameButton5.setBackground(new java.awt.Color(255, 255, 255));
        gameButton5.setFont(new java.awt.Font("Impact", 0, 48)); // NOI18N
        gameButton5.setForeground(new java.awt.Color(0, 0, 0));
        gameButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        gameButton5.setMaximumSize(new java.awt.Dimension(125, 125));
        gameButton5.setMinimumSize(new java.awt.Dimension(125, 125));
        gameButton5.setPreferredSize(new java.awt.Dimension(125, 125));
        gameButton5.addActionListener(this);

        gameButton2.setBackground(new java.awt.Color(255, 255, 255));
        gameButton2.setFont(new java.awt.Font("Impact", 0, 48)); // NOI18N
        gameButton2.setForeground(new java.awt.Color(0, 0, 0));
        gameButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        gameButton2.setMaximumSize(new java.awt.Dimension(125, 125));
        gameButton2.setMinimumSize(new java.awt.Dimension(125, 125));
        gameButton2.setPreferredSize(new java.awt.Dimension(125, 125));
        gameButton2.addActionListener(this);

        gameButton6.setBackground(new java.awt.Color(255, 255, 255));
        gameButton6.setFont(new java.awt.Font("Impact", 0, 48)); // NOI18N
        gameButton6.setForeground(new java.awt.Color(0, 0, 0));
        gameButton6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        gameButton6.setMaximumSize(new java.awt.Dimension(125, 125));
        gameButton6.setMinimumSize(new java.awt.Dimension(125, 125));
        gameButton6.setPreferredSize(new java.awt.Dimension(125, 125));
        gameButton6.addActionListener(this);

        gameButton7.setBackground(new java.awt.Color(255, 255, 255));
        gameButton7.setFont(new java.awt.Font("Impact", 0, 48)); // NOI18N
        gameButton7.setForeground(new java.awt.Color(0, 0, 0));
        gameButton7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        gameButton7.setMaximumSize(new java.awt.Dimension(125, 125));
        gameButton7.setMinimumSize(new java.awt.Dimension(125, 125));
        gameButton7.setPreferredSize(new java.awt.Dimension(125, 125));
        gameButton7.addActionListener(this);

        gameButton3.setBackground(new java.awt.Color(255, 255, 255));
        gameButton3.setFont(new java.awt.Font("Impact", 0, 48)); // NOI18N
        gameButton3.setForeground(new java.awt.Color(0, 0, 0));
        gameButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        gameButton3.setMaximumSize(new java.awt.Dimension(125, 125));
        gameButton3.setMinimumSize(new java.awt.Dimension(125, 125));
        gameButton3.setPreferredSize(new java.awt.Dimension(125, 125));
        gameButton3.addActionListener(this);

        gameButton9.setBackground(new java.awt.Color(255, 255, 255));
        gameButton9.setFont(new java.awt.Font("Impact", 0, 48)); // NOI18N
        gameButton9.setForeground(new java.awt.Color(0, 0, 0));
        gameButton9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        gameButton9.setMaximumSize(new java.awt.Dimension(125, 125));
        gameButton9.setMinimumSize(new java.awt.Dimension(125, 125));
        gameButton9.setPreferredSize(new java.awt.Dimension(125, 125));
        gameButton9.addActionListener(this);

        gameButton8.setBackground(new java.awt.Color(255, 255, 255));
        gameButton8.setFont(new java.awt.Font("Impact", 0, 48)); // NOI18N
        gameButton8.setForeground(new java.awt.Color(0, 0, 0));
        gameButton8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        gameButton8.setMaximumSize(new java.awt.Dimension(125, 125));
        gameButton8.setMinimumSize(new java.awt.Dimension(125, 125));
        gameButton8.setPreferredSize(new java.awt.Dimension(125, 125));
        gameButton8.addActionListener(this);

        winnerLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        winnerLabel.setForeground(new java.awt.Color(255, 0, 0));
        winnerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        winnerLabel.setBorder(new javax.swing.border.MatteBorder(null));

        xWinLabel.setForeground(new java.awt.Color(0, 204, 204));
        xWinLabel.setText("X wins:");

        yWinLabel1.setForeground(new java.awt.Color(0, 204, 204));
        yWinLabel1.setText("Y wins:");

        javax.swing.GroupLayout gameBoardPanelLayout = new javax.swing.GroupLayout(gameBoardPanel);
        gameBoardPanel.setLayout(gameBoardPanelLayout);
        gameBoardPanelLayout.setHorizontalGroup(
            gameBoardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gameBoardPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gameBoardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(gameBoardPanelLayout.createSequentialGroup()
                        .addComponent(xWinLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(xWinCountLabel)
                        .addGap(39, 39, 39)
                        .addComponent(winnerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(yWinLabel1))
                    .addGroup(gameBoardPanelLayout.createSequentialGroup()
                        .addGap(0, 34, Short.MAX_VALUE)
                        .addGroup(gameBoardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gameButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gameButton7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gameButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(gameBoardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(gameButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(gameButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(gameButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(gameBoardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gameButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gameButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gameButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(yWinCountLabel)
                .addGap(11, 11, 11))
        );
        gameBoardPanelLayout.setVerticalGroup(
            gameBoardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gameBoardPanelLayout.createSequentialGroup()
                .addGroup(gameBoardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gameBoardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(xWinLabel)
                        .addComponent(xWinCountLabel))
                    .addGroup(gameBoardPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(gameBoardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(yWinCountLabel)
                            .addComponent(winnerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(yWinLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(gameBoardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gameBoardPanelLayout.createSequentialGroup()
                        .addComponent(gameButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(gameButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gameBoardPanelLayout.createSequentialGroup()
                        .addGroup(gameBoardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(gameButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gameButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(gameBoardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gameButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gameButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(gameBoardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gameButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gameButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gameButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );

        resetButton.setText("Reset me if you are gay");
        resetButton.addActionListener(this);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gameBoardPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(gameBoardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resetButton)
                .addContainerGap())
        );

        pack();
    }

    // Code for dispatching events from components to event handlers.

    public void actionPerformed(java.awt.event.ActionEvent evt) {
        if (evt.getSource() == gameButton1) {
            MainGameFrame.this.gameButton1ActionPerformed(evt);
        }
        else if (evt.getSource() == gameButton4) {
            MainGameFrame.this.gameButton4ActionPerformed(evt);
        }
        else if (evt.getSource() == gameButton5) {
            MainGameFrame.this.gameButton5ActionPerformed(evt);
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
        else if (evt.getSource() == resetButton) {
            MainGameFrame.this.resetButtonActionPerformed(evt);
        }
    }// </editor-fold>//GEN-END:initComponents

    private void gameButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gameButton3ActionPerformed
        if (this.gameButton3.getText().equalsIgnoreCase("")){
           this.gameButton3.setText(control.getPlayer()); 
           declareWinner();
           checkTie();
           control.switchPlayer();
        }   
    }//GEN-LAST:event_gameButton3ActionPerformed

    private void gameButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gameButton1ActionPerformed
        if (this.gameButton1.getText().equalsIgnoreCase("")){
           this.gameButton1.setText(control.getPlayer()); 
           declareWinner();
           checkTie();
           control.switchPlayer();
        } 
    }//GEN-LAST:event_gameButton1ActionPerformed

    private void gameButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gameButton2ActionPerformed
        if (this.gameButton2.getText().equalsIgnoreCase("")){
           this.gameButton2.setText(control.getPlayer()); 
           declareWinner();
           checkTie();
           control.switchPlayer();
        } 
    }//GEN-LAST:event_gameButton2ActionPerformed

    private void gameButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gameButton6ActionPerformed
        if (this.gameButton6.getText().equalsIgnoreCase("")){
           this.gameButton6.setText(control.getPlayer()); 
           declareWinner();
           checkTie();
           control.switchPlayer();
        } 
    }//GEN-LAST:event_gameButton6ActionPerformed

    private void gameButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gameButton5ActionPerformed
        if (this.gameButton5.getText().equalsIgnoreCase("")){
           this.gameButton5.setText(control.getPlayer()); 
           declareWinner();
           checkTie();
           control.switchPlayer();
        } 
    }//GEN-LAST:event_gameButton5ActionPerformed

    private void gameButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gameButton4ActionPerformed
        if (this.gameButton4.getText().equalsIgnoreCase("")){
           this.gameButton4.setText(control.getPlayer()); 
           declareWinner();
           checkTie();
           control.switchPlayer();
        } 
    }//GEN-LAST:event_gameButton4ActionPerformed

    private void gameButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gameButton7ActionPerformed
        if (this.gameButton7.getText().equalsIgnoreCase("")){
           this.gameButton7.setText(control.getPlayer()); 
           declareWinner();
           checkTie();
           control.switchPlayer();
        } 
    }//GEN-LAST:event_gameButton7ActionPerformed

    private void gameButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gameButton8ActionPerformed
        if (this.gameButton8.getText().equalsIgnoreCase("")){
           this.gameButton8.setText(control.getPlayer()); 
           declareWinner();
           checkTie();
           control.switchPlayer();
        } 
    }//GEN-LAST:event_gameButton8ActionPerformed

    private void gameButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gameButton9ActionPerformed
        if (this.gameButton9.getText().equalsIgnoreCase("")){
           this.gameButton9.setText(control.getPlayer()); 
           declareWinner();
           checkTie();
           control.switchPlayer();
        } 
    }//GEN-LAST:event_gameButton9ActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        this.gameButton1.setText("");
        this.gameButton2.setText("");
        this.gameButton3.setText("");
        this.gameButton4.setText("");
        this.gameButton5.setText("");
        this.gameButton6.setText("");
        this.gameButton7.setText("");
        this.gameButton8.setText("");
        this.gameButton9.setText("");
        this.winnerLabel.setText("");
    }//GEN-LAST:event_resetButtonActionPerformed

    public boolean checkRow1Winner(){
        if (gameButton1.getText().equalsIgnoreCase(control.getPlayer()) && 
            gameButton2.getText().equalsIgnoreCase(control.getPlayer()) &&
            gameButton3.getText().equalsIgnoreCase(control.getPlayer())){        
        return true;
        }
        return false;
    }
    
    public boolean checkRow2Winner(){
        if (gameButton4.getText().equalsIgnoreCase(control.getPlayer()) && 
            gameButton5.getText().equalsIgnoreCase(control.getPlayer()) &&
            gameButton6.getText().equalsIgnoreCase(control.getPlayer())){       
        return true;
        }
        return false;
    }
    
    public boolean checkRow3Winner(){
        if (gameButton7.getText().equalsIgnoreCase(control.getPlayer()) && 
            gameButton8.getText().equalsIgnoreCase(control.getPlayer()) &&
            gameButton9.getText().equalsIgnoreCase(control.getPlayer())){         
        return true;
        }
        return false;
    }
    
    public boolean checkCol1Winner(){
        if (gameButton1.getText().equalsIgnoreCase(control.getPlayer()) && 
            gameButton4.getText().equalsIgnoreCase(control.getPlayer()) &&
            gameButton7.getText().equalsIgnoreCase(control.getPlayer())){         
        return true;
        }
        return false;
    }
    
    public boolean checkCol2Winner(){      
        if (gameButton2.getText().equalsIgnoreCase(control.getPlayer()) && 
            gameButton5.getText().equalsIgnoreCase(control.getPlayer()) &&
            gameButton8.getText().equalsIgnoreCase(control.getPlayer())){         
        return true;
        }
        return false;
    }
    
    public boolean checkCol3Winner(){
        if (gameButton3.getText().equalsIgnoreCase(control.getPlayer()) && 
            gameButton6.getText().equalsIgnoreCase(control.getPlayer()) &&
            gameButton9.getText().equalsIgnoreCase(control.getPlayer())){        
        return true;
        }
        return false;
    }
    
    public boolean checkDiag1Winner(){
        if (gameButton1.getText().equalsIgnoreCase(control.getPlayer()) && 
            gameButton5.getText().equalsIgnoreCase(control.getPlayer()) &&
            gameButton9.getText().equalsIgnoreCase(control.getPlayer())){         
        return true;
        }
        return false;
    }
    
    public boolean checkDiag2Winner(){
        if (gameButton3.getText().equalsIgnoreCase(control.getPlayer()) && 
            gameButton5.getText().equalsIgnoreCase(control.getPlayer()) &&
            gameButton7.getText().equalsIgnoreCase(control.getPlayer())){         
        return true;
        }
        return false;
    }
    
    public void checkTie(){
        if (!this.gameButton1.getText().equalsIgnoreCase("") && !this.gameButton2.getText().equalsIgnoreCase("") &&
            !this.gameButton3.getText().equalsIgnoreCase("") && !this.gameButton4.getText().equalsIgnoreCase("") &&
            !this.gameButton5.getText().equalsIgnoreCase("") && !this.gameButton6.getText().equalsIgnoreCase("") &&
            !this.gameButton7.getText().equalsIgnoreCase("") && !this.gameButton8.getText().equalsIgnoreCase("") &&
            !this.gameButton9.getText().equalsIgnoreCase("")){
                if (!checkRow1Winner() || !checkRow2Winner() || !checkRow3Winner() ||
                    !checkCol1Winner() || !checkCol2Winner() || !checkCol3Winner() ||
                    !checkDiag1Winner()|| !checkDiag2Winner()){
                        winnerLabel.setText("Gay... a tie, congrats.");
             }
        }
    }
    
    public void declareWinner(){
        if (checkRow1Winner() || checkRow2Winner() || checkRow3Winner() ||
            checkCol1Winner() || checkCol2Winner() || checkCol3Winner() ||
            checkDiag1Winner()|| checkDiag2Winner()){
            winnerLabel.setText(control.getPlayer().toUpperCase() + " WINS!");
                if (control.getPlayer().equalsIgnoreCase("x")){
                    control.setxWinCount(control.getxWinCount()+1);
                    this.xWinLabel.setText("X wins: "+control.getxWinCount());
                }
                if (control.getPlayer().equalsIgnoreCase("o")){
                    control.setyWinCount(control.getyWinCount()+1);
                    this.yWinLabel1.setText("O wins: "+control.getyWinCount());
                }
        }
    }

    
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
    private javax.swing.JButton resetButton;
    private javax.swing.JLabel winnerLabel;
    private javax.swing.JLabel xWinCountLabel;
    private javax.swing.JLabel xWinLabel;
    private javax.swing.JLabel yWinCountLabel;
    private javax.swing.JLabel yWinLabel1;
    // End of variables declaration//GEN-END:variables
}
