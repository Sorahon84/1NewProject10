package org.example.FirstProject;

public class MyFirstProject10 {
    public static void main(String[] args) {
        String[] arr = {"John", "Natasha", " Shon", "Sara", "James", "Jane", "Tanya", "Jasob", "John"};
        System.out.println("Duplicate elements in given array: ");
        //Searches for duplicate element
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j]) && i != j) {
                    System.out.println(arr[i]);
                }
            }
        }
    }
}

