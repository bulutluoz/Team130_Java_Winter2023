package day10_stringManipulations;

public class C05_contains {

    public static void main(String[] args) {

        String str = "Java Candir";

        // Adet gozetmeksizin, bir String'de
        // aranan bir metnin var olup olmadigina bakar
        // metin varsa true, yoksa false dondurur

        System.out.println(str.contains("a")); // true
        System.out.println(str.contains("b")); // false
        System.out.println(str.contains("java")); // false (Java iceriyor)
        System.out.println(str.contains("a C")); // true

        System.out.println(str.contains(" ")); // true
        System.out.println(str.contains("")); // true
    }
}
