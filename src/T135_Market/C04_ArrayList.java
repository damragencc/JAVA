package T135_Market;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C04_ArrayList {
    // Bir öğretmenden girmek istediği kadar notu alınız, ve
    // ortalamayı geçen öğrenci sayısını bulunuz.

    public static void main(String[] args) {


        List<Double> nots =new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen girmek istediginiz notları yazın");
        char devam= scanner.next().charAt(0);
        double ortalama=0;
        double toplam=0;




        while(devam=='E'){
            System.out.println("Notu giriniz");
           nots.add(scanner.nextDouble());
            System.out.println("Yeni not girmek icin E tusuna basıız");
            devam=scanner.next().charAt(0);


        }

        System.out.println(nots);
        for (int i = 0; i < nots.size() ; i++) {
            toplam+=nots.get(i);


        }
        ortalama=toplam/nots.size();


    }
}
