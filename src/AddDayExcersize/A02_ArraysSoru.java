package AddDayExcersize;

public class A02_ArraysSoru {
    public static void main(String[] args) {

        //Verilen 2 katlı bir arrayde bulunan cift sayıları toplayıp sonucu
        // yazdıran bir method olusturun

        int[][] arr = {{3, 5, 6,}, {1, 8, 2, 3, 4, 2}, {1, 8, 9, 4}};
        cıftSayılarınToplamı(arr);
    }


    public static void cıftSayılarınToplamı(int[][] arr) {

        int toplam = 0;

        for (int i = 0; i < arr.length; i++) {


            for (int j = 0; j < arr[i].length; j++) {


                if (arr[i][j] % 2 == 0) {

                    toplam += arr[i][j];

                }

            }

        }
        System.out.println("Toplamı : " + toplam);


    }
}