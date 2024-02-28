package day13_Arrey;

import java.util.Arrays;

public class C07_ArraydeSıralamaVeArama {
    public static void main(String[] args) {

        int [] arr = {9,4,6,1,14};

        String [] isimler = {"Ali", "Adnan", "Ahmet", "Mahmut","Mehmet", "Metin"};

        Arrays.sort(arr);
        Arrays.sort(isimler);

      //  Arrays.sort() verilen arrayi NATURAL ORDERA uygun olarak düzenler
      // metinler buyuk veya kucuk harf varsa ascii tablosuna göre alır
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(isimler));

        int[] sayılar = {6,1,13,5,8,2};
        // bu arrayde 5 var mı?
        C03_ElemanKullanımSayısınıBulma.elemanSayisiniYazdir(sayılar,5);
        C03_ElemanKullanımSayısınıBulma.elemanSayisiniYazdir(sayılar,10);

        System.out.println(Arrays.binarySearch(sayılar, 5)); // -1
        System.out.println(Arrays.binarySearch(sayılar, 13)); //-2
        System.out.println(Arrays.binarySearch(sayılar, 6)); //0
        System.out.println(Arrays.binarySearch(sayılar, 2)); //-1
        System.out.println(Arrays.binarySearch(sayılar, 1)); // -1
        System.out.println(Arrays.binarySearch(sayılar, 8)); // -3

        //binarySearch()un saglıklı calısması ıcın once array sort yapılmalıdır
        //sort yapılmadan binarySearch() calıstırılırsa sonucu ongoremeyız
        // dogru sonucu da verebilir.yanlıs sonuc da verebılır.

        Arrays.sort(sayılar);
        System.out.println(Arrays.toString(sayılar)); // [1, 2, 5, 6, 8, 13]

        System.out.println(Arrays.binarySearch(sayılar, 5)); //2
        System.out.println(Arrays.binarySearch(sayılar, 13)); //5
        System.out.println(Arrays.binarySearch(sayılar, 6)); //3
        System.out.println(Arrays.binarySearch(sayılar, 2)); //1
        System.out.println(Arrays.binarySearch(sayılar, 1)); // 0
        System.out.println(Arrays.binarySearch(sayılar, 8)); // 4

        //binarySearch() array de olan elementlerin Indexini verir
        // Olmayan elementler icin olsaydı Hangi sırada olacagını -ısaretler verir

    }
}
