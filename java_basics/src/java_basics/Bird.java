package java_basics;

public class Bird extends Animal{
	
	
	public Bird(String vertebrateType, double age, String sex, double height, String overallColor) {
		super(vertebrateType, age, sex, height, overallColor);
	
	}

	public void fly() {
		System.out.println("Flying in the sky!");
	}
}