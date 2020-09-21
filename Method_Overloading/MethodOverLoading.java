class MathOpe{
    static void sum(int i,int j)
    {
        int k = i+j;
        System.out.println(k);

    }
    static void sum(int i,int j,int n)

    {
        int k = i+j+n;
        System.out.println(k);
        
    }
}




public class MethodOverLoading {
    public static void main(String args[])
    {
        MathOpe.sum(12,13);
        MathOpe.sum(12, 13,14);
    }
}
