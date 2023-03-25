package java_basics;

public class Firehawk extends Bird{

	public Firehawk(String vertebrateType, double age, String sex, double height, String overallColor) {
		super(vertebrateType, age, sex, height, overallColor);
	}

	
	public void fly() {
		System.out.println("Soars, does not fly.");
	}
}

