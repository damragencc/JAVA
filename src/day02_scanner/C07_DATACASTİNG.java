package day02_scanner;

import java.util.Scanner;


public class C07_DATACASTİNG {

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Lütfen 3 tamsayi giriniz");

    int s1 = scanner.nextInt();
        int s2 = scanner.nextInt();
        int s3 = scanner.nextInt();


        System.out.println("Girilen sayiların ortalaması : " + ((double)s1+s2+s3)/3 );








    }
}
