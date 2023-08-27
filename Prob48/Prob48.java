/*
	Problem 48:

	The series, 1^(1) + 2^(2) + 3^(3) + ... + 10^(10) = 10405071317.

	Find the last ten digits of the series, 1^(1) + 2^(2) + 3^(3) + ... + 1000^(1000).
		
*/
import java.io.*;
import java.math.*;

public class Prob48 {

	public static String last10Digits() {
		int i = 1;
		BigInteger sum = new BigInteger("0");

		do {
			BigInteger b = new BigInteger(new Integer(i).toString());
			b = b.pow(i);
			sum = sum.add(b);
			i++;
		} while (i < 1001);

		String s = sum.toString(10);
		System.out.println("The sum of series is = " + s);
		// & now find the last 10 digits of s
		String ret = s.substring(s.length()-10);
		return ret;
	}

	public static void main(String args[]) {
		System.out.println("Last 10 digits = " + last10Digits());
	}

}

