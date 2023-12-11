package day36_overridding;

public class C05_Child extends C04_Parent{

    public void method1(int sayi){
        // child class'da parent class'dan bir method'u
        // override etmek istersek
        // signature'i parent class'daki method ile ayni olan
        // bir method olusturmaliyiz
        // eger signature farkli olursa,
        // ismin ayni olmasi overridding icin yeterli degildir
    }

    public void method2(){

    }

    @Override
    public void method3() {
        // overridding method olusturmak icin
        // @Override notasyonu kullanmak zorunlu degildir
        // ama override method'u intelliJ'e olusturtursak
        // intelliJ otomatik olarak notasyonu koyar
        // @Override notasyonu parent class'daki
        // overridden method'u takip eder
        // silinir veya signature'i degistirilirse
        // CTE verir
        // Notasyon kullanilmayan method'larda
        // parent class'daki method kontrol edilmez
        // silinmesi veya degistirilmasi durumunda
        // overridding ozelligi biter ama kod calismaya devam eder
    }

    public static void method4(){
        // static olarak isaretlenen method'lar override edilemez
        // child class'da ayni signature'a sahip method olusturabilirsiniz
        // ama bu ikisi override iliskisi olusturmaz
        // bagimsiz iki method olurlar

        // parent class'da static olarak isaretlenen bir method'u
        // child class'da ayni signature ile static keyword
        // kullanmadan OLUSTURAMAZSINIZ,
        // static yapmadan olusturmak isterseniz CTE verir
    }

    /* public final String method5(){
        // bir method'u final olarak isaretlerseniz
        // o method override EDILEMEZ

        return null;
    } */

    private void method6(){
        // private bir method'u override edemezsiniz
        // child class'da ayni signature'a sahip
        // method olustursaniz da
        // bu overridding method olmaz
    }

    protected void method7(){
        // HER NE KADAR signature'a dahil olmasa da
        // overridding'de access modifier da onemlidir
        // parent class'daki method7'nin
        // access modifier'i default oldugundan
        // child class'daki method7
        // default, protected veya public olabilir
        // private olamaz
    }

    protected void method8(){
       // parent class'daki method8'in
       // access modifier'i protected oldugundan
       // child class'daki method 8
       // protected veya public olabilir
       // amma default access modifier veya private OLAMAZ

    }

    public void method9(){
        // Overridden method'un return type'i
        // void veya primitive ise
        // Overridding method'un return type'i da ayni OLMALIDIR

    }

    public String method10(){
        // eger overridden method'un return type'i
        // non-primitive ise
        // overridding method'un return type'i
        // YA aynisi olacak
        // YA DA parent class'in return type'i ile
        // IS-A reletionship olan bir data turu olacak
        return null;
    }







}










