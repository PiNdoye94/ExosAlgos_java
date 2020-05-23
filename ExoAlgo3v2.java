import java.util.Scanner;
public class ExoAlgo3v2 {
   public static void main(String[] args) {
	    Scanner resis1 = new Scanner(System.in);
		System.out.println("saisir la valeur R1: ");
		double R1 = resis1.nextInt();
		Scanner resis2 = new Scanner(System.in);
		System.out.println("saisir la valeur R2: ");
		double R2 = resis2.nextInt();
		Scanner resis3 = new Scanner(System.in);
		System.out.println("saisir la valeur R3: ");
		double R3 = resis3.nextInt();
		Scanner chx = new Scanner(System.in);
		System.out.println("Entrer votre choix qui ne prend que deux valeurs 1 ou 2!");
	    int choix = chx.nextInt();
	    if(choix==1){
		  double RT = R1 + R2 + R3;
          System.out.println("la resistance totale en circuit serie est: " + RT + "ohm");
        } else if(choix==2){
               double RT = (R1 + R2 + R3)/(R1 * R2 + R2 * R3 + R1 * R3);
               System.out.println("la resistance totale en circuit parallele est: " + RT + "ohm");
		      } else {
                System.out.println("choix impossible!!");			 
			    }
   }
}