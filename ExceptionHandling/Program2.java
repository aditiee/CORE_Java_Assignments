public class Program2 {

    public static void main(String args[])
    {
        System.out.println("Started");
        String s1 = "12";
        String s2 = "0";
        int i = Integer.parseInt(s1);
        int j = Integer.parseInt(s2);
        try{
        int k = i/j;
        System.out.println(k);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
            //Sytem.out.println("Divide by zero is not allowed!")

        }
        System.out.println("Finished");
    }
}

