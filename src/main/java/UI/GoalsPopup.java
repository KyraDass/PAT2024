/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import backend.GoalsManager;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

/**
 *
 * @author kyrad
 */
public class GoalsPopup extends javax.swing.JFrame {

    /**
     * Creates new form GoalsPopup
     */
    public GoalsPopup() {
        initComponents();

        try {
            updateGoalsComponents();

            //links to the goal manager to update the list of goals
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GoalsPopup.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GoalsPopup.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateGoalsComponents() throws FileNotFoundException, IOException {
        String[] goals = GoalsManager.getGoals();
        //gets the goals from the goals manager

        DefaultListModel goalsListModel = new DefaultListModel();
        for (int i = 0; i < goals.length; i++) {
            goalsListModel.addElement(goals[i]);
            //added each goals as an element to the goalsListModel.

        }
        goalsList.setModel(goalsListModel);
        //sets the goals list to the updated version

        String[] completedGoals = GoalsManager.getCompletedGoals();

        // gets the completed goals
        DefaultListModel completedGoalsListModel = new DefaultListModel();
        for (int i = 0; i < completedGoals.length; i++) {
            completedGoalsListModel.addElement(completedGoals[i]);
            //added each completed goal as an element to the completedGoalsListModel.
        }
        completedGoalsList.setModel(completedGoalsListModel);
        if (goals == completedGoals) {

            MainMenu m = new MainMenu();
            m.setVisible(true);
            dispose();

        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GoalsTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        CheckBoxGoals = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        AddGoalButton = new javax.swing.JButton();
        GoalsDeleteButton = new javax.swing.JButton();
        goalsTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        goalsList = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        completedGoalsList = new javax.swing.JList<>();
        goalsCompletedButton = new javax.swing.JButton();
        backGoalButton = new javax.swing.JButton();
        removeGoal = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jLabel2.setText("Monthly");

        jLabel3.setText("Yearly");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jButton2.setText("Delete");

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(246, 246, 238));

        jLabel1.setBackground(new java.awt.Color(172, 209, 191));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Goals");

        AddGoalButton.setText("Add");
        AddGoalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddGoalButtonActionPerformed(evt);
            }
        });

        GoalsDeleteButton.setText("Delete");
        GoalsDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoalsDeleteButtonActionPerformed(evt);
            }
        });

        goalsTextField.setBackground(new java.awt.Color(246, 246, 238));

        goalsList.setBackground(new java.awt.Color(172, 209, 191));
        goalsList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(goalsList);

        completedGoalsList.setBackground(new java.awt.Color(172, 209, 191));
        completedGoalsList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        completedGoalsList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                completedGoalsListMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(completedGoalsList);

        goalsCompletedButton.setText("Completed");
        goalsCompletedButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goalsCompletedButtonMouseClicked(evt);
            }
        });

        backGoalButton.setText("Back");
        backGoalButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backGoalButtonMouseClicked(evt);
            }
        });
        backGoalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backGoalButtonActionPerformed(evt);
            }
        });

        removeGoal.setText("Remove");
        removeGoal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeGoalActionPerformed(evt);
            }
        });

        jLabel4.setText("Any new goals?Add them here:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backGoalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AddGoalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(34, 34, 34)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(goalsCompletedButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(GoalsDeleteButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(removeGoal, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(goalsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(goalsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AddGoalButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(57, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(backGoalButton)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(goalsCompletedButton)
                            .addComponent(GoalsDeleteButton)
                            .addComponent(removeGoal))
                        .addGap(21, 21, 21))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddGoalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddGoalButtonActionPerformed

//dashboard
        try {
            String newGoal = goalsTextField.getText();
            goalsTextField.setText("");
            GoalsManager.addGoal(newGoal);
            updateGoalsComponents();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }

        // When the button is clicked this code runs and adds the text entered in the text field to the goals list
    }//GEN-LAST:event_AddGoalButtonActionPerformed

    private void GoalsDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoalsDeleteButtonActionPerformed

        try {
            //Account
            String selectedGoal = goalsList.getSelectedValue();
            //gets the selected goal 
            GoalsManager.deleteGoal(selectedGoal);

            updateGoalsComponents();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }

        // When the button is clicked this code runs and deletes the text selected from the goals list
    }//GEN-LAST:event_GoalsDeleteButtonActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void completedGoalsListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_completedGoalsListMouseClicked


    }//GEN-LAST:event_completedGoalsListMouseClicked

    private void goalsCompletedButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goalsCompletedButtonMouseClicked

        try {
            String goal = goalsList.getSelectedValue();
            //gets the selected goal
            GoalsManager.completeGoal(goal);

            updateGoalsComponents();
            //updates the completed goals list

        } catch (IOException ex) {
            Logger.getLogger(GoalsPopup.class.getName()).log(Level.SEVERE, null, ex);
        }

        // If the completed button is clicked,then the goals will be added to the completed goals list

    }//GEN-LAST:event_goalsCompletedButtonMouseClicked

    private void backGoalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backGoalButtonActionPerformed

        this.hide();
        MainMenu frm = new MainMenu();
        frm.setVisible(true);
        //sets the screen back to the main menu when clicked


    }//GEN-LAST:event_backGoalButtonActionPerformed

    private void backGoalButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backGoalButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_backGoalButtonMouseClicked

    private void removeGoalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeGoalActionPerformed

        try {
            String selectedGoal = completedGoalsList.getSelectedValue();
            //gets the selected goal
            GoalsManager.deleteCompletedGoal(selectedGoal);

            updateGoalsComponents();
            //updates the completed goals list
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }

        //this code removes a selected goal from the completed goals list and from the text file

    }//GEN-LAST:event_removeGoalActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(GoalsPopup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GoalsPopup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GoalsPopup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GoalsPopup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GoalsPopup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddGoalButton;
    private javax.swing.JCheckBox CheckBoxGoals;
    private javax.swing.JButton GoalsDeleteButton;
    private javax.swing.JTextField GoalsTextField;
    private javax.swing.JButton backGoalButton;
    private javax.swing.JList<String> completedGoalsList;
    private javax.swing.JButton goalsCompletedButton;
    private javax.swing.JList<String> goalsList;
    private javax.swing.JTextField goalsTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton removeGoal;
    // End of variables declaration//GEN-END:variables

}
