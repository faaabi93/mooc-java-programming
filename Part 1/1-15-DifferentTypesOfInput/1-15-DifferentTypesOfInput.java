
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String text = String.valueOf(scan.nextLine());
        System.out.println("Give an integer:");
        int number = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double number2 = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean trueFlase = Boolean.valueOf(scan.nextLine());
        System.out.println("You gave the string " + text);
        System.out.println("You gave the integer " + number);
        System.out.println("You gave the double " + number2);
        System.out.println("You gave the boolean " + trueFlase);

        // Closing the scanner, so the error disappears
        scanner.close();
    }
}
