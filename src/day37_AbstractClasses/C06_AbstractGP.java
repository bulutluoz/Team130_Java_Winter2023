package day37_AbstractClasses;

public abstract class C06_AbstractGP {

    public abstract void method1();

    public abstract String method2();

    public abstract int method3();

    public void method4(){
        System.out.println("GP method4");
    }

    public void method5(){
        System.out.println("GP method 5");
    }

    public static void main(String[] args) {

        //  C06_AbstractGP objGp = new C06_AbstractGP();
        // 'C06_AbstractGP' is abstract; cannot be instantiated
        //  objGp.method1();
    }

}
