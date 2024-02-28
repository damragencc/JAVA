package day02_scanner;

import java.util.Scanner;


public class c06_swap {


    public static void main (String[] args) {


       Scanner scanner = new Scanner(System.in);


        System.out.println("Lütfen 1.sayiyi giriniz...");

        int sayi1 = scanner.nextInt();

        System.out.println("Lütfen 2.sayiyi giriniz...");

        int sayi2 = scanner.nextInt();

        int temp = 0;

        temp = sayi2;

        sayi2 = sayi1;

        sayi1 = temp;

        System.out.println("Verdiğiniz sayilarin yerini değiştirdim...");
        System.out.println("sayi1 : " + sayi1 + " ve sayi2 : " + sayi2 + "oldu.");







             }
}
