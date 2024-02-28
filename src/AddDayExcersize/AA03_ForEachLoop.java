package AddDayExcersize;

import java.util.ArrayList;
import java.util.List;

public class AA03_ForEachLoop {
    public static void main(String[] args) {

        /*
             Soru 3 -  Verilen String bir array’deki her bir elementi kontrol edip,
                    -  Kelimenin uzunlugu cift sayi ise ilk yarisini
                    - Kelimenin uzunlugu tek sayi ise ortadaki harf dahil ikinci yarisini
                      yeni bir listeye ekleyip yazdirin.
         */

        String[] isimler = {"Selcuk", "Fuat", "Berk", "Muhammed", "Bilal", "Damra", "Bugra"};

        List<String> kelimelerinUzunlugu = new ArrayList<>();

        for (String each:isimler
             ) {
            if (each.length() % 2 == 0){

              kelimelerinUzunlugu.add(each.substring(0,each.length()/2));

            }else{
                kelimelerinUzunlugu.add(each.substring(each.length()/2));
            }

        }
        System.out.println(kelimelerinUzunlugu);

    }
}
