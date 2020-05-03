/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendingmachine;


import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.Icon;
import javax.swing.ImageIcon;


public class VendingMachineGUI extends javax.swing.JFrame {

    /**
     * Creates new form VendingMachineGUI
     */
    public VendingMachineGUI() {
        initComponents();
        enter100.setVisible(false);
        enter200.setVisible(false);
        enter500.setVisible(false);
        enter1000.setVisible(false);
        displayAmount.setText("        Enter Cash.");
    }
    
    //cashStatus checks if cash is inserted or not
    boolean cashStatus = false;
    
    //okStatus checks if enter button was clicked by user to confirm inserted amount
    boolean okStatus = false;
    
    //orderStatus checks if enter button was clicked by user to confirm chosen item
    boolean orderStatus = false;
    
    //threadStatus is for the implementation of the delays in animation
    boolean threadStatus = true;
    
    //sets the decimal place to 2
    NumberFormat dec = new DecimalFormat("#0.00"); 
    
    //calculates total amount entered by the user
    double total = 0;
    
    //price of each item in the machine
    double price = 0;
    
    //total - price
    double change = 0;
    
    // Money handler
    Boolean money = false;
    // Keypad Handler
    Boolean keypad = false;
    StringBuilder keypadInput = new StringBuilder();
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        dispenserDuplicate = new javax.swing.JLabel();
        displayItem = new javax.swing.JLabel();
        okayButton = new javax.swing.JLabel();
        eraseButton = new javax.swing.JLabel();
        keypad0 = new javax.swing.JLabel();
        keypad9 = new javax.swing.JLabel();
        keypad8 = new javax.swing.JLabel();
        keypad7 = new javax.swing.JLabel();
        keypad6 = new javax.swing.JLabel();
        keypad5 = new javax.swing.JLabel();
        keypad4 = new javax.swing.JLabel();
        keypad3 = new javax.swing.JLabel();
        keypad2 = new javax.swing.JLabel();
        keypad1 = new javax.swing.JLabel();
        item19Label = new javax.swing.JLabel();
        item18Label = new javax.swing.JLabel();
        item17Label = new javax.swing.JLabel();
        item16Label = new javax.swing.JLabel();
        item15Label = new javax.swing.JLabel();
        item14Label = new javax.swing.JLabel();
        item13Label = new javax.swing.JLabel();
        item12Label = new javax.swing.JLabel();
        item11Label = new javax.swing.JLabel();
        item10Label = new javax.swing.JLabel();
        item9Label = new javax.swing.JLabel();
        item8Label = new javax.swing.JLabel();
        item7Label = new javax.swing.JLabel();
        item6Label = new javax.swing.JLabel();
        item5Label = new javax.swing.JLabel();
        item4Label = new javax.swing.JLabel();
        item3Label = new javax.swing.JLabel();
        item2Label = new javax.swing.JLabel();
        item1Label = new javax.swing.JLabel();
        changeSlotDuplicate = new javax.swing.JLabel();
        change100 = new javax.swing.JLabel();
        change200 = new javax.swing.JLabel();
        change500 = new javax.swing.JLabel();
        displayNumber = new javax.swing.JLabel();
        displayAmount = new javax.swing.JLabel();
        screen = new javax.swing.JLabel();
        cashSlotDuplicate = new javax.swing.JLabel();
        enter100 = new javax.swing.JLabel();
        enter200 = new javax.swing.JLabel();
        enter500 = new javax.swing.JLabel();
        enter1000 = new javax.swing.JLabel();
        confirmAmountButton = new javax.swing.JLabel();
        money_1000 = new javax.swing.JLabel();
        money_500 = new javax.swing.JLabel();
        money_200 = new javax.swing.JLabel();
        money_100 = new javax.swing.JLabel();
        walletLabel = new javax.swing.JLabel();
        catchPhraseLabel = new javax.swing.JLabel();
        projectTitleLabel = new javax.swing.JLabel();
        vendingMachineImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dispenserDuplicate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dispenser_duplicate.jpg"))); // NOI18N
        jPanel1.add(dispenserDuplicate, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 760, -1, -1));

        displayItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bag Tag.jpg"))); // NOI18N
        jPanel1.add(displayItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 860, 70, 60));

        okayButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                okayButtonMouseClicked(evt);
            }
        });
        jPanel1.add(okayButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(685, 486, 30, 30));

        eraseButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eraseButtonMouseClicked(evt);
            }
        });
        jPanel1.add(eraseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 486, 30, 30));

        keypad0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                keypad0MouseClicked(evt);
            }
        });
        jPanel1.add(keypad0, new org.netbeans.lib.awtextra.AbsoluteConstraints(642, 486, 30, 30));

        keypad9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                keypad9MouseClicked(evt);
            }
        });
        jPanel1.add(keypad9, new org.netbeans.lib.awtextra.AbsoluteConstraints(685, 445, 30, 30));

        keypad8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                keypad8MouseClicked(evt);
            }
        });
        jPanel1.add(keypad8, new org.netbeans.lib.awtextra.AbsoluteConstraints(642, 445, 30, 30));

        keypad7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                keypad7MouseClicked(evt);
            }
        });
        jPanel1.add(keypad7, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 445, 30, 30));

        keypad6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                keypad6MouseClicked(evt);
            }
        });
        jPanel1.add(keypad6, new org.netbeans.lib.awtextra.AbsoluteConstraints(685, 405, 30, 30));

        keypad5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                keypad5MouseClicked(evt);
            }
        });
        jPanel1.add(keypad5, new org.netbeans.lib.awtextra.AbsoluteConstraints(642, 405, 30, 30));

        keypad4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                keypad4MouseClicked(evt);
            }
        });
        jPanel1.add(keypad4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 405, 30, 30));

        keypad3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                keypad3MouseClicked(evt);
            }
        });
        jPanel1.add(keypad3, new org.netbeans.lib.awtextra.AbsoluteConstraints(685, 365, 30, 30));

        keypad2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                keypad2MouseClicked(evt);
            }
        });
        jPanel1.add(keypad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(643, 365, 30, 30));

        keypad1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                keypad1MouseClicked(evt);
            }
        });
        jPanel1.add(keypad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 365, 30, 30));

        item19Label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        item19Label.setText("700.00");
        jPanel1.add(item19Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 646, -1, -1));

        item18Label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        item18Label.setText("300.00");
        jPanel1.add(item18Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 646, -1, -1));

        item17Label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        item17Label.setText("500.00");
        jPanel1.add(item17Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 646, -1, -1));

        item16Label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        item16Label.setText("500.00");
        jPanel1.add(item16Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 646, -1, -1));

        item15Label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        item15Label.setText("300.00");
        jPanel1.add(item15Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 510, -1, -1));

        item14Label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        item14Label.setText("100.00");
        jPanel1.add(item14Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 510, -1, -1));

        item13Label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        item13Label.setText("700.00");
        jPanel1.add(item13Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 510, -1, -1));

        item12Label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        item12Label.setText("100.00");
        jPanel1.add(item12Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 510, -1, -1));

        item11Label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        item11Label.setText("200.00");
        jPanel1.add(item11Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 510, -1, -1));

        item10Label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        item10Label.setText("200.00");
        jPanel1.add(item10Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 370, -1, -1));

        item9Label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        item9Label.setText("200.00");
        jPanel1.add(item9Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 370, -1, -1));

        item8Label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        item8Label.setText("300.00");
        jPanel1.add(item8Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 370, -1, -1));

        item7Label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        item7Label.setText("200.00");
        jPanel1.add(item7Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 370, -1, -1));

        item6Label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        item6Label.setText("400.00");
        jPanel1.add(item6Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 370, -1, -1));

        item5Label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        item5Label.setText("100.00");
        jPanel1.add(item5Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 232, -1, -1));

        item4Label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        item4Label.setText("300.00");
        jPanel1.add(item4Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 232, -1, -1));

        item3Label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        item3Label.setText("400.00");
        jPanel1.add(item3Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 232, -1, -1));
        item3Label.getAccessibleContext().setAccessibleName("item3Label");

        item2Label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        item2Label.setText("100.00");
        jPanel1.add(item2Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 232, -1, -1));

        item1Label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        item1Label.setText("200.00");
        item1Label.setRequestFocusEnabled(false);
        jPanel1.add(item1Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 232, -1, -1));

        changeSlotDuplicate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/change_slot.jpg"))); // NOI18N
        jPanel1.add(changeSlotDuplicate, new org.netbeans.lib.awtextra.AbsoluteConstraints(584, 478, -1, -1));

        change100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/100_bill - Copy.png"))); // NOI18N
        jPanel1.add(change100, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 500, -1, -1));

        change200.setIcon(new javax.swing.ImageIcon(getClass().getResource("/200_bill - Copy.png"))); // NOI18N
        jPanel1.add(change200, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 500, -1, -1));

        change500.setIcon(new javax.swing.ImageIcon(getClass().getResource("/500_bill - Copy.png"))); // NOI18N
        jPanel1.add(change500, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 500, -1, -1));

        displayNumber.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(displayNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 120, 50, 50));

        displayAmount.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jPanel1.add(displayAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 120, 120, 50));

        screen.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        screen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/screen.PNG"))); // NOI18N
        screen.setText("test");
        screen.setToolTipText("");
        jPanel1.add(screen, new org.netbeans.lib.awtextra.AbsoluteConstraints(589, 110, 140, 70));

        cashSlotDuplicate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/money_slot.jpg"))); // NOI18N
        jPanel1.add(cashSlotDuplicate, new org.netbeans.lib.awtextra.AbsoluteConstraints(576, 24, -1, -1));

        enter100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/100_bill - Copy.png"))); // NOI18N
        jPanel1.add(enter100, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 230, -1, -1));

        enter200.setIcon(new javax.swing.ImageIcon(getClass().getResource("/200_bill - Copy.png"))); // NOI18N
        jPanel1.add(enter200, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 230, -1, -1));

        enter500.setIcon(new javax.swing.ImageIcon(getClass().getResource("/500_bill - Copy.png"))); // NOI18N
        jPanel1.add(enter500, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 230, -1, -1));

        enter1000.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1000_bill - Copy.png"))); // NOI18N
        jPanel1.add(enter1000, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 230, -1, -1));

        confirmAmountButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        confirmAmountButton.setForeground(new java.awt.Color(255, 255, 255));
        confirmAmountButton.setText("ENTER");
        confirmAmountButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmAmountButtonMouseClicked(evt);
            }
        });
        jPanel1.add(confirmAmountButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(666, 275, 40, 40));

        money_1000.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1000_bill.png"))); // NOI18N
        money_1000.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                money_1000MouseClicked(evt);
            }
        });
        jPanel1.add(money_1000, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 270, -1, 110));

        money_500.setIcon(new javax.swing.ImageIcon(getClass().getResource("/500_bill.png"))); // NOI18N
        money_500.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                money_500MouseClicked(evt);
            }
        });
        jPanel1.add(money_500, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 400, -1, 110));

        money_200.setIcon(new javax.swing.ImageIcon(getClass().getResource("/200_bill.png"))); // NOI18N
        money_200.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                money_200MouseClicked(evt);
            }
        });
        jPanel1.add(money_200, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 530, -1, 110));

        money_100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/100_bill.png"))); // NOI18N
        money_100.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                money_100MouseClicked(evt);
            }
        });
        jPanel1.add(money_100, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 660, -1, 110));

        walletLabel.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        walletLabel.setText("YOUR WALLET");
        jPanel1.add(walletLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 220, -1, -1));

        catchPhraseLabel.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        catchPhraseLabel.setText("A Vending Machine Simulator");
        jPanel1.add(catchPhraseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 120, -1, -1));

        projectTitleLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cool Text - itam vendo 317525316115710.png"))); // NOI18N
        jPanel1.add(projectTitleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 60, -1, -1));

        vendingMachineImage.setForeground(new java.awt.Color(255, 255, 255));
        vendingMachineImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vending Machine 1.jpg"))); // NOI18N
        jPanel1.add(vendingMachineImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 1150));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //when clicked, user will insert 1000
    private void money_1000MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_money_1000MouseClicked
        threadStatus = true;
        if(money == false){
            
        enter1000.setVisible(true);
        
        Runnable cashRun = new Runnable(){
            @Override
            public void run(){
                try{ 
                    for(int y =200; y>-30;y--){
                        Thread.sleep(3);
                        enter1000.setBounds(630, y, 140, 210);
                    }
                    cashStatus = true;
                    enter1000.setVisible(false);
                    total+= 1000;
                    displayAmount.setText(String.valueOf("           " + dec.format(total)));
                }
                catch(InterruptedException ex){
                    ex.printStackTrace();
                }
            }
        };
        
        Thread cashThread = new Thread(cashRun);
        cashThread.start();
        }
    }//GEN-LAST:event_money_1000MouseClicked

     //when clicked, user will insert 500
    private void money_500MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_money_500MouseClicked
        threadStatus = true;
        if(money == false){
            
        enter500.setVisible(true);
        
        Runnable cashRun = new Runnable(){
            @Override
            public void run(){
                try{ 
                    for(int y =200; y>-30;y--){
                        Thread.sleep(3);
                        enter500.setBounds(630, y, 140, 210);
                    }
                    cashStatus = true;
                    enter500.setVisible(false);
                    total+= 500;
                    displayAmount.setText(String.valueOf("             " + dec.format(total)));
                }
                catch(InterruptedException ex){
                    ex.printStackTrace();
                }
            }
        };
        
        Thread cashThread = new Thread(cashRun);
        cashThread.start();
        }
    }//GEN-LAST:event_money_500MouseClicked

     //when clicked, user will insert 200
    private void money_200MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_money_200MouseClicked
        threadStatus = true;
        if(money == false){
        enter200.setVisible(true);
        
        Runnable cashRun = new Runnable(){
            @Override
            public void run(){
                try{ 
                    for(int y =200; y>-30;y--){
                        Thread.sleep(3);
                        enter200.setBounds(630, y, 140, 210);
                    }
                    cashStatus = true;
                    enter200.setVisible(false);
                    total+= 200;
                    displayAmount.setText(String.valueOf("             " + dec.format(total)));
                }
                catch(InterruptedException ex){
                    ex.printStackTrace();
                }
            }
        };
        
        Thread cashThread = new Thread(cashRun);
        cashThread.start();
        }
    }//GEN-LAST:event_money_200MouseClicked

     //when clicked, user will insert 100
    private void money_100MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_money_100MouseClicked
        threadStatus = true;
        if(money == false){ // check if the money hasn't been inserted yet. If the value is true, the system won't animate or insert a money to total.
            enter100.setVisible(true);
            Runnable cashRun = new Runnable(){
            @Override
            public void run(){
                try{ 
                    for(int y =200; y>-30;y--){
                        Thread.sleep(3);
                        enter100.setBounds(630, y, 140, 210);
                    }
                    cashStatus = true;
                    screen.setVisible(true);
                    total += 100;
                    enter100.setVisible(false);
                    displayAmount.setText(String.valueOf("             " + dec.format(total)));
                }
                catch(InterruptedException ex){
                    ex.printStackTrace();
                }
            }
            };
        Thread cashThread = new Thread(cashRun);
        cashThread.start();
        }
        
        
    }//GEN-LAST:event_money_100MouseClicked

    private void keypad1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_keypad1MouseClicked
         if(cashStatus && threadStatus && okStatus){
            displayAmount.setText("");
            if(displayNumber.getText().length()<2){
                displayNumber.setText(displayNumber.getText()+"1");
            }
        }
    }//GEN-LAST:event_keypad1MouseClicked

    private void keypad2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_keypad2MouseClicked
        if(cashStatus && threadStatus && okStatus){
            displayAmount.setText("");
            if(displayNumber.getText().length()<2){
                displayNumber.setText(displayNumber.getText()+"2");
            }
        }
    }//GEN-LAST:event_keypad2MouseClicked

    private void keypad3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_keypad3MouseClicked
        if(cashStatus && threadStatus && okStatus){
            displayAmount.setText("");
            if(displayNumber.getText().length()<2){
                displayNumber.setText(displayNumber.getText()+"3");
            }
        }
    }//GEN-LAST:event_keypad3MouseClicked

    private void keypad4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_keypad4MouseClicked
        if(cashStatus && threadStatus && okStatus){
            displayAmount.setText("");
            if(displayNumber.getText().length()<2){
                displayNumber.setText(displayNumber.getText()+"4");
            }
        }
    }//GEN-LAST:event_keypad4MouseClicked

    private void keypad5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_keypad5MouseClicked
        if(cashStatus && threadStatus && okStatus){
            displayAmount.setText("");
            if(displayNumber.getText().length()<2){
                displayNumber.setText(displayNumber.getText()+"5");
            }
        }
    }//GEN-LAST:event_keypad5MouseClicked

    private void keypad6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_keypad6MouseClicked
        if(cashStatus && threadStatus && okStatus){
            displayAmount.setText("");
            if(displayNumber.getText().length()<2){
                displayNumber.setText(displayNumber.getText()+"6");
            }
        }
    }//GEN-LAST:event_keypad6MouseClicked

    private void keypad7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_keypad7MouseClicked
        if(cashStatus && threadStatus && okStatus){
            displayAmount.setText("");
            if(displayNumber.getText().length()<2){
                displayNumber.setText(displayNumber.getText()+"7");
            }
        }
    }//GEN-LAST:event_keypad7MouseClicked

    private void keypad8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_keypad8MouseClicked
        if(cashStatus && threadStatus && okStatus){
            displayAmount.setText("");
            if(displayNumber.getText().length()<2){
                displayNumber.setText(displayNumber.getText()+"8");
            }
        }
    }//GEN-LAST:event_keypad8MouseClicked

    private void keypad9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_keypad9MouseClicked
        if(cashStatus && threadStatus && okStatus){
            displayAmount.setText("");
            if(displayNumber.getText().length()<2){
                displayNumber.setText(displayNumber.getText()+"9");
            }
        }
    }//GEN-LAST:event_keypad9MouseClicked

    private void keypad0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_keypad0MouseClicked
        if(cashStatus && threadStatus && okStatus){ // Need to modify this has a bug when user tries to buy another item because if values. 
                                                    // The setText will show nothing.
            displayAmount.setText("");
            if(displayNumber.getText().length()<2){
                displayNumber.setText(displayNumber.getText()+"0");
            }
        }
    }//GEN-LAST:event_keypad0MouseClicked

    //to erase number entered
    private void eraseButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eraseButtonMouseClicked
        if(cashStatus && threadStatus){
            displayNumber.setText("");
            keypadInput.setLength(0);
        }
    }//GEN-LAST:event_eraseButtonMouseClicked

    //okay button on keypad to confirm item
    private void okayButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okayButtonMouseClicked
        if(orderStatus){
            String pin = displayNumber.getText();
            int numPin = Integer.parseInt(pin);
            displayNumber.setVisible(true);
            switch(numPin){
                //item 1
                case 01:  
                    price = 200;
                    change = total - price;
                    //START checks if your money is enough, if not restart from the top
                    if(total < price){
                        orderStatus = false;
                        displayAmount.setText("Err: Add Money");
                        money = false;
                        money_100.setEnabled(true);
                        money_200.setEnabled(true);
                        money_500.setEnabled(true);
                        money_1000.setEnabled(true);
                        displayNumber.setText("");
                    }//END
                    else{
                        
                    if(change != 0){
                        displayAmount.setText("Transac Complt");
                        displayNumber.setVisible(false);
                        Runnable cashRun;
                        cashRun = new Runnable(){
                        @Override
                        public void run(){

                            threadStatus = true;
                            try {

                                for(int i =499; i<change;change=change-500){

                                    for(int y = 550;y<660;y++){
                                        Thread.sleep(5);
                                        change500.setBounds(630, y, 450, 100);
                                    }
                                }
                                for(int i =199; i<change;change=change-200){

                                    for(int y = 550;y<660;y++){
                                        Thread.sleep(5);
                                        change200.setBounds(630, y, 450, 100);
                                    }
                                }
                                for(int i =99; i<change;change=change-100){

                                    for(int y = 550;y<660;y++){
                                        Thread.sleep(5);
                                        change100.setBounds(630, y, 450, 100);
                                    }
                                }

                                //dispense item
                                Thread.sleep(1200);
                                for(int y =840; y<900;y++){
                                    Thread.sleep(3);
                                    displayItem.setBounds(300, y, 100, 100);
                                }
                                //START once you are finished with your order you can reuse the system again
                                orderStatus = false;
                                money = false;
                                total = total - change;
                                money_100.setEnabled(true);
                                money_200.setEnabled(true);
                                money_500.setEnabled(true);
                                money_1000.setEnabled(true);
                                confirmAmountButton.setEnabled(true);
                                // END
                            }catch (InterruptedException ex) {
                                ex.printStackTrace();
                            }   
                    }};

                        Thread cash = new Thread(cashRun);
                        cash.start();
                        
                    }else{
                        displayAmount.setText("Transac Complt");
                        displayNumber.setVisible(false);
                        Runnable cashRun;
                        cashRun = new Runnable(){
                        @Override
                        public void run(){

                            threadStatus = true;
                            try {
                                
                                Thread.sleep(1200);
                                for(int y =840; y<900;y++){
                                    Thread.sleep(3);
                                    displayItem.setBounds(300, y, 100, 100);
                                }

                            }catch (InterruptedException ex) {
                                ex.printStackTrace();
                            }   
                    }};

                        Thread cash = new Thread(cashRun);
                        cash.start();
                       orderStatus = false;
                       money = false;
                       total = total - price;
                       money_100.setEnabled(true);
                       money_200.setEnabled(true);
                       money_500.setEnabled(true);
                       money_1000.setEnabled(true);
                       confirmAmountButton.setEnabled(true);
                    }
                    }
                
                    break;
                    
                    
                //item 2    
                case 02: 
                    price = 100;
                    change = total - price;
                    
                    if(change != 0){
                        
                        Runnable cashRun = new Runnable(){
                        @Override
                        public void run(){
                        
                        threadStatus = true;
                        try {
                            
                            for(int i =499; i<change;change=change-500){
                                
                                for(int y = 550;y<660;y++){
                                    Thread.sleep(5);
                                    change500.setBounds(630, y, 450, 100);
                                }
                            }
                            for(int i =199; i<change;change=change-200){
                                
                                for(int y = 550;y<660;y++){
                                    Thread.sleep(5);
                                    change200.setBounds(630, y, 450, 100);
                                }
                            }
                            for(int i =99; i<change;change=change-100){
                                
                                for(int y = 550;y<660;y++){
                                    Thread.sleep(5);
                                    change100.setBounds(630, y, 450, 100);
                                }
                            }
                            
                            //insert code that will dispense item 
                            
                            
                            
                        }catch (InterruptedException ex) {
                            ex.printStackTrace();
                        }
                        }};

                        Thread cash = new Thread(cashRun);
                        cash.start();
                        
                    }else{
                        
                        //insert code that will dispense item 
                         
                    }
                    
                    break;
                    
                
                //item 3
                case 03: 
                    price = 400;
                    change = total - price;
                    
                    if(change != 0){
                        
                        Runnable cashRun = new Runnable(){
                        @Override
                        public void run(){
                        
                        threadStatus = true;
                        try {
                            
                            for(int i =499; i<change;change=change-500){
                                
                                for(int y = 550;y<660;y++){
                                    Thread.sleep(5);
                                    change500.setBounds(630, y, 450, 100);
                                }
                            }
                            for(int i =199; i<change;change=change-200){
                                
                                for(int y = 550;y<660;y++){
                                    Thread.sleep(5);
                                    change200.setBounds(630, y, 450, 100);
                                }
                            }
                            for(int i =99; i<change;change=change-100){
                                
                                for(int y = 550;y<660;y++){
                                    Thread.sleep(5);
                                    change100.setBounds(630, y, 450, 100);
                                }
                            }
                            
                            //insert code that will dispense item 
                            
                            
                            
                        }catch (InterruptedException ex) {
                            ex.printStackTrace();
                        }
                        }};

                        Thread cash = new Thread(cashRun);
                        cash.start();
                        
                    }else{
                        
                        //insert code that will dispense item 
                         
                    }
                
                    break;
                    
                    
                //item 4
                case 04: 
                    price = 400;
                    change = total - price;
                    
                    if(change != 0){
                        
                        Runnable cashRun = new Runnable(){
                        @Override
                        public void run(){
                        
                        threadStatus = true;
                        try {
                            
                            for(int i =499; i<change;change=change-500){
                                
                                for(int y = 550;y<660;y++){
                                    Thread.sleep(5);
                                    change500.setBounds(630, y, 450, 100);
                                }
                            }
                            for(int i =199; i<change;change=change-200){
                                
                                for(int y = 550;y<660;y++){
                                    Thread.sleep(5);
                                    change200.setBounds(630, y, 450, 100);
                                }
                            }
                            for(int i =99; i<change;change=change-100){
                                
                                for(int y = 550;y<660;y++){
                                    Thread.sleep(5);
                                    change100.setBounds(630, y, 450, 100);
                                }
                            }
                            
                           //insert code that will dispense item
                            
                        }catch (InterruptedException ex) {
                            ex.printStackTrace();
                        }
                        }};

                        Thread cash = new Thread(cashRun);
                        cash.start();
                        
                    }else{
                        
                        //insert code that will dispense item 
                         
                    }
                
                    break;
                    
                
                //item 5
                //item 6
                //item 7  
                //item 8
                //item 9
                //item 10    
                //item 11
                //item 12   
                //item 13  
                //item 14
                //item 15   
                //item 16   
                //item 17
                //item 18
                //item 19
            }
            

        }
        
    }//GEN-LAST:event_okayButtonMouseClicked

    //confirm button: user will confirm amount inserted
    private void confirmAmountButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmAmountButtonMouseClicked
        money = true;
        if(okStatus = true){
            orderStatus = true;
            // START disable the button if the user has already input a money
            confirmAmountButton.setEnabled(false);
        }
        displayAmount.setText("Choose your item.");
        //insert code that will prevent user from inserting cash again once enter button has been clicked
    }//GEN-LAST:event_confirmAmountButtonMouseClicked
    
   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VendingMachineGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VendingMachineGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VendingMachineGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VendingMachineGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VendingMachineGUI().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cashSlotDuplicate;
    private javax.swing.JLabel catchPhraseLabel;
    private javax.swing.JLabel change100;
    private javax.swing.JLabel change200;
    private javax.swing.JLabel change500;
    private javax.swing.JLabel changeSlotDuplicate;
    private javax.swing.JLabel confirmAmountButton;
    private javax.swing.JLabel dispenserDuplicate;
    private javax.swing.JLabel displayAmount;
    private javax.swing.JLabel displayItem;
    private javax.swing.JLabel displayNumber;
    private javax.swing.JLabel enter100;
    private javax.swing.JLabel enter1000;
    private javax.swing.JLabel enter200;
    private javax.swing.JLabel enter500;
    private javax.swing.JLabel eraseButton;
    private javax.swing.JLabel item10Label;
    private javax.swing.JLabel item11Label;
    private javax.swing.JLabel item12Label;
    private javax.swing.JLabel item13Label;
    private javax.swing.JLabel item14Label;
    private javax.swing.JLabel item15Label;
    private javax.swing.JLabel item16Label;
    private javax.swing.JLabel item17Label;
    private javax.swing.JLabel item18Label;
    private javax.swing.JLabel item19Label;
    private javax.swing.JLabel item1Label;
    private javax.swing.JLabel item2Label;
    private javax.swing.JLabel item3Label;
    private javax.swing.JLabel item4Label;
    private javax.swing.JLabel item5Label;
    private javax.swing.JLabel item6Label;
    private javax.swing.JLabel item7Label;
    private javax.swing.JLabel item8Label;
    private javax.swing.JLabel item9Label;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel keypad0;
    private javax.swing.JLabel keypad1;
    private javax.swing.JLabel keypad2;
    private javax.swing.JLabel keypad3;
    private javax.swing.JLabel keypad4;
    private javax.swing.JLabel keypad5;
    private javax.swing.JLabel keypad6;
    private javax.swing.JLabel keypad7;
    private javax.swing.JLabel keypad8;
    private javax.swing.JLabel keypad9;
    private javax.swing.JLabel money_100;
    private javax.swing.JLabel money_1000;
    private javax.swing.JLabel money_200;
    private javax.swing.JLabel money_500;
    private javax.swing.JLabel okayButton;
    private javax.swing.JLabel projectTitleLabel;
    private javax.swing.JLabel screen;
    private javax.swing.JLabel vendingMachineImage;
    private javax.swing.JLabel walletLabel;
    // End of variables declaration//GEN-END:variables
}
