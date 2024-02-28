package day30_ListItrator_Collection;

import java.util.Deque;
import java.util.LinkedList;

public class C06_LinkedLis_Deque {
    public static void main(String[] args) {

        //deque ==>Z Double Ended Queue ==> iki uclu kuyruk

        Deque<Integer> sayilar = new LinkedList<>();
        System.out.println(sayilar.add(10)); // true
        sayilar.add(20);
        sayilar.add(50);
        sayilar.add(60);
        System.out.println(sayilar); // [20,50,60]

        //deque double ended queue oldugundan hemen hemen
        //butun methodlarin ...first() ve .....last() versiyonlari vardir

        sayilar.addFirst(70);
        sayilar.addLast(90);
        System.out.println(sayilar);

       sayilar.addFirst(20);
       sayilar.addLast(70);
        System.out.println(sayilar);

        sayilar.removeLastOccurrence(20);
        System.out.println(sayilar);

        sayilar.removeFirstOccurrence(70);
        System.out.println(sayilar);

        sayilar.removeFirstOccurrence(42); // false Listede olmadıgı icin false dondurur


        //ilk elementi silip bize dondurur
        System.out.println(sayilar.pop()); // 20



    }

}
