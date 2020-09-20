//31.Create a class Student with 2 data members rno and name. Create one method setData() that takes roll number
//and student name as parameter and stores them in data members rno and name. Create one more method showData() 
//to print the data member values. Create another class ( main class) StudentDemo that creates Student class 
//object and calls setData() and showData() methods


class Students
{
   public int rollno;
   public String name;

   void setData(int rollno , String name)
   {
       this.rollno = rollno;
       this.name = name;
   }

   void showData()
   {
       System.out.println("Student RollNo :" + rollno);
       System.out.println("Student Name :" + name);
       


   }

}

public class StudentDemo {
            public static void main(String args[])
            {
                Students s = new Students();
                s.setData(001, "Aditi Gudadhe");
                s.showData();

                s.setData(002, "Drushti Sonarkar");
                s.showData();

                s.setData(003, "Raj Thakur");
                s.showData();
                
                s.setData(004, "Akash Gorle");
                s.showData();

            }


}
