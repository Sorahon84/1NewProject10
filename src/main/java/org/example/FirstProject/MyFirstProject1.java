package org.example.FirstProject;

public class MyFirstProject1 {
    public static void main(String[] args) {
int [] arr = {67, 90 ,100, 59, 85, 99,84};
int highTemp = arr[0];
int lowTemp = arr[0];
        for (int i = 0 ; i < arr.length; i++){
        if (arr [i] > highTemp){
            highTemp = arr[i];
        }
        if(arr[i] < lowTemp){
            lowTemp = arr[i];
        }
    }
        System.out.println("Highest temperature: "+ highTemp);
        System.out.println("Lowest temperature: "+ lowTemp );
    }
}