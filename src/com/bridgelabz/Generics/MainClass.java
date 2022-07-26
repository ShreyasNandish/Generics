package com.bridgelabz.Generics;

public class MainClass {
    public static void main(String[] args) {
        StringMax stringmax = new StringMax();
        System.out.println("Test case 1 :");
        stringmax.stringMax("Apple","Peach","Banana");
        System.out.println("Test case 2 :");
        stringmax.stringMax("Peach","Apple","Banana");
        System.out.println("Test case 3 :");
        stringmax.stringMax("Banana","Apple","Peach");
    }
}
