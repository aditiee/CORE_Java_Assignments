//array of objects : array of objects stores reference value of the objects

import java.util.*;

    class Employeee
    {
    
        private int empId;
        private String empName;
        void set(int empId, String empName)
        {
            System.out.println("this = "+this);
           this. empId = empId;
            this.empName = empName;
        }
        void show()
        {
            System.out.println(empId + " " +empName);
        }
    }
    public class Array_Of_Objects 
    {
        public static void main(String args[])
        {
           Scanner sc = new Scanner(System.in);
           Employeee ar[]=new Employeee[3];
           for(int i=0;i<ar.length;i++)
           {
               System.out.println("ENTER ID : ");
               int empId = sc.nextInt();
               System.out.println("ENTER NAME ; ");
               String empName = sc.next();
               Employeee e = new Employeee();
               e.set(empId, empName);
               ar[i]= e;
                }
                for(Employeee a : ar)
                {   
                    System.out.println("  ");
                    System.out.println("a = " +a);
                      a.show();  // a contains the reference of 1st object and so on...
                }
        }
       

    }
