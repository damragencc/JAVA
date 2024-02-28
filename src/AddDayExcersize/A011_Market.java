package AddDayExcersize;

import java.util.Scanner;

public class A011_Market {
    /*
                5 ürünlü manav alisveris programi yaziniz.
                1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
                2. Adim : Baska bir urun almak isteyip istemedigini sor. istemiyorsa toplam
                  miktari goster, istiyorsa tekrar urun sectir.
                  Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
                3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata
                  ekle.
                4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.

     */

   static Scanner scanner = new Scanner(System.in);

   static boolean ekUrun;
   static int urunKodu;

   static String urunAdi;

   static int urunMiktari;

   static double urunFiyati;
   static int toplamFiyat;
   static double  fisYazdir;

   static String sepet = " ";






    public static void main(String[] args) {
        girisEkrani();
    }





   public static void girisEkrani(){
       System.out.println("----------Damra06Market_--------");
       System.out.println("Markete Hosgeldınız");
       System.out.println("Menu");
       System.out.println("1-manav\n2-sarkuteri\n3-market\n4-fisYazdir\n5-cikis");
       int secim=scanner.nextInt();

       if (secim>=1 && secim<=5){
           switch (secim){
               case 1:
                   manav();
               case 2:
                   sarkuteri();
               case 3:
                   market();
               case 4:
                   fisYazdir();
               case 5:
                   cikis();
           }
       }else
           System.out.println("Lutfen gecerli bir sayı giriniz");





}

    private static void fisYazdir() {

        System.out.println("Toplam fiyat : " +toplamFiyat);


    }

    private static void cikis() {
    }

    private static void market() {
    }

    private static void sarkuteri() {
        System.out.println("Sarkuteri reyonuna hosgeldiniz");
        System.out.println("Lutfen urun seciniz");
        System.out.println("16-kiyMa 19.90\n17-bAlik 39.90\n18-pirzola\n19antrikot\n20-biftek");

        while (true){
            while(!ekUrun){
                urunKodu= scanner.nextInt();
                if (urunKodu>=16 && urunKodu<=20){
                    System.out.println("Kac kılogram alacaksınız");
                    urunMiktari=scanner.nextInt();




                  switch (urunKodu){
                      case 16:
                          urunAdi="kiyMa";
                          urunFiyati=50;
                          System.out.println(urunMiktari+ "kg  " +urunAdi+ "fiyatı" +urunMiktari*urunFiyati );
                          break;

                      case 17:
                          urunAdi="bAlik";
                          urunFiyati=100;
                          System.out.println(urunMiktari+ "kg  " +urunAdi+ "fiyatı" +urunMiktari*urunFiyati );
                          break;
                      case 18:
                          urunAdi="pirzola";
                          urunFiyati=80;
                          System.out.println(urunMiktari+ "kg  " +urunAdi+ "fiyatı" +urunMiktari*urunFiyati );
                          break;
                      case 19:
                          urunAdi="antrikot";
                          urunFiyati=70;
                          System.out.println(urunMiktari+ "kg  " +urunAdi+ "fiyatı" +urunMiktari*urunFiyati );
                          break;
                      case 20:
                          urunAdi="biftek";
                          urunFiyati=60;
                          System.out.println(urunMiktari+ "kg  " +urunAdi+ "fiyatı" +urunMiktari*urunFiyati );
                          break;
                  }
                    urunFiyati*=urunMiktari;
                    toplamFiyat+=urunFiyati;


                    System.out.println("Baska bır urun almak ıstermısınız yoksa baska reyona gecmek ıcın 0 basın");




                }
                else if (urunKodu==0){
                    girisEkrani();
                }

            }
        }

    }

    private static void manav() {
        System.out.println("Manav reyonuna hosgeldiniz");
        System.out.println("Lutfen urun seciniz");
        System.out.println("11-Patates 19.90\n12-Muz 39.90\n13-nar\n14elma\n15-armut");


        while(true){
            while(!ekUrun){
                urunKodu= scanner.nextInt();
                if (urunKodu>=11 && urunKodu<=15) {
                    System.out.println("Kac kılogram alacaksınız");
                    urunMiktari=scanner.nextInt();


                    switch (urunKodu){
                        case 11:
                            urunAdi="Patates";
                            urunFiyati=19.90;
                            System.out.println(urunMiktari + " kilogram " +urunAdi+ " aldiniz. Fiyati : " +(urunMiktari*urunFiyati));
                            break;

                        case 12:
                            urunAdi="Muz";
                            urunFiyati=39.90;
                            System.out.println(urunMiktari + " kilogram " +urunAdi+ " aldınız. Fiyati : " +(urunMiktari*urunFiyati));
                            break;
                        case 13:
                            urunAdi="nar";

                            urunFiyati=49.90;
                            System.out.println(urunMiktari + " kilogram " +urunAdi+ " aldiniz. Fiyati : " +(urunMiktari*urunFiyati));
                            break;
                        case 14:
                            urunAdi="elma";
                            urunFiyati=29.90;
                            System.out.println(urunMiktari + " kilogram " +urunAdi+ " aldınız. Fiyati : " +(urunMiktari*urunFiyati));
                            break;
                        case 15:
                            urunAdi="armut";
                            urunFiyati=59.90;
                            System.out.println(urunMiktari + " kilogram " +urunAdi+ " aldınız. Fiyati : " +(urunMiktari*urunFiyati));
                            break;


                    }
                    urunFiyati*=urunMiktari;
                    toplamFiyat+=urunFiyati;



                    System.out.println("Baska bır urun almak ıstermısınız yoksa baska reyona gecmek ıcın 0 basın");



                }else if (urunKodu==0){
                    girisEkrani();
                }






            }
        }






            }
        }

