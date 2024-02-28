package AddDayExcersize;

public class D05_StartWith_endWith {
    public static void main(String[] args) {

        String str = "Damra gun gectikce yaslanıyor";

        System.out.println(str.startsWith("Damra")); // true
        System.out.println(str.startsWith("gun")); // false
        System.out.println(str.startsWith("yaslanıyor")); // false
        System.out.println(str.startsWith("Damra gun")); // true
        System.out.println(str.startsWith(""));  // true

        System.out.println(str.startsWith("a", 1)); // true
        System.out.println(str.startsWith("g", 6)); // true

        str = "Damra gun gectıkce yaslanıyor";

        System.out.println(str.endsWith("yaslanıyor")); // true
        System.out.println(str.endsWith("yor")); // true
        System.out.println(str.endsWith("gectıkce yaslanıyor")); // true
        System.out.println(str.endsWith("Damra gun gectıkce yaslanıyor")); // true

    }
}
