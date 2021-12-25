package HamzaYimazSorular.donguler;

public class ForQ3 {

	public static void main(String[] args) {
		//FOR KULLANARAK BÝR SAYÝNÝN KAREKOKUNU HESAPLA
		
		
		//System.out.println(Math.sqrt(55));    math methodu ile kolaylýkla yapilabilir
		
		
		@SuppressWarnings("unused")
		int sayi= 9;
		double karekok=1;
		
		for (double i = 1.000;  i*i<=9 ; i+=0.001) {
			karekok=i;
		}

		System.out.println(karekok);
	}

}
