package AddDayExcersize;

import java.util.Scanner;

public class AD01_If {
    public static void main(String[] args) {
        //Soru 1- Kullanicidan cinsiyetini ve yasini alin,
        //        Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        //        Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
        //        veya “Emekli olmak icin .. yil daha calis

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz Erkek 'E' Kadın 'K'" );
        char cinsiyet = scanner.next().toUpperCase().charAt(0);
        System.out.println("Lutfen yasını giriniz");
        int yas = scanner.nextInt();

        if (cinsiyet == 'E' && yas>=65){
            System.out.println("Emeklı olabılırsınız");
        } else if (cinsiyet== 'E' && yas<65) {
            System.out.println("Emekli olabılmek icin : " +(65-yas)+ "yıl gerekiyor");

        } else if (cinsiyet=='K' && yas>=60) {
            System.out.println("Emekli olabılırsınız");

        } else if (cinsiyet=='K' && yas<60) {
            System.out.println("Emekli olabilmek ıcın : " +(60-yas) + " yıl gerekiyor" );

        }

    }
}
