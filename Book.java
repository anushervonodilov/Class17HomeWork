package com.class17HomeWork;

public class Book {

//    Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
//    Instance variables are being initialized
//    Both Constructors are being executed

    String name;
    int price;
    double weight;

    Book() {
        System.out.println("This constructor doesn't have a parameter");
    }

    Book(String bName, int bPrice, double bWeight) {
        name = bName;
        price = bPrice;
        weight = bWeight;
    }

    void printInfo() {
        System.out.println("Book name is " + name + " price is " + price + " weight is " + weight);
    }

}
