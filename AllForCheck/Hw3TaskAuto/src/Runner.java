import java.util.List;
import java.util.ArrayList;

public class Runner {
	public static void main(String[] args) {
		Planet planet = new Planet();
		
		for(int i = 0; i < 6; i ++) {
			
			Materik materik = new EurasiaMaterik();
			
			List <Ocean> oceanList = new ArrayList<Ocean>();
			
			Ocean pacific = new PacificOcean();
			pacific.setName("Pacific!");
			Ocean indian = new IndianOcean();
			pacific.setName("Indian!");
			
			oceanList.add(pacific);
			oceanList.add(indian);
			
			materik.setOceanList(oceanList);
			
			planet.getMaterik()[i] = materik;
		}
		
		for(int i = 0 ; i < planet.getMaterik().length; i ++) {
			System.out.println(planet.getMaterik()[i]);
		}
		
	}
}
