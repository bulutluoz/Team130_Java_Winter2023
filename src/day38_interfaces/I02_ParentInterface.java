package day38_interfaces;

public interface I02_ParentInterface {

    void method1();

    void method2();

    public abstract String method3();

    public default void method20(){

    }

    public static void method21(){


    }


    /*

        Java8 ile birlikte, developer'lardan gelen talepler dogrultusunda
        Java Interface'ler icin bir istisna olusturmus

        Talep : Interface'e sonradan bir method eklememiz gerekirse
                onceden bu interface'i inherit eden
                tum class'lar kizariyor
                sonradan ekledigimiz bu method'u MECBURI OLMAKTAN kurtar

        Interface'lere sonradan eklenen method'lari
        IMPLEMENT etmenin mecbur olmamasi icin
        bu method'larin body'si OLMALIDIR.
        Interface'de body'si olan method olusturabilmemiz icin
        Java bildigimiz 2 keyword'u ozel kullanim icin yetkilendirmis
        bu iki kelime  :
            - default
            - static
        iki keyword'un kullanimdaki farki bu method'lara erisim yontemi ile ilgilidir

        - static keyword ile olusturulan method'a static yontemle
          yani interfaceIsmi.staticMethodismi() ile ulasabiliriz
        - default keyword ile olusturulan method'a ise
          obje olusturup, obje uzerinden ulasabiliriz


     */
}
