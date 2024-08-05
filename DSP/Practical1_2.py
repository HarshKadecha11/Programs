# Practical 1_2
# a) Remove Duplicate elements from the list .

def duplicate():
    size = int(input("Enter the number of element in the list :"))
    List = []

    for i in range(size):
        ele = int(input("Enter the Element "))
        List.append(ele)

    Uni_List = []
    for i in List :
        if i not in Uni_List :
            Uni_List.append(i)
    print("After removing duplicate element the list is : ")
    print(Uni_List)



# b) Program to sort a given list.
def sortt():
    size = int(input("Enter the number of element in the list :"))
    List = []

    for i in range(size):
        ele = int(input("Enter the Element "))
        List.append(ele)

    for i in range(size-1):
        for j in range(size-i-1):                    #BUBBLE SORT
            if List[j]>List[j+1] :
                List[j] , List[j+1] = List[j+1] , List[j]



    print(List)

# c) Program to find maximum and minimum from the list of tuples .

def find_min_max(tuples_list):

    min_value = tuples_list[0][0]
    max_value = tuples_list[0][0]

    for tpl in tuples_list:
        for value in tpl:
            if value < min_value:
                min_value = value
            if value > max_value:
                max_value = value

    return min_value, max_value


tuples_list = [(3, 5, 1), (10, 2, 8), (6, 7, 4)]
min_value, max_value = find_min_max(tuples_list)
print("Minimum value: ", min_value)
print("Maximum value: " ,max_value)

# d) Program to remove element from the tuple .

def removetuple(tu, element):
    index = tu.index(element)
    return tu[:index] + tu[index+1:]

tu = (1,2,3,4,5,6,7)
rev = removetuple(tu , 7)
print("After removing element the tuple is " , rev)

# e) Program to check whether element is exist in a tuple or not

def exist(tu , element) :
    for i in tu :
        flag = False
        if i==element :
            flag = True
            break
    if flag:
        print(element , " exists.")
    else :
        print("Element doesnt exist")

tu = 1,2,4,6,7,8,23
exist(tu , 4)

# f) Program to insert key values in a dictionary .

def dict():
    n = int(input("Enter the number of key-value pairs : "))
    dictt = {}

    for i in range(n):
        key = input("Enter key : ")
        value = input("Enter value : ")
        dictt[key] = value

    print(dictt)

# g) Program to sum of all items in dictionary .

def summm(dict):
    total = 0
    for i in dict.values():
        total = total + i

    print("Sum of all items is " , total)

dict = { 1 : 10 , 2:20 , 3:30 , 4:40, 5:50}
#summm(dict)


# h) Program to concatenate given dictionaries

def concatee(dict1,dict2):
    res = dict1.copy()

    res.update(dict2)

    print(res)

dict1 = {1: 10, 2: 20, 3: 30}
dict2 = {4: 40, 1: 50, 6: 60}
concatee(dict1 , dict2)

# i) Program to find occurance of a word in a given string

def find_char_occurrence():
    string = input("Enter your string: ").lower()
    char = input("Enter the character to find: ").lower()

    count = 0
    for c in string:
        if c == char:
            count += 1

    print(f"The character '{char}' occurs {count} times in the given string.")

# Example usage
find_char_occurrence()

















