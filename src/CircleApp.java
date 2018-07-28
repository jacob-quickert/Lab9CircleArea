import java.util.Scanner;

public class CircleApp {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double radius;
		Circle userCircle;
		int circleCount = 0;
		String contInU = "y";

		while (contInU.equalsIgnoreCase("y")) {
			circleCount++;
			
			radius = Validator.getDouble(scan, "Please enter a radius (1.00 - 100.00): ", 1, 100);
			userCircle = new Circle(radius);
			
			System.out.println("Circumference: " + userCircle.getFormattedCircumference());
			System.out.println("Area: " + userCircle.getFormattedArea());

			System.out.print("Continue? (y/n): ");
			contInU = scan.nextLine();
		}
		
		System.out.println("Thank you, you created " + circleCount + " circles. Goodbye.");
		
		scan.close();
	}

}
