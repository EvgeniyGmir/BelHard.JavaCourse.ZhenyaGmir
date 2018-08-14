
public class Runner {
	public static void main(String[] args) {
		
		TypeArray typeArray = new TypeArray();
		
		String[] strArray = {"String","number", "1"};
		Integer[] intArray = {1,2,3,4,5};
		Double [] doubleArray = {1.2,2.3,3.4,4.5,6.0};
		
		System.out.println(typeArray.arrayType(strArray));
		System.out.println(typeArray.arrayType(intArray));
		System.out.println(typeArray.arrayType(doubleArray));
		

	System.out.println(	typeArray.arrayType(doubleArray).get(3));
		
	
	}
}
