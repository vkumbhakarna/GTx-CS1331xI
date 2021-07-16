public class FahrenheitToCelsius {
	public static void main (String[] args	) {
		int saturdayFarnehit;
		int sundayFarnehit;
		saturdayFarnehit = 78;
		sundayFarnehit = 81;
		double saturdayCelsius  = (5.0/9) * (saturdayFarnehit - 32);
		double sundayCelsius  = (5.0/9) * (sundayFarnehit - 32);
		System.out.println("Weekend averages");
		System.out.println("Saturday: " + saturdayCelsius);
		System.out.println("Sunday: " + sundayCelsius);
	}
}
