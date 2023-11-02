package day10_stringManipulations;

import java.util.Scanner;

public class C07_EmailKontrol {

    public static void main(String[] args) {

        // Kullanicidan email isteyin
        // eger @ isareti icermiyorsa "Yanlis giris"
        // eger @gmail.com icermiyorsa "girilen mail, gmail olmali"
        // email @gmail.com ile bitmiyorsa "gecersiz mail"
        // email bosluk iceriyorsa "Yazim hatasi" yazdirin
        // eger hata yoksa "mailiniz kaydedildi" yazdirin


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen email adresinizi giriniz");
        String email = scanner.nextLine();

        if (!email.contains("@")){
            System.out.println("Yanlis giris");
        } else if (!email.contains("@gmail.com")) {
            System.out.println("girilen mail, gmail olmali");
        } else if (!email.endsWith("@gmail.com")) {
            System.out.println("gecersiz mail");
        } else if (email.contains(" ")) {
            System.out.println("Yazim hatasi");
        }else{
            System.out.println("mailiniz kaydedildi");
        }


    }
}
