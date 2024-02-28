package day09_ForLoopMetotOlusturma;

public class C12_AsalSayıYazdırma {
    public static void main(String[] args) {

        AsalSayiSonucYazdirma(17);

    }


      public static void AsalSayiSonucYazdirma(int sayi){

          for (int i = 2; i<=sayi ; i++) {

              if (i == sayi) {
                  System.out.println("Verilen sayi asal sayidir");

              } else if (sayi % i == 0) {
                  System.out.println("Verilen sayi asal sayi değildir");

                  break;

              }

          }


          }
      }

