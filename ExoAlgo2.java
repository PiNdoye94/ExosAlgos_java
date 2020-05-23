import java.util.Scanner;
public class ExoAlgo2 {
	public static void main(String[] args) {
		Scanner rayon = new Scanner(System.in);
		System.out.println("entrer le rayon du cercle: ");
		double r = rayon.nextInt();
		double s = r*r*3.14;
		System.out.printf("la surface du cercle est: " + s + "m2\n");
		double p = 2*r*3.14;
		System.out.printf("le perimetre du cercle est: " + p + "m");
		
	}
}