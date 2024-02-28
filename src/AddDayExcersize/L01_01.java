package AddDayExcersize;

import java.util.Scanner;

public class L01_01 {
    public static void main(String[] args) {

         /*
        Bir kullanıcı tarafından girilen bir sayının faktöriyelini
        ( faktöriyel = 1 * 2 * 3 * ... * n) hesaplayan bir Java programı yazınız. Ancak
         bu sefer, faktöriyel hesaplama işlemini recursive (özyinelemeli) bir
         fonksiyon olusturunuz
         */

        Scanner scanner = new Scanner(System.in);


        int carpim = 1;

      while(true){
          System.out.println("Lutfen bir sayi giriniz");
          int sayi = scanner.nextInt();
        for (int i = sayi; i >= 1; i--) {
            carpim *= i;


        }
        if (sayi<=0){
            System.out.println("Islem sonlandırırıyor");
            break;
        }
          System.out.println("Sonuc" +carpim);
           carpim=1;

    }
}
    }