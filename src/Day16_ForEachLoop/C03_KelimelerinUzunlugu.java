package Day16_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C03_KelimelerinUzunlugu {
    public static void main(String[] args) {

        /*
             Soru 3 -  Verilen String bir array’deki her bir elementi kontrol edip,
                    -  Kelimenin uzunlugu cift sayi ise ilk yarisini
                    - Kelimenin uzunlugu tek sayi ise ortadaki harf dahil ikinci yarisini
                      yeni bir listeye ekleyip yazdirin.
         */

         String[]isimler = {"Selcuk", "Fuat","Berk","Muhammed","Bilal","Damra","Bugra"};

        List<String> duzenlenmisIsımler = new ArrayList<>();

        for (String each:isimler
             ) {

            if (each.length() % 2==0){ //uzunlugu cift ise
                duzenlenmisIsımler.add(each.substring(0,each.length()/2));

            }else {  // tek ise
                duzenlenmisIsımler.add(each.substring(each.length()/2));


        }


    }
}
    }