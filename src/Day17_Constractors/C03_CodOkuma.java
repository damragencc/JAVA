package Day17_Constractors;

public class    C03_CodOkuma {



    String isim ="atanmadi";
    String adres="girilmedi";
    int yas;

    C03_CodOkuma(){
        yas=40;


    }
    C03_CodOkuma(int yas) {
        yas = 23;
        adres = "Cankaya";
    }

        C03_CodOkuma(String isim, String adres) {
            this.isim = isim;
            this.adres = "Yenımahalle";


        }

        public static void main (String[]args){

           C03_CodOkuma obj3 =new C03_CodOkuma("Ali","Cankaya");
           System.out.println(obj3.yas +"," + obj3.isim + "," +obj3.adres); //Yas:0 isim:Ali adres: yenımahalle




            C03_CodOkuma obj2= new C03_CodOkuma(44);
            System.out.println(obj2.yas +"," + obj2.isim + "," +obj2.adres); //yas:23 isim:atanmadı adres:cankaya



            C03_CodOkuma obj=new C03_CodOkuma();
            System.out.println(obj.yas +"," + obj.isim + "," +obj.adres); // 40-atanmadı-girilmedi


        }


    }
