package com.company;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int n= in.nextInt();
        int a= 0;
        int b= 1;

        System.out.println(a);
        System.out.println(b);

        int count= 2;
        while(count<=n){
            int temp= b;
            b= b + a;
            System.out.println(b);
            a= temp;
            count++;
        }

    }
}
