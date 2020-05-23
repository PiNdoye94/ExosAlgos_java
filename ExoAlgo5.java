import java.util.Scanner;
public class ExoAlgo5 {
	public static void main(String[] args) {
		int somme = 0;
		for(int i = 1; i <= 5; i++) {
			Scanner vals = new Scanner(System.in);
			System.out.println("entrer les valeurs de N: ");
			int N = vals.nextInt();
			somme = somme + N;
			System.out.println(somme);
		}
		
	}
}