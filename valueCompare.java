public class valueCompare {
	public static void main(String[] args) {
		String x = "park";
		String y = "p4rk";
		if (x.compareTo(y) > 0) {
			System.out.println("x is greater than y");
			System.out.println("x: " + x);
			System.out.println("y: " + y);
		}
	}
}