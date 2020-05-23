import java.util.Scanner;
public class ExoAlgo3 {
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
		double RTS = R1 + R2 + R3;
		System.out.println("la resistance totale du circuit serie est: " + RTS + "ohm");
		double RTP = (R1 * R2 * R3)/(R1 * R2 + R2 * R3 + R1 * R3);
		System.out.println("la resistance totale du circuit parallele est : " + RTP + "ohm");
	}
}
