#!/usr/bin/env python

def checkDivisible(num):
    """ check if number is evenly divisible by all nums from 1 to 20"""
    qualifies = True
    # NOTE: all numbers are always divisible by 1 :)
    for i in range(2,21):
        if (num % i != 0):
            qualifies = False
            break
    return qualifies


# brute force method
# NOTE: since we are testing for divisibility by 2 to 20, all inclusive
# the number must be a multiple of 20!
start = 20
while True:
    print(f"Testing {start}")
    if checkDivisible(start):
        break
    start = start + 20

