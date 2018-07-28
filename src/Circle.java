import java.text.DecimalFormat;

public class Circle { //"Circle" looks like it's spelled weird now. Thanks Java. :/
					   // I need this for it to work and I don't remember why
	private double userRadius; //I think it's my initial variable declaration
							   //but it only works in this class
	
	public Circle (double radius) { //this is the circle object that takes a double for a parameter
		userRadius = radius; 		//it fills the variable with double value from the parameter
	}
	
	public double getCircumference() { //calculate & return circumference
		double circumference = userRadius * 2 * Math.PI;
		
		return circumference;
	}
	
	public String getFormattedCircumference() {		
		double circumference = getCircumference(); // call the circumference calculation
		String formatCirc = formatNumber(circumference); // call the format method
		
		return formatCirc; //--------------- this is the value I call from my main
	}
	
	public double getArea() { //calculate & return area
		double area = userRadius * userRadius * Math.PI;
		
		return area;
	}
	
	public String getFormattedArea() {
		double area = getArea(); //------------ call the area calculation
		String formatArea = formatNumber(area); // call the format method
		
		return formatArea; //------ this is the value I call from my main
	}
	
	private String formatNumber (double x) { // format the double for 2 decimal places and a comma
		DecimalFormat decimalFormat = new DecimalFormat("#,##0.00"); // define my pattern
		String formattedNum = decimalFormat.format(x); //-- call the method for my double
		
		return formattedNum;
	}

}
