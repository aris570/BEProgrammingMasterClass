package utils;

import java.util.ArrayList;
import java.util.Scanner;

public class DynamicKeyboardInputReader {

    public ArrayList<Integer> getInput(){

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> inputList = new ArrayList<>();

        int index = 0;
        while (sc.hasNext()) {

            if (sc.hasNextInt()) {
                int num = sc.nextInt();
                inputList.add(num);
                index++;
            } else if (sc.hasNext()) {
                if (sc.next().equals("n")) {
                    System.out.println("input stopped & calculating minimum inserted number....\n");
                    return inputList;
                } else {
                    System.out.println("Invalid input");
                    System.exit(-1);
                }
            }
        }
        return inputList;
    }

}
