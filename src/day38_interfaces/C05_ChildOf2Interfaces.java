package day38_interfaces;

public class C05_ChildOf2Interfaces implements I04_ChildInterface2,I05_ChildInterface3{
    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    @Override
    public String method3() {
        return null;
    }

    @Override
    public void method4() {

    }

    @Override
    public String method5() {
        return null;
    }

    @Override
    public int method7() {
        return 0;
    }

    @Override
    public String method9() {
        return null;
    }

    @Override
    public char method8() {
        return 0;
    }

    // 1,2,3 parent'dan
   // 4,7,9 I05'den
   // 4,5,7,8 I04'den

    public static void main(String[] args) {

        System.out.println(I04_ChildInterface2.SAYI);
        System.out.println(I05_ChildInterface3.S);
        System.out.println(ILK_HARF);

    }

}


















