/*
The Fibonacci sequence is defined by the recurrence relation:

    F_(n) = F_(n-1) + F_(n-2), where F_(1) = 1 and F_(2) = 1.

Hence the first 12 terms will be:

    F_(1) = 1
    F_(2) = 1
    F_(3) = 2
    F_(4) = 3
    F_(5) = 5
    F_(6) = 8
    F_(7) = 13
    F_(8) = 21
    F_(9) = 34
    F_(10) = 55
    F_(11) = 89
    F_(12) = 144

The 12th term, F_(12), is the first term to contain three digits.

What is the first term in the Fibonacci sequence to contain 1000 digits?
*/
import java.io.*;
import java.math.*;

public class Prob25 {
	
	long findFiboTerm() {
		int len = 0;
		long term = 2;
		
		// we know that F_1 & F_2 = 1 & len(F_1), len(F_2) < 1000
		BigInteger f_1 = new BigInteger("1");
		BigInteger f_2 = new BigInteger("1");

		do {
			BigInteger f_3 = new BigInteger(f_1.toString(10));
			f_3 = f_3.add(f_2);
			String s = f_3.toString(10);
			len = s.length();
			// NOTE: We are assigning pointers, which is OK
			f_1 = f_2;
			f_2 = f_3;
			term++;
			System.out.println("F(" + term + ") = " + s + 
				" and len(F(" + term + ") = " + len);
		} while(len < 1000);
		return term;
	}


	public static void main(String args[]) {
		System.out.println("len(F(" + new Prob25().findFiboTerm() + ")) contains 1000 digits");
	}
}
