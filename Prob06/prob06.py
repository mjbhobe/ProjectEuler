import numpy as np


def calc_diff(first_n):
    sum_of_squares = sum([x**2 for x in range(1, first_n + 1)])
    square_of_sums = sum([x for x in range(1, first_n + 1)]) ** 2

    print(f"For first {first_n} natural numbers")
    print(f"Sum of squares {sum_of_squares}")
    print(f"Square of sums {square_of_sums}")
    print(f"Difference {square_of_sums - sum_of_squares}")


for i in [x * 10 for x in range(1, 11)]:
    calc_diff(i)
