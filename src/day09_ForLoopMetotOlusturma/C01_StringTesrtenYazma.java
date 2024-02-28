package day09_ForLoopMetotOlusturma;

import java.util.Scanner;

public class C01_StringTesrtenYazma {

    public static void main(String[] args) {

        //Soru9 -Kullanıcıdan bir string isteyin
        //       ve Stringi tersten yazdırın...


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir yazı girin");
        String metin = scanner.nextLine();

        for (int i = metin.length()-1; i>=0 ; i--) {

            System.out.print(metin.charAt(i));

        }


    }
}
