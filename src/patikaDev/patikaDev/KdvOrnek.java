package patikaDev.patikaDev;

import java.util.Scanner;

public class KdvOrnek {

	public static void main(String[] args) {
		
	//kullan�c�dan alinan para tutar�nin kdv li fiyatini ve kdv tutar�n� hesaplayarak yazd�r
		
	Scanner scan = new Scanner(System.in);
	
	System.out.print("lutfen bir para tutari giriniz : ");
	
	double tutar = scan.nextDouble();
	
	double kdvOrani = 0.18;
    
	double kdvTutar = tutar*kdvOrani ;
	
	double kdvliTutar = tutar+kdvTutar;
	
	System.out.println("Kdv orani : " + kdvOrani +"\n kdvli tutar :" + kdvTutar + "\n kdvlitutar : " + kdvliTutar );
	
	scan.close();
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
