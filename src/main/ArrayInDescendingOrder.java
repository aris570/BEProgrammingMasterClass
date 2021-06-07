package main;

import utils.ArrayService;
import utils.KeyboardInputReader;

import java.util.*;

import static java.util.Collections.reverseOrder;

public class ArrayInDescendingOrder {

    public static void main(String[] args) {

        /*
        Create a program using arrays, that will order its contents in descending
order. The numbers will be provided from user input (keyboard). Try to
create three methods, that each will perform a specific task (
get input,
print,
sort)
         */
        Integer[] inputArray = new Integer[10];

        ArrayService arrayService = new ArrayService(inputArray);

        for (int i=0; i <=(inputArray.length - 1); i++){
            System.out.println("Please insert "+ (i+1) +"th number: ");

            KeyboardInputReader reader = new KeyboardInputReader();
            inputArray[i]= reader.getInput();
        }
        arrayService.print(inputArray);

        /* Sorting without making use of Streams sorting function */
        System.out.println("Sorted array without making use of Streams sorting function: ");
        arrayService.sortDescending(inputArray);
        Arrays.stream(inputArray).forEach(System.out::print);

        /* Sorting by making use of Streams sorting capabilities */
        System.out.println("\n Sorted array by making use of Streams sorting function: ");
        Arrays.stream(inputArray).sorted(Comparator.reverseOrder()).forEach(System.out::print);
    }

}


