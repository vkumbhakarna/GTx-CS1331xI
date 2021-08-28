import java.util.Scanner;
import java.text.NuberFormat;

public class FahrenheitToCelsiusIn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //read keyboard input
		System.out.print("Enter a Fahrenheit value: ");
		int fahrenheit = input.nextInt();
		System.out.print("Enter a day of the week: ");
		String day = input.next();
		System.out.print("Enter preferred Celsius label (Centigrade, Celsius, or C: ");		
		String cText = input.next();
		//String day = input.nextLine();
		double celsius = (5.0 / 9) * (fahrenheit - 32);
		System.out.printf("%s Fahrenheit: %d\n", day , fahrenheit);
		System.out.printf("%s %10s: %,.1f\n", day, cText, celsius);
		
    }
}