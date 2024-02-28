package Day05_nestedIfElse;

import java.util.Scanner;

public class C11_SwitchStatementssoru3 {
    public static void main(String[] args) {


        //soru 4 Kullanıcıdıdan ISTQB kısaltmasından harfin anlamını ögrenmek istediginizi alın ve girilen harfin karsılıgını yazdırın
        // I : Inertenational S: Software T : testing
         // Q : Qualifications B; board

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen anlamnını görmek istediginiz harfi giriniz...");
        char girilenHarf = scanner.next().charAt(0);
        switch (girilenHarf){

            case 'i' :
            case 'I' :
                System.out.println("International");
                break;
            case 's' :
            case 'S' :
                System.out.println("Software");
                break;
            case 't' :
            case 'T' :
                System.out.println("Testing");
                break;
            case 'q' :
            case 'Q' :
                System.out.println("Qualifications");
                break;
            case 'b' :
            case 'B' :
                System.out.println("Board");
                break;
            default:
                System.out.println("Lutfen ISQB kisaltmlarındaki harflerden birini giriniz");
        }
    }
}
