package org.example.FirstProject;

public class MyFirstProject9 {
    public static void main(String[] args) {

       int arr[] = {99,14,46,86,52,48,36,66,85,92};
        //int[] arr = {3, 2, 20, 4, 1, 9, 6, 3, 8};
        int max = 0;
        int secondMax = 0;

        for(int i =0; i< arr.length; i++) {

            if(max < arr[i]) max = arr[i];

            if((max > arr[i]) && (secondMax < arr[i])) secondMax = arr[i];

        }
        System.out.println("Second largest number: " + secondMax);
    }
}













//int [] arr = {1,9,3,10,4,8,20,7,33};
//    int largest = 0;
//    int secondLargest = 0;
//    for (int x : arr) {
//        if (x > largest) {
//            secondLargest = largest;
//            largest = x;
//        }
//        else if (x > secondLargest) {
//            secondLargest = x;
//        }
//    }
//    System.out.println("secondLargest: "+ secondLargest);