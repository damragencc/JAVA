package day10_MethotOlusturma_WhileLoop;

import day09_ForLoopMetotOlusturma.C12_AsalSayıYazdırma;

import java.util.Scanner;

public class C09_AsalSayıIsteme {
    public static void main(String[] args) {

        // Kullanicidan asal bir sayi girmesini isteyin
        // kullanicinin girdigi sayiyi kontrol edip
        // asal sayi ise "Giris basarili" yazdirin
        // asal sayi degilse tekrar isteyin

        // Kac kere giris olacagini bilmiyoruz, while loop daha avantajli


        Scanner scanner = new Scanner(System.in);
        int girilenSayi= 0;

        boolean asalMı = false;

        while (!asalMı){
            System.out.println("Lufen bir asal sayi giriniz...");
            girilenSayi = scanner.nextInt();

            asalMı= C03_Soruuu.isAsal(girilenSayi);
        }

        System.out.println("Giris Basarılı");


    }
}
