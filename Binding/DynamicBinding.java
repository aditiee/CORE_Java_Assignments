//Dynamic binding is a binding which happens during run time. It is also called late binding because binding happens when
//  aprogram actually is running.


class AA
{
    void method()
    {
        System.out.println("METHOD CALLED FROM CLASS A");
    }

}

class BB extends AA
{
    void method()
    {
         System.out.println("METHOD CALLED FROM CLASS B");
    }
}


public class DynamicBinding {
    public static void main(String args[])
    {
            AA a1 = new AA();
            a1.method();
            AA a2 = new BB();
            a2.method();
    }
}
