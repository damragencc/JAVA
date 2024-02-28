package Day08_StringManipilationsForloops;

import java.util.Scanner;

public class C08_ForLOOp {
    public static void main(String[] args) {


        // Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        // sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        // Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen baslangıc icin bir pozitif tam sayı giriniz...");
        int baslangıc = scanner.nextInt();

        System.out.println("Lutfen bıtıs ıcın bır pozıtıf tamsayı gırınız...");
        int bitis = scanner.nextInt();

        if (bitis < baslangıc) {
            System.out.println("Bitis degeri baslangıctan kucuk olamaz...");
        } else {//toplama ıslemını yapabılırız

            int toplam = 0;

            for (int i =baslangıc; i<=bitis; i++){

                toplam += i;
            }
            System.out.println("Baslangıc ve bıtıs arasındakı sayıların toplamı" +toplam);
        }


        }
    }
