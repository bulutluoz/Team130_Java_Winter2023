package day07_ifElseStatements;

import java.util.Scanner;

public class C02_IfElseStatements {
    public static void main(String[] args) {

        // Soru 5- Kullanicidan bir harf isteyin,
        //         girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        //         yoksa girilen karakteri girildigi gibi yazdirin


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");

        char girilenHarf = scanner.next().charAt(0);

        // 1.yontem

        if (Character.isLowerCase(girilenHarf)){

            System.out.println(Character.toUpperCase(girilenHarf));
        }else {
            System.out.println(girilenHarf);
        }

        // 2.yontem

        if (girilenHarf >= 'a' && girilenHarf<='z'){
            System.out.println(  (char)(girilenHarf-32)  );
        }else {
            System.out.println(girilenHarf);
        }

    }
}
