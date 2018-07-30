import java.util.List;
import java.util.ArrayList;

public class Runner {
	public static void main(String[] args) {
		
		Present present = new Present();
		

			Sweets sweets = new Sweets();
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
		
			sweets.setCandyList(candyList);
			
			System.out.println(chocolateCandy.outInformation());
			System.out.println(suckingCandy.outInformation());
			System.out.println(fruitCandy.outInformation());
			System.out.println(sweets.getCandyList());
		
		
	}
}
