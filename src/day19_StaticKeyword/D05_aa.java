package day19_StaticKeyword;

import java.util.ArrayList;
import java.util.List;

public class D05_aa {
    public static void main(String[] args) {


        List<String> sayilar = new ArrayList<>();
        int [] arr = {1,3,5,7};



        // verilen listeye eleman olarak 10 ekleyip
// listenin yeni halini yazdiran bir method olusturun


// verilen listedeki 2.indeksde bulunan sayiyi silip
// listeyi yazdiran bir method olusturun


// verilen listeye esit elemanda random sayilar iceren bir list olusturup
// eski listeye yeni olusturulan listeyi atayan
// ve ilk listenin son halini yazdiran bir method olusturun


    }

    public static void elemanEkle(List<Integer>sayilar){
        sayilar.add(10);
        System.out.println(sayilar);
    }
    public static void elamansil(List<Integer>list){
        list.remove(2);
        System.out.println("elaman sil methodunda liste : " +list);

    }
}
