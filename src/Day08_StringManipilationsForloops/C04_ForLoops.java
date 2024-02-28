package Day08_StringManipilationsForloops;

public class C04_ForLoops {
    public static void main(String[] args) {


        // 1den 10 a kadar olan sayıları yazdırın

        for (int i = 1; i<=10; i++) {
            System.out.println(i+"");

            // 2 basamaklı sayıları yazdırın

            for (int a = 10; i<100; a+=2) {

                System.out.println(a + " ");

                //190 dan baslayıp geriye dogru 0 a kadar

                for(int c = 190; i>=0; i-=5) {

                    System.out.println(c + " ");
                }


                // 3 basamaklı sayılardan 17 ile bolunebilenleri yazdırın

                for( int b = 100; b<1000; b++)
                    if (b %17 == 0)
                    System.out.print(b + " ");


                }


            }

        }

    }

