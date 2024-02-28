package day07_StringManipilationss;

import java.util.Scanner;

public class C02_IndexOf_LastIndex {
    public static void main(String[] args) {

        // kullanıcıdan bir cumle ve aranan metin isteyin
        // IndexOf() ve LastIndex() kullanarak
        // Kullanıcıya asagıdakı durumlardan uygun olanı yazdırın
        // aranan metin cumlede yok
        // aranan metın cumlede sadece 1 kere kullanılmıs
        // aranan metın cumlede bırden fazla kullanılmıs

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir cumle giriniz...");
        String cumle = scanner.nextLine();

        System.out.println("Lutfen cumlede aradıgınız metni girin..." );
        String metin = scanner.nextLine();

        int ilkIndex = cumle.indexOf(metin);
        int sonIndex = cumle.lastIndexOf(metin);

        if (ilkIndex == -1) {
            System.out.println("aranan metin cumlede yok");
        } else if (ilkIndex == sonIndex) {
            System.out.println("Aranan metin cumlede sadece 1 kere kullanilmis");

            }
        }
    }

