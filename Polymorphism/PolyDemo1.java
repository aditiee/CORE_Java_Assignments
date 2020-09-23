//Compile Time Polymorphism - Method Overloading -Early Binding-Static binding
//which method is that decison is taken on the basis of parameter and argument match 
class Foo
{
    void m1()
    {
        System.out.println("Foo m1");
    }

    void m1(int i)
    {
        System.out.println("Foo M1");
    }
}

class PolyDemo1
{
    public static void main(String args[])
    {
        
        Foo f = new Foo();
        f.m1();
        f.m1(123);
    }
}