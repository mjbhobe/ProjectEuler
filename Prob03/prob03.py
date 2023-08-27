#!/usr/bin/env python
import math


def primeFactorsOf(num):
    prime_factors = []

    # how many 2's divide num
    while num % 2 == 0:
        prime_factors.append(2)
        num = num / 2

    # now num should be odd
    for i in range(3, int(math.sqrt(num)) + 1, 2):
        while num % i == 0:
            prime_factors.append(i)
            num = num / i

    if num > 2:
        prime_factors.append(num)

    return prime_factors


print(primeFactorsOf(600851475143))
