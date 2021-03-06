/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageCustomerBookings;

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
public class CustomerBookingDetailsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerBookingDetailsJPanel
     */
    private JPanel userProcessContainer;
    private Client client;
    private Flights flight;
    
    public CustomerBookingDetailsJPanel(JPanel userProcessContainer, Client client, Flights flight) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.client = client;
        this.flight = flight;
        
        disableFields();
        populateCustomerData();
    }
    
    public void populateCustomerData()
    {
            firstNameTextField.setText(client.getFirstName());
            lastNameTextField.setText(client.getLastName());
            addressTextField.setText(client.getAddress());
            emailTextField.setText(client.getEmail());
            phoneNumTextField.setText(String.valueOf(client.getPhoneNum()));
            passportNumTextField.setText(client.getPassportNum());
            genderTextField.setText(client.getGender());
            dateOfBirthTextField.setText(client.getDateOfBirth());
            seatBookedTextField.setText(client.getSeatBooked().getSeatAlloted());
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
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        phoneNumTextField = new javax.swing.JTextField();
        addressTextField = new javax.swing.JTextField();
        lastNameTextField = new javax.swing.JTextField();
        firstNameTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        seatBookedTextField = new javax.swing.JTextField();
        dateOfBirthTextField = new javax.swing.JTextField();
        passportNumTextField = new javax.swing.JTextField();
        genderTextField = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();
        updateDetailsBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 102, 102));
        setPreferredSize(new java.awt.Dimension(649, 450));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Customer Booking Details");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("First Name :");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Last Name :");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Address :");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Contact Number :");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Email :");

        emailTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                emailTextFieldKeyTyped(evt);
            }
        });

        phoneNumTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                phoneNumTextFieldKeyTyped(evt);
            }
        });

        addressTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                addressTextFieldKeyTyped(evt);
            }
        });

        lastNameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lastNameTextFieldKeyTyped(evt);
            }
        });

        firstNameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                firstNameTextFieldKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Gender :");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Passport Number :");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("Date Of Birth :");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("Seat Booked :");

        seatBookedTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                seatBookedTextFieldKeyTyped(evt);
            }
        });

        genderTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                genderTextFieldKeyTyped(evt);
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
        backBtn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                backBtnKeyTyped(evt);
            }
        });

        updateDetailsBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        updateDetailsBtn.setText("Update Details");
        updateDetailsBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.darkGray, null, null));
        updateDetailsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateDetailsBtnActionPerformed(evt);
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
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phoneNumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(updateDetailsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(genderTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dateOfBirthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(passportNumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(seatBookedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(82, 82, 82)))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(genderTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(passportNumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(dateOfBirthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(phoneNumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(seatBookedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(updateDetailsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void emailTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailTextFieldKeyTyped

        char ch = evt.getKeyChar();
        if(!(Character.isAlphabetic(ch)) || (ch == KeyEvent.VK_BACK_SPACE) || (ch == KeyEvent.VK_DELETE))
        {
            evt.consume();
            if(Character.isDigit(ch) || Character.isSpaceChar(ch))
            JOptionPane.showMessageDialog(null,"Enter alphabetical values only.");
        }
    }//GEN-LAST:event_emailTextFieldKeyTyped

    private void phoneNumTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phoneNumTextFieldKeyTyped

        char ch = evt.getKeyChar();
        if(!(Character.isDigit(ch)) || (ch == KeyEvent.VK_BACK_SPACE) || (ch == KeyEvent.VK_DELETE))
        {
            evt.consume();
            if(Character.isAlphabetic(ch) || Character.isSpaceChar(ch))
            JOptionPane.showMessageDialog(null,"Enter numerical values only.");
        }
    }//GEN-LAST:event_phoneNumTextFieldKeyTyped

    private void addressTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addressTextFieldKeyTyped

        char ch = evt.getKeyChar();
        if(!(Character.isAlphabetic(ch)) || (ch == KeyEvent.VK_BACK_SPACE) || (ch == KeyEvent.VK_DELETE))
        {
            evt.consume();
            if(Character.isDigit(ch) || Character.isSpaceChar(ch))
            JOptionPane.showMessageDialog(null,"Enter alphabetical values only.");
        }
    }//GEN-LAST:event_addressTextFieldKeyTyped

    private void lastNameTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lastNameTextFieldKeyTyped

        char ch = evt.getKeyChar();
        if(!(Character.isAlphabetic(ch)) || (ch == KeyEvent.VK_BACK_SPACE) || (ch == KeyEvent.VK_DELETE))
        {
            evt.consume();
            if(Character.isDigit(ch) || Character.isSpaceChar(ch))
            JOptionPane.showMessageDialog(null,"Enter alphabetical values only.");
        }
    }//GEN-LAST:event_lastNameTextFieldKeyTyped

    private void firstNameTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_firstNameTextFieldKeyTyped

        char ch = evt.getKeyChar();
        if(!(Character.isAlphabetic(ch)) || (ch == KeyEvent.VK_BACK_SPACE) || (ch == KeyEvent.VK_DELETE))
        {
            evt.consume();
            if(Character.isDigit(ch) || Character.isSpaceChar(ch))
            JOptionPane.showMessageDialog(null,"Enter alphabetical values only.");
        }
    }//GEN-LAST:event_firstNameTextFieldKeyTyped

    private void seatBookedTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_seatBookedTextFieldKeyTyped

    }//GEN-LAST:event_seatBookedTextFieldKeyTyped

    private void genderTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_genderTextFieldKeyTyped

        char ch = evt.getKeyChar();
        if(!(Character.isAlphabetic(ch)) || (ch == KeyEvent.VK_BACK_SPACE) || (ch == KeyEvent.VK_DELETE))
        {
            evt.consume();
            if(Character.isDigit(ch) || Character.isSpaceChar(ch))
            JOptionPane.showMessageDialog(null,"Enter alphabetical values only.");
        }
    }//GEN-LAST:event_genderTextFieldKeyTyped

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length-1];
        ManageBookingsJPanel manageBookingsJPanel = (ManageBookingsJPanel)component;
        manageBookingsJPanel.populateTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void backBtnKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_backBtnKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_backBtnKeyTyped

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed

        if(firstNameTextField.getText().isEmpty() || lastNameTextField.getText().isEmpty() || emailTextField.getText().isEmpty()
            || passportNumTextField.getText().isEmpty() || phoneNumTextField.getText().isEmpty() || addressTextField.getText().isEmpty()
            ||  genderTextField.getText().isEmpty() || dateOfBirthTextField.getText().isEmpty() || seatBookedTextField.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Please enter all fields.","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            String previousSeatBooked = client.getSeatBooked().getSeatAlloted();
            String seatBooked = seatBookedTextField.getText();
            
            Seats [][] seats = flight.getSeatsAvailable();
            
            outerloop:
            for(int i = 0;i<seats.length;i++)
            {
                for(int j = 0;j<seats[i].length;j++)
                {
                    if(seats[i][j].getSeatAlloted().equalsIgnoreCase(seatBooked))
                    {
                        if(seats[i][j].getSeatAlloted().equalsIgnoreCase(previousSeatBooked))
                        {
                            seats[i][j].setBookingStatus(false);
                        }
                        if(seats[i][j].isBookingStatus() == true)
                        {
                            JOptionPane.showMessageDialog(null, "Seat is already booked.");
                        }
                        else
                        {
                            for(Client client : flight.getClientCatalog())
                            {
                                client.setFirstName(firstNameTextField.getText());
                                client.setLastName(lastNameTextField.getText());
                                client.setAddress(addressTextField.getText());
                                client.setEmail(emailTextField.getText());
                                client.setGender(genderTextField.getText());
                                client.setDateOfBirth(dateOfBirthTextField.getText());
                                client.setPassportNum(passportNumTextField.getText());
                                client.setPhoneNum(Long.parseLong(phoneNumTextField.getText()));

                                seats[i][j].setBookingStatus(true);
                                client.setSeatBooked(seats[i][j]);

                                break outerloop;
                            }
                        }
                    }
                }
            }
            JOptionPane.showMessageDialog(null, "Client Details Updated Successfully!");
            resetFields();
            updateDetailsBtn.setEnabled(true);
            saveBtn.setEnabled(false);
        }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void updateDetailsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateDetailsBtnActionPerformed
        
        firstNameTextField.setEnabled(true);
        lastNameTextField.setEnabled(true);
        emailTextField.setEnabled(true);
        phoneNumTextField.setEnabled(true);
        genderTextField.setEnabled(true);
        addressTextField.setEnabled(true);
        passportNumTextField.setEnabled(true);
        dateOfBirthTextField.setEnabled(true);
        seatBookedTextField.setEnabled(true);
        saveBtn.setEnabled(true);
        updateDetailsBtn.setEnabled(false);
    }//GEN-LAST:event_updateDetailsBtnActionPerformed

    private void disableFields()
    {
        firstNameTextField.setEnabled(false);
        lastNameTextField.setEnabled(false);
        emailTextField.setEnabled(false);
        phoneNumTextField.setEnabled(false);
        genderTextField.setEnabled(false);
        addressTextField.setEnabled(false);
        passportNumTextField.setEnabled(false);
        dateOfBirthTextField.setEnabled(false);
        seatBookedTextField.setEnabled(false);
        saveBtn.setEnabled(false);
    }
    
    private void resetFields()
    {
        firstNameTextField.setText("");
        lastNameTextField.setText("");
        emailTextField.setText("");
        phoneNumTextField.setText("");
        genderTextField.setText("");
        addressTextField.setText("");
        passportNumTextField.setText("");
        dateOfBirthTextField.setText("");
        seatBookedTextField.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressTextField;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField dateOfBirthTextField;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JTextField genderTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JTextField passportNumTextField;
    private javax.swing.JTextField phoneNumTextField;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTextField seatBookedTextField;
    private javax.swing.JButton updateDetailsBtn;
    // End of variables declaration//GEN-END:variables
}
