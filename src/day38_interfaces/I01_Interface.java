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
