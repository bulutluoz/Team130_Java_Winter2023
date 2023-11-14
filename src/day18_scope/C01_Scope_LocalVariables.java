package day18_scope;

public class C01_Scope_LocalVariables {

    public static void main(String[] args) {

        // Kural 1 - Bir method icerisinde olusturulan variable'lara
        //          local variable denir
        //          local variable'lar sadece olusturulduklari method'da kullanilabilir
        //          diger method'larda KULLANILAMAZ

        String str = "Java Candir";
        // System.out.println(sayi);

        int a;
        boolean bl;
        char c;

        // System.out.println(a);

        // a++;

        bl = true;
        c = 'a';

        // Kural 2 - Local variable'lar deger atanmadan olusturulabilir
        //           AMMA deger atamadan kullanilamazlar


        for (int i = 0; i <10 ; i++) {

            System.out.print(i); // 0123456789
            String s = "Java";
        }

         //System.out.println(s); //
        // System.out.println(i); //

        // Kural 3 - Her ne kadar bir method'un icinde olsa da
        //          Loop'lar da ayri bir local alandir
        //          Loop icerisinde olusturulan variable'lar
        //          Loop disinda KULLANILAMAZ

    }


    public static void method1(){

        // System.out.println(str); //

        int sayi = 10;
    }
}
