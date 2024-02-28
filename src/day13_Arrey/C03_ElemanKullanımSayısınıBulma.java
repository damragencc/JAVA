package day13_Arrey;

public class C03_ElemanKullanımSayısınıBulma {
    public static void main(String[] args) {

        //Soru 4- Verilen bir array de
        //        istenen bir elemanın var olup olmadıgını
        //        ve varsa kac kere kullanıldıgını yazdıran bir method olusturun

        int[] arr = {3,4,5,1,2,4,6,7,4,3,2,5,6,7,8,1,2,3,4,5};

        elemanSayisiniYazdir(arr,3);
        elemanSayisiniYazdir(arr,8);
        elemanSayisiniYazdir(arr,10);
    }

    public static void elemanSayisiniYazdir(int[] arr, int arananSayi){
        int sayac=0;

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] == arananSayi){
                sayac++;
            }
        }
        if (sayac == 0){
            System.out.println("Aranan sayı hic kullanılmamıs");

        } else{
            System.out.println("Verilen" + arananSayi+  "array de " +sayac +"kullanılmıstır");

        }
    }
}
