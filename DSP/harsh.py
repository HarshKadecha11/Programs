class B :
    def __init__(self) :
        print("Hellllooooo")
    def display(self):
        print("Display from class B")

class A :
    def __init__(self) :
        print("Hello Duniaa")
    def display(self):
        print("Hello Duniaa From Harsh Kadechaaaa")
        print("Display from class A")



class C(A,B) :
    def __init__(self) :
        print("Kadechaa")




c = C()
c.display()


