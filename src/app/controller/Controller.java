/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.controller;

import app.model.Invoice;
import app.model.InvoiceItems;
import app.view.MainFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import javax.swing.JFileChooser;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 * @author maysoon
 */
public class Controller implements ActionListener, ListSelectionListener {

    private MainFrame frame;

    public Controller(MainFrame frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Create New Invoice" ->
                newInvoice();
            case "Delete Invoice" ->
                deleteInvoice();
            case "Save" ->
                saveItem();
            case "Cancel" ->
                cancelItem();
            case "Load File" ->
                loadFile(null, null);
            case "Save File" ->
                saveFile();
            case "Submit New Item " ->
                submitNewIetm();
            case "Add New Invoice" ->
                createNewInvoice();

        }
    }

    private void newInvoice() {
    }

    private void deleteInvoice() {
        frame.removeSelectedRowInInvTable();
    }

    private void saveItem() {
    }

    private void cancelItem() {
        frame.removeSelectedRowInInvItemTable();
    }

    public void loadFile(String headerFilePath, String itemsFilePath) {
        File invoiceHeader = null;
        File itemsHeader = null;
        if (headerFilePath == null && itemsFilePath == null) {
            JFileChooser fc = new JFileChooser();
            int result = fc.showOpenDialog(frame);
            if (result == JFileChooser.APPROVE_OPTION) {
                invoiceHeader = fc.getSelectedFile();
                result = fc.showOpenDialog(frame);
                if (result == JFileChooser.APPROVE_OPTION) {
                    itemsHeader = fc.getSelectedFile();
                }
            }
        } else {
            invoiceHeader = new File(headerFilePath);
            itemsHeader = new File(itemsFilePath);
        }

        if (invoiceHeader != null && itemsHeader != null) {
            try {

                List<String> headerLinesList = Files.lines(Paths.get(invoiceHeader.getAbsolutePath())).collect(Collectors.toList());

                List<String> itemLinesList = Files.lines(Paths.get(itemsHeader.getAbsolutePath())).collect(Collectors.toList());

                frame.getInvoices().clear();
                frame.getInvoiceItems().clear();

                // ex : 1 , 12-11-2022 , Ali
                for (String headerLineList : headerLinesList) {
                    String[] line = headerLineList.split(",");
                    String invoiceNumb = line[0];
                    String invDate = line[1];
                    String invCustName = line[2];
                    int invoiceNumbCast = Integer.parseInt(invoiceNumb);
                    SimpleDateFormat newFormat = new SimpleDateFormat("yyyy-MM-dd");
                    Date invDateCaset = newFormat.parse(invDate);
                    Invoice invoice = new Invoice(invoiceNumbCast, invDateCaset, invCustName);
                    // getInvoicesMethod
                    frame.getInvoices().add(invoice);

                }

                // filter items related to the selected invoices
                for (String itemLineList : itemLinesList) {
                    String[] line = itemLineList.split(",");
                    int invoiceNumber = Integer.parseInt(line[0]);
                    String itemName = line[1];
                    double itemPrice = Double.parseDouble(line[2]);
                    int itemCount = Integer.parseInt(line[3]);
                    //getInvoiceperNumberMethod
                    InvoiceItems items = new InvoiceItems(invoiceNumber, itemName, itemPrice, itemCount);
                    for (Invoice item : frame.getInvoices()) {
                        if (item.getInvNumber() == invoiceNumber) {
                            item.getItems().add(items);
                        }
                    }
                    frame.getInvoiceItems().add(items);
                    frame.addDatainInvitemsTable();
                }
                frame.addDataInInvoiceTable();

                //ex:  1 , mobile , 3200 , 1 
            } catch (Exception e) {

            }
        }
    }

    public void getSelectedRowValue(int rowValue) {

    }

    public void saveFile() {
       

    }

    private void newIetm() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void submitNewIetm() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void createNewInvoice() {

    }

    @Override
    public void valueChanged(ListSelectionEvent event) {
        // do some actions here, for example
        // print first column value from selected row
        int selectedInvoice = -1;
        if (frame.getInvTable().getSelectedRowCount() > 0) {
            selectedInvoice = (int) frame.getInvTable().getValueAt(frame.getInvTable().getSelectedRow(), 0);
        }
        if (selectedInvoice != -1) {
            ArrayList<InvoiceItems> result = frame.getInvoiceItems();
            frame.getInvNumberLabel().setText(frame.getInvTable().getValueAt(frame.getInvTable().getSelectedRow(), 0).toString());
            frame.getInvDateField().setText(frame.getInvTable().getValueAt(frame.getInvTable().getSelectedRow(), 1).toString());
            frame.getCustNameField().setText(frame.getInvTable().getValueAt(frame.getInvTable().getSelectedRow(), 2).toString());
            frame.gettotalLabel().setText(frame.getInvTable().getValueAt(frame.getInvTable().getSelectedRow(), 3).toString());
            DefaultTableModel model = (DefaultTableModel) frame.getInvItemTable().getModel();
            model.setRowCount(0);
            for (InvoiceItems item : result) {
                if (item.getInvNumber() == selectedInvoice) {
                    Object rowData[] = new Object[5];
                    rowData[0] = item.getInvNumber();
                    rowData[1] = item.getItemName();
                    rowData[2] = item.getItemPrice();
                    rowData[3] = item.getItemsCount();
                    rowData[4] = item.calcTotalPrice();
                    model.addRow(rowData);
                }

            }
        } else {
            frame.getInvNumberLabel().setText("");
            frame.getInvDateField().setText("");
            frame.getCustNameField().setText("");
            frame.gettotalLabel().setText("");

        }
        
                frame.getSaveChangeBtn().setEnabled(true);
    }

}
