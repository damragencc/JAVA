package AddDayExcersize;

import java.util.Scanner;

public class C01_ABCC {



    /*
    ATM Kullanicidan giriş için kart numarasi ve şifresini isteyin, eger herhangi birini yanlis girerse tekrar isteyin.

    Kart numarasi aralarda boşluk ile girerse de eger doğruysa kabul edin. Kart numarasi ve sifre dogrulanirsa kullanici
    nin yapabileceği işlemleri ekrana yazdirin,   Menu listesinde Bakiye sorgula, para yatirma, para çekme, para gönderm
    e, sifre değiştirme ve cikis islemleri olacaktır.   Para çekme ve para gonderme işleminde mevcut bakiyeden buyuk par
    a çekilemez,  Para gönderme işleminde istenen iban TR ile baslamali ve toplam 26 karakterli olmali, eger değilse men
    ü ekranina geri donsun.  Sifre değiştirme işleminde mevcut şifreyi teyit ettikten sonra, sifre değişiklik işlemini
    yapmali,

     */

    static String kkNo = "1234 1234 1234 1234";
    static String sifre ="1234";
    static Scanner scanner = new Scanner(System.in);

    static int bakiye = 10000;








    public static void main(String[] args) {

        System.out.println("Lutfen 16 haneli kknO gırınız");
        String girilenkkNo=scanner.nextLine();
        String bosluksuzkkNo=kkNo.replaceAll("\\W","");

        while(!(girilenkkNo.equalsIgnoreCase(kkNo)||girilenkkNo.equalsIgnoreCase(bosluksuzkkNo))){

            System.out.println("Hatalı gırıs yaptınız tekrardan gırıs yaptınız");
            girilenkkNo= scanner.nextLine();

        }
        System.out.println("Lutfen sıfrenızı gırınız");
        String girilenSifre=scanner.nextLine();

        while (!girilenSifre.equalsIgnoreCase(sifre)){
            System.out.println("Hatalı gırıs yaptınız Lutfen tekrar gırıs yapınız");
            girilenSifre=scanner.nextLine();


        }
        menu();


    }
    public static void menu(){
        System.out.println("===========================================");
        System.out.println("Bankamıza Hosgeldınız");
        System.out.println("1-Bakiye Sorgulama\n2-Para Gonderme\n3-Para Cekme\n4-Para Yatırma\n5-Sifre Degistirme\n6-Cıkıs");
        System.out.println("===========================================================");
        int secim= scanner.nextInt();


     while(secim>6){
         System.out.println("Hatalı gırıs yaptınız lutfen tekrar deneyınız");
         secim=scanner.nextInt();
     }

        switch (secim){

            case 1:
                bakiyeSorgulama();
                break;
            case 2:
                paraGonder();
                break;
            case 3:
                paraCekme();
                break;
            case 4:
                paraYatırma();
                break;
            case 5:
                sifreDegıstır();
                break;

            case 6:
                cıkıs();
                break;



            }




    }
    public static void paraCekme(){
        System.out.println("Lutfen cekecegınız miktarı giriniz");
        int cekilenMiktar=scanner.nextInt();
        while (cekilenMiktar>=bakiye){
            System.out.println("Lutfen bakiyenizden dusuk bir miktar giriniz");
            cekilenMiktar=scanner.nextInt();

        }
        String bos=scanner.nextLine();
        bakiye-=cekilenMiktar;
        System.out.println("Cekilen tutar : " +cekilenMiktar+ " TL'dir");
        System.out.println("Mevcut bakiyeniz  : "+bakiye+ " Tl'dır ");

     menuSorgu();


    }
    public static void paraYatırma(){
        System.out.println("Lutfen yatıracagınız tutarı giriniz");
        int girilenMiktar= scanner.nextInt();

        String bos=scanner.nextLine();

        bakiye+=girilenMiktar;

        System.out.println("Para yatırma islemınız basarıyla tamamlandı");

        System.out.println("Mevcut Bakiyeniz : " +bakiye);

        menuSorgu();

    }
    public static void bakiyeSorgulama(){

        System.out.println("Bakiyeniz : " +bakiye+ "TL'dır");

        menuSorgu();


    }
    public static void paraGonder(){
        System.out.println("Lutfen para gönderecegınız miktarı giriniz");
        int gonderilenMiktar=scanner.nextInt();
        while (gonderilenMiktar>=bakiye){
            System.out.println("Bakiyenizden yüksek miktar girdiniz lütfen bakiyenizden düsük bir miktar giriniz");

        }
        String bos=scanner.nextLine();
        bakiye-=gonderilenMiktar;
        System.out.println("Gönderilen mikar : " +gonderilenMiktar+ "Tl'dir");
        System.out.println("Mevcut bakiyeniz : " +bakiye+ " Tl'dir");

        menuSorgu();


    }
    public static void sifreDegıstır(){
        System.out.println("Lutfen mevcut sıfrenızı gırınız");
        String girilenSifre=scanner.nextLine();
        while (!girilenSifre.equalsIgnoreCase(sifre)){
            System.out.println("Hatalı gırıs yaptınız lutfen sıfrenızı tekrar gırınız");
            girilenSifre=scanner.nextLine();


        }
        System.out.println("Yenı sıfrenızı gırınız");
        sifre= scanner.nextLine();
        menuSorgu();










    }
    public static void cıkıs(){

        System.exit(0);

    }

    public static void menuSorgu(){

        System.out.println("Menuye donmek ıcın 'M' tuslayın cıkmak icin 'E' tuslayın" );
        String donus=scanner.nextLine();
        while(!(donus.equalsIgnoreCase("M")||donus.equalsIgnoreCase("E"))){
            System.out.println("Hatalı tuslama yaptınız lutfen tekrar deneyiniz");
                    donus=scanner.nextLine();

        }
        if (donus.equalsIgnoreCase("M")){
            menu();

        }else{
            cıkıs();
        }


    }


    }

