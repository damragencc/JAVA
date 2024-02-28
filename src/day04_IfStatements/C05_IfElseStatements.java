package day04_IfStatements;

import java.util.Scanner;

public class C05_IfElseStatements {
    public static void main(String[] args) {


        //Soru1- Kullanıcıdan bir ucgenın 3 kenar uzunlugu alın,
        // ucgene eskenar ise Eskena ucgen yazıdırın,
        // degılse eskenar degıl yazdırın.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen ucgenın kenar uzunlukları giriniz..");
        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();
        double kenar3 = scanner.nextDouble();

        if (kenar1 == kenar2 && kenar1 == kenar3 && kenar1 > 0) {
            System.out.println("Eskenar ucgen");
        } else {
            System.out.println("Eskenar ucgen degil");
        }

    }
}


