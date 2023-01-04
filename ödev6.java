import java.util.Iterator;
//diziyi büyükten küçüğe sıralama
class ödev6 {
	public static void main(String[] args) {
		 int random=(int)(Math.random()*10+1);//min 1 max 10 elemanlı dizi.
		int dizi[]=new int [random];
		for(int i=0;i<random;i++) {
     dizi[i]=(int) (Math.random()*101); //max 100 olacak şekilde elemanları random atadı.
		}
		
	     
	   
		for(int i=0;i<random-1;i++) {    //dizinin i.elemanıyla diğer elemanlarını karşılaştırma
			                             //karşılaştırmayı j(i+1)' den başlatıyoruz
	  for(int j=i+1;j<random;j++){       //i yi j son eleman olana kadar karşılaştırıyoruz
			
			if(dizi[i]<dizi[j]) {        //dizi[i] ile dizi[j]nin yerini değiştirme
				int temp=dizi[i];
				dizi[i]=dizi[j];
				dizi[j]=temp;
			}
			          
			}
	 
		}
		
		for(int e:dizi) {       //diziyi yazdırma
		System.out.print(e+" ");
	     	
	}
	
	
	}
	}