#!/usr/bin/env python
"""
2^(15) = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

What is the sum of the digits of the number 2^(1000)?
"""


def main():
    base_num = 2**1000
    # base_num = 2**15
    print(f"base_num -> {base_num}")

    sum = 0
    for i in str(base_num):
        sum += int(i)
    print(sum)


if __name__ == "__main__":
    main()
