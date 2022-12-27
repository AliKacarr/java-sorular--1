import java.util.Random;

//0-100 arasında dizinin ort bul ve ort üstü olanları yazdır
public class diziavarage {
public static void main(String[] args) {
	int random=(int)(Math.random()*10+1);  //min 1 max 10 elemanlı dizi.
	int dizi[]=new int [random];
	int toplam=0;
	for(int i=0;i<random;i++) {
		dizi[i]=(int) (Math.random()*101); //max 100 olacak şekilde elemanları random atadı.
		toplam+=dizi[i];
	}
	double avarage=toplam/random;   //avarage hesaplama
		for(int i=0;i<random;i++) { //elemanları yeniden göstermek için
			
			if(dizi[i]>avarage) //avarage dan yüksekse yazdır
				System.out.println(dizi[i]);
			
		}
		System.out.print("diziniz= ");
		for(int e:dizi) { //diziyi kontrol  amaçlı yazdırdım
			System.out.print(e+" ");
}
}
}