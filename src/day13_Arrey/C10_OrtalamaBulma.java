package day13_Arrey;

import java.util.Arrays;

public class C10_OrtalamaBulma {
    public static void main(String[] args) {

        // Verilen iki katlı bir arrayde
        //Cift sayı olan elementlerin adedini ve
        //double olarak ortalamasını alın

        int[][] arr = {{3,4,6},{1,8,2,3,4,2},{1,8,9,4}};
        int ciftSayiAdedi=0;
        double toplam =0;

        for (int i = 0; i < arr.length ; i++) {

            for (int j = 0; j <arr[i].length ; j++) {
                if (arr[i][j] % 2 == 0){
                    toplam += arr[i][j];
                    ciftSayiAdedi++;

            }

            }

        }
        System.out.println("Array de bulunan çift sayı adedi : " + ciftSayiAdedi +
                           " adet cift sayının ortalaması"  +toplam/ciftSayiAdedi);


    }
}
