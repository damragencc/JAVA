package AddDayExcersize;

public class A03_Arraysü {
    public static void main(String[] args) {

        // 2 katlı bir arrayde bulunan butun sayıların carpımını donduruen method olusturun

        int[][] arr = {{3, 5, 6}, {1, 8, 2, 3, 4, 2,}, {1, 8, 2, 4}};

        System.out.println(butunSayılarınCarpımı(arr));
    }

    public static int butunSayılarınCarpımı(int[][] arr) {

        int carpım = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                carpım *= arr[i][j];

            }

        }
        return carpım;


    }
}