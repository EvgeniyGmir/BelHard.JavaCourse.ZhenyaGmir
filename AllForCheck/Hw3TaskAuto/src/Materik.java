import java.util.List;

public abstract class Materik {
	private Integer number;
	List <Ocean> oceanList;
	
	public Integer getNumber() {
		return number;
	}
	
	public void setNumber(Integer number) {
		this.number = number;
	}
	
	public List<Ocean> getOceanList(){
		return oceanList;
	}
	
	public void setOceanList(List<Ocean> oceanList) {
		this.oceanList = oceanList;
	}
	
	public String toString() {
		return "Materik: [number = " + number + ", oceanList: " + oceanList + "]";
	}
	
	public abstract void outName();
}
