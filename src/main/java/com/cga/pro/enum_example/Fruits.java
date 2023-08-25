package com.cga.pro.enum_example;

public enum Fruits {
    APPLE(10), ORANGE(9),
    PEAR(12),  BANANA(15);

    private Integer price;
    Fruits(Integer price) {
        this.price = price;
    }
    public  Integer getPrice() {
        return this.price;
    }
}
