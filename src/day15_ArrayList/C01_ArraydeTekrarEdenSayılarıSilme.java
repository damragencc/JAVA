package day15_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_ArraydeTekrarEdenSayılarıSilme {
    public static void main(String[] args) {

        // verilen bir int array'deki tekrar eden sayilari silip
        // array'i unique sayilardan olusan hale donusturun
        // input :  {3,5,6,7,2,3,4,5,6,7,8,2,3,4,5,6,7};
        // output : {3,5,6,7,2,4,8}

        int[] arr ={3,5,6,7,2,3,4,5,6,7,8,2,3,4,5,6,7};


        List<Integer> TekrarEtmeyenler = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            if (!TekrarEtmeyenler.contains(arr[i])){

                TekrarEtmeyenler.add(arr[i]);

            }

        }
        System.out.println(TekrarEtmeyenler);

        arr = new int[TekrarEtmeyenler.size()];

        for (int i = 0; i <TekrarEtmeyenler.size() ; i++) {

            arr[i] = TekrarEtmeyenler.get(i);

        }   

        System.out.println("Sayıların son hali : "  + Arrays.toString(arr));


    }
}
