package day18_scope;

public class C03_Scope_ClassVariableKullanim {
    /*
        Kural 4 - static variable'lar her yere gidebilirler
                  static olmayan variable (instance variable)'lar ise
                  static alanlara giremezler

        Kural 5 - class level variable'lar deger atanmadan olusturulabildigi gibi
                  deger atanmadan kullanilabilirler
                  biz deger atamazsak, Java default deger olarak
                  - non-primitive'lere ==> null
                  - sayisal primitive'lere ==> 0
                  - boolean variable'lara ==> false
                  - char variable'lara ==> hiclik degeri atar
     */

    static String s;
    static int a;
    boolean bl;
    char chr;

    public static void main(String[] args) {

        System.out.println(s); // null

        System.out.println(a); // 0

        // Eger static olmayan class uyelerine static alandan ulasmak istersek
        // once class'dan bir obje olusturmali
        // sonra o obje uzerinden static olmayan uyeler kullanilmalidir
        C03_Scope_ClassVariableKullanim obj = new C03_Scope_ClassVariableKullanim();

        System.out.println(obj.bl); // false
        System.out.println(obj.chr); // hiclik ''
    }


    public static void method1(){
        System.out.println("static method calisti");
    }


    public void method2(){
        System.out.println("static olmayan method calisti");
    }
}
