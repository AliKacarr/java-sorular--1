
//Metni tersten yazdırma

import java.util.*;

public class ödev5 {
  
public static String ters_metin(String a){
  String ters="";
  for (int i = a.length()-1; i >=0; i--) {
      ters=ters+a.charAt(i);
      
  }
  return ters;
}
  
  public static void main(String[] args) {
  Scanner giris=new Scanner(System.in);
  System.out.print("Bir metin giriniz : ");
  String metin=giris.nextLine();
  System.out.println("Metniniz : "+metin);
 System.out.println("Ters çevrilmiş hali : "+ters_metin(metin));
  
  }
}