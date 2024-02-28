import java.util.Scanner;

public class M01_Persembe {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("1.vize Notu");
        double vize1=scan.nextDouble();
        System.out.println("2.vize Notu");
        double vize2=scan.nextDouble();
        System.out.println("Final Notu");
        double finalNotu=scan.nextDouble();


        System.out.println(".......Yıl Sonu Başarı Notu Tablosu.............");
        System.out.println(" ");
        System.out.println("\t1.vize Notu: "+vize1+"\n\t2.vize Notu:"+vize2+"\n\tFinal Notu: "+finalNotu);
        System.out.println("Yıl Sonu Başarı Notu: "+((((vize1+vize2)/2)*0.4+finalNotu*0.6)));





    }
}
