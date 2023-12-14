package day39_exceptions;

import java.util.Scanner;

public class C01_AritmetikException {

    public static void main(String[] args) {

        // kullanicidan 2 tamsayi isteyin
        // birinci sayiyi ikinci sayiya bolup
        // sonucun tamsayi kismini yazdirin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bolunecek tamsayiyi girin");

        int sayi1 = scanner.nextInt();

        System.out.println("Lutfen bolecek tamsayiyi girin");

        int sayi2 = scanner.nextInt();

        if (sayi2 == 0){
            System.out.println("bolecek sayi 0 olamaz");
        }else{
            System.out.println("ilk sayi / ikinci sayi = " + sayi1/sayi2);
        }


    }
}
