package com.bridgelabz.Generics;

public class StringMax {
    void stringMax(String val1,String val2,String val3)
    {
        if((val1.compareTo(val2))>=0 && (val1.compareTo(val3))>=0)
            System.out.println("The first string is largest among 3 strings ");
        else if ((val2.compareTo(val1))>=0 && (val2.compareTo(val3))>=0)
        {
            System.out.println("The second string is largest among 3 strings ");
        }
        else
            System.out.println("The Third string is largest among 3 strings ");
    }
}
