package main;

import java.util.*;
import java.util.stream.Collectors;

import utils.DynamicKeyboardInputReader;
import utils.NumbersListService;

public class MinimumNumberFinder {

    /*
Create a program that will find the minimum provided number. The
numbers will be provided from user input (keyboard), and numbers are
going to be continuously added in the structure till the user provides a
“n” in the prompt asking him for another number.
Hint: Scan for empty string and parse any input as Integer
 */

        public static void main(String[] args) {

            System.out.println("Please type an integer otherwise press n to stop");

            DynamicKeyboardInputReader reader = new DynamicKeyboardInputReader();

            //sort list to natural order without using streams
            reader.getInput().sort(Comparator.comparing(Integer::valueOf));
            System.out.println("Minimum number is : " + reader.getInput().get(0));


            /*Same output using Streams */
            NumbersListService  service = new NumbersListService(reader.getInput());
            System.out.println("List of numbers in natural order using streams: " + service.SortListAscending(reader.getInput()));
            System.out.println("Minimum Number using streams is: " + service.findMinimumNumber(reader.getInput()));

        }


}

