package com.company;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double ans = 0;
        System.out.println("This program will run until you press x or X");

        while(true){
            System.out.println("Enter the operator: ");
            char op= in.next().trim().charAt(0);

            if(op == '+' || op == '-' || op == '*' || op== '/' || op == '%'){
                System.out.println("Enter two nums: ");
                double a = in.nextDouble();
                double b = in.nextDouble();

                if(op == '+'){
                    ans = a + b;
                }
                if(op == '-'){
                    ans = a - b;
                }
                if(op == '*'){
                    ans = a * b;
                }
                if(op == '%'){
                    if(b != 0){
                        ans = a % b;
                    }
                }
                if(op == '/'){
                    ans = a / b;
                }

            } else if(op == 'x' || op == 'X'){
                break;
            }
            else{
                System.out.println("Enter the valid number");
            }
            System.out.println(ans);
        }
    }
}
