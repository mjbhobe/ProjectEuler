#!/usr/bin/env python

def listOfAllPossible3DigitNumbers():
    all_possible_nums = []

    for i in range(1, 10):
        for j in range(10):
            for k in range(10):
                num = i * 100 + j * 10 + k
                all_possible_nums.append(num)

    return all_possible_nums


def isPalindrome(num):
    num_str = str(num)
    rev_str = str(num)[::-1]

    return num_str == rev_str


l1 = listOfAllPossible3DigitNumbers()
l2 = l1.copy()
p1, n1, n2 = None, None, None

for num1 in l1[::-1]:
    for num2 in l2[::-1]:
        prod = num1 * num2
        if isPalindrome(prod):
            if p1 is None:
                p1, n1, n2 = prod, num1, num2
            elif prod > p1:
                p1, n1, n2 = prod, num1, num2

print(f"largest palindrome = {p1} = {n1} * {n2}")



