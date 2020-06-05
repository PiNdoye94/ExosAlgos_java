import java.util.Scanner;
public class ExoAlgo12 {
	public static void main(String[] args) {
		Scanner nbparfait = new Scanner(System.in);
		System.out.println("entrer une valeur n:");
		int n = nbparfait.nextInt();
		if(n==0){
			System.out.println("le nombre n'est pas parfait!");
		}
		int somme = 1;
		for(int i = 2; i == n/2;){
			if(n%i==0){			
				somme = somme+i;}
		}
		if(n==somme){
			System.out.println("le nombre est parfait");
		}else{
			System.out.println("le nombre n'est pas parfait");
		}
		
		
		
	}
}