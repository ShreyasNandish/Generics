package com.bridgelabz.Generics;

public class IntMax {
    void intMax(Integer val1,Integer val2,Integer val3)
    {
        if((val1.compareTo(val2))>=0 && (val1.compareTo(val3))>=0)
            System.out.println("The first number is largest among 3 numbers ");
        else if ((val2.compareTo(val1))>=0 && (val2.compareTo(val3))>=0)
        {
            System.out.println("The second number is largest among 3 numbers ");
        }
        else
            System.out.println("The Third number is largest among 3 numbers ");
    }
}
