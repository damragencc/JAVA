package AddDayExcersize;

import java.util.Scanner;

public class C02_Loop {

    public static void main(String[] args) {

        //Soru 5- Kullanicidan 17’den kucuk bir sayi alip,
        //        bu sayinin faktoryel degerini hesaplayin.
        //       Ornek 6 ! = 6 * 5 * 4 * 3 * 2 * 1  ==> 720

        System.out.println("Lutfen bir sayı giriniz...");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();


    }

    public static void fack(long c) {
        long z = 1;
        if (0 < c && c < 17) {
            for (long k = c; k > 0; k--) {
                z = z * k;
            }
            System.out.println(c + "! = " + z);
        } else {
            System.out.println("Lutfen gecerli sayı griniz");
        }
        {


        }}}



