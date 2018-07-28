import java.text.DecimalFormat;

public class Circle {
	private double userRadius;
	
	public Circle (double radius) {
		userRadius = radius;
	}
	
	public double getCircumference() {
		double circumference = 0.0;
		circumference = userRadius * 2 * Math.PI;
		
		return circumference;
	}
	
	public String getFormattedCircumference() {
		
		double circumference = getCircumference();
		String formatCirc = formatNumber(circumference);
		
		return formatCirc;
	}
	
	public double getArea() {
		double area = 0.0;
		area = userRadius * userRadius * Math.PI;
		
		return area;
	}
	
	public String getFormattedArea() {
		double area = getArea();
		String formatArea = formatNumber(area);
		
		return formatArea;
	}
	
	private String formatNumber (double x) {
		DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
		String formattedNum = decimalFormat.format(x);
		
		return formattedNum;
	}

}
