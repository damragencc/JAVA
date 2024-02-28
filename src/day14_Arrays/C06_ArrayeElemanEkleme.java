package day14_Arrays;

import java.util.Arrays;

public class C06_ArrayeElemanEkleme {
    public static void main(String[] args) {


        //Array ler ekeleme-silme yapamadıgımız ıcın bizi cok kısıtlıyor

        int[] arr = {3,5,8};
        // arr ye 4.eleman olarak 20 ekleyin

        // arr[3] = 20; // ArrayIndexOutOfBoundsException


        int[] yeniArr = {3,5,8,20};

        arr = yeniArr;
        System.out.println(Arrays.toString(arr)); // [3,5,8,20]

        int[] yeniArr2 = {3,8,20};

        arr = yeniArr2;

        System.out.println(Arrays.toString(arr));

    }
}
