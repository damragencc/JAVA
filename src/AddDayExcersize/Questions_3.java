package AddDayExcersize;

import java.util.Scanner;

public class Questions_3 {
    public static void main(String[] args) {

        /*

        Kullanıcıdan aldığınız  Adı, Soyadı ve kredi kartı numaralarını aşağıdaki gibi özel
           forma dönüştürün
          Kredi kartı numarasını kontrol edin, 16 haneden küçük olursa   "Geçersiz kredi kartı
         numarası" yazdırın.
        input : John White 1234234534561478
         output: Ad : J*** Soyad :W**** kartNo:***********1478 (Adın baş harfleri ve soyadı
        büyük olmalıdır)

         */

         Scanner scanner = new Scanner(System.in);
         System.out.println("Lutfen adınızı giriniz");
         String isim = scanner.nextLine();
        System.out.println("Lutfen soyadınızı giriniz");
        String soyadınız = scanner.nextLine();
        System.out.println("Lutfen 16 haneli kredi kartınız giriniz");
        String kkNo = scanner.nextLine();


        String duzenlenmisHali=scanner.nextLine();


      duzenlenmisHali = isim.toUpperCase().charAt(0) + isim.substring(1).replaceAll("\\w","*")+
              soyadınız.toUpperCase().charAt(0) + soyadınız.substring(1) + soyadınız.replaceAll("\\w", "*") +
              "**** **** ****" + kkNo.substring(kkNo.length() - 4);


      System.out.println(duzenlenmisHali);


  }

        }













