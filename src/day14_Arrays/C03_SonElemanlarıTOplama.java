package day14_Arrays;

public class C03_SonElemanlarıTOplama {
    public static void main(String[] args) {
        /*Soru 5- Verilen 2 katli bir array’de
                 her bir inner array’in son elementlerinin toplamini
         */


        int[][] arr = {{3,5,6},{1,8,2,5,6},{1,8,0,4}};
        int toplam = 0;
        for (int i = 0; i <arr.length ; i++) {
            toplam += arr[i][arr[i].length-1];

            sonElemanlarıTopla(arr);


        }
        System.out.println("Son elemanların Toplamı : " +toplam);

    }
    public static void sonElemanlarıTopla(int[][] arr){
        int toplam = 0;
        for (int i = 0; i <arr.length ; i++) {
            toplam += arr[i][arr[i].length-1];

    }
}
    }