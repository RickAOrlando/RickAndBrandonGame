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

        jPanel1 = new javax.swing.JPanel();
        StartButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 500));
        setName("HomeMenu"); // NOI18N
        setPreferredSize(new java.awt.Dimension(500, 500));
        setResizable(false);

        jPanel1.setName("HomeMenuPanel"); // NOI18N

        StartButton.setText("Start");
        StartButton.setToolTipText("");
        StartButton.setPreferredSize(new java.awt.Dimension(300, 75));
        StartButton.addActionListener(this);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addComponent(StartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(StartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(315, Short.MAX_VALUE))
        );

        StartButton.getAccessibleContext().setAccessibleName("Start");
        StartButton.getAccessibleContext().setAccessibleDescription("Start Game Button");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    // Code for dispatching events from components to event handlers.

    public void actionPerformed(java.awt.event.ActionEvent evt) {
        if (evt.getSource() == StartButton) {
            HomeMenu.this.StartButtonActionPerformed(evt);
        }
    }// </editor-fold>//GEN-END:initComponents

    private void StartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StartButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton StartButton;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
