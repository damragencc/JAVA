package day04_IfStatements;

import java.util.Scanner;

public class C05_IFelseQuestion {
    public static void main(String[] args) {
        // ogrencinin notunu isteyin
        // 0'dan kucuk veya 100'den buyuk notlar icin "gecersiz not" yazdirin
        //Ogrencinin notu 85 ve ustu ise AA,
        //(85 ve ustu  degilse) 65 ve ustu ise BB,
        //(65 ve ustu  de degilse) 50 ve ustu ise CC,
        //(geriye kalanlar) DD

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");
        int sayi = scanner.nextInt();

        if (sayi<0 || sayi>100){
            System.out.println("Gecersiz not");
        } else if (sayi>=85) {
            System.out.println("Notunuz : AA");

        } else if (sayi>=65) {
            System.out.println("Notunuz : BB");

        } else if (sayi>=50) {
            System.out.println("Notunuz : CC ");

        }else
            System.out.println("Notunuz : DD");


    }
    }

