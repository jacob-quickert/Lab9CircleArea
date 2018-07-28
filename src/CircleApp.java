import java.util.Scanner;

public class CircleApp {

	public static void main(String[] args) {
		//create Scanner and declare variables for the counter and the while condition
		Scanner scan = new Scanner(System.in);
		int circleCount = 0;
		String contInU = "y";

		while (contInU.equalsIgnoreCase("y")) {
			//start the counter at the top of the loop so it counts the first time through
			circleCount++;
			
			//use validator class to prompt, get, and validate user input
			double radius = Validator.getDouble(scan, "Please enter a radius (1.00 - 100.00): ", 1, 100);
			//create circle object instance
			Circle userCircle = new Circle(radius);
			
			//print the results
			System.out.println("Circumference: " + userCircle.getFormattedCircumference());
			System.out.println("Area: " + userCircle.getFormattedArea());
			
			//prompt the user to continue
			System.out.print("Continue? (y/n): ");
			contInU = scan.nextLine();
		}
		//print a goodbye and the number of circles
		System.out.println("Thank you, you created " + circleCount + " circles. Goodbye.");
		
		scan.close();
	}

}
