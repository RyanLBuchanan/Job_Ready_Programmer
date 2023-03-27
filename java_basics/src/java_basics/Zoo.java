package java_basics;

public class Zoo {

	public static void main(String[] args) {
		
		
		Animal puppyAnimal =  new Animal("Puppy", 10.11, "Male", 15, "Golden");
				
		puppyAnimal.speak();
		System.out.println("");
//		
//		Bird birdBrain = new Bird("BirdBrain", 3.14159, "Female", 69, "Turqoise");
//		System.out.println("BirdBrain be...");
//		birdBrain.eat();
//		birdBrain.sleep();
//		birdBrain.fly();
//		System.out.println("");
		
	
		
		Fish fishFace = new Fish("FishFace", 1.1614, "Male", 42, "Rainbow");
		System.out.println("FishFace be...");
		fishFace.swim();
		fishFace.hunt();
		System.out.println("");
		
		Firehawk firehawk = new Firehawk("Hero Hawk", 42, "male", 12, "Fire color");
		System.out.println("FireHawky be...");
		firehawk.fly();
		System.out.println("");
		
//		Chickenhawk chickenhawk = new Chickenhawk("Chickenhawky", 21, "male", 6, "Brown");
//		System.out.println("ChickenHawky be...");
//		chickenhawk.fly();
//		System.out.println("");
		
		Sparrow sparrow = new Sparrow("SparrowMan", 21, "male", 6, "blue");
		System.out.println("Sparrow will . . . ");
		sparrow.fly();
		System.out.println();
	}
}