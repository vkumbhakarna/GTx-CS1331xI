public class Powers {
	public static void main(String[] args) {
	int i;
	int j;
	for (i=2; i<=5; i++) {
		for (j=1; j<=40; j*=i) {
			System.out.println("For " + i + " value of " + i +" x " + j + " is " + i * j );
			}
		}
	}
}