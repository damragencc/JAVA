package day19_StaticKeyword;

public class d02_Deneme {
    static int sayi=10;




    static {
       ++sayi;
        System.out.println(sayi);
    }

    public static void main(String[] args) {
        System.out.println(sayi);
        d02_Deneme deneme =new d02_Deneme();
        System.out.println(sayi);

    }
    static {
        ++sayi;
        System.out.println(sayi);
    }

}
