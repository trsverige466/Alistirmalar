package HamzaYimazSorular.donguler;

public class ForQ5 {

	public static void main(String[] args) {
		// BÝR ARRAY ÝCERÝSÝNDE HANGÝ ÝSÝM KAC DEFA OLDUGUNU BUL
		
		String array[]= {"hamza","ali","hamza","ahmet","ahmet","ahmet"};
		
		String bos= "";
		
		for (int i = 0; i < array.length; i++) {
			if (!bos.contains(array[i])) {
				int sayi=1;
				for (int j = i+1; j < array.length; j++) {
					if (array[i].equals(array[j])) {
						sayi++;
		
				}
			}
				System.out.println(array[i]+ " : " +sayi);
				bos += array[i];
		}
		}	
			
		
		
	}

}
