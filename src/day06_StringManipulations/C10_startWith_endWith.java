package day06_StringManipulations;

public class C10_startWith_endWith {
    public static void main(String[] args) {


        String str = "Java gun gectikce guzellesiyor";

        // str ne ile baslıyor ? J, Ja, Java, Java gun

        System.out.println(str.startsWith("Java")); // true

        System.out.println(str.startsWith("J")); // true

        System.out.println(str.startsWith("Java gun")); // true

        System.out.println(str.startsWith("")); // true

        System.out.println(str.startsWith("Java gun gectikce guzellesiyor")); // true
        System.out.println(str.startsWith("gun")); //false


        System.out.println(str.startsWith("a", 3)); // true

        System.out.println(str.startsWith("e", 9)); // false

        str = " Java gun gectikce guzellesiyor";

        System.out.println(str.endsWith("yor")); // true

        System.out.println(str.endsWith("r")); // true

        System.out.println(str.endsWith("")); // true

        System.out.println(str.endsWith("Java gun gectikce guzellesiyor")); // true

    }
}
