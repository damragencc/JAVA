package day04_IfStatements;

public class c04_çç {
    public static void main(String[] args) {

        int sayi = 33;

        //sayı çift ise ayrı ayrı 'Sayi çift' ve 'çift sayılar 2 ile bölünür' yazdırın
        //sayi tek sayi ise ayri ayri 'tek sayi' ve Tek sayılar 2 ile bölünmez yazdırın

        if (sayi%2==0){
            System.out.println("sayi çift");
            System.out.println("Çift sayılar 2 ile bölünür");
        }else{
            System.out.println("tek sayi");
            System.out.println("Tek sayilar 2 ile bölünmez");

        }
    }
}
