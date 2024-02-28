package day13_Arrey;

import java.util.Arrays;

public class C01_TumElementleriArttırma {
    public static void main(String[] args) {

        //Soru1- Verilen bir int array'in
        // tüm elemanlarını 2 arttırıp bize donduren bir methot olusturalım
        // Eski arrayi yeni haliyle kaydedin


        int[] arr = {5,7,9,10};

        for (int i = 0; i < arr.length ; i++) {

            arr[i] +=2;

        }
        System.out.println(Arrays.toString(arr));

       arr = ElemanlarıArttır(arr,3);

        System.out.println("3 arttırılınca  : " + Arrays.toString(arr));
        }

        public static int[]ElemanlarıArttır(int[]arr,int artısMıktarı){

            for (int i = 0; i < arr.length ; i++) {

                arr[i] += artısMıktarı;

            }

            return arr;


        }
    }



