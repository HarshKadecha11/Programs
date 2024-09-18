
with open("books.csv") as f :
    rows = f.readlines()
    c = True
    avg1,avg2,avg3,avg4 = 0,0,0 ,0
    for i in rows :
        if c :
            c = False
            continue
        cols = i.split(',')
        # print("Eno : " , cols[0] , end = " ")
        # print("Name : " , cols[1],end = " ")
        # print("Sub1 : " , cols[2] , end = " ")
        # print("Sub2 : ", cols[3], end=" ")
        # print("Sub3 : ", cols[4], end=" ")
        # print("Sub4 : ", cols[5], end=" ")
        print("\n")

        avg1 += int(cols[2])/3
        avg2 +=int(cols[3])/3
        avg3 +=int(cols[4])/3
        avg4 +=int(cols[5])/3

print(avg1)
print(avg2)
print(avg3)
print(avg4)
