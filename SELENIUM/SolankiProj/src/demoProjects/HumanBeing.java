package demoProjects;

public class HumanBeing {
	static int eyes=2;
	static int ear=3;
	
		
	public void walk()
	{
		int ear=5;
		System.out.println("Can Walk");
		System.out.println(ear);
	}
	
	public void talk()
	{
		System.out.println("Can Talk");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HumanBeing Hb=new HumanBeing();
		Hb.walk();
		Hb.talk();
		System.out.println(eyes);
		//System.out.println(ear);
		int ear=4;
		System.out.println(ear);
		
		

	}

}
