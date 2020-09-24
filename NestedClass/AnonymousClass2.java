interface Talk
{
    void sayHello(String name);
}
public class AnonymousClass2 {
    static void takeAction(Talk ref)
    {
        ref.sayHello("Ram");
    }
   public static void main(String args[]) {
       Talk t = new Talk()
       {
           public void sayHello(String name)
           {
               System.out.println("Hello " + name);
           }
       };
       takeAction(t);
   } 
}
