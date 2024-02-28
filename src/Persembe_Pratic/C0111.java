package Persembe_Pratic;

public class C0111 {
    public static void main(String[] args) {

        /*
         * $ ve £ isareti olanlarin toplamlarini ayri ayri bulun
         *
         * String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
         */
        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        String[] paralar = str.split("\\s+"); // String'i boşluklara göre böler

        int dolar = 0;
        int euro = 0;

        for (String para : paralar) {
            if (para.startsWith("$")) {

                dolar += Integer.parseInt(para.substring(1));
            } else if (para.startsWith("£")) {

                euro += Integer.parseInt(para.substring(1));
            }
        }

        System.out.println("Toplam dolar: " + dolar);
        System.out.println("Toplam pound: " + euro);

    }}
