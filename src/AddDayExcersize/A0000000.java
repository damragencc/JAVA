package AddDayExcersize;

import java.util.Scanner;

public class A0000000 {
    public static void main(String[] args) {

        //Soru 5- Kullanicidan bir harf isteyin,
        //        girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        //        yoksa girilen karakteri girildigi gibi yazdirin

     Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
       String harf=scanner.nextLine();

      char girilenKelime= harf.charAt(0);


      if (Character.isLowerCase(girilenKelime)){
          System.out.println(Character.toUpperCase(girilenKelime));
      }else
          System.out.println(girilenKelime);


    }
}
