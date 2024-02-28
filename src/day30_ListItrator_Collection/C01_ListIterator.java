package day30_ListItrator_Collection;

import java.util.*;

public class C01_ListIterator {
    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>(Arrays.asList(2,5,7,8,1,3,4));

        //index kullanmadan listedeki tum sayilari toplayip sonra elemanlari silelim

        int toplam =0;

        Iterator iterator = sayilar.iterator();

        while(iterator.hasNext()){
            toplam+=(Integer)iterator.next();


        }

        System.out.println(toplam); //30

        iterator.remove();

        //Iterator konusunda dikkat etmemiz gereken en onemli konu
        //Iterator objesinin nerede oldugudur
        //yukarda while loop ile iterator'i sona kadar goturdugumuz icin
        //tum elemanlari silme islemini ayni iterator ile yapamayiz
        //EGer yeniden bastan sona tum elementleri elden gecirmek isterseniz
        //yeni bir iterator olusturmaliyiz


        iterator=sayilar.iterator();

        while (iterator.hasNext()){
            iterator.next();
            iterator.remove();
        }

        System.out.println(sayilar);

        //Iterator sadece 3 methoda sahip oldugundan
        //istenen islemleri yapmakta zorlanınca
        //Java Iterator'in child interface'i olan
        //ListIterator'i olusturmustur


        List<Integer> sayilar2 = new ArrayList<>(Arrays.asList(2,5,7,8,1,3,4));

        ListIterator lit = sayilar2.listIterator();

        toplam=0;

        while (lit.hasNext()){

            toplam+=(Integer)lit.next();

        }
        System.out.println(toplam);

        //ListIteratorde ileri gidebildigimiz gibi geri de gelebiliriz
        //ilk while loop da sona kadar gittigimiz icin, simdi sondan basa dogru loop olusturalım


        while (lit.hasPrevious()){
            lit.previous();
            lit.remove();
        }
        System.out.println(sayilar2);
























    }

}
