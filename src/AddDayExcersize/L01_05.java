package AddDayExcersize;

import java.util.Scanner;

public class L01_05 {
    public static void main(String[] args) {
          /*
        Bir kullanıcının girdiği bir sayının tersini bulan
        bir Java programı yazın. Ancak bu kez, sayıyı string
         olarak değil, matematiksel olarak ters çevirin.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz ");
        int sayi = scanner.nextInt();
        double tersSayi = 0;
        int birlerBasamagi = 0;
        int basamakSayisi = Integer.toString(sayi).length();
        for (int i = 1; i <= basamakSayisi; i++) {
            birlerBasamagi = sayi % 10;
            sayi /= 10;
            tersSayi += (birlerBasamagi * Math.pow(10, basamakSayisi - i));
        }
        System.out.println(tersSayi);
    }
}
