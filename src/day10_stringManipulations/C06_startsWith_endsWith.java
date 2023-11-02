package day10_stringManipulations;

public class C06_startsWith_endsWith {
    public static void main(String[] args) {

        String str = "Java Candir";

        System.out.println(str.startsWith("J")); // true
        System.out.println(str.startsWith("Ja")); // true
        System.out.println(str.startsWith("Java")); // true
        System.out.println(str.startsWith("Java Candir")); // true
        System.out.println(str.startsWith("")); // true


        System.out.println(str.endsWith("r")); // true
        System.out.println(str.endsWith("dir")); // true
        System.out.println(str.endsWith("Candir")); // true
        System.out.println(str.endsWith("Java Candir")); // true
        System.out.println(str.endsWith("")); // true

    }
}
