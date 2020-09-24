interface Talk
{
    void sayHello(String name);
   
}
class TalkImple implements Talk
{
    public void sayHello(String name)
    {
        System.out.println("Welcome !! " + name);
    }
}

public class AnonymousClass {
    static void takeAction(Talk ref)
    {
        ref.sayHello("Ram");
    }
    public static void main(String args[]) {
       //create the referenec variable
       Talk t = new TalkImple();
       AnonymousClass.takeAction(t);
    }
}
