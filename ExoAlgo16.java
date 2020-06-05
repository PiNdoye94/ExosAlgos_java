import java.util.Scanner;
public class ExoAlgo16{
	public static void main(String[] args){
		Scanner vala = new Scanner(System.in);
		System.out.println("Ajouter la valeur a: ");
		int a = vala.nextInt();
		
		Scanner valb = new Scanner(System.in);
		System.out.println("Ajouter la valeur: ");
		int b = valb.nextInt();
		
		int quotient = 0;
		
		while(a>=b){
			a = a-b;
			quotient = quotient+1;
		}
		System.out.println("le quotient de la division par soustraction est: " + quotient);
	}
}