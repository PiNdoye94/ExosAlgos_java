import java.util.Scanner;
public class ExoAlgo14 {
	public static void main(String[] args){
		System.out.println("Entrer une date au format jj/mm/aa");
		Scanner jr = new Scanner(System.in);
		System.out.println("Ajouter le jour: ");
		int jour = jr.nextInt();
		
		Scanner ms = new Scanner(System.in);
		System.out.println("Ajouter le mois: ");
		int mois = ms.nextInt();
		
		Scanner an = new Scanner(System.in);
		System.out.println("Ajouter l'annee: ");
		int annee = an.nextInt();
		
		System.out.printf("la date saisie: " + jour + "/" + mois + "/" + annee + "\n");
		
		if(annee%4==0 && annee%100!=0 || annee%400==0){
			System.out.println("l'annee de cette date est bissextile");
		}else{
			System.out.println("l'annee de cette date n'est bissextile");
		}
	}
}