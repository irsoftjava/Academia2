package com.cga.pro.enum_example;

public class TestEnum {

    public static void main(String[] args) {

        Fruits[] allFruits = Fruits.values();
        //System.out.println(Arrays.toString(allFruits));
        for (Fruits f : allFruits)
            System.out.println(f);
        System.out.println();

        Fruits fruit = Fruits.valueOf("ORANGE");
        System.out.println("fruits is " + fruit);
        fruit = Fruits.APPLE;
        if (fruit == Fruits.APPLE)
            System.out.println("fruit is a Apple");

        switch (fruit) {
            case APPLE -> {
                System.out.println("El precio de " + Fruits.APPLE + " es: " + Fruits.APPLE.getPrice());
                break;
            }
            case ORANGE -> {
                System.out.println("El precio de " + Fruits.ORANGE + " es: " + Fruits.ORANGE.getPrice());
                break;
            }
            case PEAR -> {
                System.out.println("El precio de " + Fruits.PEAR + " es: " + Fruits.PEAR.getPrice());
                break;
            }
            case BANANA -> {
                System.out.println("El precio de " + Fruits.BANANA + " es: " + Fruits.BANANA.getPrice());
                break;
            }
        }

        for (Fruits f : allFruits)
            System.out.println(f + " " + f.ordinal());

        Fruits orange = Fruits.ORANGE;
        Fruits apple = Fruits.APPLE;
        Fruits orange2 = Fruits.ORANGE;

        if (orange.compareTo(apple) < 0)
            System.out.println(orange + " viene antes " + apple);
        if (orange.compareTo(apple) > 0)
            System.out.println(apple + " viene antes " + orange);
        if (orange.compareTo(orange2) == 0)
            System.out.println(orange + " es igual a " + orange2);

        System.out.println();

        if (orange.equals(apple))
            System.out.println("Error...");
        if (orange.equals(orange2))
            System.out.println(orange + " es igual a " + orange2);
        if (orange.equals(orange2))
            System.out.println(orange + " == " + orange2);
    }
}
