package patikaDev.patikaDev;

import java.util.Scanner;

public class HipotenusHesaplama {

	public static void main(String[] args) {
	
	// kullan�c�dan dikucgenin kenarlar�n� al�p hipotenusu hesapla
		
	Scanner scan = new Scanner(System.in);
	
	System.out.print("1. dik kenari giriniz :");
	 
	int dik1 = scan.nextInt();
	
	System.out.print("2. dik kenari giriniz : ");
		
	int dik2 = scan.nextInt();
	
	double hipotenus = Math.sqrt((dik1*dik1)+(dik2*dik2)) ;
	
	System.out.print("hipoten�s = " + hipotenus );
		
	scan.close();
	
		
		
		
		
		
		
		
		
		
		
		

	}

}
