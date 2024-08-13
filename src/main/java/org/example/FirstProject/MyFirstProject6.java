package org.example.FirstProject;

public class MyFirstProject6 {
    public static void main(String[] args) {


        int number = 29;
        boolean prime = true;
        for (int i = 2; i < number; i++ ) {
            if (number % i == 0) {
                prime = false;
                break;
            }
        }
        if (prime == true)
        {
            System.out.println(number +" number is prime");
        }
        else
        {
            System.out.println(number +" number is not prime");
        }















    }
}
