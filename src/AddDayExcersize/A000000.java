package AddDayExcersize;

import java.util.Scanner;

public class A000000 {
    public static void main(String[] args) {

        //Soru 4- Kullanicidan ISTQB kisaltmasindaki harflerden anlamini ogrenmek istedigini alin
        //        ve girilen harfin karsiligini yazdirin.
        //	        I : International
        //	        S : Software
        //	        T : Testing
        //	        Q : Qualifications
        //	        B: Board

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen gun numarasını gırınız");
       char harf=scanner.nextLine().charAt(0);

       switch (harf){
           case 'i':
           case 'I':
               System.out.println("INternatational");
                break;
           case 'S':
           case 's':
               System.out.println("Software");
               break;

           case 't':
           case 'T':
               System.out.println("Testing");
               break;
           case 'Q':
           case 'q':
               System.out.println("Qualifications");
               break;
           case'b':
           case'B':
               System.out.println("Board");
               break;
           default:
               System.out.println("Lutfen gecerli bir harf giriniz");
       }


    }}

