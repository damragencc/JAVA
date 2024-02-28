package day28_Exception;

public class C04_TryCatch {
    public static void main(String[] args) {

        int sayi1=10;
        int sayi2=0;

        try {
            System.out.println(sayi1/sayi2);
        } catch (ArithmeticException e) {

            //e catch cumlesinin yakaladigi exception'i kaydettigi variable ismidir

            //try bolumunde olusan exception'in catch bolumunde yakalanabilmesi icin
            //uygun exception turu yazilmalidir

            //catch bolumu hatayı yakaladıgında
            //hatayi yazdigimiz e variable kaydeder ve calismaya devam eder

            //Eger Java'nin yakaladigi hatayi tamamen veya kismen yazdirmak isterseniz
            //e objesi ile hazır metodlar kullanabilirsiniz

            //System.out.println("Ikinci sayi 0 olamaz");

            //e.printStackTrace();

        }


    }
}
