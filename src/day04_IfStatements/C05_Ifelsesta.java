package day04_IfStatements;

import java.util.Scanner;

public class C05_Ifelsesta {
    public static void main(String[] args) {

        //soru= Kullancıdıdan bir karakter girmesini isteyin

        // girilen karakterın buyuk harf olup olmadıgını yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir karakter girin");
        char girilenKarakter = scanner.next().charAt(0);

        if (girilenKarakter >= 'A' && girilenKarakter <= 'Z');
        {
            System.out.println("Girilen karakter buyuk harf");
        }

        }

    }

