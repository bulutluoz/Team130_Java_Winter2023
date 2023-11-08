package day14_forLoop_nestedForLoop;

import java.util.Scanner;

public class C04_MetniTerseCevirme {

    public static void main(String[] args) {

        // Soru 10 (interview)- Kullanicidan bir String isteyin ve String’i tersine cevirip kaydedin.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz");
        String metin = scanner.nextLine(); // Java Candir

        String tersMetin="";


        for (int i = metin.length()-1 ; i >=0  ; i--) {

            tersMetin += metin.charAt(i);
        }

        //System.out.println(tersMetin);

        // kullanicinin girdigi metnin palindrome olup olmadigini yazdirin

        if (metin.equalsIgnoreCase(tersMetin)){
            System.out.println("Girilen metin palindrome");
        }else{
            System.out.println("Girilen metin palindrome degil");
        }
    }
}
