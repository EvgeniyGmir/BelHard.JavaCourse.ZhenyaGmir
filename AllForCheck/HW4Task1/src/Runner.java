
public class Runner {

	public static void main(String[] args) {
		
		ArrayToList arrayToList = new ArrayToList();
		
		Integer [] intArray = {1, 2, 3, 4};
		String [] stringArray = {"Hello", "Roman","!"};
		Object [] objectArray = {1,"List","of","object",2,3};
		System.out.println(arrayToList.convert(intArray));
		System.out.println(arrayToList.convert(stringArray));
		System.out.println(arrayToList.convert(objectArray));
//		arrayToList.convert(intArray);
//		arrayToList.convert(stringArray);
	}
}
