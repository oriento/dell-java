package calculator;
import java.util.Scanner;
public class MyCalculator {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.println("Please enter 2 numbers separated by space");
		double a = k.nextDouble();
		double b = k.nextDouble();
		System.out.println("The sum of   " + a +" and " +b + " is " + add(a,b));
		System.out.println("The difference of  "+ a +" and " +b + " is " + subtract(a,b));
		System.out.println("The product of  "+ a +" and " +b + " is " + multiply(a,b));
		System.out.println("The quotient of  "+ a +" and " +b + " is " + divide(a,b));
		
		
	}
	// Methods for the 4 operations
	public static double add(double a, double b) {
		return a+b;
		}
	public static double subtract(double a, double b) {
		return a-b;
		}
	public static double multiply(double a, double b) {
		return a*b;
		}
	public static double divide(double a, double b) {
		return a/b;
		}

}
