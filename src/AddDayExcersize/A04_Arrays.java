package AddDayExcersize;

public class A04_Arrays {
    public static void main(String[] args) {

        //Soru - Verilen 2 katlı bir arrayde her bir inner arrayin son
        // elementlerin toplamnı yazdıran bir method olusturun


        int[][] arr = {{3, 5, 6}, {1, 8, 2, 3, 4, 2,}, {1, 8, 0, 8}};

        elementlerinToplamı(arr);


    }
    public static void elementlerinToplamı(int[][]arr){

            int toplam = 0;
        for (int i = 0; i <arr.length ; i++) {
              toplam += arr[i][arr[i].length-1];


            }
        System.out.println("Toplam : " +toplam);

        }

    }






