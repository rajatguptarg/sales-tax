package com.tax;

public class Item {
    private String value;
    private String type;
    private String name;

    public Item(String value, String type, String name) {
        this.value = value;
        this.type = type;
        this.name = name;
    }

    public double getValue() {
        return Double.parseDouble(value);
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }
}
