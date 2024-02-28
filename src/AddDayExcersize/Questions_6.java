package AddDayExcersize;

import java.util.Scanner;

public class Questions_6 {
    public static void main(String[] args) {

        /*
        Bir kullanıcı tarafından girilen bir sayının faktöriyelini
        ( faktöriyel = 1 * 2 * 3 * ... * n) hesaplayan bir Java programı yazınız. Ancak
         bu sefer, faktöriyel hesaplama işlemini recursive (özyinelemeli) bir
         fonksiyon olusturunuz
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi = scanner.nextInt();

        int carpim = 1;


        for (int i = sayi; i >= 1; i--) {
            carpim *= i;


                System.out.println("Sonuc : " + carpim);

            }

        }
    }