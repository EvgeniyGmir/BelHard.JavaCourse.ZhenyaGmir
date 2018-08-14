import java.util.List;
import java.util.ArrayList;

public abstract class Candy{
	
	private String name;
	private Integer weight;
	private Integer sugarValue;

	List <Candy> candyList;
	
	public void setCandyList(List<Candy> candyList) {
		this.candyList = candyList;
	}
	
	public List <Candy> getCandyList(){
		return candyList;
	}
	
	public void setName(String name) {
		this.name = name; 
	}
	
	public String getName() {
		return name;
	}
	
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	
	public Integer getWeight() {
		return weight;
	}
	
	public Integer getSugerValue() {
		return sugarValue;
	}
	
	public void setSugerValue(Integer sugerValue) {
		this.sugarValue = sugerValue;
	}
	
	
	
	public abstract void outType();
	
	public String outInformation() {
		return "Name: " + name + ", sugar: " + sugarValue + ", weight: " + weight; 
	}
}
