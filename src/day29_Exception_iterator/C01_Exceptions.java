package day29_Exception_iterator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C01_Exceptions {
    public static void main(String[] args) {

        //Kullanicidan toplamak uzere sayilar isteyin


        Scanner scanner = new Scanner(System.in);
        int girilenSayi=0;
        int sayiAdedi=0;
        int sayilarinToplami=0;
        String girilenHarf="a";


        while(!girilenHarf.equalsIgnoreCase("Q")){

            System.out.println("Toplanmak uzere tam sayi giriniz\nbitirmek icin Q'ya basin");

            try {
                girilenSayi=scanner.nextInt();
                sayilarinToplami+=girilenSayi;
                sayiAdedi++;
            } catch (InputMismatchException e) {
                //kod buraya geldiyse tamsayi disinda bir deger girilmistir
                girilenHarf=scanner.nextLine();

                if (girilenHarf.equalsIgnoreCase("Q")){
                    System.out.println("Ya tamsayi gir ya da bitirmek icin Q'ya bas");
                }

            }


        }

        System.out.println("Girilen " +sayiAdedi+ "tamsayinin toplami : " +sayilarinToplami);

    }
}
