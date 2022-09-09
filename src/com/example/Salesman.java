package com.example;

public class Salesman {
    public String name;
    public int salesTotal;

    public Salesman(String name, int salesTotal) {
        this.name = name;
        this.salesTotal = salesTotal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalesTotal() {
        return salesTotal;
    }

    public void setSalesTotal(int salesTotal) {
        this.salesTotal = salesTotal;
    }
}
