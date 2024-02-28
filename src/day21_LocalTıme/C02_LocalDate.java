package day21_LocalTıme;

import java.time.LocalDate;

public class C02_LocalDate {
    public static void main(String[] args) {

        LocalDate bugun =LocalDate.now();
        System.out.println(bugun);

        LocalDate dogumTarihi=LocalDate.of(1993,11,25);
    }
}
