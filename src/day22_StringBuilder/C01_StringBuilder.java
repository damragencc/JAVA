package day22_StringBuilder;

public class C01_StringBuilder {
    public static void main(String[] args) {

        /*
        StringBuilder java da metin ıceren classlardan birisidir
        String den farkı mutable olmasıdır
        Yani method ile yapılan degısıklıkler kalıcı olur

        ANCAK burada dikkat etmemiz gereken sey
        kullandıgımız methodun bize ne dondurdugudur
        Eger bize Stringbuilde getiriyorsa degısıklık kalici olur
        ama String veya farklı bır data turunden sonuc donduruyorsa
        degısıklık kalıcı olmaz...

         */

        StringBuilder sb=new StringBuilder("Java Candir");

        sb.append(" . ");
        sb.insert(4,"Gercekten");
        sb.replace(15,21,"Guzeldir");
        sb.delete(5,15);
        sb.deleteCharAt(13);
        System.out.println(sb);


        System.out.println(sb.substring(5)); //Guzeldir



    }
}
