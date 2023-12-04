package day32_encapsulation;

public class C04_EncapsulationRunner {

    public static void main(String[] args) {

        // Access modifier ile bir variable'a erisim yetkimiz varsa
        // HEM onu yazdirabilir, HEM DE deger atayabiliriz
        // ulasamiyorsak da hic bir islem yapamayiz

        C03_Encapsulation obj = new C03_Encapsulation();
        C03_Encapsulation obj2 = new C03_Encapsulation();

        // obj.strPrivate = "Private";
        // System.out.println(obj.strPrivate);

        obj.strDefault = "Default";
        System.out.println(obj.strDefault);
        obj.strProtected = "protected";
        System.out.println(obj.strProtected);
        obj.strPublic = "Public";
        System.out.println(obj.strPublic);

        // PEKIII okuma yani degerini gorunteleme yetkisi ile
        // write yani deger atayabilme yetkisini ayirabilir misiniz ?

        /*
        ilgili variable'lari private yaptigimiz icin
        access modifier onlari kullanmamiza hicbir sekilde
        izin vermez
        obj.satisTutari = 20;
        System.out.println(obj.satisTutari);
        obj.toplamSatisTutari = 50;
        System.out.println(obj.toplamSatisTutari);

         */

        System.out.println(obj.getToplamSatisTutari()); // 0

        obj.setSatisTutari(50);
        obj.setSatisTutari(100);
        obj.setSatisTutari(100);

        System.out.println(obj.getToplamSatisTutari()); // 250


        // satis tutari variable'inin degerini yazdirana
        // 100 Euro veriyoruz

        // System.out.println(obj.satisTutari);

        // Toplam satis tutari variable'ina degere atayana da
        // 100 Euro veriyoruz

        // obj.toplamSatisTutari = 200;

    }
}
