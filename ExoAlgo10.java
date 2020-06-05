import java.util.Scanner;
public class ExoAlgo10{
	public static void main(String[] args){
		System.out.println("entrer une valeur A: ");
		  Scanner valA = new Scanner(System.in);
		  int A = valA.nextInt();
		System.out.println("entrer une valeur B: ");
		  Scanner valB = new Scanner(System.in);
		  int B = valB.nextInt();  
		System.out.println("entrer une valeur C: ");
		  Scanner valC = new Scanner(System.in);
		  int C = valC.nextInt();
		  if(A>B && A>C){
			  if(B>C){
				  System.out.println("l'ordre croissant est: "+ C + "<" + B + "<" + A);
			  }else{
				  System.out.println("l'ordre croissant est: "+ B + "<" + C + "<" + A);
			  }
		  }else if(B>A && B>C){
			  if(A>C){
				  System.out.println("l'ordre croissant est: "+ C + "<" + A + "<" + B);
			  }else{
				  System.out.println("l'ordre croissant est: "+ A + "<" + C + "<" + B);
			  }
		  }else if(C>A && C>B){
			  if(A>B){
				  System.out.println("l'ordre croissant est: "+ B + "<" + A + "<" + C);
			  }else{
				  System.out.println("l'ordre croissant est: "+ A + "<" + B + "<" + C);
			  }
	      }else{
			  System.out.println("les trois valeurs sont egaux: "+ A + "=" + B + "=" + C);
		  }
	}
}