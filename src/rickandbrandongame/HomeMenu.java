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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("HomeMenu"); // NOI18N
        setResizable(false);

        startmenupanel.setBackground(new java.awt.Color(64, 64, 64));
        startmenupanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        startmenupanel.setMaximumSize(new java.awt.Dimension(500, 500));
        startmenupanel.setMinimumSize(new java.awt.Dimension(500, 500));
        startmenupanel.setName("HomeMenuPanel"); // NOI18N

        startButton.setBackground(new java.awt.Color(255, 255, 255));
        startButton.setFont(new java.awt.Font("Impact", 0, 48)); // NOI18N
        startButton.setForeground(new java.awt.Color(64, 64, 64));
        startButton.setText("Start");
        startButton.setToolTipText("");
        startButton.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, java.awt.Color.black));
        startButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        startButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        startButton.setIconTextGap(0);
        startButton.setMaximumSize(new java.awt.Dimension(300, 75));
        startButton.setMinimumSize(new java.awt.Dimension(300, 75));
        startButton.setName(""); // NOI18N
        startButton.setPreferredSize(new java.awt.Dimension(300, 75));
        startButton.addActionListener(this);
        startmenupanel.add(startButton);
        startButton.getAccessibleContext().setAccessibleDescription("Start Game Button");

        soundfxbutton.setBackground(new java.awt.Color(255, 255, 255));
        soundfxbutton.setFont(new java.awt.Font("Impact", 0, 48)); // NOI18N
        soundfxbutton.setForeground(new java.awt.Color(64, 64, 64));
        soundfxbutton.setText("Sound FX");
        soundfxbutton.setToolTipText("");
        soundfxbutton.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, new java.awt.Color(0, 0, 0)));
        soundfxbutton.setMaximumSize(new java.awt.Dimension(300, 75));
        soundfxbutton.setMinimumSize(new java.awt.Dimension(300, 75));
        soundfxbutton.setPreferredSize(new java.awt.Dimension(300, 75));
        soundfxbutton.addActionListener(this);
        startmenupanel.add(soundfxbutton);
        soundfxbutton.getAccessibleContext().setAccessibleDescription("Turn sound FX on and off");

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

        pack();
    }

    // Code for dispatching events from components to event handlers.

    public void actionPerformed(java.awt.event.ActionEvent evt) {
        if (evt.getSource() == startButton) {
            HomeMenu.this.startButtonActionPerformed(evt);
        }
        else if (evt.getSource() == soundfxbutton) {
            HomeMenu.this.soundfxbuttonActionPerformed(evt);
        }
    }// </editor-fold>//GEN-END:initComponents

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
                /* Create and display the Main Game Form */
        java.awt.EventQueue.invokeLater(() -> {
            new MainGameFrame().setVisible(true);
        });
    }//GEN-LAST:event_startButtonActionPerformed

    private void soundfxbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soundfxbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_soundfxbuttonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton soundfxbutton;
    private javax.swing.JButton startButton;
    private javax.swing.JPanel startmenupanel;
    // End of variables declaration//GEN-END:variables
}
