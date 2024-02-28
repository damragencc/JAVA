package AddDayExcersize;

import java.util.Scanner;

public class Questions_1 {
    public static void main(String[] args) {

        //SORU-1 Kullanıcıdan alacagınız bir stringde bosluk karakterlerinin
        // olup olmadıgını kontrol ediniz...

     Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen cumleyi giriniz");
        String cumle = scanner.nextLine();

        System.out.println("Lutfen aradg    ınız ifadeyi giriniz");
        String karakter = scanner.nextLine();

        if (cumle.indexOf(karakter)>0){
            System.out.println("Aradıgınız karakter cumlede var");
        }else {
            System.out.println("YOktur");
        }



}}