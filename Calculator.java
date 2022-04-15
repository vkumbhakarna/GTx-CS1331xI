import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("List of operations: add subtract multiply divide alphabetize");
        System.out.println("Enter an operation: ");
        String op;
	int num1;
	int num2;
	double numa;
	double numb;
	op = input.nextLine().toLowerCase();
	switch (op) {
		case "add":
		{
			System.out.println("Enter two integers:");
			if (input.hasNextInt()) {
				num1=input.nextInt();		
				num2 = input.nextInt();
				int addval = num1 + num2;
				System.out.println("Answer: " + addval);
				break;
			}
			else {
		        	System.out.println("Invalid input entered. Terminating...");			
				break;
			}

		}
		case "subtract":
		{
			System.out.println("Enter two integers:");
			if (input.hasNextInt())  { 
						   num1=input.nextInt(); 
			} else {
				System.out.println("Invalid input entered. Terminating...");
				break;			
				}		
			if (input.hasNextInt() ) { 
							num2 = input.nextInt(); 
			} else {
				System.out.println("Invalid input entered. Terminating...");
				break;			
				}					
			int subval = num1 - num2;
			System.out.println("Answer: " + subval );
			break;

		}
		case "multiply":
		{
			System.out.println("Enter two doubles:");
			if (input.hasNextDouble()) {
				numa=input.nextDouble();		
				numb = input.nextDouble();
				System.out.printf("%.2f", numa * numb);
				break;
			}
			else {
		        	System.out.println("Invalid input entered. Terminating...");
				break;			
			}
		}
		case "divide":
		{
			System.out.println("Enter two doubles:");
			numa=input.nextDouble();		
			numb = input.nextDouble();
			if (numb == 0.00 ) {
				System.out.println("Invalid input entered. Terminating...");
				break;
			}
			else {
				System.out.printf("%.2f", numa / numb);
				break;
			}
		}
		case "alphabetize":
		{
			System.out.println("Enter two words:");
			String str1 = input.next();		
			String str2 = input.next();
			System.out.println( "str1 is " + str1 + " and str2 is " + str2 + " str1.compareToIgnoreCase(str2) "  + str1.compareToIgnoreCase(str2));
			if (str1.compareToIgnoreCase(str2) == 0) {
					System.out.println("Answer: Chicken or Egg.");
			} else if (str1.compareToIgnoreCase(str2) > 0) {
					System.out.println("Answer: " + str2 + " comes before " + str1 + " alphabetically.");
			} else {
				System.out.println("Answer: " + str1 + " comes before " + str2 + " alphabetically.");
			}
			break;
		}
		default: 
		        System.out.println("Invalid input entered. Terminating...");
			break;
	}

    }
}