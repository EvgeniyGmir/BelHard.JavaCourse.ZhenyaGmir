import java.util.List;
import java.util.ArrayList;

public class ArrayToList implements ConvertArray{

	@Override
	public <T> List convert(T[] objectArray) {
		
		List <T> list = new ArrayList<T>();
		for(int i = 0; i < objectArray.length; i++ ) {
			list.add(objectArray[i]);
			//System.out.print(list.get(i));
		}
		
		return list;
	}
	
}
