package Day16_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_ArraydenTekrarEdenleriSilme {
    public static void main(String[] args) {
        //Soru 1- Verilen bir array’de tekrar eden elementler icin,
        //mukerrer olanlari silip, tum elemanlardan sadece 1 tane
        //yapip eski array’e yeni halini atayip yazdirin.



       Integer [] arr = {1,4,3,5,2,7,4,2,3,4,5,6,2,3,4,5,8,9,6,7,8};

        List<Integer> tekrarList = new ArrayList<>();

        for (Integer each : arr
             ) {

            if (!tekrarList.contains(each)){

                tekrarList.add(each);
            }

        }
        System.out.println(tekrarList); //TekrarsızList : [1,4,3,5,2,7,6,8,9]

       arr = new Integer[tekrarList.size()];

        for (int i = 0; i <arr.length; i++) {
            arr[i] = tekrarList.get(i);

        }

        System.out.println("Arr'in son hali : " + Arrays.toString(arr));

    }
}
