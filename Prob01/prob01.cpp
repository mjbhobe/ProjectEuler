// Find SUM of all natural numbers < 1000 that are divisible by 3 OR 5
// compile:
//	g++ -std=c++20 prob01.cpp -lstdc++ -lm
#include <iostream>
using namespace std;

bool isDivisibleBy3Or5(int i) { return (i % 3 == 0) || (i % 5 == 0); }

int main(void) 
{ 
  unsigned long sum = 0;
  const int UPPER = 1000;

  while (auto i < UPPER) {
    if isDivisibleBy3Or5 (i)
      sum += i;
  }

  cout << "Sum of all numbers < 1000 divisible by 3 or 5 = " << sum << endl;
  return 0;
}
