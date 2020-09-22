//Constructor Chaining : Sub-Class constructor always calls the Super-class No-arg Constructor so if you want to call
// another constructor then you have to do implicitly using super() construct
class Light
{
    private int watt;

    Light()
    {
        System.out.println("No-arg Light");
    }

    Light(int watt)
    {
        System.out.println("Parameterized Light");
        
    }
}
class TubeLight extends Light
{
    private int length;

    TubeLight()
    {
        System.out.println("No-arg TubeLight");
    }
    TubeLight(int watt,int length)
    {
        System.out.println("Parameterized TubeLight");
    }
}
class Program1
{
    public static void main(String args[])
    {
        TubeLight t = new TubeLight();
        TubeLight r = new TubeLight(100,20);
    }

}