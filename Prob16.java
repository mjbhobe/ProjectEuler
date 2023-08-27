/*
2^(15) = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

What is the sum of the digits of the number 2^(1000)?

*/
import java.io.*;
import java.math.*;

public class Prob16 {
	
	public static long getSum() {
		BigInteger b = new BigInteger("2");
		b = b.pow(1000);
		String s = b.toString(10);
		long sum = 0;

		for (long i = 0; i < s.length(); i++) {
			sum += Integer.parseInt(s.charAt(i));
		}
		return sum;
	}

	public static void main(String args[]) {
		System.out.println("The sum = " + getSum());
	}
}

