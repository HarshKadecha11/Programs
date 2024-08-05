#Practical 1_3

# a) Program to find factorial of a given number using recursion .

def fact(num) :
    if num == 0 :
        return 1
    else :
        return num * fact(num-1)

num = int(input("Enter the Number : "))
print("The factorial of a given is : " , fact(num))



# b)  Program to find Fibonacci Series using recursion .

def fibo(n) :
    if n<= 0:
        return 0
    elif n == 1:
        return 1
    else :
        return fibo(n-1) + fibo(n-2)


num = int(input("Enter the number of terms : "))
print("Fibonacci Series ....")
for i in range(num):
    print(fibo(i) , end = " ")