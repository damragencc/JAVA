package AddDayExcersize;

import java.util.ArrayList;
import java.util.List;

public class AA05_ForEachLoop {
    public static void main(String[] args) {

        //Soru- Verilen iki arrayin elementlerini karsılastırıp ikisinde ortak
        //      olan elementleri ayrı bir liste olarak bir program yazın

        int [] arr = {1,3,4,5,6,7,2,3,4,8,9};
        int[] arr2 = {1,5,7,8,9,3,4,2,6,7,8};

        List<Integer> yeniListe = new ArrayList<>();

        for (Integer each:arr
             ) {

            for (Integer each2 :arr2
                 ) {

                if (each == each2 && !yeniListe.contains(each)){

                    yeniListe.add(each);

                }

                System.out.println(yeniListe);
            }

        }
    }
}
