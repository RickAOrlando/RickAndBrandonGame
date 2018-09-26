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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 500));
        setName("HomeMenu"); // NOI18N
        setPreferredSize(new java.awt.Dimension(500, 500));
        setResizable(false);

        startmenupanel.setName("HomeMenuPanel"); // NOI18N

        startButton.setText("Start");
        startButton.setToolTipText("");
        startButton.setPreferredSize(new java.awt.Dimension(300, 75));
        startButton.addActionListener(this);

        jTextPane1.setText("Rick and Brandon's Game");
        jScrollPane1.setViewportView(jTextPane1);

        javax.swing.GroupLayout startmenupanelLayout = new javax.swing.GroupLayout(startmenupanel);
        startmenupanel.setLayout(startmenupanelLayout);
        startmenupanelLayout.setHorizontalGroup(
            startmenupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, startmenupanelLayout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109))
            .addGroup(startmenupanelLayout.createSequentialGroup()
                .addGap(243, 243, 243)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        startmenupanelLayout.setVerticalGroup(
            startmenupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(startmenupanelLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(299, Short.MAX_VALUE))
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
        // TODO add your handling code here:
    }//GEN-LAST:event_startButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JButton startButton;
    private javax.swing.JPanel startmenupanel;
    // End of variables declaration//GEN-END:variables
}
