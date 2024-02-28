package AddDayExcersize;

import java.util.Scanner;

public class Questions_5 {
    public static void main(String[] args) {

        /*
        Kullanicidan email girmesini isteyin
       @ isareti icermiyorsa "gecerli bir email girin" yazdirin
       @ isaretinden sonra sadece "gmail.com" yaziyorsa "email onaylandi" yazdirin
       @ isaretinden sonra "gmail.com" disinda birsey yaziyorsa "Lutfen gmail
hesabinizi girin" yazdirin
       ORNEK:
       INPUT : abc.com OUTPUT : "gecerli bir email girin "
       INPUT : abc@gmail.com OUTPUT :  "email onaylandi "
       INPUT : abc@hotmail.com OUTPUT : "Lutfen gmail hesabinizi girin"
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen mail adresinizi giriniz");
        String mail = scanner.nextLine();

        int flag = 0;

        if (!mail.contains("@")){
            System.out.println("Mail @ icermiyor");
            flag++;
        }
        if (!mail.contains("@gmail.com")){
            System.out.println("mail @gmail.com olmalıdır");
            flag++;

        } if (!mail.endsWith("@gmail.com")){
            System.out.println("mailde yazim hatasi var");
            flag++;
        }if (flag==0){

            System.out.println("Grısı basarılı");
        }

    }
}
