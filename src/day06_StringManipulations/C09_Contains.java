package day06_StringManipulations;

public class C09_Contains {
    public static void main(String[] args) {

        String str = "String guzelmis";

        // sadece var olup olmadıgını ile ilgilenir
        // kac tane oldugu ile ilgilenmez

        System.out.println(str.contains("a")); // false

        System.out.println(str.contains("g g")); // true

        System.out.println(str.contains("String guzelmis")); // true

        System.out.println(str.contains("")); //

        System.out.println(str.contains("G")); // false

        System.out.println(str.toLowerCase().contains("g")); //true



}
    }