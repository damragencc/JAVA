package AddDayExcersize;

public class D2_substring {
    public static void main(String[] args) {

        String str = "DAMRA GENC";

        System.out.println(str.substring(3)); // RA GENC
        System.out.println(str.substring(5)); // A GENC


        System.out.println(str.substring(2, 7)); // MRA G
        System.out.println(str.substring(5, 9)); //   GEN


        System.out.println(str.substring(str.length()-1)); // C
        System.out.println(str.substring(str.length()-3)); // ENC




    }
}
