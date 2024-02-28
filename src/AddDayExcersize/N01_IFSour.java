package AddDayExcersize;

import java.util.Scanner;

public class N01_IFSour {
    public static void main(String[] args) {

        //Soru 3- Kullanicidan aldigi urun adedini ve indirimsiz fiyatini alin,
        //        kullaniciya musteri karti olup olmadigini sorun.
        //        Musteri karti varsa
        //              - 10 urunden fazla alirsa %20,
        //              - az alirsa %15 indirim yapin,
        //        Musteri karti yoksa
        //              - 10 urunden fazla alirsa %15,
        //              - az alirsa %10 indirim yapin
        // ve toplam fiyati yazdirin

       Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen aldıgınız urun adedini giriniz");
        int adet = scanner.nextInt();
        System.out.println("Urunun indirimsiz fiyatini giriniz...");
        double indirimsizFiyat = scanner.nextDouble();
        System.out.println("Musteri kartınız var ise 'E' yoksa 'H' deyiniz");
        char kartınızVarmı = scanner.next().toUpperCase().charAt(0);

        double indirimsizToplamFiyat= adet*indirimsizFiyat;

        if (kartınızVarmı =='E' && adet>10){
            System.out.println("%20 indirimli fiyatı : " +indirimsizFiyat*80/100);

        } else if (kartınızVarmı=='E' && adet<10) {
            System.out.println("%15 indirimli fiyatı : " +indirimsizFiyat*85/100);

        } else if (kartınızVarmı=='H' && adet>10) {
            System.out.println("%15 indirimli fiyatı : " +indirimsizFiyat*85/100);

        } else if (kartınızVarmı=='H' && adet<10) {
            System.out.println("%10 indirimli fiyatı : " +indirimsizFiyat*90/100);

        }else System.out.println("Giris hatalı tekrar giriniz");
    }
}
