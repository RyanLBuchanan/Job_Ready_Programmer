package java_basics;

public class Sparrow extends Bird implements Flyable{

	public Sparrow(String vertebrateType, double age, String sex, double height, String overallColor) {
		super(vertebrateType, age, sex, height, overallColor);
		// TODO Auto-generated constructor stub
	}

	public void fly() {
		System.out.println("Sparrow flying high");
		
	}

}
