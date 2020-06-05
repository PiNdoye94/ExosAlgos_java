import java.util.Scanner;
public class ExoAlgo13 {
	public static void main(String[] args) {
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
		
		if(jour>0 && jour<=31){
			if(mois>0 && mois<=12){
				if(annee>=2020){
			        System.out.printf("la date " + jour + "/" + mois + "/" + annee + " est valide");
				} 
		    }
		}else{
			System.out.println("la date est invalide!!");
		}	
	}
}