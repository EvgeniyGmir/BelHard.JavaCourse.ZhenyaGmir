
public class Task19 {
	public static void main(String[] args) {
		long start1 = System.currentTimeMillis();
		String [] s1 = {"This" , "text", "for" , "example" };
		String sum1 = "", sum2 ="";
		for(int i = 0; i < 10000; i++)
		for (int j = 0; j < s1.length; j++) {
			sum1 += s1[j] + " ";
		}
		long timeAfterSumString = System.currentTimeMillis() - start1;
		System.out.println("Time sum Strings: " + timeAfterSumString);
		long start2 = System.currentTimeMillis();
		StringBuilder builder = new StringBuilder();
		for (int i =0; i < 10000; i++) {
		for (int j = 0; j < s1.length; j++) {
			builder.append(s1[j]).append(" ");
			}
		}
		long timeAfterSumStringBuilder = System.currentTimeMillis() - start2;
		System.out.println("Time StringBuilder: " + timeAfterSumStringBuilder);

	}
}
