interface MyLogicc
{
    boolean test(int num);
}
class ArrayOpe4
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
public class Demo10 {
    boolean myTest(int n){
       return n%2==0;

   }
   public static void main(String args[]) {

    int a[] = {1,2,3,4,5,6,7,8,9,10,11,13,15,15};
    ArrayOpe4.showArray(a,new Demo10()::myTest);//method reference
   }   
}

