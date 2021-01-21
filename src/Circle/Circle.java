package Circle;

public class Circle {
	double radius;
	
	public Circle() {
		this.radius = 1.0;
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double calculateArea() {
		return Math.PI*(radius * radius);
	}
}
