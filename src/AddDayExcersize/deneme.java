package AddDayExcersize;

import java.util.Scanner;

public class deneme {
    public class C19Kk {
        static String kkno = "1234 1234 1234 1234";
        static String sifre = "123456";
        static Scanner scanner = new Scanner(System.in);
        static int bakiye = 10000;

        public static void main(String[] args) {

        /*
         Kullanicidan giriş için kart numarasi ve şifresini isteyin,
         eger herhangi birini yanlis girerse tekrar isteyin. Kart numarasi
         aralarda boşluk ile girerse de eger doğruysa kabul edin. Kart numarasi
          ve sifredogrulanirsakullanicinin yapabileceği işlemleri ekrana yazdirin,
         */

            Scanner scanner = new Scanner(System.in);
            System.out.println("Lütfen Kredi Kartı numaranızı giriniz :");
            String girilenKKNo = scanner.nextLine();
            String bosluksuzKKNo = kkno.replaceAll("\\W", "");

            while (!(girilenKKNo.equalsIgnoreCase(kkno) || girilenKKNo.equalsIgnoreCase(bosluksuzKKNo))) {
                System.out.println("Hatalı giriş yaptınız Lütfen Kredi Kartı numaranızı tekrar giriniz :");
                girilenKKNo = scanner.nextLine();
            }
            System.out.println("Lütfen şifrenizi giriniz :");
            String girilenSifre = scanner.nextLine();

            while (!girilenSifre.equalsIgnoreCase(sifre)) {
                System.out.println("Hatalı giriş yaptınız Lütfen şifrenizi tekrar giriniz :");
                girilenSifre = scanner.nextLine();
            }
            menu();

        }
        public static void menu() {

            System.out.println("-----------MUDAM'A HOŞGELDİNİZ-------------");
            System.out.println("------------------MENU---------------------");
            System.out.println("1 - Bakiye Sorgula \n2 - Para Çekme \n3 - Para Gönder \n4 - Şifre Değiştirme \n5 - Para Yatır \n6 - Çıkış");
            Scanner scanner = new Scanner(System.in);

            String tus = scanner.nextLine();

            switch (tus) {
                case "1":
                    bakiyeSorgula();
                    break;
                case "2":
                    paraCek();
                    break;
                case "3":
                    paraGonder();
                    break;
                case "4":
                    sifreDegistir();
                    break;
                case "5":
                    paraYatir();
                    break;
                case "6":
                    cikis();
                    break;
                default:
                    System.out.println("Hatalı tuşlama yaptınız.");
                    menuSorgu();
            }
        }
        private static void paraYatir() {
            System.out.println("Ne kadar yatırmak istiyor sunuz ?");
            int yatirilacakTutar = scanner.nextInt();
            while (!(yatirilacakTutar >= 0 && yatirilacakTutar < Integer.MAX_VALUE)) {
                System.out.println("Hatalı giriş yaptınız lütfen yatırmak istediğiniz tutarı tekrar girin");
                yatirilacakTutar = scanner.nextInt();
            }
            String boskod = scanner.nextLine();
            bakiye += yatirilacakTutar;
            System.out.println("Para yatırma işlemi Başarıyla gerçekleştirildi.");
            menuSorgu();
        }
        public static void cikis() {
            System.exit(0);
        }

        public static void sifreDegistir () {

            System.out.println("Mevcut Şifrenizi giriniz : ");
            String anlikSifre = scanner.nextLine();

            while (!anlikSifre.equalsIgnoreCase(sifre)) {
                System.out.println("Hatalı giriş yaptınız lütfen şifrenizi tekrar giriniz ");
                anlikSifre = scanner.nextLine();
            }
            System.out.println("Yeni şifrenizi giriniz : ");

            sifre = scanner.nextLine();
            System.out.println("Şifre başarıyla değiştirildi.");

            menuSorgu();
        }
        public static void paraGonder () {
            System.out.println("Göndermek istediğiniz IBAN bilgisini başında TR olacak şekilde giriniz");
            String iban = scanner.nextLine();

            while (!(iban.substring(0,2).equals("TR") && iban.length() == 26 )){
                menu();
            }

            System.out.println("Ne kadar göndermek istiyor sunuz ?");
            int gonderilecekTutar = scanner.nextInt();

            while (gonderilecekTutar > bakiye) {
                System.out.println("Bakiyenizden yüksek bir tutar girdiniz.Hesabınızdaki bakiye " + bakiye + " TL'dir" +
                        "Lütfen göndermek istediğiniz tutarı tekrar girin.");
                gonderilecekTutar = scanner.nextInt();

            }
            String boskod = scanner.nextLine();
            bakiye -= gonderilecekTutar;

            System.out.println("Para Gönderme işlemi başarıyla gerçekleştirildi");

            menuSorgu();
        }
        public static void paraCek () {
            System.out.println("Ne kadar çekmek istiyor sunuz ?");
            int cekilecekTutar = scanner.nextInt();

            while (cekilecekTutar > bakiye) {
                System.out.println("Bakiyenizden yüksek bir tutar girdiniz.Hesabınızdaki bakiye " + bakiye + " TL'dır." +
                        "Lütfen çekmek istediğiniz tutarı tekrar girin.");
                cekilecekTutar = scanner.nextInt();

            }
            String boskod = scanner.nextLine();
            bakiye -= cekilecekTutar;

            System.out.println("Para Çekme işlemi başarıyla gerçekleştirildi");

            menuSorgu();
        }
        public static void bakiyeSorgula () {
            System.out.println("Bakiniz = " + bakiye + " Tl");

            menuSorgu();
        }
        public static void menuSorgu () {
            System.out.println("Ana Menüye dönmek için M'e basınız Çıkmak için E'e basın");
            String donusTus = scanner.nextLine();
            while (!(donusTus.equalsIgnoreCase("M") || donusTus.equalsIgnoreCase("E"))) {
                System.out.println("Hatalı giriş yaptınız");
                System.out.println("Ana Menüye dönmek için M'e basınız Çıkmak için E'e basın");
                donusTus = scanner.nextLine();
            }
            if (donusTus.equalsIgnoreCase("M")) {
                menu();
            } else {
                cikis();
            }
        }
    }

}
