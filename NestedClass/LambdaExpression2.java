//FUNCTIONAL INTERFACE
interface MyLogicc
{
    boolean test(int num);
}
class ArrayOpe3
{
    static void showArray(int ar[], MyLogicc ref)
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
public class LambdaExpression2 {
   
   public static void main(String args[]) {

    int a[] = {1,2,3,4,5,6,7,8,9,10,11,13,15,15};
    ArrayOpe3.showArray(a,(int n)->{return true;});
    ArrayOpe3.showArray(a,(n)->{return n%2==0;});
    ArrayOpe3.showArray(a,(n)-> n%2!=0);
    ArrayOpe3.showArray(a,n->n%2!=0);
   }   
}

