//Static binding is a binding which happens during compilation. It is also called early binding because binding happens 
//before a program actually runs.
class A
{
    void method()
    {
        System.out.println("METHOD CALLED FROM CLASS A");
    }
}

class B extends A
{
    @Override
    void method()
    {
        System.out.println("METHOD CALLED FROM CLASS B");
    }
}

public class StaticBinding
{
    public static void main(String args[])
    {
        A a1 = new A();
        a1.method();
        A a2 = new B();
        a2.method();
    }
}