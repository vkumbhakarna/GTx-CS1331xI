import java.util.Scanner;
public class ternary{
	public static void main(String[] args){
		boolean raining;
		Scanner input = new Scanner(System.in);
		System.out.print("Is it raining? (y/n): ");
		String rainInput = input.next().toLowerCase();
		raining = rainInput.startsWith("y") ? true: false;
		System.out.println(raining);
	}
}