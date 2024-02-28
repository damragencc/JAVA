package Day08_StringManipilationsForloops;

public class  C05_ForLoop{

    public static void main(String[] args) {

        // 123 ile 789 (dahil) arasındaki sayıları yazdırın

        int toplam = 0;

        for (int i = 123; i <= 789; i++) {

            toplam += i;
            System.out.println("Toplam işleminin sonucu" + toplam);


            //897 ile 1345 (dahil) 7 ile bolunebılen sayıları toplayın

            toplam = 0;
            for (int y = 897; y <= 1345; y++) {

                if (y % 7 == 0) {
                    toplam += y;


                }
                System.out.println("toplam işlemin sonucu " + toplam);
                {

                }
            }


            // verilen bas ve bitis sayıları dahil olarak
            // aradakı tum sayıları toplayıp yazdırın




            toplam = 0;


            int bas = 50;
            int bit = 145;
            toplam = 0;
            for (int c = bas; c <=bit ; c++) {
                toplam += c;


            }
            System.out.println("Toplam: " + toplam);
        }


    }
}
