package day15_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_ArrayListMethodları {
    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();

        isimler.add("Damra");
        isimler.add("Gökcen");
        isimler.add("Barıs");
        isimler.add("Fuat");

        System.out.println(isimler);

        isimler.add(2,"Bugra"); // gökcen ve barıs arasına bugrayı ekler

        System.out.println(isimler);

        //2.index deki ismi Furkan yapin

        isimler.set(2,"Furkan");

        System.out.println(isimler); // Damra,Gökcen,Furkan,Barıs,Fuat

        System.out.println(isimler.set(3, "Ali"));

        System.out.println(isimler); // Damra Gökcen Furkan Ali Fuat

        // Aliyi sil

        System.out.println(isimler.remove("Ali")); // true
        System.out.println(isimler); // Damra Gökcen Furkan Fuat

        //Cereni sil
        System.out.println(isimler.remove("Ceren")); // False

        // Verilen isim Listede varsa silsim
        //yoksa verilen isim hatalı Listede yok yazdırsın

        String silinecekIsım = "Kemal";

        if (!isimler.remove(silinecekIsım)){

            System.out.println("verilen isim hatalı Listede yok");
        }

        System.out.println(isimler.remove(0)); // Damra
        System.out.println(isimler); // Gokcen Furkan Fuat


        List<Integer> sayilar = new ArrayList<>(Arrays.asList(3,4,3,5,6,7,9));

        System.out.println(sayilar); // [3, 4, 3, 5, 6, 7, 9]

        sayilar.remove(3); // 3.index'deki 5'i siler

        System.out.println(sayilar); // [3, 4, 3, 6, 7, 9]

        // sayilar.remove(9); // IndexOutOfBoundsException

        // Listemiz sayilardan olusuyorsa,
        // bir sayi yazdigimizda obje mi index mi ? diye suphe olmamasi icin
        // Java otomatik olarak girilen sayiyi index kabul eder
        // Eger siz obje olarak 9'u silmek isterseniz
        // once bir variable olarak olusturmalisiniz

        Integer silinecekSayi = 9;

        sayilar.remove(silinecekSayi);

        System.out.println(sayilar); // [3, 4, 3, 6, 7]


    }
}
