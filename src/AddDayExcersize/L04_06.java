package AddDayExcersize;
import java.util.ArrayList;
import java.util.List;
public class L04_06 {
    public static void main(String[] args) {

        /*
       Bir kullanıcının girdiği sayı kadar Fibonacci serisinin elemanlarını
       ekrana yazdıran bir Java programı yazın.Fibonacci serisi, her sayının kendisinden önce
       gelen iki sayının toplamı olduğu bir sayı serisidir
       Örneğin, 0, 1, 1, 2, 3, 5, 8, 13, ...
         */
        List<Integer> fibonacciListesi = new ArrayList<>(); // []
        int sayiAdedi=0;
        if (sayiAdedi <= 0){
            System.out.println("sayi adedi pozitif olmadigindan, size bos bir liste donduruyorum");
        } else if (sayiAdedi == 1) {
            fibonacciListesi.add(0);
        } else if (sayiAdedi == 2) {
            fibonacciListesi.add(0);
            fibonacciListesi.add(1);
        }else { // sayi adedi > 2

            fibonacciListesi.add(0);
            fibonacciListesi.add(1);

            for (int i = 2; i <sayiAdedi ; i++) {

                fibonacciListesi.add(fibonacciListesi.get(i-2) + fibonacciListesi.get(i-1));
            }
        }


    }
}
