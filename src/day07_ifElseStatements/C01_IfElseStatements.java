package day07_ifElseStatements;

import java.util.Scanner;

public class C01_IfElseStatements {

    public static void main(String[] args) {

        // Soru 4- Kullanicidan bir karakter girmesini isteyin,
        //         girilen karakterin buyuk harf olup olmadigini yazdirin.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");

        char karakter = scanner.next().charAt(0);

        if (karakter >= 'A'  && karakter<='Z'){
            System.out.println("Girilen karakter buyuk harf");
        }else {
            System.out.println("Girilen karakter buyuk harf degil");
        }
    }
}
