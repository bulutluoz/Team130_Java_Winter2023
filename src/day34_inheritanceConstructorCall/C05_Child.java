package day34_inheritanceConstructorCall;

public class C05_Child extends C04_Parent {

    String str = "Java daha guzeldir";
    String t = "Java java java";
    int sayi = 15;
    int b = 25;

    public static void main(String[] args) {

        C05_Child obj = new C05_Child();
        obj.method1();
    }

    public void method1(){
        /*
            Herhangi bir scope'da bir variable kullanmak istediginizde
            o variable'in degerini bulmak icin
            java
                - once icinde bulundugu scope
                - scope'da bulamazsa class level'a
                - class'da bulamazsa parent'a
                - parent'da bulamazsa grand parent'lara bakar
            ve ilk buldugu degeri kullanir.

            EGER this.variable dersek
            bu durumda arama islemini yaparken
            icinde bulundugumuz scope'u atlayip
            aramaya class level'dan baslar

            EGER super.variable dersek
            scope ve class level'i atlayip
            aramaya parent class'dan baslar.

            ONEMLI NOT : aramaya baslayacagi yeri java'ya soyleyince
                         Java soyledigimiz yerden baslar ve yukarda yazilan siralama ile
                         aramaya devam eder
                         eger aradigi variable'i
                         aradigi basamaklarda bulamazsa CTE verir.

         */
        String t = "Hava cok guzel";
        int a = 27;
        int b = 37;
        String str = "Her sey guzel olacak";

        System.out.println(s); // Java candir
        System.out.println(this.s); // Java candir
        System.out.println(super.s); // Java candir

        System.out.println(sayi); // 15
        System.out.println(this.sayi); // 15
        System.out.println(super.sayi); // 20

        System.out.println(t); // Hava cok guzel
        System.out.println(this.t); // Java java java
        // System.out.println(super.t); // CTE

        System.out.println(b); // 37
        System.out.println(this.b); // 25
        // System.out.println(super.b); // CTE

        System.out.println(str); // Her sey guzel olacak
        System.out.println(this.str); // Java daha guzeldir
        System.out.println(super.str); // Java guzeldir

        System.out.println(a); // 27
        System.out.println(this.a); // 30
        System.out.println(super.a); // 30

    }

}
