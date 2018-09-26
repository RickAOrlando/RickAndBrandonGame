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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        startmenupanel = new javax.swing.JPanel();
        startButton = new javax.swing.JButton();
        soundfxbutton = new javax.swing.JButton();
        musicbutton = new javax.swing.JButton();
        titlelabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("HomeMenu"); // NOI18N
        setResizable(false);

        startmenupanel.setBackground(new java.awt.Color(64, 64, 64));
        startmenupanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        startmenupanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        startmenupanel.setMaximumSize(new java.awt.Dimension(500, 500));
        startmenupanel.setMinimumSize(new java.awt.Dimension(500, 500));
        startmenupanel.setName("HomeMenuPanel"); // NOI18N
        startmenupanel.setRequestFocusEnabled(false);
        startmenupanel.setVerifyInputWhenFocusTarget(false);

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

        soundfxbutton.setBackground(new java.awt.Color(255, 255, 255));
        soundfxbutton.setFont(new java.awt.Font("Impact", 0, 48)); // NOI18N
        soundfxbutton.setForeground(new java.awt.Color(64, 64, 64));
        soundfxbutton.setText("Sound FX");
        soundfxbutton.setToolTipText("");
        soundfxbutton.setAlignmentX(0.5F);
        soundfxbutton.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, new java.awt.Color(0, 0, 0)));
        soundfxbutton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        soundfxbutton.setMaximumSize(new java.awt.Dimension(300, 75));
        soundfxbutton.setMinimumSize(new java.awt.Dimension(300, 75));
        soundfxbutton.setName(""); // NOI18N
        soundfxbutton.setPreferredSize(new java.awt.Dimension(300, 75));
        soundfxbutton.addActionListener(this);

        musicbutton.setBackground(new java.awt.Color(255, 255, 255));
        musicbutton.setFont(new java.awt.Font("Impact", 0, 48)); // NOI18N
        musicbutton.setForeground(new java.awt.Color(64, 64, 64));
        musicbutton.setText("Music");
        musicbutton.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, java.awt.Color.black));
        musicbutton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        musicbutton.setMaximumSize(new java.awt.Dimension(300, 75));
        musicbutton.setMinimumSize(new java.awt.Dimension(300, 75));
        musicbutton.setPreferredSize(new java.awt.Dimension(300, 75));
        musicbutton.addActionListener(this);

        titlelabel.setBackground(new java.awt.Color(64, 64, 64));
        titlelabel.setFont(new java.awt.Font("Impact", 0, 48)); // NOI18N
        titlelabel.setForeground(new java.awt.Color(255, 255, 255));
        titlelabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titlelabel.setText("Tic Tac Toe");
        titlelabel.setAlignmentX(0.5F);
        titlelabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        titlelabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        titlelabel.setMaximumSize(new java.awt.Dimension(300, 75));
        titlelabel.setMinimumSize(new java.awt.Dimension(300, 75));
        titlelabel.setPreferredSize(new java.awt.Dimension(300, 75));

        javax.swing.GroupLayout startmenupanelLayout = new javax.swing.GroupLayout(startmenupanel);
        startmenupanel.setLayout(startmenupanelLayout);
        startmenupanelLayout.setHorizontalGroup(
            startmenupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(startmenupanelLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(startmenupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titlelabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(musicbutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(soundfxbutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(100, 100, 100))
        );
        startmenupanelLayout.setVerticalGroup(
            startmenupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(startmenupanelLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(titlelabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(soundfxbutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(musicbutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        startButton.getAccessibleContext().setAccessibleDescription("Start Game Button");
        soundfxbutton.getAccessibleContext().setAccessibleDescription("Turn sound FX on and off");
        musicbutton.getAccessibleContext().setAccessibleDescription("Turn Music On/Off");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(startmenupanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(startmenupanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        startmenupanel.getAccessibleContext().setAccessibleName("startmenupanel");
        startmenupanel.getAccessibleContext().setAccessibleDescription("the panel that holds the buttons and everything together");

        pack();
    }

    // Code for dispatching events from components to event handlers.

    public void actionPerformed(java.awt.event.ActionEvent evt) {
        if (evt.getSource() == soundfxbutton) {
            HomeMenu.this.soundfxbuttonActionPerformed(evt);
        }
        else if (evt.getSource() == musicbutton) {
            HomeMenu.this.musicbuttonActionPerformed(evt);
        }
        else if (evt.getSource() == startButton) {
            HomeMenu.this.startButtonActionPerformed(evt);
        }
    }// </editor-fold>//GEN-END:initComponents

    private void soundfxbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soundfxbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_soundfxbuttonActionPerformed

    private void musicbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_musicbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_musicbuttonActionPerformed

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        /* Create and display the Main Game Form */
        java.awt.EventQueue.invokeLater(() -> {
            new MainGameFrame().setVisible(true);
        });
    }//GEN-LAST:event_startButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton musicbutton;
    private javax.swing.JButton soundfxbutton;
    private javax.swing.JButton startButton;
    private javax.swing.JPanel startmenupanel;
    private javax.swing.JLabel titlelabel;
    // End of variables declaration//GEN-END:variables
}
