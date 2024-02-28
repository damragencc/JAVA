package day10_MethotOlusturma_WhileLoop;

public class C07_WhileLoop {
    public static void main(String[] args) {

        //Baslangıc ve bıtıs degerlerı bellı ıse Veya
        // bır ıslemı kac kere yapacagınızı bılıyorsak
        // for Loop kullanmak ideal olur.


        // 1 den 10a kadar olan sayiları yan yana yazdırın

        for (int i = 1; i < 10; i++) {
            System.out.print(i + " ");

        }
        System.out.println("");

        // aynı islemi while loop ile yapalım

        int sayi = 1;

        while (sayi<=10){
            System.out.println(sayi + " ");
            sayi++;
        }
    }
}
