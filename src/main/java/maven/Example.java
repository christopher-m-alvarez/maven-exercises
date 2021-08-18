package maven;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Example {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name");

        String userInput = scanner.nextLine();
        System.out.printf("You entered: %s\n", userInput);
        String message;

        if (StringUtils.isNumeric(userInput)) {
            message = "is a number";
        }else {
            message = "is not a number";
        }
        System.out.printf("\"%s\" %s\n", userInput, message);
        System.out.printf("Flipped: %s", StringUtils.swapCase(userInput));
        System.out.printf("reversed: %s\n", StringUtils.reverse(userInput));

        //my way
//        StringUtils.reverse(userInput);
//        StringUtils.swapCase(userInput);
//        StringUtils.isNumeric(userInput);

    }

}
