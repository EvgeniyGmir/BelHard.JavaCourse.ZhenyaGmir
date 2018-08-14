import java.util.ArrayList;
import java.util.List;

public class TypeArray {
	
//	private Integer index;

	public <T> List arrayType(T [] objectArray){
		
		List <T> list = new ArrayList<T>();
		for(int i = 0; i < objectArray.length; i ++) {
			list.add(objectArray[i]);
		}
		return list;
	}
	
}
