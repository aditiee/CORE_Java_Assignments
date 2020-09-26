//finally : block will be exceuted in condition whether exception occurs or not
public class Program7 {

    public static void main(String args[]) {
        System.out.println("Started");
       // String ar[] = { "12","3"};
        String ar[] = { "12" ,"0"};//--->Exception
       //String ar[] = { "12" , "a"};//--->Exception
       //String ar[] = { "12"};//--->Exception
        try {
            
            String s1 = ar[0];
            String s2 = ar[1];
            int i = Integer.parseInt(s1);
            int j = Integer.parseInt(s2);

            int k = i / j;
            System.out.println(k);

        } 
        finally{
            System.out.println("CLOSE THE RESOURCE");
        }
        System.out.println("Finished");
    }
}
