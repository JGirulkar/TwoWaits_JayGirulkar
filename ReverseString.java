package com.company;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String nstr = "";
        char ch;

        for(int i=0; i<str.length(); i++){
            ch = str.charAt(i);
            nstr = ch+nstr;
        }
        System.out.println(nstr);
    }
}
