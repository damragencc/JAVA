package Day17_Constractors;

public class C01_Car {
    /*
    Biz bir class olusturdugumuzda Java her classdan obje olusturabilmesi icin
    bizim olusturdugumuz classa default constructor yerlestirir
    Default constructor
    -Parametresizdir
    -publicdir
    -Bodysinde kod yoktur
    -gorunmez

    Eger siz objenin bazı ozelliklerini bastan belirlemek icin bu
    ozelliklerini constructora parametre olarak yollayıp constructor icinde atama yapabilirsiniz.

    YANLIZ dikkat etmemiz gereken bir konu var
    EGER biz gorunur bir constructor olusturursak
    Java default constructori siler

    Bundan dolayı
    classda gorunur bir constructor olusturdugumuzda default constructor
    kullanarak olusturulan objelerde default constructorın gorevını yapacak
    PARAMETRESIZ bir constructor olustururuz.

    Eger bazi degerleri obje olusturulurken atamak istersek
         parametreli constructor'lari kullanabiliriz
         parametreli constructor kullandigimizda
         - Eger parametre ismi ile instance variable ismi ayni degilse
           direk atama yapabiliriz
           marka = mrk;  model = mdl;   gibi

            - parametre ismi ile instance variable ismi ayni olursa
           scope'dan dolayi Java class level'daki variable'lara bakmaz
           bu durumda objeye ait instance variable'lara deger atamasi yapilmaz
           esitligin solundaki variable'larin
           class level'daki instance variable'lar oldugunu belirtmek icin
           basina this. kullaniriz

           this.marka = marka; gibi

         this. kullanildiginda Java icinde bulundugu scope'a degil
         direk olarak class level'a bakacaktir

     */

    String marka =" Marka atanmadı";
    String model;
    String renk;
    int yil;
    int fiyat;


  public C01_Car(){

      // default constructor aynen bu yazdigimiz constructor gibidir
      // public, parametresiz ve body'sinde kod yoktur
      // ancak bu cons. gorunur oldugu icin
      // default cons degildir, parametresiz cons. olarak adlandirilir
      // default cons.'in body'si bostur ama biz
      // parametresiz cons'in body'sine kod yazabiliriz


  }


    C01_Car(String mrk, String mdl) {

      marka = mdl;
      model = mdl;


    }
    /*
    menuden Generate kısmına gidip toString
    isaretleyip sectigimiz parametleleri yazdırıyoruz.
     */
    C01_Car(String mdl, int yl, int fyt){

        model = mdl;
        yil = yl;
        fiyat = fyt;
    }


   C01_Car(String mrk,String mdl, String rnk, int yl, int fyt) {
        marka=mrk;
        model=mdl;
        renk=rnk;
        yil=yl;
        fiyat=fyt;

   }












    // menu'den code/generate/toString()
    // objenin yazdirmak istedigimiz ozellikliklerini isaretliyoruz


    @Override
    public String toString() {
        return "Car Ozellikler : " +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", yil=" + yil +
                ", fiyat=" + fiyat ;





    }}


