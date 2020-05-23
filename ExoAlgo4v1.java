import java.util.Scanner;
public class ExoAlgo4v1 {
	public static void main(String[] args) {
		Scanner valx = new Scanner(System.in);
		System.out.println("saisir la valeur de x: ");
		double x = valx.nextInt();
		Scanner valn = new Scanner(System.in);
		System.out.println("saisir la valeur de n: ");
		int n = valn.nextInt();
		double p = Math.pow(x,n);
		System.out.println(p);
	} 
}