public class EqualityTest{
	public static void main(String [] args) {
		//String x = "park";
		//String x = "home";
		// Use w/o New operator results in creating an alias		
		String x = new String("home");
		// use of new operator results in creating a new string
		String y = "home";
		
		if ( x == y) {
			System.out.println("x and y are aliases");
		}
		if ( x != y) {
			System.out.println("x and y are not aliases");
		}
		
		if (x.equals(y) ) {
			System.out.println("x and y have the same contents");
			System.out.println("x :" + x);
			System.out.println("y :" + y);
		}
	}
}