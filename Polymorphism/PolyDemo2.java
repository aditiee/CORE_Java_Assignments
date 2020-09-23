//Run-time Polymorphism - method overriding-late binding-dynamic binding

class Foo
{
    void m1()
    {
        System.out.println("Foo m1");
    }
}

class Bar extends Foo
{
    void m1()
    {
        System.out.println("Bar m1");
    }
}

public class PolyDemo2 {
    public static void main(String args[]) {
        //Foo f = new Foo();//Foo m1
        Bar f =  new Bar();//Bar m1
        f.m1();
    }
}
