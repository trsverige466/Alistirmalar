package HamzaYimazSorular.donguler;

public class WhileQ3 {

	public static void main(String[] args) {
		// bir array icerisindeki sayilarin toplamini while dongusunu kullanarak hesapla
		
		int arr[]= {2,33,44,13};
		
		int sira=0;
		int toplam=0;
		
		while (sira<arr.length) {
			toplam+=arr[sira];
			sira++;
			
		}

		System.out.println(toplam);
		
	}

}
