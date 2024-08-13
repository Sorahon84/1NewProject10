package org.example.FirstProject;

public class MyFirstProject7{
    public static void main(String[] args) {
int n = 20;
int first = 0;
int second = 1;
int next = 0;
        System.out.print("0, 1, ");
for (int i = 0; i < n-2; i++){
     next = first+second;
    System.out.print(next + ", ");
    first = second;
    second=next;
    //System.out.print(first + ",");
}













    }
}
