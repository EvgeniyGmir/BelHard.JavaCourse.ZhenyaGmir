//import java.util.List;
//import java.util.ArrayList;

public abstract class Candy extends Sweets{
	
	private String name;
	private Integer weight;
	private Integer sugarValue;

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
