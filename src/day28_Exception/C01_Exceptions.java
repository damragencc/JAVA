package day28_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C01_Exceptions {
    public static void main(String[] args) {

        //Kullanıcıdan iki tamsayi alip
        //bu sayiların bolumunu yazdirin


        Scanner scanner = new Scanner(System.in);
        int sayi1 = 0;
        int sayi2 = 0;
        boolean problemVarMi = true;

        while (problemVarMi) { //loop problemVarMi = false oldugundan biter
            try {

                scanner = new Scanner(System.in);
                System.out.println("Lutfen iki tamsayi giriniz...");

                sayi1 = scanner.nextInt();
                sayi2 = scanner.nextInt();
                problemVarMi = false;


            } catch (InputMismatchException e) {
                System.out.println("Tamsayi dedik...");

            }

            if (sayi2 == 0) {
                System.out.println("ıkıncı sayi 0 olamaz");

            } else {
                System.out.println("verilen sayilaın bolumu : " + sayi1 / sayi2);
            }
            System.out.println("Kodda bir hata olursa bu kod calısmaz");


        }
    }}
