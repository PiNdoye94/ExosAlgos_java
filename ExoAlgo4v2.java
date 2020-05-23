import java.util.Scanner;
public class ExoAlgo4v2 {
	public static void main(String[] args) {
		Scanner valx = new Scanner(System.in);
		System.out.println("saisir la valeur de x: ");
		double x = valx.nextInt();
		Scanner valn = new Scanner(System.in);
		System.out.println("saisir la valeur de n: ");
		int n = valn.nextInt();
		double p = 1;
		for(int i = 0; i <= n; i++) {
			p = p * x;
			System.out.println(p);
		}
		
	}
}