#P1.1
# a)to print the hello world

s = "Hello Dunia "
print(s)

# b)to find maximum out of 3 numbers
def maxi():
    a = int(input("Enter First number :"))
    b = int(input("Enter Second number :"))
    c = int(input("Enter Third number :"))
    if (a > b):
        if (a > c):
            print(a, " is maximum .")
        else:
            print(c, " is maximum .")
    else:
        if (b > c):
            print(b, "is maximum.")
        else:
            print(c, " is maximum .")

# c)Program to swap to numbers without using third variable

def swapp() :
    a = int(input("Enter First number :"))
    b = int(input("Enter Second number :"))

    print("Before swapping the value of a = " , a)
    print("Before swapping the value of b = " , b)
    print("\n")

    a = a + b
    b = a - b
    a = a - b
    #a,b=b,a
    print("After swapping the value of a = " , a)
    print("After swapping the value of b = " , b)





# d)Program to implement simple calculator

def calc():
    x = "y"
    while(x=="y"):
        print("Enter two numbers : ")
        a = int(input("a = "))
        b = int(input("b = "))
        print("1.Addition")
        print("2.Subtraction")
        print("3.Multiplication")
        print("4.Division")

        ch = int(input("Enter Your Choice :"))
        if (ch == 1):
            print("Addition of the two numbers are : ", a + b)
        elif (ch == 2):
            print("Substraction of the two numbers are : ", a - b)
        elif (ch == 3):
            print("Multiplication of the two numbers are : ", a * b)
        elif (ch == 4):
            print("Division of the two numbers are : ", a / b)
        else:
            print("Invalid Choice")

        x = input("Do you want to continue? ")

# e)To calculate the sum of digits in an integer

def summ():
    dig = int(input("Enter a Digit: "))
    sum = 0
    while(dig>0):
        n = dig % 10
        sum = sum + n
        dig = dig // 10
    print("The sum of all digits of above integer is : " , sum )


# f)Program which takes a sentence and calculates the number of digits , uppercase letters ,
#  lowercase and special char.

def _m() :
    s = input("Enter a Sentence : ")

    digits = 0
    u_case = 0
    l_case = 0
    space = 0
    letters = 0
    others = 0
    for i in s:
        if(i.isdigit()):
            digits = digits + 1
        elif(i.isalpha()):
            letters = letters + 1
            if(i.islower()):
                l_case = l_case + 1
            elif(i.isupper()):
                u_case = u_case + 1
        elif (i == " "):
            space = space + 1
        else:
            others = others + 1

    print("No of digits in this sentence = " , digits)
    print("No of uppercase letters in this sentence = " , u_case)
    print("No of lowercase letters in this sentence = ", l_case)
    print("No of letters in this sentence = ", letters)
    print("No of spaces in this sentence = ", space)
    print("No of others in this sentence = ", others)

def prime() :
    start = int(input("Enter the starting index:"))
    end = int(input("enter the ending index:"))
    print('Range is:', start , end)
    for num in range(start , end+1):
        if num > 1:
            is_prime = True
            for i in range(2, num):
                if (num % i) == 0:
                    is_prime = False
                    break
            if is_prime:
                print(num)
prime()


# g)Program to check whether the number is a armstrong number or not

def arm():
    s = arms = int(input("Enter the number : "))
    sum = 0
    while(arms>0):
        ar = arms % 10
        sum = sum + (ar**3)
        arms = arms // 10
    if(s == sum):
        print("The number is a armstrong number")





























