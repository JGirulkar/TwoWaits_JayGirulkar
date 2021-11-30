package com.company;

public class Diamond {
    public void hollow(){
        int k = -1;
        for(int i=0; i<=6; i++){
            if(i<4){
                k++;
            }
            else{
                k--;
            }
            for(int j =1; j<=7; j++){
                if(j==4+k || j==4-k){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void solid(){
        int k=-1;
        for(int i=0; i<=6; i++){
            if(i<4){
                k++;
            }
            else{
                k--;
            }
            for(int j =1; j<=7; j++){
                if(j<=4+k && j>=4-k){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Diamond obj = new Diamond();
        obj.hollow();
        System.out.println("");
        obj.solid();
    }
}
