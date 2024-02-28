package AddDayExcersize;

import java.util.ArrayList;
import java.util.List;

public class AA02_ForEachLoop {
    public static void main(String[] args) {

        //Soru : Verilen arraydeki sayıların karelerinin
        // toplamını yazdırın

        int [] sayilar = {1,3,4,5,7,8,9,6};

        int karelerininTOplamı=0;

        List<Integer> karelerinTOplamı = new ArrayList<>();

        for (int each:sayilar
             ) {

            karelerininTOplamı += each*each;

        }
        System.out.println(karelerininTOplamı);


    }
}
