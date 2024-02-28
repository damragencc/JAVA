package Day05_nestedIfElse;

import java.util.Scanner;

public class C10_SwitchStatements {
    public static void main(String[] args) {

        // kullanıcıdan gün numarasını alın
        // girilen numaraya gore gün ısmını yazdırın


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen gün numarasını giriniz");

        int gunNo = scanner.nextInt();

        switch (gunNo){

            case 1 :
                System.out.println("Pazartesi");
                break;
            case 2 :
                System.out.println("Salı");
                break;
            case 3 :
                System.out.println("carsamba");
                break;
            case 4 :
                System.out.println("persembe");
                break;
            case 5 :
                System.out.println("Cuma");
                break;
            case 6 :
                System.out.println("cumartesi");
                break;
            case 7 :
                System.out.println("pazar");
                break;
            default:
                System.out.println("Gun numarası 1-7 arasında olmalidir");
        }




    }
}
