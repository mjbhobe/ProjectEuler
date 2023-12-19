#!/usr/bin/env python


def fibonacci():
    """fibonacci generator"""
    x, y = 1, 2
    while True:
        yield x
        x, y = y, x + y


# max fibo value
MAX_VAL = 4_000_000

fib = fibonacci()
values = []
while True:
    x = next(fib)
    if x > MAX_VAL:
        break
    if x % 2 == 0:
        # append even numbers to values
        values.append(x)

print(sum(values), len(values), values[-5:])
# Ans: 4613732 11 [10946, 46368, 196418, 832040, 3524578]
