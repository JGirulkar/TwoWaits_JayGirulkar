package com.company;
import java.util.Locale;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();
        String nstr = str.replaceAll(" ","");
        String fstr = nstr.toLowerCase();

        for (int i = 0; i < ((fstr.length() - 1) / 2); i++) {
            if (fstr.charAt(fstr.length() - (i + 1)) != fstr.charAt(i)) {
                System.out.println("not palindrome");
                return;
            }
        }
        System.out.println("Palindrome");
    }
}
