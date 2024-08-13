package org.example.FirstProject;

public class MyFirstProject8 {
    public static void main(String[] args) {
        int  arr [] = {15, 36, 78, 55, 45, 34, 90, 20, 4 };
int min = arr[0];
int max = arr[0];
for (int i = 0; i < arr.length; i++){
    if (arr[i] < min){
        min = arr[i];
    }
    if(arr[i] > max){
        max=arr[i];
    }
}
        System.out.println("Minimum  " + min + ".  Maximum  " + max + ".");

















    }
}
