public class HelloWorldLoop {
	public static void main (String[] args) {
		int line = 0;
		while (line <10) {
			line ++;
			System.out.println(line + " : " + "Hello World");		
		}
		int lineNum = 10;
		while (lineNum > 0) {
			System.out.println(lineNum + " : " + "Bye World!");
			lineNum --;
		}

	}
}