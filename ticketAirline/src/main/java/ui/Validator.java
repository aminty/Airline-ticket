package ui;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Validator {

    public static String validator(String pattern){
        while (true)
        {
            String input=new Scanner(System.in).next();
            if (Pattern.compile(pattern).matcher(input).find()){
                return input;

            }
            PrintData.errorMessage("Invalid input! ");
        }

    }
}
