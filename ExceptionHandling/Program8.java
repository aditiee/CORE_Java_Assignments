public class Program8 {
    
    public static void main(String args[]) {
        System.out.println("Started");
        //String ar[] = { "12","3"};
        String ar[] = { "12" ,"0"};//--->Exception
       //String ar[] = { "12" , "a"}//;--->Exception
       //String ar[] = { "12"};//--->Exception
        try {
            
            String s1 = ar[0];
            String s2 = ar[1];
            int i = Integer.parseInt(s1);
            int j = Integer.parseInt(s2);

            int k = i / j;
            System.out.println(k);
        } //in the catch(only predefined exception classes are allowed)
        catch (ArithmeticException e) //Exception -(contains all classes) can handle  all kind  exceptions!! 
            {
            System.out.println(e);
            // Sytem.out.println("Divide by zero is not allowed!")
            }
        catch (Exception e) //Exception -(contains all classes) can handle  all kind  exceptions!! 
            {
            System.out.println(e);
            // Sytem.out.println("Divide by zero is not allowed!")
            }
          /*  catch (ArithmeticException e) //Control will never come to this block if we write it in the last
            {
            System.out.println(e);
            // Sytem.out.println("Divide by zero is not allowed!")
            }*/
        
        System.out.println("Finished");
    }
}
