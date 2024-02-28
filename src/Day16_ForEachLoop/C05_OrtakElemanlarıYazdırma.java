package Day16_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C05_OrtakElemanlarıYazdırma {
    public static void main(String[] args) {

        /*
        Soru 5- Verilen iki array’in elementlerini karsilastirip,
        ikisinde ortak olan elementleri ayri bir liste olarak veren bir program yazin.
         */

        int [] arr ={3,6,9,1,3,9,3,3};
        int []arr2 = {5,3,1,4,7,8,8,8};
        List<Integer>ortakElemanSayısı = new ArrayList<>();

        for (int each:arr
             ) {
            for (int each2:arr2
                 ) {
                if (each == each2 && !ortakElemanSayısı.contains(arr)){

                }
            }
        }
    }
}
