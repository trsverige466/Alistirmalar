package HamzaYimazSorular.donguler;

public class WhileQ4 {

	public static void main(String[] args) {
		// SONSUZA KADAR CALÝSAN BÝR TANE WHÝLE LOOP OLUSTURUN, VE 100. CALÝSMA SÝRASÝNDA DONGUYU BREAK ÝLE BÝTÝRÝN.
		
		int sayi=0;
		
		while (sayi<sayi+1) {
			System.out.println(sayi);
			
			if (sayi>=100) {
				break;
			}
			sayi++;
			
		}

	}

}
