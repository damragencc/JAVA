package T135_Market;

import java.util.List;
import java.util.Scanner;

public class Day06_Araay {

    //kullanicin girdigi sayi kadar int array olusturan ve array elemanlarini
    //kullanicidan alan ve girilen array elemanlarinin en buyuk ile en kucuk
    //elemaninin arasinki farki gosteren java programi yazi

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen array olusturmak icin bir sayi giriniz");
        int boyut = scanner.nextInt();

        int[] arr= new int[boyut];

        for (int i = 0; i < boyut; i++) {
            System.out.println("Array elemanını griniz");
            arr[i]= scanner.nextInt();

        }

        int Buyuk=arr[0];
        int kucuk=arr[0];
        for (int i = 0; i < boyut; i++) {

            if (arr[i]>Buyuk){
                Buyuk=arr[i];

        }
            if (arr[i]<kucuk){
                kucuk=arr[i];
            }
        }

        int fark =Buyuk-kucuk;
        System.out.println("büyük eleman" +Buyuk);
        System.out.println("Kucuk eleman" +kucuk);
        System.out.println("Arasındaki fark" +fark);





    }

}
