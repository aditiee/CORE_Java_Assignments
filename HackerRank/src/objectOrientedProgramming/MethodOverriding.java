package objectOrientedProgramming;

class Sports
{
	String getName()
	{
		return "Generic game";
		
	}
	
	void getNumberOfTeamPlayers()
	{
		System.out.println("Each Team has n players " + getName());
	}
}

class Soccer extends Sports
{

	@Override
	String getName() {
		
		return "Soccer Game";
	}

	@Override
	void getNumberOfTeamPlayers() {
		System.out.println("Each Team has 11 players " + getName());
		
	}
	
}
public class MethodOverriding {

	public static void main(String[] args) {
		Sports s1 = new Sports();
		Soccer s2 = new Soccer();
		System.out.println(s1.getName());
		s1.getNumberOfTeamPlayers();
		System.out.println(s2.getName());
		s2.getNumberOfTeamPlayers();
	

	}

}
