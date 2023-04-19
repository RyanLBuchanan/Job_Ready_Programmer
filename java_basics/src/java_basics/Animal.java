package java_basics;

public abstract class Animal {
	// Vertebrate type
			String vertebrateType;
			// Age
			int age;
			// Animal sex
			String sex;
			// Height
			double height;
			// Overall color
			String overallColor;
			
			
			
			public Animal(String vertebrateType, double age, String sex, double height, String overallColor) {
				super();
				this.vertebrateType = vertebrateType;
				this.age = (int) age;
				this.sex = sex;
				this.height = height;
				this.overallColor = overallColor;
			}



			public void speak() {
				System.out.println("My name is " + vertebrateType + ".");
				System.out.println("I am " + height + " meters tall.");
				System.out.println("I am " + age + " years old.");
				System.out.println("My eyes are " + overallColor + ".");
			}
			
			public void eat() {
				System.out.println("Eating in the canteen.");
				
			}
			
			public void sleep() {
				System.out.println("Sleeping in the bed.");
				
			}
			
			public abstract void move();
			
			public void hunt() {
				System.out.println("Hunting wabbits!");
				
			}
}
