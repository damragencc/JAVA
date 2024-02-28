package day13_Arrey;

public class C09_ArrayTumElemanlaraUlasma {
    public static void main(String[] args) {

        int[] sayılar = {4,7,8,1};
        // sayılar arrayindeki elemanların toplamını yazdırın

        int toplam = 0;
        for (int i = 0; i < sayılar.length ; i++) {

            toplam += sayılar[i];

        }
        System.out.println(toplam); //20


        int[][] arr = {{3,5},{2,3,4},{1}};
        toplam = 0;

        for (int i = 0; i < arr.length ; i++) {

            for (int j = 0; j <arr[i].length ; j++) {

                toplam += arr[i][j];

            }

        }
        System.out.println("İki katlı arayylerin toplam : " + toplam);
    }
}
