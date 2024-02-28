package AddDayExcersize;

public class D4_Contains {
    public static void main(String[] args) {

        String str = "DAMRA GENC";

        System.out.println(str.contains("D")); // true
        System.out.println(str.contains("RA GENC")); // true
        System.out.println(str.contains("v")); // false
        System.out.println(str.contains(" GENC")); // true

        System.out.println(str.toUpperCase().contains("D")); // true
        System.out.println(str.toUpperCase().contains("MRA")); // true


        System.out.println(str.toLowerCase().contains("d")); // true
        System.out.println(str.toLowerCase().contains("damra genc"));// true


        String str1 = "damra genc";

        System.out.println(str.toLowerCase().contains("a")); // true
        System.out.println(str.toLowerCase().contains("damra genc")); // true
        System.out.println(str.toLowerCase().contains("DAMRA")); // false
    }
}
