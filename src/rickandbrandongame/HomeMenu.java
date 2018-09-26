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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 500));
        setName("HomeMenu"); // NOI18N
        setPreferredSize(new java.awt.Dimension(500, 500));
        setResizable(false);

        startmenupanel.setBackground(new java.awt.Color(255, 255, 255));
        startmenupanel.setName("HomeMenuPanel"); // NOI18N

        startButton.setBackground(new java.awt.Color(64, 64, 64));
        startButton.setFont(new java.awt.Font("Impact", 0, 48)); // NOI18N
        startButton.setForeground(new java.awt.Color(255, 255, 255));
        startButton.setText("Start");
        startButton.setToolTipText("");
        startButton.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        startButton.setPreferredSize(new java.awt.Dimension(300, 75));
        startButton.addActionListener(this);

        javax.swing.GroupLayout startmenupanelLayout = new javax.swing.GroupLayout(startmenupanel);
        startmenupanel.setLayout(startmenupanelLayout);
        startmenupanelLayout.setHorizontalGroup(
            startmenupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, startmenupanelLayout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109))
        );
        startmenupanelLayout.setVerticalGroup(
            startmenupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(startmenupanelLayout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(314, Short.MAX_VALUE))
        );

        startButton.getAccessibleContext().setAccessibleName("Start");
        startButton.getAccessibleContext().setAccessibleDescription("Start Game Button");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(startmenupanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(startmenupanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    // Code for dispatching events from components to event handlers.

    public void actionPerformed(java.awt.event.ActionEvent evt) {
        if (evt.getSource() == startButton) {
            HomeMenu.this.startButtonActionPerformed(evt);
        }
    }// </editor-fold>//GEN-END:initComponents

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
                /* Create and display the Main Game Form */
        java.awt.EventQueue.invokeLater(() -> {
            new MainGameFrame().setVisible(true);
        });
    }//GEN-LAST:event_startButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton startButton;
    private javax.swing.JPanel startmenupanel;
    // End of variables declaration//GEN-END:variables
}
