package day13_Arrey;

import java.util.Arrays;
import java.util.Scanner;

public class C04_KullanıcıyaArreyOlusturma {
    public static void main(String[] args) {

        //Soru 5 - Kullanıcıdan arrayin boyutunu ve elementlerini alıp
        //         arrayi olusturan ve bize donduren bir method olusturun.

        int[] arr = intArrayOlustur();

        System.out.println(Arrays.toString(arr));

    }

    public static int[] intArrayOlustur(){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Kac elemanlı bir array olusturmak istiyorsunuz?");
        int arrayBoyutu = scanner.nextInt();
        int[] arr = new int[arrayBoyutu];

        for (int i = 0; i <arrayBoyutu ; i++) {
            System.out.println(i + "İndex icin bir tamsayı girin..." );
            arr[i] = scanner.nextInt();

        }
        return  arr;



    }
}
