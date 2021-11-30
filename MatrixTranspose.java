package com.company;

import java.util.*;

public class MatrixTranspose {
    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        int trans[][] = new int[3][3];
        int i, j;
        Scanner sc= new Scanner(System.in);

        for(i=0; i<3; i++){
            for(j=0; j<3; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Elements are");

        for(i=0; i<3; i++){
            for(j=0; j<3; j++){

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        for( i=0; i<3; i++){
            for(j=0; j<3; j++){
                trans[i][j] = arr[j][i];
            }
        }
        System.out.println("Transpose of matrix");

        for(i=0; i<3; i++){
            for(j=0; j<3; j++){

                System.out.print(trans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
