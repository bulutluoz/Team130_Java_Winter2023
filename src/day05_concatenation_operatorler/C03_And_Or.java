package day05_concatenation_operatorler;

import java.util.Scanner;

public class C03_And_Or {

    public static void main(String[] args) {

        // kullanicidan not isteyin
        // girilen not 0 ile 100 arasinda ise true, yoksa false yazdiralim
        // 0 ve 100 dahil true

        Scanner scanner = new Scanner(System.in) ;

        System.out.println("Lutfen notunuzu giriniz");

        int not = scanner.nextInt();


        System.out.println(not >= 0 && not <= 100);


        // not 50'den kucukse veya 80'den buyukse true
        // arasinda ise false yazdirin

        System.out.println(not < 50  || not > 80);   // istenen durum

        // once istenmeyen durumu yazalim
        // sonra basina ! koyalim
        System.out.println(   ! (not >= 50 && not <=80)   ); //  ! istenmeyen durum


    }
}
