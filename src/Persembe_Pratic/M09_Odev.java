package Persembe_Pratic;

import java.util.Scanner;

public class M09_Odev {
    public static void main(String[] args) {


        // Kullanicidan 2 basamakli bir
        // sayi alip, girilen sayiyi yazi ile yazdirin

       Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen iki basamaklı bir sayı gırınız");
        int sayi = scanner.nextInt();


                if (sayi % 10 == 0){
                    switch (sayi) {
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
                    }
                    }if (sayi % 100 == 0) {
            switch (sayi) {
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
            }


        }
        System.out.println(+sayi);

    }}
