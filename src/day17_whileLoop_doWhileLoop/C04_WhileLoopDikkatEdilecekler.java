package day17_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C04_WhileLoopDikkatEdilecekler {

    public static void main(String[] args) {

        // 1- while parantezinde kontrol ettigimiz degisken
        //    loop icerisinde degistirilmezse sonsuz loop olusur

        int sayi = 5;
        int sayac= 0;

        while (sayi <= 10){

            sayac++;
            System.out.print(sayac + " ");
            sayi++;
        }


        // 2- eger loop olusturulmadan once
        //    ihtiyac duydugumuz variable'lari biz olusturuyorsak
        //    loop'un ilk defa calismasini ve kullanicidan degerler almasini ENGELLEMEYECEK
        //    bir deger atamaya DIKKAT ETMELIYIZ


        // kullanicidan sayilar isteyin,
        // verilen sayilar pozitif oldugu muddetce
        // sayilari toplayalim ve negatif sayi girildiginde toplami yazdiralim

        sayi = 20;
        int toplam =0;
        Scanner scanner = new Scanner(System.in);

        while (sayi > 0 ){

            System.out.println("Lutfen toplanmak uzere pozitif tam sayilar girin");
            sayi = scanner.nextInt();

            if (sayi>0) toplam += sayi;
        }

        System.out.println(toplam);


        // 3- Eger loop parantezinde yazdigimiz degisken icin
        //    loop icerisinde kullanicidan deger aliyorsak
        //    aldigimiz degerin, loop'u bitirme ozelligi OLMAYAN bir deger oldugundan
        //    emin olduktan sonra islemimizi yapmaliyiz
        //    42.satirda oldugu gibi

    }
}
