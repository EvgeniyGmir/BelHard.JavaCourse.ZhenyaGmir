import java.util.Random;
import java.util.Scanner;

public class Circle {

	public Circle(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter radius of circle: ");
		int radius  = scan.nextInt();
		System.out.println("Enter Coordinate X ");
		int coordinateX1 = scan.nextInt();
		System.out.println("Enter Coordinate Y ");
		int coordinateY1 = scan.nextInt();
		System.out.println("We have circle N1 with characteristics: radius = " + radius + ", coordinate X1 = " + coordinateX1 + ", coordinate Y1 = " + coordinateY1 + ".");
	}
		
	public static double lengthCircle(double radius) {
		double length = radius* 2 * Math.PI; 
		return length;
	}
	
	public static void transferCenter() {
		Random rand = new Random();
		int coordinateX2 = -99 + rand.nextInt(200);
		int coordinateY2 = - 99 + rand.nextInt(200);
		System.out.println("Coordinates center of circle N2: " + coordinateX2 + ", " + coordinateY2);
	}
	
	public static double calculatingDistance(int X1, int Y1, int X2, int Y2) {
		double distance;
		distance = Math.sqrt(Math.pow((X1 - X2),2) + Math.pow((Y1- Y2), 2));
		return distance;

	}
	
	public static void touchCircle( int X1, int Y1, int radius1, int X2, int Y2, int radius2) {
		if(calculatingDistance(X1, Y1, X2, Y2) == (radius1+radius2) || calculatingDistance(X1, Y1, X2, Y2) == Math.abs(radius1-radius2) ) {
			System.out.println("Circles are touching!!");
		} else System.out.println("Circles aren't touching!!");
		
	}
}