package day10_MethotOlusturma_WhileLoop;

import java.util.Scanner;

public class C08_WhileLoopVsForLoop {
    public static void main(String[] args) {

        // Kullanicidan toplanmak uzere sayilar alin
        // girilen sayilarin toplami 500 oldugunda
        // kac sayi girildigini ve toplamin kac oldugunu yazdirin

        Scanner scanner = new Scanner(System.in);
        int girilenSayi = 0;
        int sayilarinToplami = 0;
        int girilenSayiAdedi = 0;

        while (sayilarinToplami < 500){

            System.out.println("Toplama eklemek uzere bir tamsayi giriniz...");
            girilenSayi = scanner.nextInt();
            sayilarinToplami += girilenSayi;
            girilenSayiAdedi++;
        }

        System.out.println("Toplam " + girilenSayiAdedi + " adet sayi girdiniz..");
        System.out.println("Girilen sayilarin toplami : " + sayilarinToplami);



    }
}
