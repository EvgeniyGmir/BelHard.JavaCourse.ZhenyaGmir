
public class Task16 {
public static void main(String[] args) {
	int radius = 5;
	System.out.println("Length of circle is " + Circle.lengthCircle(radius));
	Circle circle1 = new Circle();
	Circle.transferCenter();
	System.out.println("Distance between circles is: " + Circle.calculatingDistance(5, 6, 7, 8));
	Circle.touchCircle(2, 3, 1, 1, 3, 1);
}
}
