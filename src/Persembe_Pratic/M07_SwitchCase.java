package Persembe_Pratic;

import java.util.Scanner;

public class M07_SwitchCase {
    public static void main(String[] args) {

        //Soru Kullanıcıdan bir rakam alıp rakamı yazıyla yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir rakam giriniz");
        int sayı = scanner.nextInt();

        switch (sayı){
            case 0:
                System.out.println("Sıfır");
                break;
            case 1:
                System.out.println("Bir");
                break;
            case 2:
                System.out.println("İki");
                break;
            case 3:
                System.out.println("uc");
                break;
            case 4:
                System.out.println("Dort");
                break;
            case 5:
                System.out.println("Bes");
                break;
            case 6:
                System.out.println("Altı");
                break;
            case 7:
                System.out.println("yedi");
                break;
            case 8:
                System.out.println("Sekiz");
                break;
            case 9:
                System.out.println("dokuz");
                break;
            default:
                System.out.println("Girdiginiz sayı 0-9 arasında olmalı");
                break;

        }
    }
}
