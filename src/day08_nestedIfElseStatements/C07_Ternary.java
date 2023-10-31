package day08_nestedIfElseStatements;

import java.util.Scanner;

public class C07_Ternary {
    public static void main(String[] args) {

        //Soru 1- Kullanicidan bir sayi isteyin,
        //        sayiyi kontrol edip 5 ile bolunebiliyorsa “Sayi 5’in tam kati”
        //        veya “Sayi 5’in kati degil” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int sayi = scanner.nextInt();

        System.out.println( sayi%5==0 ? "Sayi 5’in tam kati" : "Sayi 5’in kati degil");
    }
}
