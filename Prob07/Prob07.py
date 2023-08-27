# lambda to check if number is prime or not
# logic: number is prime if it is NOT evenly divisible by any number from
#   2 to sqrt(number)
is_prime = lambda num: all(num % x != 0 for x in range(2, int(num**0.5) + 1))


def gen_primes_list(max_count=10001):
    primes, start = [], 2
    while len(primes) < max_count:
        if is_prime(start):
            primes.append(start)
        start = start + 1
    return primes


for i in range(2, 20):
    list_of_primes = gen_primes_list(i)
    print(f"Max len {i}: {len(list_of_primes)} numbers {list_of_primes} -> {gen_primes_list(i)[-1]}", flush=True)

MAX_COUNT = 10001
print(f"Calculating the {MAX_COUNT}th prime...", flush=True)
list_of_primes = gen_primes_list(MAX_COUNT)
print(f"Max len {MAX_COUNT}: {len(list_of_primes)} numbers -> last 5 {gen_primes_list(MAX_COUNT)[-5:]}")
print(f"The {MAX_COUNT}st prime is {list_of_primes[-1]}")
