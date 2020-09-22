
class Light
{
    private int watt;

    Light()
    {
        System.out.println("NO-arg Light");

    }
    Light(int watt)
    {
        System.out.println("Parameterized Light");
    }
}

class TubeLight extends Light
{
    private int length;
    TubeLight(int watt,int length)
    {
        super(watt);
        System.out.println("Parameterized TubeLight " + watt + " " + length);
    }
}
public class Program2 {
    public static void main(String args[])
    {
        TubeLight t = new TubeLight(100,20);
    }   
}
