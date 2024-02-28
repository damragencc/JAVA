package day19_StaticKeyword;

public class d03_PBV {
    public static void main(String[] args) {
        double fiyat =100;

        System.out.println(indirimyap10(fiyat));
        System.out.println(indirimyap20(fiyat));
        System.out.println(indirimyap30(fiyat));

        System.out.println(fiyat);
    }
    public static double indirimyap10(double fiyat){
        int fiyat1=90;
        return fiyat1*0.9;

    }
    public static double indirimyap20(double fiyat){
        int fiyat2=80;
        return fiyat*0.8;
    }


    public static double indirimyap30(double fiyat){
        return fiyat*0.8;
        }}