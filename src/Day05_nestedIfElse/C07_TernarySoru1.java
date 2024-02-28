package Day05_nestedIfElse;

import java.util.Scanner;

public class C07_TernarySoru1 {

    public static void main(String[] args) {

        //Soru2- Kullanıcıdan bir ucgenın 3 kenar uzunlugunu alın
        // ucgen eskenar ise Eskenar ucgen yazdırın
        // degılse eskenar degıl yazıdırın


        Scanner scanner = new Scanner(System.in);
        System.out.println("Ucgenin kenar uzunlujları giriniz");
        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();
        double kenar3 = scanner.nextDouble();

        System.out.println( kenar1==kenar2 && kenar1==kenar3 && kenar1>1 ? "Eskenar ucgen" : "Eskenar ucgen değil");


    }
}
