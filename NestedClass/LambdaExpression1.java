//FUNCTIONAL INTERFACE
interface MyLogic
{
    boolean test(int num);
}
class ArrayOpe2
{
    static void showArray(int ar[], MyLogic ref)
    {
        for(int a : ar)
        {
            if(ref.test(a))
            {
            System.out.print(" " + a);
            }

        }
        System.out.println("");
    }
}
public class LambdaExpression1 {
   
   public static void main(String args[]) {

    int a[] = {1,2,3,4,5,6,7,8,9,10,11,13,15,15};
    ArrayOpe2.showArray(a,(int n)->{return true;});
    ArrayOpe2.showArray(a,(int n)->{return n%2==0;});
    ArrayOpe2.showArray(a,(int n)->{return n%2!=0;});
    ArrayOpe2.showArray(a, (int n)->
    {
        if(n==1)
        return false;
        for(int i = 2 ;i<=n/2;i++)
        {
            if(n%i == 0)
            
                return false;
        }
            return true;
        
    });
   }   
}

