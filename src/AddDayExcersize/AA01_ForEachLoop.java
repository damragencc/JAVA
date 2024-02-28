package AddDayExcersize;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AA01_ForEachLoop {
    public static void main(String[] args) {
        //Soru 1- Verilen bir array’de tekrar eden elementler icin,
        //tekrar edenleri  silip, tum elemanlardan sadece 1 tane
        //yapip eski array’e yeni halini atayip yazdirin.


        int[] arr = {1, 3, 4, 5, 6, 7, 8, 9, 2, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        List<Integer> tekrarEtmeyenler = new ArrayList<>();

        for (Integer each:arr
             ) {

            if (!tekrarEtmeyenler.contains(each)){

                tekrarEtmeyenler.add(each);
            }

        }
        System.out.println(tekrarEtmeyenler);

        arr = new int[tekrarEtmeyenler.size()];
        for (int i = 0; i < arr.length ; i++) {

            arr[i]=tekrarEtmeyenler.get(i);

        }


        System.out.println("Arraysin yeni hali : " +Arrays.toString(arr));

    }}