# Program to remove duplicate elements in list

l = []
n = int(input("Enter how many numbers you want : "))
for i in range(n):
    n = int(input("Enter number : "))
    l.append(n)
print(l)

s = set(l)
print(s)