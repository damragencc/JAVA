package day07_StringManipilationss;

import java.util.Scanner;

public class C01_IndexOf {
    public static void main(String[] args) {

        // kullanıcıdan bir cumle ve aranan metin isteyin
        // kullanıcıya aranan metnin  cumlede var olup olmadıgını
        // IndexOf methodu kullanarak yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir cumle giriniz...");
        String cumle = scanner.nextLine();

        System.out.println("Lutfen cumlede aradıgınız metni girin..." );
        String metin = scanner.nextLine();

        // indexof() ile yapalim
        //cumle.indexof(metin) ==> bize ya index verir veya -1

        if(cumle.indexOf(metin)>=0) {
            System.out.println("Cumlede aranan metin var");
        }else {
            System.out.println("Cumlede aranan metin yok");
        }

       // cumlenın ikinci yarısında metin var mı ?





    }
}
