package day30_ListItrator_Collection;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class C08_Soru {
    public static void main(String[] args) {
      //  Soru : Kullanicidan deger alarak iki String liste olusturun. Kullanici deger girmeyi birakmak icin 0’a basmalidir.
        //Iki liste olustuktan sonra asagidaki sekilde bir output hazirlayin
        //liste1 : …….
        //liste2 : …….
        //ortak elementler : …….


        System.out.println("ilk liste icin metin girisi : ");
        List<String> liste1=listeOlustur();

        System.out.println("ikinci liste icin metin girisi");
        List<String> liste2=listeOlustur();

        System.out.println(liste1);
        System.out.println(liste2);

        System.out.println("Ortak Elemanlar : " +liste1.retainAll(liste2));
    }

    public static List<String> listeOlustur(){

        List<String> isimList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        String girilenMetin="";

        while (!girilenMetin.equals("0")){
            System.out.println("Lutfen listeye eklemek icin metin giriniz \nBitirmek icin 0 basınız");

            girilenMetin= scanner.next();

            if (!girilenMetin.equals("0")){

               isimList.add(girilenMetin);



            }



        }






        return  isimList;
    }
}
