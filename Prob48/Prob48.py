"""
Problem 48:
	The series, 1^(1) + 2^(2) + 3^(3) + ... + 10^(10) = 10405071317.
	Find the last ten digits of the series, 1^(1) + 2^(2) + 3^(3) + ... + 1000^(1000).
"""
import numpy as np


def main():
    nums = [i**i for i in range(1, 1001)]
    sums = np.array(nums).sum()
    print(f"Last 10 digits {str(sums)[-10:]}")
    # or very concisely, this can be written as
    print(f"Last 10 digits {str(sum([i**i for i in range(1, 1001)]))[-10:]}")


if __name__ == "__main__":
    main()
