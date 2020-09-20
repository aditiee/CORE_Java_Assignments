
class Student3{
    private int rollno;
    private String name;
    public static int count = 0;
    
    void setData(int rollno , String name) {
        this.rollno = rollno;
        this.name=name;
        count++;
    }
    
    void showData() {
         System.out.println("StudentCount Id :  "+count);
        System.out.println("RollNo: " + rollno +"  Students's Name :" + name);
       
    }
    
}
public class Student {

   public static void main(String[] args) {

       Student3 s1 = new Student3();
       s1.setData(100, "Rakhi Kumari");
       s1.showData();
       
       Student3 s2 = new Student3();
       s2.setData(200, "Kiran Bobade");
       s2.showData();
       
       Student3 s3 = new Student3();
       s3.setData(300, "Kalyani ingole");
       s3.showData();

   }

}
