package day17_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C07_DoWhileLoop {

    public static void main(String[] args) {

        /*
            While loop'da parantez icinde kontrol edilen degiskene
            biz loop'dan once deger atiyoruz

            eger bu degiskene uygun olmayan bir deger atamasi yaparsak
            loop hic calismaz

            Java bu durumun onune gecmek icin
            yani kontrolu kullanicidan deger aldiktan sonra yapabilmemiz icin
            do-while loop olusturmustur

            do while loop kullanildiginda
            loop body'sinin calismama ihtimali yoktur
            loop body'si en az 1 kere calisir
         */

        // Bir ogretmenden not ortalamasi bulmak icin notlari alin
        // ogretmen islemi bitirmek icin negatif bir sayi girmelidir
        // Ogretmen negatif sayi girdiginde
        // toplam kac not girdigini,
        // not ortalamasinin kac oldugunu yazdirin

        Scanner scanner = new Scanner(System.in);
        double not=-5;
        double toplam = 0;
        int sayac = 0;

        /*
        while (not >= 0){

            System.out.println("ortalama hesaplamak icin notlari giriniz\nbitirmek icin negatif sayi girmelisiniz");

            not = scanner.nextDouble();

            if (not>=0){
                toplam += not;
                sayac++;
            }
        }

         */


        do {
            System.out.println("ortalama hesaplamak icin notlari giriniz\nbitirmek icin negatif sayi girmelisiniz");

            not = scanner.nextDouble();

            if (not>=0){
                toplam += not;
                sayac++;
            }
        }while (not >= 0);

        System.out.println("toplam girilen not sayisi : " + sayac +
                "\ngirilen notlarin ortalamasi : " + toplam/sayac);





    }
}
