//Method Hiding - Calling at the runtime on the basis of reference type
class Foo
{
    static void m1()
    {
        System.out.println("Foo m1");
    }
}

class Bar extends Foo
{
    static void m1()
    {
        System.out.println("Bar m1");
    }
    static void m2()
    {
        m1();//bar has no m1 method then it will goes to super class and check for m1
    }

}
public class MethodHiding {
    public static void main(String args[]) {
        
      // Foo.m1();//Foo m1
      // Bar.m1();//Bar m1 in case m1 is not in the sub class then control goes to super class
        Foo f = new Bar();
        f.m1();

        Bar b = new Bar();
        b.m1();
    }
}

