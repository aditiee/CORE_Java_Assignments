
public class MethodCall2 {
    static void m1()
    {
        System.out.println("m1");
    }
    void m2()
    {
        System.out.println("m2");
    }
    public static void  main(String args[]) {
        Foo.m1();
        new Foo().m2();//intsance method
        m1();
      //  m2(); //Error 
      new MethodCall2.m2();
    }
}
//static method can access  other static (methods amnd variables)members of same class
//static method cannot acccess the instance method or variable- in this we need object 