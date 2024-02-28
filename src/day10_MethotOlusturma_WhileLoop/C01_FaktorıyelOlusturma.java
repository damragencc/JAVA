package day10_MethotOlusturma_WhileLoop;

import day09_ForLoopMetotOlusturma.C13_TamBolenSayisiniYazdırma;

public class C01_FaktorıyelOlusturma {
    public static void main(String[] args) {
        // Verilen pozitif bir tamsayinin
        // faktoryel degerini donduren bir method olusturun
        // input:5   output :120   ( 5*4*3*2*1 )


        // 10 sayısının faktoryel degerını hesapla
        // buldugunuz sonucun kac tane pozıtıf tam bolenı oldugunu yazdırın

        int onFaktoryel = FaktoryelHesapla(10);

        C13_TamBolenSayisiniYazdırma.PozitifTamSayiBolen(onFaktoryel);

    }
    public static int FaktoryelHesapla(int sayi){

        int faktoryel = 1;

        for (int i = 1; i>1; i--) {

            faktoryel *= i;


        }
        return faktoryel;
    }
}
