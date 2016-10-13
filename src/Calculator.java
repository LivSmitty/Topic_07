import com.sun.deploy.util.StringUtils;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

/**
 * Created by scott_000 on 10/7/2016.
 */
public class Calculator {
    public static void main(String[] args) {
        String function = "";
        int numerator = 0;
        int denominator = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an argument: (FORMAT Example: #/#+#/#)");
        String argument = input.nextLine();

        //verify correct input from user - no white space allowed
            if (argument.contains(" ") == true) {
                System.out.println("Incorrect Format. Try again.");
                System.exit(1);
            }

        //Determine math function
        if (argument.charAt(3) == '+')
            function = "+";
        if (argument.charAt(3) == '-')
            function = "-";
        if (argument.charAt(3) == '*')
            function = "*";


        //Create array of numbers
        String[] argsArray = argument.split("[/+*-]");


        //Perform math function
        if (function == "+") {
            numerator = parseInt(argsArray[0]) + parseInt(argsArray[2]);
            denominator = parseInt(argsArray[1]) + parseInt(argsArray[3]);
            System.out.println(numerator + "/" + denominator);
        }

        if (function == "-") {
            numerator = parseInt(argsArray[0]) - parseInt(argsArray[2]);
            denominator = parseInt(argsArray[1]) - parseInt(argsArray[3]);
            System.out.println(numerator + "/" + denominator);
        }
        if (function == "*") {
            numerator = parseInt(argsArray[0]) * parseInt(argsArray[2]);
            denominator = parseInt(argsArray[1]) * parseInt(argsArray[3]);
            System.out.println(numerator + "/" + denominator);
        }

    }
}
