package day38_interfaces;

public interface I01_Interface {

    /*
        Interface'ler class degildir
        KURAL 1 : Interface'ler full abstraction saglar

        KURAL 2 : bir interface icinde olusturulan method'lar icin
                  public veya abstract keyword'lerini yazmak redundant'dir
                  yani yazsak da yazmasak da bu ozellikleri tasiyacagindan
                  yazmak GEREKSIZ olur

       KURAL 3 :  bir interface icinde olusturulan variable'lar icin
                  public,static veya final keyword'lerini yazmak redundant'dir

       KURAL 4 : bir class birden fazla class'i inherit EDEMEZ
                 ama birden fazla interface'i IMPLEMENT edebilir
                 Hatta bir class bir class'a extends edip, bunun yaninda
                 birden fazla interface'e de implement edebilir

       KURAL 5 :  class ==> class  inherit icin  extends
                  class ==> interface  inherit icin implements
                  interface ==> interface inherit icin extends
                  interface ==> class'a inherit OLMAZ

       KURAL 6 :  Bir class birden fazla interface'i inherit ettiginde
                  - parent interface'lerde ayni isimde variable varsa
                    secim yapmamizi ister, interfaceIsmi.VariableIsmi seklinde kullandirir
                  - parent interface'lerde ayni isimde METHOD varsa
                     * eger return type'lari ayni ise
                       hangisinden aldigi onemli olmaz
                       o method'u override ederiz
                     * eger return type'lari FARKLI ise
                       overridding method hangi return type'i secse
                       diger interface itiraz eder
                       bu durumda 2 interface'den birine implement edebilir
                       otekini birakiriz


     */

    public abstract void method1();
    // Modifier 'abstract' is redundant for interface methods
    // Modifier 'public' is redundant for interface members

    public void method2();
    abstract void method3();

    void method4();

    public static final int SAYI = 20;
    // Modifier 'public' is redundant for interface members
    // Modifier 'static' is redundant for interface fields
    // Modifier 'final' is redundant for interface fields

    public String STR = "Java";
    final boolean GUZEL_MI = true;
    char ILK_HARF = 'H';


}
