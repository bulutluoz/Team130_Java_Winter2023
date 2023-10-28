package day06_ifElseStatements;

import java.util.Scanner;

public class C03_IfStatements {

    public static void main(String[] args) {

        //Soru 1- Kullanicidan bir sayi isteyin,
        //        sayiyi kontrol edip 5 ile bolunebiliyorsa
        //        “Sayi 5’in tam kati” yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir tamsayi giriniz");

        int sayi = scanner.nextInt();

        if ( sayi % 5 == 0){
            System.out.println("sayi 5'in kati");
        }

    }
}
