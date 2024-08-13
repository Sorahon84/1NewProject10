package org.example.FirstProject;

public class MyFirstProject3 {
    public static void main(String[] args) {

        int  [][] arr = {
                {15, 22, 23, 47},
                {19, 85, 90, 12},
                {81, 32, 73, 60}
        };
        for (int [] r : arr) {
            for (int num : r) {
                if (num % 2 == 0)
                    System.out.println("Even numbers " + num);
            }
        }







    //for (int i = 0; i < 3; i++) {
    //for (int j = 0; j < 4; j++){
    //if(a[i]%2==0)

    //System.out.println(a[i][j]);
    }

}

