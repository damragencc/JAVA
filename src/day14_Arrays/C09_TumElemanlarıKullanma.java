package day14_Arrays;

import java.util.ArrayList;
import java.util.List;

public class C09_TumElemanlarıKullanma {
    public static void main(String[] args) {

        int[] arr = {3,5,6,7,2,3,4,5,6,7,8,2,3,4,5,6,7};
        List<Integer> sayilar = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            sayilar.add(arr[i]);

        }
        System.out.println(sayilar);


        int toplam =0;
        for (int i = 0; i < sayilar.size() ; i++) {

            toplam += sayilar.get(i);

        }
        System.out.println("Toplam : " +toplam);

        // Listedeki cift sayi adedini yazdırın

        int sayac = 0;
        for (int i = 0; i < sayilar.size() ; i++) {
            if (sayilar.get(i) % 2 == 0){
                sayac++;
            }


        }
        System.out.println("Lıstedeki cift sayı adedi : " + sayac);

        // Listedeki tek sayıların ortalamasını ondalılı olarak yazdırın

        double tekSayilarınToplamı = 0;
        int tekSayıAdedi = 0;

        for (int i = 0; i <sayilar.size() ; i++) {

            if (sayilar.get(i) % 2 != 1){
                tekSayilarınToplamı += sayilar.get(i);
                tekSayıAdedi++;


            }

        }
        System.out.println("Listedeki " +tekSayıAdedi+ " adet tek sayının ortalaması : " +tekSayilarınToplamı/tekSayıAdedi );


        //Listedeki 5 den kucuk sayıların carpımını yazdırın
      int carpım = 1;
        for (int i = 0; i <sayilar.get(i) ; i++) {

          if (sayilar.get(i)<5);

          carpım*= sayilar.get(i);


        }
        System.out.println("Sayıların carpımı : " +carpım);
    }
}
