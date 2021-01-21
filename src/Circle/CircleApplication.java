package Circle;

public class CircleApplication {

	public static void main(String[] args) {
		Circle circle = new Circle();
		System.out.printf("Area: %f\n", circle.calculateArea());
		Circle circleTwo = new Circle(2.0);
		System.out.printf("Area: %f\n", circleTwo.calculateArea());
	}

}
