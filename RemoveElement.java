package com.company;
import java.util.ArrayList;
import java.util.Iterator;

public class RemoveElement {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>(10);
        numbers.add(20);
        numbers.add(10);
        numbers.add(1);
        numbers.add(4);
        numbers.add(0);
        System.out.println("The list of the size is: " + numbers.size());

        for (Integer number : numbers) {
            System.out.println("Number is: " + number);
        }

        Iterator itr = numbers.iterator();
        while (itr.hasNext())
        {
            int data = (Integer)itr.next();
            if (data > 10)
                itr.remove();
        }

        System.out.println("\nAfter removing the element the size of the ArrayList is: " + numbers.size());

        for (Integer number : numbers) {
            System.out.println("Number is: " + number);
        }
    }
}