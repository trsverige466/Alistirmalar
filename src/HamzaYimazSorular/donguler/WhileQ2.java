package HamzaYimazSorular.donguler;

public class WhileQ2 {

	public static void main(String[] args) {
		//bir sayinin rakamlari toplamini while dongusunu kullanarak bulan program yaz.
		
		int sayi=122;
		
		int rakam= 0;
		
		int rakamToplam=0;
		
		while (sayi>0) {
			rakam=sayi%10;
			rakamToplam+=rakam;
			sayi/=10;
		}
		System.out.println("rakamlar toplami : " +rakamToplam);
		
	}

}
