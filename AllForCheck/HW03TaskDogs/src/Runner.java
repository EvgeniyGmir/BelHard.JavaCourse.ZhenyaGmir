
public class Runner {
	public static void main(String[] args) {
		
		Puppy puppy = new Puppy("Vasya");
		
		System.out.println("Name: " + puppy.getName());
		System.out.println("Bark: " + puppy.bark());
		System.out.println("Jump: " + puppy.jump());
		System.out.println("Run: " + puppy.run());
		System.out.println("Bite:  " + puppy.bite());
	}
}
