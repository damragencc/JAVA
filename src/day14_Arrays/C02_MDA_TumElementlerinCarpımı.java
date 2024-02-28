package day14_Arrays;

public class C02_MDA_TumElementlerinCarpımı {
    public static void main(String[] args) {

        /*Soru 4- Verilen 2 katli donduren bir method olusturun
         bir array’de bulunan tum sayilarin carpinini bize
         */

        int[][] arr = {{3,5,6},{1,8,2,3,4},{1,8,0,4}};
        System.out.println(tumElemanlarıCarp(arr));
    }
    public static int tumElemanlarıCarp(int[][] arr){

        int sayılarınCarpımı = 1;

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
               sayılarınCarpımı *=  arr[i][j];

            }

        }
        return sayılarınCarpımı;
    }
}
