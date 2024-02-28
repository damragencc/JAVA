package day10_MethotOlusturma_WhileLoop;

import java.util.Scanner;

public class C02_SORU {
    public static void main(String[] args) {

        // kullanıcıdan pozıtıf bir rakam ve bir sayı alın
        // Eger sayı rakamın faktorıyel degerınden buyuk ıse rakamı
        // sayı rakamın faktoryel degerınden buyuk degıl ıse sayıyı yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir  rakam girin");
        int rakam = scanner.nextInt();

        System.out.println("Lutfen pozıtıfı bir sayı gırınız");
        int sayi = scanner.nextInt();


        int rakamınFaktoryelDegeri = C01_FaktorıyelOlusturma.FaktoryelHesapla(rakam);

        if (sayi > rakamınFaktoryelDegeri){
            System.out.println(rakam);
        } else {
            System.out.println(sayi);
            
        }

    }
}
