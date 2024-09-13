import java.util.Scanner; // import the Scanner class

public class AddTwoNumbers {
    public static void main(String[] args) {
        // create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // prompt user to enter the first number
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        // prompt user to enter the second number
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // add two numbers
        int sum = num1 + num2;

        // print the result
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);

        // close the scanner
        scanner.close();
    }
}
