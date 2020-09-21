





class MathOpe2{
    static void sum(int i,int j)
    {
        int k = i+j;
        System.out.println(k);

    }
    static void sum(float i,float j)

    {
        float k = i+j;
        System.out.println(k);
        
    }
}




 class MethodOverLoading2 {
    public static void main(String args[])
    {
        MathOpe2.sum(12,13);
        MathOpe2.sum(12.5f, 13.5f);
    }
}
