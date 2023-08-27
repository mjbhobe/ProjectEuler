import java.math.*;

public class Prob20 {
	public static void main(String args[]) {
		int sum = 0;
		BigInteger bi = new BigInteger("1");
		// find Factorial of 100
		for (int i = 2; i <= 100; i++)
			bi = bi.multiply(new BigInteger(""+i));
		// convert it into a String
		String s = bi.toString(10);
		for (int i = 0; i < s.length(); i++)
			sum += Integer.parseInt(""+ s.charAt(i));
		System.out.println(sum);
	}
}

