package com.company;

public class PermutationCombination {
    static int noOfDigits(int N)
    {
        int count = 0;
        while (N>0)
        {
            count++;

            N = N / 10;
        }

        return count;
    }
    static void cyclicPermutation(int N)
    {
        int num = N;
        int n = noOfDigits(N);
        while (true)
        {
            System.out.println(num);
            int remainder = num % 10;
            int dev = num / 10;
            num = (int)((Math.pow(10, n - 1)) * remainder + dev);
            if (num == N)
                break;
        }
    }

    public static void main (String args[])
    {
        int N = 1234;
        cyclicPermutation(N);
    }
}