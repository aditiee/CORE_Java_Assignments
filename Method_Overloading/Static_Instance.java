//Static member : belongs to class [can be accessed using class name] without creating the object of class
//Instance member : belongs to object [ need object to access the instance member]

class ClassMethod {
    static int sum(int i, int j) {
        return i + j;
        //System.out.println(i + j);
    }

    static void show(int result) {
        System.out.println(result);
    }

}

public class Static_Instance {
    public static void main(String args[]) {
       // ClassMethod.sum(12, 13);
       int s = ClassMethod.sum(12, 13); //ClassMethod is called by using class name
        ClassMethod.show(s);
    }
}
