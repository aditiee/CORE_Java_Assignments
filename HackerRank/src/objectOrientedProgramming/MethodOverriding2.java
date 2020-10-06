package objectOrientedProgramming;
class Bicycle
{
	String define_Me()
	{
		return " a vehicle with pedals.";
	}
}
class MotorCycle extends Bicycle
{

	@Override
	String define_Me() {
		
		return "a cycle with an engine.";
	}
	
	MotorCycle()
	{
		System.out.println("Hello I am a motorcycle, I am " + define_Me());
		//String temp = super.define_Me();
	    System.out.println("My ancestor is a cycle who is " + super.define_Me());
		
	}
	
}
public class MethodOverriding2 {

	public static void main(String[] args) {
		MotorCycle m = new MotorCycle();
		
	}

}
