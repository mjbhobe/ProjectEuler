// Problem 19: How many Sundays fell on the first of the month during the 
// twentieth century (1 Jan 1901 to 31 Dec 2000)?
#ifdef __MSVC__
#include <iostream.h>
#include <stdio.h>
#include <time.h>
#include <string.h>
#else
#include <iostream>
#include <cstdio>
#include <ctime>
#include <cstring>
using namespace std;
#endif

// See http://c-faq.com/misc/zeller.html for details of algorithm

// Using the first method suggested on site
// returns 0 for Sunday, 1 for Monday & so on...
int getWeekday(int month, int day, int year)
{
	tm tm_x;
	
	// initialize tm structure
	tm_x.tm_year = year - 1900;	// pass years since 1900
	tm_x.tm_mon = month - 1;		// 0 = Jan, 1 = Feb & so on...
	tm_x.tm_mday = day;						
	tm_x.tm_isdst = -1;					// determine DST
	
	mktime(&tm_x);
	return tm_x.tm_wday;
}

// Using 3rd method - Tomohiko Sakamoto's method	 
// returns 0 for Sunday, 1 for Monday & so on...
int weekday(int m, int d, int y)
{	
/*
  int ix, tx, vx;

  switch (month) {
	case 2  :
	case 6  : vx = 0; break;
	case 8  : vx = 4; break;
	case 10 : vx = 8; break;
	case 9  :
	case 12 : vx = 12; break;
	case 3  :
	case 11 : vx = 16; break;
	case 1  :
	case 5  : vx = 20; break;
	case 4  :
	case 7  : vx = 24; break;
  }
  if (year > 1900)  // 1900 was not a leap year
    year -= 1900;
  ix = ((year - 21) % 28) + vx + (month > 2);  // take care of February 
  tx = (ix + (ix / 4)) % 7 + day;              // take care of leap year
  return (tx % 7);
*/
	static int t[] = {0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4};
	y -= m < 3;
	return (y + y/4 - y/100 + y/400 + t[m-1] + d) % 7;
}

int main(void)
{
	long numSundays = 0;

	for (int year = 1901; year < 2001; year++) {
		for (int month = 1; month < 13; month++) {
			if (weekday(month,1,year) == 0) numSundays++;
		}
	}

	cout << numSundays << " Sundays fell on first of a month in 20th century!" << endl;

/*
	int month, year;
	static const char* weekdays[] = {	
		"Sunday","Monday","Tuesday","Wednesday",
		"Thursday","Friday","Saturday"
	};
	
	cout << "Enter month (1-Jan, 2-Feb...12-Dec): ";
	cin >> month;
	cout << "Enter year (yyyy): ";
	cin >> year;
	
	struct tm tm;
	
	memset((void*)&tm,0,sizeof(struct tm));

	tm.tm_mon = month - 1;		// 0 = Jan, 1 = Feb & so on...
	tm.tm_mday = 1;						
	tm.tm_year = year - 1900;	// pass years since 1900
	tm.tm_hour = tm.tm_min = tm.tm_sec = 0;	// don't care for time
	tm.tm_isdst = -1;
	
	mktime(&tm);
		cout << month << "/" << 1 << "/" << year << " falls on a "
			<< tm.tm_wday << endl;
	return 0;

	int month,day,year;

	cout << "Enter valid date in mm/dd/yyyy format (no validation!): ";
	scanf("%d/%d/%d",&month,&day,&year);
	cout << month << "/" << day << "/" << year << " falls on a "
		<< weekday(month,day,year) << endl;
	*/
	return 0;
}

		
