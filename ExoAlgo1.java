import java.util.Scanner;
public class ExoAlgo1 {
    public static void main(String[] args) {
	   Scanner nomb1 = new Scanner(System.in);
	   System.out.println("Entrer la valeur de a: ");
	   int a = nomb1.nextInt();
	   Scanner nomb2 = new Scanner(System.in);
	   System.out.println("Entrer la valeur de b: ");
	   int b = nomb2.nextInt();
	   int q_entier = a/b;
	   System.out.println("le quotient entier de la division est: " + q_entier);
	   double q_reel = (double)a/b;
	   System.out.println("le quotient reel de la division est: " + q_reel);
	   int reste = a%b;
	   System.out.println("le reste de la division est : " + reste);
	
	}

}
