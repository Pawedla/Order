package com.github.Pawedla;

import java.io.Serializable;

public class OrderReport implements Serializable {

    private int orderNumber;
    private String[] config;
    private double price;
    private String dateOfDelivery;

    public OrderReport() {
    }

    public OrderReport(int orderNumber, String[] config, double price, String dateOfDelivery) {
        this.orderNumber = orderNumber;
        this.config = config;
        this.price = price;
        this.dateOfDelivery = dateOfDelivery;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public void setConfig(String[] config) {
        this.config = config;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDateOfDelivery(String dateOfDelivery) {
        this.dateOfDelivery = dateOfDelivery;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public String[] getConfig() {
        return config;
    }

    public double getPrice() {
        return price;
    }

    public String getDateOfDelivery() {
        return dateOfDelivery;
    }

    public void printOrder() {
        System.out.println("Order successful!");
        System.out.println("Order Nr.: " + orderNumber);
        System.out.println(config[0] + "/" + config[1] + "/" + config[2] + "/" + config[3]);
        System.out.println("Price: " + price);
        System.out.println("Date of delivery: " + dateOfDelivery);
        System.out.println();
    }
}

