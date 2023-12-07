package day35_inheritanceDataTypeKullanimi;

public class C07_Runner {

    /*
        EGER ozellikler method olarak olusturuldu ise
        objenin tasidigi ozellikleri belirlemek icin
        Data Turunun yaninda Constructor'da etkili olur

        Bir objenin istenen ozelligi tasiyip tasimadigini
        Data Turu belirler

        O ozelligin daha guncel degerinin olup olmadigi ise
        constructor'a baglidir
        Java, Objenin ozelligi bulunduktan sonra
        constructor'in oldugu class'a kadar
        daha guncel bilgi olup olmadigini kontrol eder
        ve daha guncel bilgi bulursa onu kullanir
     */


    public static void main(String[] args) {

        C06_AvciKuslar avciKus1 = new C06_AvciKuslar();

        avciKus1.omur(); // yasar ve olur H
        avciKus1.solunum(); // akciger K
        avciKus1.cogalma(); // yumurta K
        avciKus1.kanat(); // kanatlidir K
        avciKus1.hareket(); // ucarlar AVK
        avciKus1.beslenme(); // et AVK
        avciKus1.gaga(); // sivri gagalidir AVK
        avciKus1.pence(); // pencelidir AVK


        C05_Kuslar avciKus2 = new C06_AvciKuslar();

        avciKus2.omur(); // yasar ve olur H
        avciKus2.solunum(); // akciger K
        avciKus2.cogalma(); // yumurta K
        avciKus2.kanat(); // kanatlidir K
        avciKus2.hareket(); // ucarlar AVK
        avciKus2.beslenme(); // et AVK
        avciKus2.gaga(); // sivri gagalidir AVK
        // avciKus2.pence(); // CTE

        C04_Hayvanlar avciKus3 = new C06_AvciKuslar();

        avciKus3.omur(); // yasar ve olur H
        avciKus3.solunum(); // akciger K
        avciKus3.cogalma(); // yumurta K
        // avciKus3.kanat(); // CTE
        avciKus3.hareket(); // ucarlar AVK
        avciKus3.beslenme(); // et AVK
        // avciKus3.gaga(); // CTE
        // avciKus3.pence(); // CTE

        C05_Kuslar kus1 = new C05_Kuslar();

        kus1.omur(); // yasar ve olur H
        kus1.solunum(); // akciger K
        kus1.cogalma(); // yumurta K
        kus1.kanat(); // kanatlidir K
        kus1.hareket(); // hareket ederler H
        kus1.beslenme(); // beslenirler H
        kus1.gaga(); // gagalidir K
        // kus1.pence(); // CTE




    }
}








