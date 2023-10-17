#!/usr/bin/env python

"""
2^(15) = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

Calculate the sum of the digits of the number 2^(1000)?
"""


def main():
    base_num = 2**1000
    print(f"base_num -> {base_num}")
    sum_of_digits = sum([int(i) for i in str(base_num)])
    print(f"Sum of digits = {sum_of_digits}")


if __name__ == "__main__":
    main()
