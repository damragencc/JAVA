package Persembe_Pratic;

import java.util.Scanner;

public class M05_Ternary {
    public static void main(String[] args) {



         /*
             Kullanicidan bir sayi aliniz
            Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
            10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
           Sayi o dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.
       */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir sayı giriniz");

        int a = scanner.nextInt();

        if (a>=0){

            System.out.println("Sayı pozitif");


        }if(a<10){
            System.out.println("Girilen sayı Negatif");
        }

    }
}
