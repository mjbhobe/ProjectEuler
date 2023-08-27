// Problem 20:
// n! means n × (n - 1) × ... × 3 × 2 × 1
// Find the sum of the digits in the number 100!
// Compiler: GNUC++ (MingW32 on Windows XP)
// To compile: g++ -Wall -O2 Prob20.cpp -o Prob20.exe -lstdc++
#include <iostream>
#include <string>
using namespace std;
#include "LargeNumber.h"

CLargeNumber factorial(int num)
{
	CLargeNumber aNum("1");

	if (num > 1) {
		for (int i = 2; i <= num; i++)
			aNum *= i;
	}
	return aNum;
}


int main(void)
{
	int num;

	cout << "Enter number: ";
	cin >> num;
	string s_fact = factorial(num).ToString();
	long long sum = 0;
	
	cout << num << "! = " << s_fact.c_str() << endl;

	for (int i = 0; i < s_fact.length(); i++)
		sum += (s_fact[i] - '0');
	cout << "Sum of digits of " << num << "! = " << sum << endl;

	return 0;
}




