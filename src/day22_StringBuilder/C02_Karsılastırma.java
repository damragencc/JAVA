package day22_StringBuilder;

public class C02_Karsılastırma {
    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder("Java");
        StringBuilder sb2=new StringBuilder("Java");
        String str="Java";

        //String ile sStringBuilderi karsılastıralım

      //   str == sb1; // Operator Operator '==' cannot be applied to
                       // Java da farklı data turlerındekı non-prımıtıve leri ile
                       // karsılastıramazsın


        System.out.println(sb1.equals(str)); // false
                                             // CTE vermez ama sonuc hep false verir



         // Sadece sb yi toString() ile karsılastırabılırz

        System.out.println(sb1.toString().equals(str)); // true

        System.out.println(sb1==sb2);// false olur cunku  aynı referansa sahipler


        System.out.println(sb1.equals(sb2));//false

        System.out.println(sb1.equals(sb1)); // true


        // StringBUilderları karsılastırmak icin comparaTo() kullanılır
        // Java her bir indexteki harfleri karsılastırır
        // eger tum indekslerdeki karakterler ayni ise sonuc 0 olur
        // eger farklı iseler, farklı harf olan ilk ındeksdeki harfler arasındaki farkı vardır.

        System.out.println(sb1.compareTo(sb2)); //0

        StringBuilder sb3 = new StringBuilder("Ali");
        StringBuilder sb4 = new StringBuilder("Ahmet");
        StringBuilder sb5 = new StringBuilder("Bilal");
        StringBuilder sb6 = new StringBuilder("Barbaros");

        System.out.println(sb3.compareTo(sb4)); // 4       l k j i h
        System.out.println(sb4.compareTo(sb5)); // -1       A B
        System.out.println(sb5.compareTo(sb6)); // 8         i h g  f e d c b a

    }
}
