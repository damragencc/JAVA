package Persembe_Pratic;

import java.util.Scanner;

public class M04_HesapMakınası {
    public static void Hesapmakinesi(){
        Scanner scanner = new Scanner (System.in);
        System.out.print("1.Ci sayıyı gırınız :");
        double sayi1 = scanner.nextDouble();
        System.out.print("2.ci sayıyı giriniz :");
        double sayi2 = scanner.nextDouble();

        System.out.println("1-TOplama islemı");
        System.out.println("2-Cıkarma islemi");
        System.out.println("3-Carpma islemi");
        System.out.println("4-Böylme islemi");

        int secim = scanner.nextInt();

        if (secim== 1) {
            System.out.println("Toplam = " + (sayi1 + sayi2));

        } else if (secim==2) {
            System.out.println("Cıkarma = " +(sayi1 - sayi2));

        } else if (secim==3) {
            System.out.println("Carpım = " + (sayi1 * sayi2));

        } else if (secim==4) {
            if (sayi2 == 0)
                System.out.println("Birinci sayi 0 ile bölünemez");

            System.out.println("Bölüm : " + (sayi1 / sayi2));

        }else
            System.out.println("Lutfen gecerli bir sayı giriniz");
        Hesapmakinesi();
    }
    public static void main(String[] args) {

        Hesapmakinesi();
    }

}