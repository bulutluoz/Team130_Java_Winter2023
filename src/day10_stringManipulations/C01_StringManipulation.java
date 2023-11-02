package day10_stringManipulations;

import java.util.Locale;

public class C01_StringManipulation {

    public static void main(String[] args) {

        String str = "Java Candir";

        // str'i buyuk harflerle yazdirin
        System.out.println(str.toUpperCase()); // JAVA CANDIR

        // str'i kucuk harflerle yazdirin
        System.out.println(str.toLowerCase()); // java candir

        // String method'lari kullanildiginda orjinal metin DEGISMEZ
        // Degisikligi kalici olarak yapmak istersek ATAMA yapmaliyiz
        System.out.println(str); // Java Candir

        str = str.toUpperCase();

        System.out.println(str); // JAVA CANDIR

        // str'i kucuk harfe cevirin
        // ancak I harfi kucuk harfe cevrildiginde ingilizce i olur


        System.out.println(str.toLowerCase()); // java candir

        // eger metinde ingilizcede olmayan I'yi
        // Turkce kucuk ı'ya cevirmek istersek
        // toLowerCase(Locale....) kullanilabilir

        System.out.println(str.toLowerCase(Locale.forLanguageTag("TR"))); // java candır

        System.out.println("Ahmet Çağrı"); // Ahmet Çağrı

    }
}
