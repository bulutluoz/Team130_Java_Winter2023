package day16_methodOlusturma_methodOverloading;

public class C06_MethodOverloading {

    public static void main(String[] args) {
        /*
            Java bir class'da ayni isimde birden fazla method olmasina izin verir
            ANCAK SIGNATURE'lari farkli olmak ZORUNDADIR

            Signature => method ismi + parametre data turleri demektir

            Eger ayni isimde birden fazla method varsa
            1- java oncelikle argument ve parametreler arasinda %100 uyum olan var mi diye kontrol eder
            2- Eger %100 uyum yoksa casting ile kullanilabilecek var mi diye tumunu kontrol eder
               Birden fazla method casting ile calisabilir durumda olursa
               en az casting olani kabul eder
         */

        topla(6); // 1

        topla(3,5); // 2 topla int int

        topla(6.3,5); // 3 topla double int

        topla(2.4F,5);// 4 topla float int

        topla(2.3,3.4); // 5 topla double double ==> double double : 5.699999999999999

        topla('a',5); // topla char int  ==> int int : 102

        topla(2.3f,3.5f); // topla float float ==> double double : 5.799999952316284

        topla(4,5.2); // topla int double ==> double double : 9.2



    }

    public static void topla(int sayi){ // topla int

        System.out.println("Tek integer : " + (sayi + sayi));

    }//1  topla int

    public static void topla(int a, int b){ // topla int int

        System.out.println("int int : " + (a+b));
    }//2  topla int int

    public static void topla(double c, int d){ // topla double int

        System.out.println("double int : " + (c+d));
    }//3 topla double int

    public static void topla(float c, int d){ // topla float int

        System.out.println("float int : " + (c+d));
    }//4 topla float int

    public static void topla(double c, double d){ // topla double double

        System.out.println("double double : " + (c+d));
    }//5 topla double double
}
