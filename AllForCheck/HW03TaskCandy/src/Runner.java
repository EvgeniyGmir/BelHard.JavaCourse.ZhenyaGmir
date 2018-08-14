import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Runner {
	public static void main(String[] args) {
		
			Present present = new Present();
		
//			for(int i = 0; i < 3; i ++) {
			List <Candy> candyList= new ArrayList<>();
			
			
			Candy chocolateCandy = new ChocolateCandy();
			chocolateCandy.setName("Chocolate!");
			chocolateCandy.setSugerValue(10);
			chocolateCandy.setWeight(3);
			Candy suckingCandy = new SuckingCandy();
			suckingCandy.setName("Sucking!");
			suckingCandy.setSugerValue(5);
			suckingCandy.setWeight(4);
			Candy fruitCandy = new FruitCandy();
			fruitCandy.setName("Fruit!");
			fruitCandy.setSugerValue(2);
			fruitCandy.setWeight(5);
			candyList.add(chocolateCandy);
			candyList.add(suckingCandy);
			candyList.add(fruitCandy);
			
			chocolateCandy.setCandyList(candyList);
			suckingCandy.setCandyList(candyList);
			fruitCandy.setCandyList(candyList);
			
			present.getCandy()[0] = chocolateCandy;
			present.getCandy()[1] = suckingCandy;
			present.getCandy()[2] = fruitCandy;

				
	//		System.out.println(chocolateCandy.outInformation());
		//	System.out.println(suckingCandy.outInformation());
			//System.out.println(fruitCandy.outInformation());
			for (int i = 0 ; i < present.getCandy().length; i ++){
				System.out.println(candyList.get(i));
			}

		
		
	}
}
