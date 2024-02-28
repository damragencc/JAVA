package AddDayExcersize;

import java.util.Scanner;

public class A000000_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lutfen bir sayi giriniztamsayı girin: ");
        int sayi = scanner.nextInt();

        int toplam = 0;
        int kalan;


        while (sayi > 0) {
            kalan = sayi % 10;
            toplam += kalan;
            sayi /= 10;
        }

        System.out.println("Girilen sayının rakamları toplamı: " + toplam);

    }
}
