package day37_AbstractClasses;

public class C08_ChildOfC07 extends C07_AbstractParent{


    @Override
    public String method2() {

        return "child method2";
    }

    @Override
    public int method3() {

        return 0;
    }

    @Override
    public void method6() {
        System.out.println("child method6");
    }

    @Override
    public void method7() {
        System.out.println("child method7");
    }

    public static void main(String[] args) {

        C08_ChildOfC07 child1 = new C08_ChildOfC07();

        C07_AbstractParent child2 = new C08_ChildOfC07();

        C06_AbstractGP child3 = new C08_ChildOfC07();
    }
}
