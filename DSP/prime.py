print("Enter the range: ")
st = int(input("Starting point: "))
end = int(input("Ending point: "))

def is_prime(n):
    """Check if a number is prime."""
    if n <= 1:
        return False
    for i in range(2, int(n**0.5) + 1):
        if n % i == 0:
            return False
    return True

print(f"Prime numbers between {st} and {end} are:")
for i in range(st, end + 1):
    if is_prime(i):
        print(i, end=" ")