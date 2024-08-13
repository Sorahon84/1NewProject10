package org.example.FirstProject;

public class MyFirstProject4 {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 7, 9, 4, 5, 6, 10, 4 };
        int even = 0, odd = 0;

        // Loop to find even, odd sum
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0)
                even += arr[i];
            else
                odd += arr[i];
        }

        System.out.println("Even number: " + even);
        System.out.println("Odd number: " + odd);

    }
}
