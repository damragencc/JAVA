package day29_Exception_iterator;

import java.util.Arrays;

public class C06_Iterator {
    public static void main(String[] args) {

        /*
             Java index kullanmanin mumkun olmadıgı durumlarda veya index kullanmak istemediginizde

             tum elementleri bize getirebilecek ve kalici degisiklik yapabileceginiz
             Iterator interface'ini
         */

        int[] arr = {3,5,6};

        //array'in tum elementlerini 2 arttirin

        for (int i = 0; i <arr.length ; i++) {
            arr[i] +=2;

        }
        System.out.println(Arrays.toString(arr));

        //INDEX kullanmadan bu islemi tekrar yapin


        for (int each:arr
             ) {
            each+=2;
        }
        System.out.println(Arrays.toString(arr));



    }
}
