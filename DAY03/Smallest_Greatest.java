//27.	Write a program to fine the smallest and greatest number present in the array of integer type.
import java.util.*;
public class Smallest_Greatest {
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Number of Elements : ");
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i = 0 ; i < a.length;i++) {
                a[i] = sc.nextInt();
            }
                int smallest = a[0];
                int biggest = a[0];
                for(int i=1; i< a.length; i++)
                        {
                                if(a[i] > biggest)
                                        biggest = a[i];
                                else if (a[i] < smallest)
                                        smallest = a[i];
                               
                        }
                       
                        System.out.println("Largest Number is : " + biggest);
                        System.out.println("Smallest Number is : " + smallest);
                        sc.close();
                }
        }