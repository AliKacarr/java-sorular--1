import java.util.Scanner;

//kullanıcıdan uzunluğunun girişini al 1\n23\n456 şeklinde üçgen yazdır
public class floydüçgeni {
public static void main(String[] args) {
	Scanner giris=new Scanner(System.in);
	System.out.print("üçgen kaç satırdan oluşsun=");
	int satır=giris.nextInt();
	int a=1;
	for(int i=1;i<=satır;i++) {  
		for(int j=0;j<i;j++) {   //satır sayısı kadar yan yana yazdırma yapacaz
			System.out.print(a);
			a++;                 //yazdırılacak a değerini her seferinde arttırıyoruz
		}
		System.out.println();   //her for'a döneceğimiz zaman alt satıra geçiyoruz
		
	}
	
	
	
}
}
