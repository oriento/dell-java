package helloWorld;
import java.util.Scanner;

public class myWorld2 {

	public static void main(String[] args) {
		System.out.println("Hello World!");
    System.out.println("What is your name?");
		Scanner reader = new Scanner(System.in);
		String input = reader.nextLine();
		System.out.println("Hello: " + input);
		reader.close();
	}

}