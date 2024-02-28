package day10_MethotOlusturma_WhileLoop;

import day09_ForLoopMetotOlusturma.C12_AsalSayıYazdırma;

public class C03_Soruuu {
    public static void main(String[] args) {

        //verilen bir sayı asal sayı ise true
        // asal sayı degil ise false donduren bir methort olusturun

       C12_AsalSayıYazdırma.AsalSayiSonucYazdirma(20); // Verilen 20 sayisi asal degil

        System.out.println(isAsal(20)); // false




    }

    public static boolean isAsal(int sayi){

        boolean sonuc = false;

        for (int i = 2; i <=sayi ; i++) {

            if (i == sayi){
                sonuc = true;
            } else if ( sayi % i == 0) {
                sonuc = false;
                break;
            }
        }

        return sonuc;

    }


    }

