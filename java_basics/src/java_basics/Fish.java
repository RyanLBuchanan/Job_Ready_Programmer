package java_basics;

public class Fish extends Animal{
	
	public Fish(String vertebrateType, double age, String sex, double height, String overallColor) {
		super(vertebrateType, age, sex, height, overallColor);
		// TODO Auto-generated constructor stub
	}

	public void swim() {
		System.out.println("Swimming in the sea!");
	}

	public void move() {
		System.out.println("Fish is swimming.");
		
	}
}