package day37_AbstractClasses;

public abstract class C03_KuralciParent {

    public abstract void method1();
    // Abstract methods cannot have a body
    // bunlara bir method olarak degil,
    // resmi gazetede yazan bir standart olarak dusunun

    public abstract String method2();

    public void method3(){

    }

    public int method4(){
        return 0;
    }

    /*
        Eger bir class'in child class'lar uzerinde
        kural koyucu olmasini istiyorsaniz
        Java iki alternatif sunar
        1- abstract classes
        2- interfaces

        Bir class'i abstract class yapmak icin
        class deklarasyonuna abstract yazmaniz yeterlidir

        Abstract class kismi abstraction saglar
        YANNNNIII icinde child class'larin
         - MUTLAKA OVERRIDE etmesi gereken method'lar olacagi gibi
           (abstract method olarak olusturmaliyiz)

         - override etmenin mecbur olmadigi,
           child class'in insiyatifine birakildigi method'lar da olabilir
           (simdiye kadar olusturdugumuz method'lar gibi olusturmaliyiz)

     */

}
