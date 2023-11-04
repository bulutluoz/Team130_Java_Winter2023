package day11_stringManipulation;

public class C05_nullPointer {

    public static void main(String[] args) {

        String str;

        // System.out.println(str);
        // bir variable'i deger atamadan olusturabilirsiniz
        // ama deger atamadan kullanamazsiniz

        String str2 = "";
        System.out.println("Str2'in degeri :" + str2 + "====");
        System.out.println("Str2'nin uzunlugu : " + str2.length()); // 0

        // str2'ye "" atayabiliriz,
        // ama bu durumda Java bu variable'a bir deger atandigini kabul eder
        // deger atanmamis elementleri say dedigimizde
        // "" degeri atananlari dolu kabul eder
        // baska data turlerinde hiclik atama sansi da olmaz


        // null pointer Java tarafindan ozel bir gorev ile olusturulmustur
        // bir variable'in deger atanmamis oldugunu isaretler
        // null bir deger degil isaretcidir

        String str3 = null ;
        System.out.println(str3); // null

        // null primitive variable'lara yazilamaz
        // sadece non-primitive'lere yazilir

        System.out.println(str3 + "Java"); // nullJava

        // null olarak isaretlenen variable'lar SADECE yazirilabilir
        // deger atamadan baska islem yapmak isterseniz
        // NullPointerException verir

        System.out.println(str3.length()); // NullPointerException
        System.out.println(str3.concat("Java")); // NullPointerException


    }
}
