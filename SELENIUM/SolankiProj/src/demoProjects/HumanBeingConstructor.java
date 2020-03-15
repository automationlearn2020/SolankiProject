package demoProjects;

public class HumanBeingConstructor {
	
	String name;
	int age;
	
	HumanBeingConstructor(String name, int age)
	{
		this.name=name;
		this.age=age;
		System.out.println(name);
		System.out.println(age);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HumanBeingConstructor Hbc=new HumanBeingConstructor("Solanki", 24);
		
		

	}

}
