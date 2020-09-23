
public class MethodCall4 {
   int i =100;
   static int j=200;
   void m3()
   {
       System.out.println(i);
       System.out.println(j);
   }
    public static void  main(String args[]) {
        
       //System.out.println(i);
       
       System.out.println(new MethodCall4().i);
    
        System.out.println(j);
    }
}
//static method can access  other static (methods amnd variables)members of same class
//static method cannot acccess the instance method or variable- in this we need object 
