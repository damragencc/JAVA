package day04_IfStatements;


import java.util.Scanner;

public class c04_kontrolet {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen notunuzu girin");
        double girilenNot = scanner.nextDouble();


        if (girilenNot >=50){
            System.out.println("Geçtin");
        }else
            System.out.println("Kaldın");


        }
    }

