/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageAirlines;

import Business.*;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
/**
 *
 * @author Vaibhavi
 */
public class ViewAirlinerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewAirliner
     */
    private JPanel userProcessContainer;
    private Airliner airliner;
    private TravelAgency travelAgency;
    
    public ViewAirlinerJPanel(JPanel userProcessContainer,Airliner airliner) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.airliner = airliner;
        disableFields();
        populateAirlineDetails();
    }

    private void populateAirlineDetails()
    {
        airlinerNameTextField.setText(airliner.getAirlinerName());
        airlinerOwnerTextField.setText(airliner.getAirlinerOwner());
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        airlinerOwnerTextField = new javax.swing.JTextField();
        airlinerNameTextField = new javax.swing.JTextField();
        updateAirlinerDetailsBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 102, 102));
        setForeground(new java.awt.Color(0, 102, 102));
        setPreferredSize(new java.awt.Dimension(700, 600));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Display Airliner Details");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Airliner Name :");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Airliner Owner :");

        airlinerOwnerTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                airlinerOwnerTextFieldKeyTyped(evt);
            }
        });

        airlinerNameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                airlinerNameTextFieldKeyTyped(evt);
            }
        });

        updateAirlinerDetailsBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        updateAirlinerDetailsBtn.setText("Update Airliner Details");
        updateAirlinerDetailsBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.darkGray, null, null));
        updateAirlinerDetailsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateAirlinerDetailsBtnActionPerformed(evt);
            }
        });

        backBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        backBtn.setText("<< Back");
        backBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.darkGray, null, null));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        saveBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        saveBtn.setText("Save");
        saveBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.darkGray, null, null));
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)
                        .addComponent(updateAirlinerDetailsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(38, 38, 38)
                                .addComponent(airlinerNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(38, 38, 38)
                                .addComponent(airlinerOwnerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(airlinerNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(airlinerOwnerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateAirlinerDetailsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length-1];
        ManageAirlinerJPanel manageAirlinerJPanel = (ManageAirlinerJPanel)component;
        manageAirlinerJPanel.populateTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        
        if(airlinerNameTextField.getText().isEmpty() || airlinerOwnerTextField.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Please enter all the fields!","Warning",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            airliner.setAirlinerName(airlinerNameTextField.getText());
            airliner.setAirlinerOwner(airlinerOwnerTextField.getText());
            
            JOptionPane.showMessageDialog(null,"Airline Details Updated Successfully!");
            disableFields();
            updateAirlinerDetailsBtn.setEnabled(true);
        }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void updateAirlinerDetailsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateAirlinerDetailsBtnActionPerformed
        
        airlinerNameTextField.setEnabled(true);
        airlinerOwnerTextField.setEnabled(true);
        saveBtn.setEnabled(true);
        updateAirlinerDetailsBtn.setEnabled(false);
    }//GEN-LAST:event_updateAirlinerDetailsBtnActionPerformed

    private void airlinerNameTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_airlinerNameTextFieldKeyTyped
        
        char ch = evt.getKeyChar();
        if(!(Character.isAlphabetic(ch)) || (ch == KeyEvent.VK_BACK_SPACE) || (ch == KeyEvent.VK_DELETE))
        {
            evt.consume();
            if(Character.isDigit(ch) || Character.isSpaceChar(ch))
            JOptionPane.showMessageDialog(null,"Enter alphabetical values only.");
        }
    }//GEN-LAST:event_airlinerNameTextFieldKeyTyped

    private void airlinerOwnerTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_airlinerOwnerTextFieldKeyTyped
        
        char ch = evt.getKeyChar();
        if(!(Character.isAlphabetic(ch)) || (ch == KeyEvent.VK_BACK_SPACE) || (ch == KeyEvent.VK_DELETE))
        {
            evt.consume();
            if(Character.isDigit(ch) || Character.isSpaceChar(ch))
            JOptionPane.showMessageDialog(null,"Enter alphabetical values only.");
        }
    }//GEN-LAST:event_airlinerOwnerTextFieldKeyTyped

    private void disableFields()
    {
        airlinerNameTextField.setEnabled(false);
        airlinerOwnerTextField.setEnabled(false);
        saveBtn.setEnabled(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField airlinerNameTextField;
    private javax.swing.JTextField airlinerOwnerTextField;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton saveBtn;
    private javax.swing.JButton updateAirlinerDetailsBtn;
    // End of variables declaration//GEN-END:variables
}