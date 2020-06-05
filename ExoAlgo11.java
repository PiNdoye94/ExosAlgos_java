import java.util.Scanner;
public class ExoAlgo11{
	public static void main(String[] args){
		Scanner vala = new Scanner(System.in);
		System.out.println("saisir la valeur a: ");
		int a = vala.nextInt();
		Scanner opera = new Scanner(System.in);
		System.out.println("entrer l'operateur de calcul: ");
		String operateur = opera.nextLine();
		Scanner valb = new Scanner(System.in);
		System.out.println("saisir la valeur b: ");
		int b = valb.nextInt();
		if(operateur== +){
			int somme = a+b;
			System.out.println("l'addition de a et b est = " + somme);
		}
	}
}