package AddDayExcersize;

public class D1_Equals {
    public static void main(String[] args) {

        String str1 = "Damra";
        String str2 = "DAMRA";
        String str3 = "DAmRa";
        String str4 = "DAMRA ";
        String str5 = "damra";
        String str6 = "DAMRA";


        System.out.println(str6.equals(str2)); // true
        System.out.println(str1.equals(str5)); // false
        System.out.println(str2.equals(str4)); // false
        System.out.println(str4.equals(str5)); //false


        // EqualsIqnore


        System.out.println(str1.equalsIgnoreCase(str2)); //true
        System.out.println(str3.equalsIgnoreCase(str5)); //true
        System.out.println(str2.equalsIgnoreCase(str4)); //false



    }
}
