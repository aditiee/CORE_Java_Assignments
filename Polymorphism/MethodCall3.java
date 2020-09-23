
public class MethodCall3 {
    static void m1()
    {
        System.out.println("m1");
    }
    void m2()
    {
        System.out.println("m2");
    }
   static void m3()
    {
        m1();
        m2();
    }
    public static void  main(String args[]) {
       new MethodCall3.m3();
    }
}
//static method cannot access the non-static method directlty
//static method can access  other static (methods amnd variables)members of same class
//static method cannot acccess the instance method or variable- in this we need object 
//instance can access th 
//non-static  method can access static and instance method 