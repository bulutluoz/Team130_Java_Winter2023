package day07_ifElseStatements;

import java.util.Scanner;

public class C04_Bolunebilme {

    public static void main(String[] args) {

        // kullanicidan pozitif bir tam sayi alin
        // hem 3 hem de 5 ile bolunebiliyorsa "super sayi"
        // 3 ile bolunebiliyorsa "3'un kati"
        // 5 ile bolunebiliyorsa "5'in kati" yazdirin


        /*
            - Eger sartlar birbiri ile ilgili ise
            en once en secici olani yazmaliyiz

            - Eger ifade else ile bitmezse
            if else statement tum degerleri KAPSAMIYOR demektir
            yani bazi degerleri girdigimizde
            kod calisir ama hic bir sonuc uretmez
         */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int sayi = scanner.nextInt();

        if (sayi % 3 == 0 && sayi % 5 == 0 ) {
            System.out.println("super sayi");
        } else if (sayi % 3 == 0){
            System.out.println("3'un kati");
        } else if (sayi % 5 == 0) {
            System.out.println("5'in kati");
        }
    }
}
