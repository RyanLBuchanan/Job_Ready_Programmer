package java_basics;

public class Earth {

	public static void main(String[] args) {
		Human Archer = new Human("Archer", 42, 1.73, "blue");
//		RussianHuman Ivan = new RussianHuman("Ivan", 21, 1.83, "brown");
		Vulcan TPol = new Vulcan("T'Pol", 69, 1.6, "green");
		
		Archer.speak();
		System.out.println("");
//		Ivan.russianSpeak();
		System.out.println("");
		TPol.speak();
	}
}
