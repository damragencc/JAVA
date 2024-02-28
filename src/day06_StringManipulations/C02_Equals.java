package day06_StringManipulations;

public class C02_Equals {
    public static void main(String[] args) {

        String str1 = "Ali";
        String str2 = "ali";
        String str3 = "ALI";
        String str4 = "ALi";
        String str5 = "Ali ";
        String str6 = "Ali";



        // equals() buyuk kucuk harflere dıkkat ederek case sensıvıte metınlerın aynı olup olmadıgını kontrol eder

        System.out.println(str1.equals(str2)); // Ali <==>ali <==> false
        System.out.println(str3.equals(str2)); // ALI <==> ali <==> false
        System.out.println(str1.equals(str5));  // Ali <==> Ali <==> false
        System.out.println(str1.equals(str6)); //Ali <==> Ali <==> true

        //equalsIgnoreCase() ise buyuk kucuk harf dikkat etmeden metinlerın
        // aynı olup olmadıgını kontrol eder.




        System.out.println(str1.equalsIgnoreCase(str2)); // Ali <==>ali <==> true
        System.out.println(str3.equalsIgnoreCase(str2)); // ALI <==> ali <==> true
        System.out.println(str1.equalsIgnoreCase(str5));  // Ali <==> Ali <==> false
        System.out.println(str1.equalsIgnoreCase(str6)); // Ali <==> Ali <==> true



    }
}
