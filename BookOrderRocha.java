import java.text.DecimalFormat;
import java.util.Scanner;

public class BookOrderRocha {
	public static void main(String[] args) {
		
		double subtotal = 0;
		int numberOfBooks = 0;
		
		final double TAX_RATE = 0.065;
		final double SHIPPING_CHARGE = 2.95;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter number of books purchased: ");
		numberOfBooks = in.nextInt();
		
		System.out.print("Enter the book or5der subtotal: ");
		subtotal = in.nextDouble();
		
		double tax = subtotal * TAX_RATE;
		double shippingTotal = numberOfBooks * SHIPPING_CHARGE;
		double total = subtotal + tax + shippingTotal;
		
		DecimalFormat df = new DecimalFormat(".00");

		System.out.println("Number of books purchased: " + numberOfBooks);
		System.out.println("Book Subtotal: " + subtotal);
		System.out.println("Tax: " + df.format(tax));
		System.out.println("Shipping: " + df.format(shippingTotal));
		System.out.println("--------------------------------");
		System.out.printf("Order Total: $%.2f", total);
		
		in.close();
	}
}
