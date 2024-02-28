package day04_IfStatements;

import java.util.Scanner;

public class C05_ıfelsQueistion {
    public static void main(String[] args) {
        //Soru 2- Kullanicinin kilo(kg) ve boyunu(cm) isteyip
        //        vucut kitle endeksini hesaplayin (kilo*10000 / (boy *boy))
        //        vucut kitle endeksi
        //          30’dan buyukse obez,
        //          25-30 arasi ise kilolu,
        //          20-25 arasi ise normal,
        //          20’den kucukse zayif yazdirin.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen kilonuzu giriniz");
        double kilo = scanner.nextDouble();
        System.out.println("Lutfen boyunuzu giriniz");

        double boy= scanner.nextDouble();

        double endeks =(kilo*10000 / (boy*boy));

        if (endeks>30){
        System.out.println("Obez");

       } else if (endeks>25) {
            System.out.println("kilolu");
        } else if (endeks>20) {
            System.out.println("Normal");

        }else
            System.out.println("Zayıf");

    }
    }
