import java.util.Scanner;

public class BookOrderRocha {
	public static void main(String[] args) {
		
		double subtotal = 0;
		int numberOfBooks = 0;
		
		final double TAX_RATE = 0.065;
		final double SHIPPING_CHARGE = 2.95;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter number of books: ");
		numberOfBooks = in.nextInt();
		
		System.out.print("Enter subtotal: ");
		subtotal = in.nextDouble();
		
		double tax = subtotal * TAX_RATE;
		double shippingTotal = numberOfBooks * SHIPPING_CHARGE;
		double total = subtotal + tax + shippingTotal;

		System.out.println();
		System.out.println("--------------------------------");
		System.out.println("Number of books purchased: " + numberOfBooks);
		System.out.println("Book Subtotal: " + subtotal);
		System.out.println("Tax: " + tax);
		System.out.println("Shipping: " + shippingTotal);
		System.out.println("--------------------------------");
		System.out.println("Order Total: $" + total);
		
		in.close();
	}
}
