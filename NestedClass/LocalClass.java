class Outer {
    void m1() {
        class Inner {
            void m2() {
                System.out.println("Local class!");
            }
        }
        Inner i = new Inner();
        i.m2();
    }

}

public class LocalClass {
    public static void main(String args[]) {
        Outer o = new Outer();
        o.m1();
        

    }
}
