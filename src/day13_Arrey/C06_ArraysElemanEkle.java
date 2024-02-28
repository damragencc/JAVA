package day13_Arrey;

import java.util.Arrays;

public class C06_ArraysElemanEkle {
    public static void main(String[] args) {

        // Soru 7- Verilen bir arraye
        //         istenen bir elemanı ekleyip bize donduren bir method yazin
        //         eski arraye yeni degeri atayın

        int [] arr = {4,5,6,7};

        // bu arraye 5.eleman olarak 1 ekleyin

        int[] yeniarray ={4,5,6,7,1};
        arr = yeniarray;

        System.out.println("Manuel olarak 1 eklenmıs hali : " + Arrays.toString(arr));
        System.out.println(Arrays.toString(arrayeElemanEkleme(arr, 10)));

    }
    public static int[] arrayeElemanEkleme(int[] eskiArray, int eklenecekEleman){
        
        int [] yeniarray = new int[eskiArray.length+1];

        for (int i = 0; i < eskiArray.length ; i++) {

             yeniarray[i]= eskiArray[i];


        }
        yeniarray[eskiArray.length] = eklenecekEleman;

        return yeniarray;

    }
}
