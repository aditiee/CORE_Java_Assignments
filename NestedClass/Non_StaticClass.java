//nested class are not independent
class Outer{
    int i =100;
    class Foo
    {
        void m1()
        {
            System.out.println("Non-Static Nested Class "+i);
        }
    }
}
class Non_StaticClass
{
    public static void main(String args[])
    {  
        Outer r = new Outer();//outer object
        Outer.Foo ref = r.new Foo();//inner object
        ref.m1();
    }
}