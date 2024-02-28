package day14_Arrays;

public class C01_MDa {
    public static void main(String[] args) {

        int[][] arr = {{3,5,6},{1,8,2,3,4,2},{1,8,9,4}};
        ciftSayılarıTopla(arr);
    }
    public static void ciftSayılarıTopla(int[][] arr){

        int ciftSayılarınToplamı = 0;

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] % 2 == 0){

              ciftSayılarınToplamı += arr[i][j];
            }

        }

    }
        System.out.println("Cift Sayıların Toplamı  :  " +ciftSayılarınToplamı );

}

    }
