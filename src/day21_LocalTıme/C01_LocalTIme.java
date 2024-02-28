package day21_LocalTıme;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class C01_LocalTIme {
    public static void main(String[] args) {

        LocalTime baslangıc = LocalTime.now();

        LocalTime istenenSaat = LocalTime.of(21,13);

        LocalTime istenenÜlkesaati = LocalTime.now(ZoneId.of("Turkey"));
        System.out.println(istenenÜlkesaati);

        //Bir işlemın suresini bulmak istersek
        //Baslangıc ve bitis de farklı local Time bilgilerini kayıt etmemız gerekir

        for (int i = 0; i <100000 ; i++) {
            for (int j = 0; j <100000 ; j++) {
                for (int k = 0; k <1 ; k++) {

                }

            }

            }
        LocalTime bitis = LocalTime.now();

        // iki local time arasındakı farkı farklı methodlarla bulabılırız

        //1-until()

        System.out.println(baslangıc.until(bitis, ChronoUnit.SECONDS));

        // 2-toSecondofDay



                }

            }






