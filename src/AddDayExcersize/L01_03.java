package AddDayExcersize;

import java.util.Scanner;

public class L01_03 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir sayı alan ve bu sayının tersini
        (rakamların sırasını tersine çevirerek) bulan bir Java programı yazın. Örneğin, 12345 sayısının tersi 54321 olmalıdır.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen sayıyı giriniz");
        int sayi = scanner.nextInt();

        String tersayi = Integer.toString(sayi);


         int i=0;
        for (i = tersayi.length()-1; i >= 0; i--) {

            System.out.print(tersayi.charAt(i));
        }



    }

    }

