package day09_ForLoopMetotOlusturma;

import java.util.Scanner;

public class C04_Palindromee {
    public static void main(String[] args) {

        //Soru 11- Kullanicidan pozitif bir tamsayi isteyip,
        //         sayinin asal sayi olup olmadigini kontrol edin
        //         ve sonucu yazdirin.
        //         Asal sayi : kendisi ve 1 disinda hic bir tamsayiya bolunemeyen sayi

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir pozıtıf tamsayı giriniz...");
        int girilenSayı = scanner.nextInt();

        for (int i = 2; i<=girilenSayı ; i++) {

            if (i == girilenSayı){
                System.out.println("Girilen sayi asal");
            } else if (girilenSayı % i == 0) {
                System.out.println("Girilen sayi asal degil");
                break;

        }

    }
}}