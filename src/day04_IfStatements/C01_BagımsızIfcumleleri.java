package day04_IfStatements;

import java.util.Scanner;

public class    C01_BagımsızIfcumleleri {
    public static void main(String[] args) {


        //kullanıcıdan notunu isteyin
        //not 50 veya daha fazla ise sınavı ''geçtin'' yazdırın


        double not = 51;

        if (not >= 50) ;
        {

            System.out.println("Geçtin");

        }

        // sayi cift ise 2 katına cıkartın

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir sayı giriniz");
        int a = scanner.nextInt();

        if (a % 2==0){

            System.out.println("Sayı cift ise sonuc : "  +a*2);
        }

        //sayi 5 ile bölünebiliyorsa 5 katına cıkartın

        if (a % 5 ==0){

        }
        System.out.println("SAyi 5 ile bolunebılıyorsa " + a*5);

    }
}
