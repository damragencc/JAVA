package day06_StringManipulations;

public class C12_Index0f_LastIndex {
    public static void main(String[] args) {

        String str = "Ali topu at, at Ali at";

        System.out.println(str.contains("Ali")); //true
        System.out.println(str.startsWith("Ali")); //true
        System.out.println(str.endsWith("Ali")); // false

        // istenen metnin oldugu indexi bize verirler

        System.out.println(str.indexOf("Ali")); // 0
        System.out.println(str.indexOf("top")); // 4
        System.out.println(str.indexOf("a")); // 9

        System.out.println(str.lastIndexOf("Ali")); //16
        System.out.println(str.lastIndexOf("top")); // 4
        System.out.println(str.lastIndexOf("a")); // 20

        System.out.println(str.lastIndexOf('i')); // 18
        System.out.println(str.lastIndexOf('i')); // 18

        System.out.println(str.indexOf("a", 13)); // 13

        // bir sonraki a yi bulabilmemiz icin baslangıcı bir arttırmalıyız

        System.out.println(str.indexOf("a", 14)); //20

        //last.index of aramayı sondan basa dogru yapar

        System.out.println(str.lastIndexOf("a",15)); //13
        System.out.println(str.lastIndexOf("Ali",  10)); // 0

        System.out.println(str.contains("x")); // false
        System.out.println(str.startsWith("x")); //false
        System.out.println(str.endsWith("x")); //false

        System.out.println(str.indexOf("x")); // -1
        System.out.println(str.lastIndexOf("q")); // -1



    }
}
