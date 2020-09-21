class MathOpe3{
    static void sum(int i,float j)
    {
        float k = i+j;
        System.out.println(k);

    }
    static void sum(float i,int j)

    {
        float k = i+j;
        System.out.println(k);
        
    }
}




class MethodOverLoading3 {
    public static void main(String args[])
    {
        MathOpe3.sum(12,13.5f);
        MathOpe3.sum(12.5f, 13);
    }
}
