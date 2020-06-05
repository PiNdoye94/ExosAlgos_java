import java.util.Scanner;
public class ExoAlgo7 {
	public static void main(String[] args) {
		Scanner mont= new Scanner(System.in);
		System.out.println("entrer le montant souhaité: ");
		int montant = mont.nextInt();
		int billet20 = montant/20;
		int reste = montant%20;
		int billet10 = reste/10;
		reste = billet10%10;
		int billet5 = reste/5;
		reste = billet5%5;
		int piece2 = reste/2;
		reste = piece2%2;
		int piece1 = reste/1;
		reste = piece1%1;
		System.out.println(billet20);
		System.out.println(billet10);
		System.out.println(billet5);
		System.out.println(piece2);
		System.out.println(piece1);
		
	}
}