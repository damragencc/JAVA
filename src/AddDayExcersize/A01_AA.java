package AddDayExcersize;

import java.util.Scanner;

public class A01_AA {
    public static void main(String[] args) {
        /*
           //Soru 3- Kullanicidan aldigi urun adedini ve indirimsiz fiyatini alin,
        //        kullaniciya musteri karti olup olmadigini sorun.
        //        Musteri karti varsa
        //              - 10 urunden fazla alirsa %20,
        //              - az alirsa %15 indirim yapin,
        //        Musteri karti yoksa
        //              - 10 urunden fazla alirsa %15,
        //              - az alirsa %10 indirim yapin
        // ve toplam fiyati yazdirin
         */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen aldıgınız urun adedını gırınız");
        int urunAdedi = scanner.nextInt();

        System.out.println("Lutfen ındırımsız fıyatını gırınız");
        double indirimsizToplamFiyat= scanner.nextDouble();

        System.out.println("Musterı kartınız varmı Eevet : E Hayır :H");
        char kartVarMi=scanner.next().toUpperCase().charAt(0);
        
        double ındırımlıFıyat=indirimsizToplamFiyat*urunAdedi;


        if (kartVarMi == 'E' && urunAdedi > 10){
            System.out.println("%20 indirimli toplam tutar : " + indirimsizToplamFiyat * 80 /100 );
        } else if (kartVarMi == 'E' ) { // && urunAdedi <=10     intelliJ gereksiz kod dedi
            System.out.println("%15 indirimli toplam tutar : " + indirimsizToplamFiyat * 85 /100 );
        } else if (kartVarMi == 'H' && urunAdedi >10) {
            System.out.println("%15 indirimli toplam tutar : " + indirimsizToplamFiyat * 85 /100 );
        } else if (kartVarMi == 'H' ) { // && urunAdedi <=10     intelliJ gereksiz kod dedi
            System.out.println("%10 indirimli toplam tutar : " + indirimsizToplamFiyat * 90 /100 );
        }else {
            System.out.println("Giris hatali, bilgileri kontrol edin");
        }



        }


    }