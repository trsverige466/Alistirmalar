package HamzaYimazSorular.donguler;

public class WhileQ1 {

	public static void main(String[] args) {
		//WHÝLE DONGUSUNU KULLANARAK 1 DEN 50 YE KADAR TUM SAYÝLARÝ YAZDÝR.ayrica sadece 5 e bolunenleri yazdir.
		
		int sayi =1 ;
		
		while (sayi<= 50) {
			
			if (sayi%5 == 0) {
				System.out.print(sayi+ " ");
			}
			sayi++;
			
		}

	}

}
