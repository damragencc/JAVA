package day29_Exception_iterator;

import java.util.LinkedList;
import java.util.Queue;

public class C05_LinkedList_Queve {
    public static void main(String[] args) {

        /*
           Queue (kuyruk)

           yeni gelenler standart olarak sona eklenir
           cikacaklar ise bas kismindan cikarılırlar
         */


        Queue<Integer> sayilar = new LinkedList<>();

        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(10);
        sayilar.add(50);
        System.out.println(sayilar); // 20 30 10 50


        //kuyruk yapisindan dolayi araya ekleme yoktur

        sayilar.remove();
        //bize index yazma hakkı tanımıyor kuyruk yapisi geregi bastaki elemani siliyor

        System.out.println(sayilar);

        sayilar.remove();
        System.out.println(sayilar);

        Queue<Integer> sayilar2 = new LinkedList<>();
       //sayilar2.remove();
        // bos bir listede kullanılırsa exception olusur


        System.out.println(sayilar); //[10,50]
        sayilar.poll();
        System.out.println(sayilar); //[50]

        System.out.println(sayilar.poll());// 50

        System.out.println(sayilar); // []

        System.out.println(sayilar.poll()); // null


        //queue'nun basindaki elementi siler e bize dondurur
        //remove'dan farkli olaraka
        //bos bir liştede bize null dondurur

        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(10);
        sayilar.add(50);
        System.out.println(sayilar); // 20 30 10 50


        sayilar.offer(25);
        System.out.println(sayilar); // 20 30 10 50 25

        //Listede bir kapasite sınırlamasi yoksa verilen elementi Listeye ekler

        System.out.println(sayilar.peek());
        System.out.println(sayilar2.peek());
        //Listenin basındaki elementi silmeden bize getirir
        //Liste bos ise null dondurur

        System.out.println(sayilar.element()); // 20
        System.out.println(sayilar2.element()); // NoSuchElementException


    }
}
