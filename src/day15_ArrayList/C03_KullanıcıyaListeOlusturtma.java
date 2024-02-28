package day15_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C03_KullanıcıyaListeOlusturtma {
    public static void main(String[] args) {
        /*Soru 2- Kullanicidan istedigi kadar isim alip, Q’ya
         bastiginda girdigi isimleri bize liste olarak dondurecek bir method olusturun.



         */

        int arr[] = new int[5];
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 1; i <= arr.length; i++) {
            list.add(i);
        }
        System.out.println(list);

        }



    }


