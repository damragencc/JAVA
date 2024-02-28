package day28_Exception;

import java.util.Scanner;

public class C03_MultipleExceptions {
    public static void main(String[] args) {

        String str = "Java Candir";

        String[] harfler = {"a", "b", "c", "d", "f", "g", "h", "j", "k"};

        //Kullanıcıdan bir pozitif sayi isteyip
        //sayiyi index kabul edin
        //Str e arraydeki o index'deki harfi yazdırın
        //ornek input : 2  output = v,c

        Scanner scanner = new Scanner(System.in);
        System.out.println("Index olarak pozitif bir tamsayi girin");
        int index = scanner.nextInt();



        //birden fazla exception olusma ihtimali varsa
        //oncelikle olasi exception'larin birbiri ile ilintili olup olmadıgina
        //(paren-child exceptions) bakmaliyiz
        //Eger bu sorudaki gibi olas exception'lar birbiri ile ilintili degilse
        // 3 farkli cozum uretebiliriz

/*
        try {
            System.out.println(str.charAt(index));

        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Verilen index Stringin sınırları dısında");
        }

        try {
            System.out.println(harfler[index]);


        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Verilen index Arrayin sınırları dısında");
        }

 */

        //2-bir try, birden fazla catch kullanabiliriz
        // ancak burada ilk exception ile karsılastıgında calısmayı durduracagı ıcın
        // tum exception'lari raporlayamayabilir

  /*
        try {
            System.out.println(str.charAt(index));
            System.out.println(harfler[index]);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Verilen index Stringin sınırları dısında");


        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Verilen index Arrayin sınırları dısında");
        }


   */

        // 3 - tek bir try daha kapsamli tek catch kullanabiliriz
        // bu durumda tek bir catch ile sorunu cozebiliriz
        //ancak hata raporunu detaylandiramayiz genel bir hata verebiliriz


        try {
            System.out.println(str.charAt(index));
            System.out.println(harfler[index]);
        } catch (RuntimeException e) {
            System.out.println("Verilen indexler sınırları dısındadır");


        }
    }
}