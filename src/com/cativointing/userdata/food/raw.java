package com.cativointing.userdata.food;

public class raw {
    private int ID;
    private String name;
    private int quantity;
    private int supplierID;

    public raw(int ID, String name, int quantity, int supplierID) {
        this.ID = ID;
        this.name = name;
        this.quantity = quantity;
        this.supplierID = supplierID;
    }

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getSupplierID() {
        return supplierID;
    }

    public void setSupplierID(int supplierID) {
        this.supplierID = supplierID;
    }

    @Override
    public String toString() {
        return "customer [ID=" + ID + ", name=" + name + ", quantity=" + quantity + ", supplierID=" + supplierID + "]";
    }
}
