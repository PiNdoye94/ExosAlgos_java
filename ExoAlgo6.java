import java.util.Scanner;
public class ExoAlgo6 {
	public static void main(String[] args) {
		System.out.println("saisir les coordonnées du point A(x1,y1):");
		  Scanner coordx1= new Scanner(System.in);
		  System.out.println("entrer l'abscisse du point A: ");
		  int x1 = coordx1.nextInt();
		  Scanner coordy1= new Scanner(System.in);
		  System.out.println("entrer l'ordonnée du point A: ");
		  int y1 = coordy1.nextInt();
		System.out.println("saisir les coordonnées du point B(x2,y2):");
		  Scanner coordx2= new Scanner(System.in);
		  System.out.println("entrer l'abscisse du point B: ");
		  int x2 = coordx2.nextInt();
		  Scanner coordy2= new Scanner(System.in);
		  System.out.println("entrer l'ordonnée du point B: ");
		  int y2 = coordy2.nextInt();
		double D = Math.sqrt(Math.pow((x1-x2),2) + Math.pow((y1-y2),2));
        System.out.printf("la distance entre le point A et B est de: " + D + " m");		
	}
}