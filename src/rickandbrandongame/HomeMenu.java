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
public class HomeMenu extends javax.swing.JFrame implements ActionListener {

    /**
     * Creates new form NewJFrame
     */
    public HomeMenu() {
        initComponents();
    }
    /*
    TODO -- SOUND FX
    Player O - "Ohh ohh" its magic
    Player X - "X gon' give it to ya
    */

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        startmenuPanel = new javax.swing.JPanel();
        startButton = new javax.swing.JButton();
        soundfxButton = new javax.swing.JButton();
        musicButton = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("HomeMenu"); // NOI18N
        setResizable(false);

        startmenuPanel.setBackground(new java.awt.Color(43, 43, 43));
        startmenuPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        startmenuPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        startmenuPanel.setMaximumSize(new java.awt.Dimension(500, 500));
        startmenuPanel.setMinimumSize(new java.awt.Dimension(500, 500));
        startmenuPanel.setName("HomeMenuPanel"); // NOI18N
        startmenuPanel.setPreferredSize(new java.awt.Dimension(500, 500));
        startmenuPanel.setRequestFocusEnabled(false);
        startmenuPanel.setVerifyInputWhenFocusTarget(false);

        startButton.setBackground(new java.awt.Color(255, 255, 255));
        startButton.setFont(new java.awt.Font("Impact", 0, 48)); // NOI18N
        startButton.setForeground(new java.awt.Color(64, 64, 64));
        startButton.setText("Start");
        startButton.setToolTipText("");
        startButton.setAlignmentX(0.5F);
        startButton.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, java.awt.Color.black));
        startButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        startButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        startButton.setMaximumSize(new java.awt.Dimension(300, 75));
        startButton.setMinimumSize(new java.awt.Dimension(300, 75));
        startButton.setName(""); // NOI18N
        startButton.setPreferredSize(new java.awt.Dimension(300, 75));
        startButton.addActionListener(this);

        soundfxButton.setBackground(new java.awt.Color(255, 255, 255));
        soundfxButton.setFont(new java.awt.Font("Impact", 0, 48)); // NOI18N
        soundfxButton.setForeground(new java.awt.Color(64, 64, 64));
        soundfxButton.setText("Sound FX");
        soundfxButton.setToolTipText("");
        soundfxButton.setAlignmentX(0.5F);
        soundfxButton.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, new java.awt.Color(0, 0, 0)));
        soundfxButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        soundfxButton.setMaximumSize(new java.awt.Dimension(300, 75));
        soundfxButton.setMinimumSize(new java.awt.Dimension(300, 75));
        soundfxButton.setName(""); // NOI18N
        soundfxButton.setPreferredSize(new java.awt.Dimension(300, 75));
        soundfxButton.addActionListener(this);

        musicButton.setBackground(new java.awt.Color(255, 255, 255));
        musicButton.setFont(new java.awt.Font("Impact", 0, 48)); // NOI18N
        musicButton.setForeground(new java.awt.Color(64, 64, 64));
        musicButton.setText("Music");
        musicButton.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, java.awt.Color.black));
        musicButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        musicButton.setMaximumSize(new java.awt.Dimension(300, 75));
        musicButton.setMinimumSize(new java.awt.Dimension(300, 75));
        musicButton.setPreferredSize(new java.awt.Dimension(300, 75));
        musicButton.addActionListener(this);

        titleLabel.setBackground(new java.awt.Color(64, 64, 64));
        titleLabel.setFont(new java.awt.Font("Impact", 0, 48)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText(" Tic Tac Toe");
        titleLabel.setAlignmentX(0.5F);
        titleLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        titleLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        titleLabel.setMaximumSize(new java.awt.Dimension(300, 75));
        titleLabel.setMinimumSize(new java.awt.Dimension(300, 75));
        titleLabel.setPreferredSize(new java.awt.Dimension(300, 75));

        javax.swing.GroupLayout startmenuPanelLayout = new javax.swing.GroupLayout(startmenuPanel);
        startmenuPanel.setLayout(startmenuPanelLayout);
        startmenuPanelLayout.setHorizontalGroup(
            startmenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(startmenuPanelLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(startmenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(musicButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(soundfxButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(100, 100, 100))
        );
        startmenuPanelLayout.setVerticalGroup(
            startmenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(startmenuPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(soundfxButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(musicButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        startButton.getAccessibleContext().setAccessibleDescription("Start Game Button");
        soundfxButton.getAccessibleContext().setAccessibleDescription("Turn sound FX on and off");
        musicButton.getAccessibleContext().setAccessibleDescription("Turn Music On/Off");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(startmenuPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(startmenuPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        startmenuPanel.getAccessibleContext().setAccessibleName("startmenupanel");
        startmenuPanel.getAccessibleContext().setAccessibleDescription("the panel that holds the buttons and everything together");

        pack();
    }

    // Code for dispatching events from components to event handlers.

    public void actionPerformed(java.awt.event.ActionEvent evt) {
        if (evt.getSource() == startButton) {
            HomeMenu.this.startButtonActionPerformed(evt);
        }
        else if (evt.getSource() == soundfxButton) {
            HomeMenu.this.soundfxButtonActionPerformed(evt);
        }
        else if (evt.getSource() == musicButton) {
            HomeMenu.this.musicButtonActionPerformed(evt);
        }
    }// </editor-fold>//GEN-END:initComponents

    private void soundfxButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soundfxButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_soundfxButtonActionPerformed

    private void musicButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_musicButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_musicButtonActionPerformed

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        /* Create and display the Main Game Form */
        java.awt.EventQueue.invokeLater(() -> {
            new MainGameFrame().setVisible(true);
        });
    }//GEN-LAST:event_startButtonActionPerformed

    
    // [Fixed 9/28/18 4:22] Code Review -- naming conventions for variables and buttons is incorrect
    // Example: testVariable
    // Note that the first word is lowercase, and the second word starts uppercase
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton musicButton;
    private javax.swing.JButton soundfxButton;
    private javax.swing.JButton startButton;
    private javax.swing.JPanel startmenuPanel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
