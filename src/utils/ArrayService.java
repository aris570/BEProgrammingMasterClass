package utils;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayService {

   private Integer[] array;

    public ArrayService(Integer[] array){
        this.array = array;
    }

    public void print(Integer[] array){
        for (int i=0; i <=(array.length-1); i++) {
            System.out.println(array[i]);
        }
    }

    public void sortDescending(Integer[] array){
        Arrays.sort(array, Collections.reverseOrder());
    }
}
