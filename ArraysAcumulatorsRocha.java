import java.util.Scanner;

public class ArraysAcumulators {

    public static void main(String[] args) {
        Integer myArray = new Integer[10];
        Integer sum = 0;
        Scanner in = new Scanner();

    for (int index = 0; index < myArray.length(); index++) {
        System.out.println("Please enter an integer to position " + index);
        myArray[index] = in.nextBigInteger();
        sum = sum + myArray[index];
    }

    System.out.println("Sum of all integers is: " + sum);

    }
}