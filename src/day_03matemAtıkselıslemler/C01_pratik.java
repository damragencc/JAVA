package day_03matemAtıkselıslemler;
 import java.util.Scanner;

public class C01_pratik {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen 3 basamaklı pozitif bir tamsayı giriniz..");
        int girilenSayi = scanner.nextInt(); //245

        int sayi= girilenSayi;
        int birlerBasamagi = 0;
        int rakamlarToplami = 0;


        birlerBasamagi = sayi % 10;
        rakamlarToplami = rakamlarToplami + birlerBasamagi;
        sayi = sayi / 10 ;

        birlerBasamagi = sayi % 10 ;
        rakamlarToplami = rakamlarToplami + birlerBasamagi;

        sayi = sayi / 10;
        rakamlarToplami = rakamlarToplami + sayi;

        System.out.println( girilenSayi + " sayisinin rakamlar toplami : " + rakamlarToplami);






    }
}
