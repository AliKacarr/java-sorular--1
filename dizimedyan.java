//random dizideki medyanı(ortadaki sayı) bulma
public class dizimedyan {
	public static void main(String[] args) {
		int random=(int)(Math.random()*10+1);  //min 1 max 10 elemanlı dizi.
		int dizi[]=new int [random];
		for(int i=0;i<random;i++) {
			dizi[i]=(int) (Math.random()*101); //max 100 olacak şekilde elemanları random atadı.
			
		}
		if(random%2==0) { //eleman sayısı çiftse ortadaki sayıların ort yazdır
			System.out.println((dizi[random/2]+dizi[random/2-1])/2.0);
		}
		else {  //değilse ortadakini yazdır
			System.out.println(dizi[random/2]);
		}
	System.out.print("diziniz= ");
		for(int e:dizi) { //diziyi kontrol  amaçlı yazdırdım
			System.out.print(e+" ");
		
	}
}
}