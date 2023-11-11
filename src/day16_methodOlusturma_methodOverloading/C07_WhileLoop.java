package day16_methodOlusturma_methodOverloading;

public class C07_WhileLoop {

    public static void main(String[] args) {

        // 1'den 20'ye kadar (sinirlar dahil) olan tam sayilari toplayin

        int toplam = 0;

        for (int i = 1; i <=20 ; i++) {

            toplam += i;
        }

        System.out.println(toplam); // 210

        // While loop olusturulurken
        // baslangic degeri, bitis sarti ve artis seklini otomatik olusturmaz
        // bunlari bizim manuel olarak yapmamiz gerekir

        // Eger for loop ile yapilabilen bir soru varsa
        // for loop tercih edilir

        toplam = 0;
        int baslangic=1;

        while (baslangic <=20){

            toplam += baslangic;
            baslangic++;
        }

        System.out.println(toplam); // 210

        // Eger tekrar sayisi belli degilse
        // for loop yerine while loop kullanmayi tercih ederiz
    }
}
