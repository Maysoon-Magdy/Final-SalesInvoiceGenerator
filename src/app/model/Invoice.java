/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.model;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author maysoon
 */
public class Invoice {

    private int invNumber;
    private Date invDate;
    private String custName;
    private ArrayList<InvoiceItems> items;

    //constructor 
    public Invoice(int invNumber, Date invDate, String custName) {
        this.invNumber = invNumber;
        this.invDate = invDate;
        this.custName = custName;
    }

    //getters & setters
    public int getInvNumber() {
        return invNumber;
    }

    public void setInvNumber(int invNumber) {
        this.invNumber = invNumber;
    }

    public Date getInvDate() {
        return invDate;
    }

    public void setInvDate(Date invDate) {
        this.invDate = invDate;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public ArrayList<InvoiceItems> getItems() {
        if (items == null) {
            items = new ArrayList();
        }
        return items;
    }

    public void setItems(ArrayList<InvoiceItems> items) {
        this.items = items;
    }


    // Methods

    @Override
    public String toString() {
        return "Invoice{" + "invNumber=" + invNumber + ", invDate=" + invDate + ", custName=" + custName + ", items=" + items + '}';
    }


    public double calcTotalPrice() {
        double total = 0;
        for (InvoiceItems i : getItems()) {
            total += i.calcTotalPrice();
        }
        return total;
    }

}
