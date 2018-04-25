package com.mayam.javapractice;

public class MyClass {

    public static void main(String[] args) {
int change=getMilk(2,40);
        System.out.println("Hello, Master, your change is  "+change+" pounds");

    }
public static int getMilk(int nrOfCartonsTobuy,int startingAmount){

int priceToPay=nrOfCartonsTobuy*2;

    System.out.println("Take money");
    System.out.println("Open Door");
    System.out.println("Close Door");
    System.out.println("Walk forward 100m");
    System.out.println("Buy "+nrOfCartonsTobuy+" cartons on the ground floor");
    System.out.println("Pay "+priceToPay +" pounds");
    System.out.println("Turn Right");
    System.out.println("Walk forwards 1000m");
    System.out.println("Turn Left");
    System.out.println("Go inside shop");
    return startingAmount-priceToPay;
}
}
