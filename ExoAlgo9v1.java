import java.util.Scanner;
public class ExoAlgo9v1{
	public static void main(String[] args){
		System.out.println("entrer l'heure de depart du vol en heure et en minute: ");
		  Scanner hd = new Scanner(System.in);
		  System.out.println("donner heure: ");
		  int heure_dep = hd.nextInt();
		  Scanner mind = new Scanner(System.in);
		  System.out.println("donner minute: ");
		  int min_dep = mind.nextInt();
		System.out.println("entrer l'heure d'arrivee du vol en heure et en minute: ");
		  Scanner ha = new Scanner(System.in);
		  System.out.println("donner heure: ");
		  int heure_arr = ha.nextInt();
		  Scanner mina = new Scanner(System.in);
		  System.out.println("donner minute: ");
		  int min_arr = mina.nextInt();
		
		if(min_arr>min_dep){
			int vol_min = min_arr - min_dep;
			int vol_heure = heure_arr - heure_dep;
			System.out.println("la duree du vol est de :" + vol_heure + "h" + vol_min + "min");
		}else{
			int vol_min = min_arr + 60 - min_dep;
			int vol_heure = heure_arr - heure_dep;
			System.out.println("la duree du vol est de: " + vol_heure + "h" + vol_min + "min");
		}
	}
}