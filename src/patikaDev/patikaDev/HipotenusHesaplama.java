package patikaDev.patikaDev;

import java.util.Scanner;

public class HipotenusHesaplama {

	public static void main(String[] args) {
	
	// kullanýcýdan dikucgenin kenarlarýný alýp hipotenusu hesapla
		
	Scanner scan = new Scanner(System.in);
	
	System.out.print("1. dik kenari giriniz :");
	 
	int dik1 = scan.nextInt();
	
	System.out.print("2. dik kenari giriniz : ");
		
	int dik2 = scan.nextInt();
	
	double hipotenus = Math.sqrt((dik1*dik1)+(dik2*dik2)) ;
	
	System.out.print("hipotenüs = " + hipotenus );
		
	scan.close();
	
		
		
		
		
		
		
		
		
		
		
		

	}

}
