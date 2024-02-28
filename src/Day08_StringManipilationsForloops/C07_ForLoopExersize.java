package Day08_StringManipilationsForloops;

public class C07_ForLoopExersize {
    public static void main(String[] args) {


        int toplam = 0;

        for (int a = 28; a < 100; a++) {
            if (a % 30 == 0)

                System.out.println(a + " ");
        }

        for (int b = 100; b < 1000; b++) {
            if (b % 17 == 0)
                System.out.print(b + " ");
        }


        for (int c = 100; c < 990; c++) {
            if (c % 30 == 0)
                System.out.println(c + "");
        }


        for (int i = 10; i < 100; i += 2) {
            System.out.print(i + " ");

        }
        toplam = 0;

        for (int i = 897; i <= 1345; i++) {
            if (i % 7 == 0) {


                toplam += i;

            }
        }


        {
                System.out.println("Islemın sonucu:" + toplam);



                }
            }
        }

