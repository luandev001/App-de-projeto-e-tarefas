/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import controller.TaskController;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import model.Project;
import model.Task;

/**
 *
 * @author Luan
 */
public class TaskDialogScreen extends javax.swing.JDialog implements ActionListener, MouseListener {

    TaskController controller;
    Project project;
    
    public TaskDialogScreen(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        hideErrorFields();
        
        controller = new TaskController();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelToolBar = new javax.swing.JPanel();
        jLabelToolBarTitle = new javax.swing.JLabel();
        jLabelToolBarSave = new javax.swing.JLabel();
        jPanelTask = new javax.swing.JPanel();
        jLabelName = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jLabelDescription = new javax.swing.JLabel();
        jScrollPaneDescription = new javax.swing.JScrollPane();
        jTextAreaDescription = new javax.swing.JTextArea();
        jLabelNotes = new javax.swing.JLabel();
        jScrollPaneNotes = new javax.swing.JScrollPane();
        jTextAreaNotes = new javax.swing.JTextArea();
        jLabelDeadline = new javax.swing.JLabel();
        jFormattedTextFieldDeadline = new javax.swing.JFormattedTextField();
        jLabelNameError = new javax.swing.JLabel();
        jLabelDeadlineError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(350, 550));

        jPanelToolBar.setBackground(new java.awt.Color(0, 153, 102));
        jPanelToolBar.setName("jPanelToolBar"); // NOI18N

        jLabelToolBarTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelToolBarTitle.setForeground(java.awt.Color.white);
        jLabelToolBarTitle.setText("Tarefa");
        jLabelToolBarTitle.setName("jLabelToolBarTitle"); // NOI18N

        jLabelToolBarSave.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelToolBarSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/check.png"))); // NOI18N
        jLabelToolBarSave.setName("jLabelToolBarSave"); // NOI18N
        jLabelToolBarSave.addMouseListener(this);

        javax.swing.GroupLayout jPanelToolBarLayout = new javax.swing.GroupLayout(jPanelToolBar);
        jPanelToolBar.setLayout(jPanelToolBarLayout);
        jPanelToolBarLayout.setHorizontalGroup(
            jPanelToolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelToolBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelToolBarTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelToolBarSave, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelToolBarLayout.setVerticalGroup(
            jPanelToolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelToolBarLayout.createSequentialGroup()
                .addGroup(jPanelToolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelToolBarTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelToolBarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelToolBarSave, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanelTask.setBackground(java.awt.Color.white);
        jPanelTask.setName("jPanelTask"); // NOI18N

        jLabelName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelName.setText("Nome");
        jLabelName.setName("jLabelName"); // NOI18N

        jTextFieldName.setName("jTextFieldName"); // NOI18N
        jTextFieldName.addActionListener(this);

        jLabelDescription.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelDescription.setText("Descri��o");
        jLabelDescription.setName("jLabelDescription"); // NOI18N

        jScrollPaneDescription.setName("jScrollPaneDescription"); // NOI18N

        jTextAreaDescription.setColumns(20);
        jTextAreaDescription.setRows(5);
        jTextAreaDescription.setName("jTextAreaDescription"); // NOI18N
        jScrollPaneDescription.setViewportView(jTextAreaDescription);

        jLabelNotes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelNotes.setText("Notas");
        jLabelNotes.setName("jLabelNotes"); // NOI18N

        jScrollPaneNotes.setName("jScrollPaneNotes"); // NOI18N

        jTextAreaNotes.setColumns(20);
        jTextAreaNotes.setRows(5);
        jTextAreaNotes.setName("jTextAreaNotes"); // NOI18N
        jScrollPaneNotes.setViewportView(jTextAreaNotes);

        jLabelDeadline.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelDeadline.setText("Prazo");
        jLabelDeadline.setName("jLabelDeadline"); // NOI18N

        jFormattedTextFieldDeadline.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        jFormattedTextFieldDeadline.setName("jFormattedTextFieldDeadline"); // NOI18N

        jLabelNameError.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelNameError.setForeground(new java.awt.Color(204, 0, 0));
        jLabelNameError.setText("Campo de nome obrigat�rio");
        jLabelNameError.setName("jLabelNameError"); // NOI18N

        jLabelDeadlineError.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelDeadlineError.setForeground(new java.awt.Color(204, 0, 0));
        jLabelDeadlineError.setText("Campo de prazo obrigat�rio");
        jLabelDeadlineError.setName("jLabelDeadlineError"); // NOI18N

        javax.swing.GroupLayout jPanelTaskLayout = new javax.swing.GroupLayout(jPanelTask);
        jPanelTask.setLayout(jPanelTaskLayout);
        jPanelTaskLayout.setHorizontalGroup(
            jPanelTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTaskLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneDescription, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelDescription, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelDeadline, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelNotes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPaneNotes)
                    .addComponent(jFormattedTextFieldDeadline)
                    .addComponent(jLabelNameError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelDeadlineError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelTaskLayout.setVerticalGroup(
            jPanelTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTaskLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabelName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabelNameError)
                .addGap(18, 18, 18)
                .addComponent(jLabelDescription)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelDeadline)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormattedTextFieldDeadline, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabelDeadlineError)
                .addGap(18, 18, 18)
                .addComponent(jLabelNotes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneNotes, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelToolBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelTask, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelTask, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }

    // Code for dispatching events from components to event handlers.

    public void actionPerformed(java.awt.event.ActionEvent evt) {
        if (evt.getSource() == jTextFieldName) {
            TaskDialogScreen.this.jTextFieldNameActionPerformed(evt);
        }
    }

    public void mouseClicked(java.awt.event.MouseEvent evt) {
        if (evt.getSource() == jLabelToolBarSave) {
            TaskDialogScreen.this.jLabelToolBarSaveMouseClicked(evt);
        }
    }

    public void mouseEntered(java.awt.event.MouseEvent evt) {
    }

    public void mouseExited(java.awt.event.MouseEvent evt) {
    }

    public void mousePressed(java.awt.event.MouseEvent evt) {
    }

    public void mouseReleased(java.awt.event.MouseEvent evt) {
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNameActionPerformed

    private void jLabelToolBarSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelToolBarSaveMouseClicked
        // TODO add your handling code here:
        try {
            if(isFieldsValid()){
                //if (!jTextFieldName.getText().isEmpty() && !jFormattedTextFieldDeadline.getText().isEmpty()) {
                Task task = new Task();
                
                task.setIdProject(project.getId());
                task.setName(jTextFieldName.getText());
                task.setDescription(jTextAreaDescription.getText());
                task.setNotes(jTextAreaNotes.getText());
                task.setIsCompleted(false);

                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy"); 
                Date deadline = null;

                deadline = dateFormat.parse(jFormattedTextFieldDeadline.getText());
                task.setDeadline(deadline);
                controller.save(task);
                JOptionPane.showMessageDialog(rootPane, "Tarefa salva com sucesso");
                
                this.dispose();
                
            } else {
                hideErrorFields();
                
                if(jTextFieldName.getText().isEmpty()){
                    jLabelNameError.setVisible(true);
//                } else {
//                    jLabelNameError.setVisible(false);
                }
                
                if(jFormattedTextFieldDeadline.getText().isEmpty()) {
                    jLabelDeadlineError.setVisible(true);
                }
//                JOptionPane.showMessageDialog(rootPane, "A tarefa n�o foi salva, "
//                + "pois existem campos obrigat�rios a serem preenchidos");
            }     
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
        
    }//GEN-LAST:event_jLabelToolBarSaveMouseClicked

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
            java.util.logging.Logger.getLogger(TaskDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TaskDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TaskDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TaskDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TaskDialogScreen dialog = new TaskDialogScreen(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField jFormattedTextFieldDeadline;
    private javax.swing.JLabel jLabelDeadline;
    private javax.swing.JLabel jLabelDeadlineError;
    private javax.swing.JLabel jLabelDescription;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelNameError;
    private javax.swing.JLabel jLabelNotes;
    private javax.swing.JLabel jLabelToolBarSave;
    private javax.swing.JLabel jLabelToolBarTitle;
    private javax.swing.JPanel jPanelTask;
    private javax.swing.JPanel jPanelToolBar;
    private javax.swing.JScrollPane jScrollPaneDescription;
    private javax.swing.JScrollPane jScrollPaneNotes;
    private javax.swing.JTextArea jTextAreaDescription;
    private javax.swing.JTextArea jTextAreaNotes;
    private javax.swing.JTextField jTextFieldName;
    // End of variables declaration//GEN-END:variables

    public void setProject(Project project) {
        this.project = project;
    }
    
    public void hideErrorFields() {
        jLabelDeadlineError.setVisible(false);
        jLabelNameError.setVisible(false);
    }
    
    public boolean isFieldsValid() {
        
        if ((!jTextFieldName.getText().isEmpty()) && (!jFormattedTextFieldDeadline.getText().isEmpty())) {
            return true;
        } else {
            return false;
        }
    }              
}
