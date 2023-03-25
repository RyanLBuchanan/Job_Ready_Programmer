package java_basics;

public class Chickenhawk extends Bird{

	public Chickenhawk(String vertebrateType, double age, String sex, double height, String overallColor) {
		super(vertebrateType, age, sex, height, overallColor);
	}
	
	public void fly() {
		System.out.println("Grumpy and cannot fly.");
	}

}

