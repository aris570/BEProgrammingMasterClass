package utils;

import java.security.Key;
import java.util.Scanner;

public class KeyboardInputReader {

    public Integer getInput(){
        // Create a Scanner object to read input.
        Scanner console = new Scanner(System.in);
        return (Integer) console.nextInt();
    }

}
