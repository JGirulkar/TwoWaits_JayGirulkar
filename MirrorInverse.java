package com.company;
import java.util.Scanner;

public class MirrorInverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        int[] arr = new int[n];

        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }

        if (isMirrorInverse(arr))
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    static boolean isMirrorInverse(int arr[])
    {
        for (int i = 0; i < arr.length; i++) {
            if (arr[arr[i]] != i)
                return false;
        }
        return true;
    }
}
