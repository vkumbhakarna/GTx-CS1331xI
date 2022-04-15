import java.util.Scanner;
import java.util.logging.Logger;
import java.util.Date;

public class DateTime {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter date (mm): ");
		int mm = input.nextInt();
		System.out.println("Enter date (dd): ");
		int dd = input.nextInt();
		System.out.println("Enter date (yy): ");
		int yy= input.nextInt();
		String InDate = String.format("%02d", mm) + String.format("%02d", dd) + String.format("%04d", yy);
		System.out.println("Date is " + InDate);
		
		SimpleDateFormat formatter = new SimpleDateFormat("Mdy", Locale.ENGLISH);
		
		Date date = formatter.parse(InDate);

		System.out.printf("Date is " + date);

	}
}