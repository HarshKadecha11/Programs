# Prac3
import math as m
# a) Create a class Circle , include methods to calculate area and circumference
#  of Circle

class Circle :
    def __init__(self , radius):
        self.radius = radius



    def area(self):
        print("The area of the Circle : " , m.pi*self.radius**2)

    def circum(self):
        print("The circumference of the circle is : " , 2*m.pi*self.radius)

r = int(input("Enter the Radius of the circle : "))
# c1 = Circle(r)
# c1.area()
# c1.circum()

# b) Create a class account with necessary methods , show_balance , withdraw , deposit , and transfer.
# Also implement necessary getters and setters . Instantiate 2 object of that class and
# show different methods call using them .

class account :
    def __init__(self , owner , balance):
        self.owner = owner
        self.balance = balance

    def show_bal(self):
        print(f"Account balance for {self.owner} : {self.balance}")

    def deposit(self , amount):
        if amount > 0 :
            self.balance += amount
            print(f"Deposited {amount} to {self.owner} 's account .")
            self.show_bal()
        else :
            print("Amount must be positive !!!")

    def withdraw(self , amount):
        if amount <= self.balance :
            self.balance -= amount
            print(f"Withdraw {amount} from {self.owner}'s account .")
            self.show_bal()
        else :
            print(f"Insufficient funds in the account !!! ")

    def transfer(self , amount , target_acc):
        if amount <= self.get_balance():
            self.set_balance(self.get_balance() - amount)
            target_acc.deposit(amount)
            print(f"Transferred {amount} from {self.owner}'s account to {target_acc.get_owner()}'s account.")


        else :
            print(f"Insufficient funds in the account !!! ")

    def get_owner(self):
        return self._owner

    def set_owner(self, owner):
        self._owner = owner

    def get_balance(self):
        return self._balance

    def set_balance(self, balance):
        if balance >= 0:
            self._balance = balance
        else:
            print("Balance cannot be negative.")


o1 = account("Rahul" , 5000)
o2 = account("Anjum" , 3000)



# c) Program to create a class that represent shopping cart , Include method to adding and
#  remaining an item and calculating the total price.

class ShoppingCart :
    def __init__(self):
        self.cart = {}

    def add_item(self , item_name , price):
        if item_name in self.cart :
            self.cart[item_name] += price
        else :
            self.cart[item_name] = price
        print(f"Added {item_name} for {price}.")

    def display(self):
        print(self.cart)

    def remove_item(self , item_name):
        if item_name in self.cart :
            del self.cart[item_name]
            print(f"Removed {item_name} ")
        else :
            print(f" {item_name} doesn't fount in the cart . ")

    def total(self):
        totall = self.cart.values()
        tot_sum = 0
        for i in totall :
            tot_sum += i
        print(f"Your total bill is : {tot_sum} ")

cart = ShoppingCart()
while True :
    print("\nShopping Cart menu : ")
    print("1.Add an item ")
    print("2. Remove an item ")
    print("3.Display my items ." )
    print("4. Total bill amount ")
    print("5. Exit ")
    ch = int(input("Enter Your choice : "))

    if ch == 1 :
        item_name = input("Enter the item name : ")
        price = float(input("Enter the price : "))
        cart.add_item(item_name , price)
    elif ch == 2:
        item_name = input("Enter the item name : ")
        cart.remove_item(item_name)
    elif ch == 3 :
        cart.display()
    elif ch == 4 :
        cart.total()
    elif ch == 5 :
        print("\n Existing program ......")
        break
    else :
        print("Invalid choice !!!!! ")


# d) Program to create a class that represent shape , Include methods to calculate area and perimeter .
# Implement subclass for different shape like circle , triangle and square.

class Shape :
    def area(self):
        pass


    def perimeter(self):
        pass

class Circle(Shape):
    def __init__(self , radius):
        self.radius = radius

    def area(self):
        return m.pi*self.radius*self.radius

    def perimeter(self):
        return 2*m.pi*self.radius

class Triangle(Shape):
    def __init__(self ,a,b,c):
        self.a = a
        self.b = b
        self.c = c
    def area(self):
        s = (self.a + self.b + self.c) / 2
        return ( s * (s - self.a) * (s - self.b) * (s - self.c)) ** 0.5
    def perimeter(self):
        return self.a + self.b + self.c

class Square(Shape) :
    def __init__(self , side):
        self.side = side

    def area(self):
        return self.side*self.side
    def perimeter(self):
        return 4*self.side

# Create instances of each shape
circle = Circle(5)
triangle = Triangle(3, 4, 5)
square = Square(6)

print(f"Circle: Area = {circle.area()}, Perimeter = {circle.perimeter()}")
print(f"Triangle: Area = {triangle.area()}, Perimeter = {triangle.perimeter()}")
print(f"Square: Area = {square.area()}, Perimeter = {square.perimeter()}")

# e) Program to demonstrate use of instance , class and static methods .
class Example:
    # Instance method
    def instance_method(self):
        print("This is an instance method.")

    # Class method
    @classmethod
    def class_method(cls):
        print("This is a class method.")

    # Static method
    @staticmethod
    def static_method():
        print("This is a static method.")

# Create an instance of the class
example = Example()

# Call instance method
example.instance_method()

# Call class method
Example.class_method()

# Call static method
Example.static_method()


# f) Program to demonstrate the use of access specifiers like public , protected and private .

class Person:
    def __init__(self, name, age, salary):
        self.name = name          # Public attribute
        self._age = age           # Protected attribute
        self.__salary = salary    # Private attribute

    # Public method to get the private attribute
    def get_salary(self):
        return self.__salary
    # Public method to set the private attribute
    def set_salary(self, salary):
        if salary > 0:
            self.__salary = salary
        else:
            print("Salary must be positive!")

# Create an instance of the class
person = Person("John", 30, 50000)

# Accessing public attribute
print(f"Name: {person.name}")
# Accessing protected attribute
print(f"Age: {person._age}")

# Accessing private attribute using public method
print(f"Salary: {person.get_salary()}")

# Modifying private attribute using public method
person.set_salary(60000)
print(f"Updated Salary: {person.get_salary()}")








