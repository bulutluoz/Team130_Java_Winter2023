package day06_ifElseStatements;

import java.util.Scanner;

public class C06_IfStatements {

    public static void main(String[] args) {

        // Soru 4- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        //         ucgen eskenar ise “Eskenar ucgen” yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen ucgenin kenar uzunluklarini giriniz");

        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();
        double kenar3 = scanner.nextDouble();


        if (kenar1 == kenar2 && kenar1 == kenar3 && kenar1 > 0){
            System.out.println("Girilen degerler eskenar ucgen olusturur");
        }
    }
}
