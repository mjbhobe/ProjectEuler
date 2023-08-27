/*
	Project Euler - Problem #3:

	The prime factors of 13195 are 5, 7, 13 and 29.

	What is the largest prime factor of the number 600851475143 ?
 */
import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.math.*;

public class Prob3 {

	public static BigInteger findLargestPrimeFactor(BigInteger num) {
		List<BigInteger> primes = new ArrayList<BigInteger>();

		BigInteger start = new BigInteger("2");
		BigInteger one = new BigInteger("1");
		BigInteger zero = new BigInteger("0");
		BigInteger maxPrimeFactor = new BigInteger("0");
		Boolean isPrime;

		// generate all prime numbers < num
		while (start.compareTo(num) < 0) {
			System.out.print("Checking..." + start.toString(10));
			// assume 'start' is prime
			isPrime = true;
			for (BigInteger b : primes) {
				if ( start.mod(b).equals(zero)) {
					isPrime = false;
					break;
				}
			}

			if (isPrime) {
				primes.add(start);
				// also check if it is the max divisor
				if (num.mod(start).equals(zero)) {
					maxPrimeFactor = start;
					System.out.println("*");
				}
			}

			start = start.add(one);
			System.out.println("");
		}
/*
		for (BigInteger b : primes)
			if (num.mod(b).equals(zero)) maxPrimeFactor = b;
*/

/*
		OUTERLOOP:
		for (long i = 2; i <= num; i++) {
			// try to divide i by all primes found so far
			for(long l : primes)
				if (i % l == 0)
					continue OUTERLOOP;	// i is NOT prime
			primes.add(i);
		}

		long maxPrimeFactor = 0;
		for(long l : primes) 
			if (num % l == 0) maxPrimeFactor = l;

*/
		return maxPrimeFactor;

	}

	public static void main(String args[]) {
		System.out.println("Max prime factor of 600851475143 = " 
			+ findLargestPrimeFactor(new BigInteger("600851475143")).toString(10));
	}

}
