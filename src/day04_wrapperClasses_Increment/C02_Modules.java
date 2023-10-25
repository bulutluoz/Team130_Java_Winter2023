package day04_wrapperClasses_Increment;

import java.util.Scanner;

public class C02_Modules {

    public static void main(String[] args) {

        System.out.println( 25 % 8 ); // 1

        System.out.println( 25 / 8 ); // 3


        // 1245354423 sayisinin 8 ile bolumunden kalan kactir?

        System.out.println( 1245354423 % 8 ); // 7

        // 76256513 sayisi 113'e tam bolunur mu ?

        System.out.println(76256513 % 113 ); // 45 tam bolunmez


        // 56476586 sayisi 3'e tam bolunur mu ?

        System.out.println(56476586 % 3); // 2 tam bolunmuyor


        // kullanicidan bir sayi isteyip
        // birler basamagini yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");

        int sayi = scanner.nextInt();

        System.out.println("Girilen sayinin birler basamagi : " + (sayi % 10));

        // 375
        System.out.println(375 % 10 ); // 5  birler basamagini veriyor
        System.out.println(375 / 10 ); // 37 birler basamagi olan 5 haric, kalan sayilari verir

        System.out.println( 37 % 10 ); // 7
        System.out.println( 37 / 10 ); // 3

        System.out.println( 3 % 10 ); // 3
        System.out.println( 3 / 10 ); // 0
     }
}
