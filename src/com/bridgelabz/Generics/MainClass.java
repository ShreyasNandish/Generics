package com.bridgelabz.Generics;

public class MainClass {
    public static void main(String[] args) {
        FloatMax floatmax = new FloatMax();
        System.out.println("Test case 1 :");
        floatmax.floatMax(3.0f,2.0f,1.0f);
        System.out.println("Test case 2 :");
        floatmax.floatMax(2.0f,3.0f,1.0f);
        System.out.println("Test case 3 :");
        floatmax.floatMax(1.0f,2.0f,3.0f);
    }
}
