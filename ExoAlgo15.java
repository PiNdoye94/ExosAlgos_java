import java.util.Scanner;
public class ExoAlgo15{
	public static void main(String[] args){
		System.out.println("Entrer un entier pour calculer la somme des entiers inferieurs");
		Scanner entier = new Scanner(System.in);
		System.out.println("Saisir un entier n au choix: ");
		int n = entier.nextInt();
		int somme = 0;
		double moyenne = 1;
		for(int i = 1; i<=n; i++){
			somme = somme+i;
		    moyenne = 1*somme/n;
		}
		System.out.println("la somme est de: " + somme);
		System.out.println("la moyenne est de: " + moyenne);
	}
}