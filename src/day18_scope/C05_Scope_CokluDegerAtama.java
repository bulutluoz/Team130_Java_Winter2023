package day18_scope;

public class C05_Scope_CokluDegerAtama {

    static String str;
    static int sayi;

    public static void main(String[] args) {

        System.out.println(str);

        sayi = 20;

        method1();

        str = "Java";
        System.out.println(sayi);
        sayi= 30;

        method1();
    }

    public static void method1(){

        System.out.println(sayi);

        sayi = sayi + 15;

        System.out.println(str);

    }
}
