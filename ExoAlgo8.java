import java.util.Scanner;
public class ExoAlgo8 {
	public static void main(String[] args) {
		Scanner coefa = new Scanner(System.in);
		System.out.println("entrer le coefficient a: ");
		int a = coefa.nextInt();
		Scanner coefb = new Scanner(System.in);
		System.out.println("entrer le coefficient b: ");
		int b = coefb.nextInt();
		Scanner coefc = new Scanner(System.in);
		System.out.println("entrer le coefficient c: ");
		int c = coefc.nextInt();
		if(a==0 && b==0){
			System.out.println("Pas de solution!!");
		} else if(a==0 && b!=0){
			System.out.println("la solution de l'equation est x =" + (-c/b));
		} else if(a!=0 && b!=0){
		    int D = (b*b-4*a*c);
		    if(D==0){
			    System.out.println("la solution de l'equation est unique x0 =" + (-b/2*a));
		    } else if(D>0){
			    System.out.println("l'équation admet une solution double:");
				System.out.println("x1 =" + (-b-Math.sqrt(D))/(2*a));
				System.out.println("x2 =" + (-b+Math.sqrt(D))/(2*a));
            }
		
		}
		
		
	} 
}