package Day05_nestedIfElse;

import java.util.Scanner;

public class C07_TernarySoru2 {
    public static void main(String[] args) {

        //Soru2 Kullanıcıdan iki sayı alın ve buyuk olmayan sayıyı yazdırın


        Scanner scanner = new Scanner(System.in);
        System.out.println("Karsılastırılacak 2 sayı giriniz");

        double sayi1 = scanner.nextDouble();
        double sayi2 = scanner.nextDouble();

        System.out.println(sayi1>sayi2 ? sayi2 : sayi1);

    }
}
