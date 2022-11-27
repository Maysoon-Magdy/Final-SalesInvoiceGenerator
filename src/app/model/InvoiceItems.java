/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.model;

import java.util.UUID;

/**
 * @author maysoon
 */
public class InvoiceItems {

    private int invNumber;
    private String itemName;
    private int itemsCount;
    private double itemPrice;
    private UUID id;

    public InvoiceItems(int invNumber, String itemName, double itemPrice, int itemCount) {
        this.invNumber = invNumber;
        this.itemName = itemName;
        this.itemsCount = itemCount;
        this.itemPrice = itemPrice;
        this.id = java.util.UUID.randomUUID();
    }

    //getters & setters
    public UUID getId() {
        return id;
    }

    public int getInvNumber() {
        return invNumber;
    }

    public void setInvNumber(int invNumber) {
        this.invNumber = invNumber;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemsCount() {
        return itemsCount;
    }

    public void setItemsCount(int itemsCount) {
        this.itemsCount = itemsCount;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    //methods
    @Override
    public String toString() {
        return "InvoiceItems{" + "itemName=" + itemName + ", itemsCount=" + itemsCount + ", itemPrice=" + itemPrice + '}';
    }

    public double calcTotalPrice() {
        return itemsCount * itemPrice;
    }

}
