/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package app.view;

import app.controller.Controller;
import app.model.Invoice;
import app.model.InvoiceItems;

import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.event.ComponentListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 * @author maysoon
 */
public class MainFrame extends javax.swing.JFrame {

    CreateNewInvoices newInvoice = new CreateNewInvoices(this);
    CreateNewInvoiceItems newInvoiceItem = new CreateNewInvoiceItems(this);
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JButton cancelInvItemBtn;
    private javax.swing.JLabel custNameConst;
    private javax.swing.JTextPane custNameField;
    private javax.swing.JScrollPane custNamePane;
    private javax.swing.JButton delInvBtn;
    private javax.swing.JLabel invDateConst;
    private javax.swing.JTextPane invDateField;
    private javax.swing.JScrollPane invDatePane;
    private javax.swing.JLabel invItemTableLabel;
    private javax.swing.JScrollPane invItemsPan;
    private javax.swing.JTable invItemsTable;
    private javax.swing.JLabel invNumConst;
    private javax.swing.JLabel invNumberLabel;
    private javax.swing.JScrollPane invPane;
    private javax.swing.JTable invTable;
    private javax.swing.JLabel invTableLabel;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem loadFileItem;
    private javax.swing.JMenu mainMenu;
    private java.awt.Menu menu1;
    private javax.swing.JMenuBar menuBar;
    private java.awt.MenuBar menuBar1;
    private javax.swing.JButton newInvBtn;
    private static javax.swing.JButton saveChangeBtn;
    private javax.swing.JMenuItem saveFileItem;
    private javax.swing.JButton saveInvItemBtn;
    private javax.swing.JLabel totalConst;
    private javax.swing.JLabel totalLabel;
    // End of variables declaration//GEN-END:variables
    private Controller controller;
    private ArrayList<Invoice> invoices;
    private ArrayList<InvoiceItems> invoiceItems;

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        controller = new Controller(this);
        initComponents();

        //invTable.addComponentListener((ComponentListener) controller);
    }

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MainFrame frame = new MainFrame();
                frame.setVisible(true);
                cancelInvItemBtn.setEnabled(false);
                saveChangeBtn.setEnabled(false);
                //  frame.controller.loadFile("InvoiceHeader.csv", "InvoiceLine.csv"); // not working

            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        jMenuItem1 = new javax.swing.JMenuItem();
        invPane = new javax.swing.JScrollPane();
        invTable = new javax.swing.JTable();
        newInvBtn = new javax.swing.JButton();
        newInvBtn.addActionListener(controller);
        delInvBtn = new javax.swing.JButton();
        delInvBtn.addActionListener(controller);
        invItemsPan = new javax.swing.JScrollPane();
        invItemsTable = new javax.swing.JTable();
        saveInvItemBtn = new javax.swing.JButton();
        saveInvItemBtn.addActionListener(controller);
        cancelInvItemBtn = new javax.swing.JButton();
        cancelInvItemBtn.addActionListener(controller);
        invTableLabel = new javax.swing.JLabel();
        invItemTableLabel = new javax.swing.JLabel();
        invNumConst = new javax.swing.JLabel();
        invDateConst = new javax.swing.JLabel();
        custNameConst = new javax.swing.JLabel();
        totalConst = new javax.swing.JLabel();
        invNumberLabel = new javax.swing.JLabel();
        totalLabel = new javax.swing.JLabel();
        invDatePane = new javax.swing.JScrollPane();
        invDateField = new javax.swing.JTextPane();
        custNamePane = new javax.swing.JScrollPane();
        custNameField = new javax.swing.JTextPane();
        saveChangeBtn = new javax.swing.JButton();
        saveChangeBtn.addActionListener(controller);
        menuBar = new javax.swing.JMenuBar();
        mainMenu = new javax.swing.JMenu();
        loadFileItem = new javax.swing.JMenuItem();
        loadFileItem.addActionListener(controller);
        saveFileItem = new javax.swing.JMenuItem();
        saveFileItem.addActionListener(controller);

        menu1.setLabel("File");
        menuBar1.add(menu1);

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        invTable.getSelectionModel().addListSelectionListener(controller);
        invTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No. ", "Date", "Customer", "Total"
            }
        ));
        invPane.setViewportView(invTable);

        newInvBtn.setText("Create New Invoice");
        newInvBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newInvBtnActionPerformed(evt);
            }
        });

        delInvBtn.setText("Delete Invoice");

        invItemsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Item Name", "Item price", "Count", "Item Total"
            }
        ));
        invItemsPan.setViewportView(invItemsTable);

        saveInvItemBtn.setText("Add Item");
        saveInvItemBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveInvItemBtnActionPerformed(evt);
            }
        });

        cancelInvItemBtn.setText("Cancel");
        cancelInvItemBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelInvItemBtnActionPerformed(evt);
            }
        });

        invTableLabel.setText("Invoices Table");

        invItemTableLabel.setText("Invoices Items");

        invNumConst.setText("Invoice Number");

        invDateConst.setText("Invoice Date");

        custNameConst.setText("Customer Name");

        totalConst.setText("Invoice Total");

        invDateField.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                invDateFieldInputMethodTextChanged(evt);
            }
        });
        invDatePane.setViewportView(invDateField);

        custNameField.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                custNameFieldInputMethodTextChanged(evt);
            }
        });
        custNamePane.setViewportView(custNameField);

        saveChangeBtn.setText("Save");
        saveChangeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveChangeBtnActionPerformed(evt);
            }
        });

        mainMenu.setText("File");

        loadFileItem.setText("Load File");
        loadFileItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadFileItemActionPerformed(evt);
            }
        });
        mainMenu.add(loadFileItem);

        saveFileItem.setText("Save File ");
        saveFileItem.setActionCommand("Save File");
        saveFileItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveFileItemActionPerformed(evt);
            }
        });
        mainMenu.add(saveFileItem);

        menuBar.add(mainMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(newInvBtn)
                        .addGap(64, 64, 64)
                        .addComponent(delInvBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(invPane, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(saveInvItemBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(saveChangeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelInvItemBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(invItemsPan, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(invItemTableLabel)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(custNameConst)
                                        .addGap(18, 18, 18)
                                        .addComponent(custNamePane))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(totalConst, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(invDateConst, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(invNumConst, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(totalLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(invNumberLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(invDatePane, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addContainerGap())))))
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(invTableLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(invTableLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(invPane))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(invNumConst)
                            .addComponent(invNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(invDateConst)
                            .addComponent(invDatePane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(custNamePane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(custNameConst))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalConst, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(invItemTableLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(invItemsPan, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newInvBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(delInvBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(saveInvItemBtn)
                    .addComponent(cancelInvItemBtn)
                    .addComponent(saveChangeBtn))
                .addGap(15, 15, 15))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loadFileItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadFileItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loadFileItemActionPerformed

    private void saveFileItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveFileItemActionPerformed
        // TODO add your handling code here:

        try {
            File fileInvoice = new File("/Users/maysoon/Desktop/InvoiceHeaders.csv");
            File fileItems = new File("/Users/maysoon/Desktop/InvoiceLines.csv");

            if (!fileInvoice.exists()) {
                fileInvoice.createNewFile();
            }

            if (!fileItems.exists()) {
                fileItems.createNewFile();
            }
            FileWriter writer1 = new FileWriter(fileInvoice.getAbsoluteFile());
            BufferedWriter buffer1 = new BufferedWriter(writer1);

            for (int row = 0; row < invTable.getRowCount(); row++) {
                for (int col = 0; col < invTable.getColumnCount(); col++) {
                    buffer1.write((String) invTable.getValueAt(row, col).toString() + " ");
                }
                buffer1.write("\n---------\n");
            }

            buffer1.close();
            writer1.close();

            FileWriter writer2 = new FileWriter(fileItems.getAbsoluteFile());
            BufferedWriter buffer2 = new BufferedWriter(writer2);

            for (int row = 0; row < invItemsTable.getRowCount(); row++) {
                for (int col = 0; col < invItemsTable.getColumnCount(); col++) {
                    buffer2.write((String) invItemsTable.getValueAt(row, col).toString() + " ");
                }
                buffer2.write("\n---------\n");
            }

            buffer2.close();
            writer2.close();
            
        } catch (IOException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_saveFileItemActionPerformed

    private void saveInvItemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveInvItemBtnActionPerformed
        // TODO add your handling code here:

        if (invTable.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Please load your invoices and select your item parent invoice ", "info", JOptionPane.INFORMATION_MESSAGE);
        } else {
            newInvoiceItem.setVisible(true);
        }

    }//GEN-LAST:event_saveInvItemBtnActionPerformed

    private void newInvBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newInvBtnActionPerformed
        // TODO add your handling code here:
        newInvoice.setVisible(true);
        newInvoice.pack();
        newInvoice.setLocationRelativeTo(null);
        newInvoice.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_newInvBtnActionPerformed

    private void cancelInvItemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelInvItemBtnActionPerformed
        // TODO add your handling code here:        
        custNameField.setText(invTable.getValueAt(invTable.getSelectedRow(), 2).toString());
        invDateField.setText(invTable.getValueAt(invTable.getSelectedRow(), 1).toString());

    }//GEN-LAST:event_cancelInvItemBtnActionPerformed

    private void saveChangeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveChangeBtnActionPerformed
        try {
            // TODO add your handling code here:
            DateFormat sdf = new SimpleDateFormat("E MMM dd HH:mm:ss Z yyyy");
            DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
            String date = df.format(sdf.parse(invDateField.getText()));
            for (Invoice invoice : getInvoices()) {
                if (invoice.getInvNumber() == Integer.valueOf(invNumberLabel.getText())) {
                    invoice.setCustName(custNameField.getText());
                    // invoice.setInvDate(date);
                }
            }
            addDataInInvoiceTable();
        } catch (ParseException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_saveChangeBtnActionPerformed

    private void invDateFieldInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_invDateFieldInputMethodTextChanged
        // TODO add your handling code here:
        cancelInvItemBtn.setEnabled(true);
    }//GEN-LAST:event_invDateFieldInputMethodTextChanged

    private void custNameFieldInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_custNameFieldInputMethodTextChanged
        // TODO add your handling code here:
        cancelInvItemBtn.setEnabled(true);

    }//GEN-LAST:event_custNameFieldInputMethodTextChanged

    public ArrayList<Invoice> getInvoices() {
        if (invoices == null) {
            invoices = new ArrayList<>();
        }
        return invoices;
    }

    public ArrayList<InvoiceItems> getInvoiceItems() {
        if (invoiceItems == null) {
            invoiceItems = new ArrayList<>();
        }
        return invoiceItems;
    }

    public void addDataInInvoiceTable() {
        DefaultTableModel model = (DefaultTableModel) getInvTable().getModel();
        model.setRowCount(0);
        ArrayList<Invoice> myInvoices = getInvoices();
        Object rowData[] = new Object[4];
        for (int i = 0; i < myInvoices.size(); i++) {
            rowData[0] = myInvoices.get(i).getInvNumber();
            rowData[1] = myInvoices.get(i).getInvDate();
            rowData[2] = myInvoices.get(i).getCustName();
            rowData[3] = myInvoices.get(i).calcTotalPrice();
            model.addRow(rowData);
        }

    }

    public void addDatainInvitemsTable() {
        int selectedInvoice = -1;
        if (invTable.getSelectedRowCount() > 0) {
            selectedInvoice = (int) getInvTable().getValueAt(getInvTable().getSelectedRow(), 0);
        }
        DefaultTableModel model = (DefaultTableModel) invItemsTable.getModel();
        model.setRowCount(0);
        ArrayList<InvoiceItems> myInvoiceItems = getInvoiceItems();
        Object rowData[] = new Object[5];
        for (int i = 0; i < myInvoiceItems.size(); i++) {
            if (selectedInvoice != -1) {
                if (myInvoiceItems.get(i).getInvNumber() == selectedInvoice) {
                    rowData[0] = myInvoiceItems.get(i).getInvNumber();
                    rowData[1] = myInvoiceItems.get(i).getItemName();
                    rowData[2] = myInvoiceItems.get(i).getItemPrice();
                    rowData[3] = myInvoiceItems.get(i).getItemsCount();
                    rowData[4] = myInvoiceItems.get(i).calcTotalPrice();
                    model.addRow(rowData);
                }

            } else {
                rowData[0] = myInvoiceItems.get(i).getInvNumber();
                rowData[1] = myInvoiceItems.get(i).getItemName();
                rowData[2] = myInvoiceItems.get(i).getItemPrice();
                rowData[3] = myInvoiceItems.get(i).getItemsCount();
                rowData[4] = myInvoiceItems.get(i).calcTotalPrice();
                model.addRow(rowData);
            }
        }

    }

    public void setIvoices(ArrayList<Invoice> invoices) {
        this.invoices = invoices;
    }

    public int getSelectedInvoiceNumber() {
        return (int) invTable.getValueAt(invTable.getSelectedRow(), 0);
    }

    public void removeSelectedRowInInvTable() {
        int selectedInvoice = -1;
        if (invTable.getSelectedRowCount() > 0) {
            selectedInvoice = (int) getInvTable().getValueAt(getInvTable().getSelectedRow(), 0);
        }
        if (selectedInvoice != -1) {
            int ItemIndex = 0;
            ArrayList<InvoiceItems> deletedInvoiceItem = new ArrayList<InvoiceItems>();
            for (Invoice invoice : getInvoices()) {
                if (selectedInvoice == invoice.getInvNumber()) {
                    getInvoices().remove(ItemIndex);
                    for (int i = 0; i < getInvoiceItems().size(); i++) {
                        if (selectedInvoice == getInvoiceItems().get(i).getInvNumber()) {
                            deletedInvoiceItem.add(getInvoiceItems().get(i));
                        }
                    }
                    for (InvoiceItems invItem : deletedInvoiceItem) {
                        getInvoiceItems().remove((InvoiceItems) invItem);
                    }
                    break;
                }
                ItemIndex++;
            }
            addDatainInvitemsTable();
            addDataInInvoiceTable();
            // remove selected row from the model
            JOptionPane.showMessageDialog(null, "Selected row deleted successfully");
        } else {
            JOptionPane.showMessageDialog(null, "Please select your invoice");
        }

    }

    public void removeSelectedRowInInvItemTable() {

    }

    public JTable getInvTable() {
        return invTable;
    }

    public JTable getInvItemTable() {
        return invItemsTable;
    }

    public JLabel getInvNumberLabel() {
        return invNumberLabel;
    }

    public JTextPane getInvDateField() {
        return invDateField;
    }

    public JTextPane getCustNameField() {
        return custNameField;
    }

    public JLabel gettotalLabel() {
        return totalLabel;
    }

    public JButton getSaveChangeBtn() {
        return saveChangeBtn;
    }

    public JButton getCancelBtn() {
        return cancelInvItemBtn;
    }

}
