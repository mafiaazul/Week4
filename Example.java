import java.util.Scanner; //import to read from the console

public class Example {

       public static void main(String[] args) {

            System.out.println("Please enter a number:");
            Scanner in = new Scanner(System.in); //creates a scanner called 'in' to scan for input from the console
            int num1 = in.nextInt(); //finds the next integer and stores it into num1

            System.out.println("Please enter another number:");
            int num2 = in.nextInt(); //finds the next integer entered and stores it into num2

            int sum = num1 + num2;
            int product = num1 * num2;

            System.out.println("The sum is " + sum);
            System.out.println("The product is " + product);

            in.close(); //closes the scanner
      }
}