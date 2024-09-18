f=open("Book1.csv","r")
rows=f.readlines()
print(rows)
avg1,avg2,avg3=0,0,0
minsub1,minsub2,minsub3=100,100,100
maxsub1,maxsub2,maxsub3=0,0,0
isFirstLine=True
for i in rows:
    if isFirstLine:
        isFirstLine=False
        continue
    cols=i.split(',')
    print("Student Enrollment no= ",cols[0],end=" ")
    print("Student name= ",cols[1],end=" ")
    print("Subject1= ",cols[2],end=" ")
    print("Subject2= ",cols[3],end=" ")
    print("Subject3= ",cols[4],end=" ")
    avg1+=int(cols[2])/3
    avg2+=int(cols[3])/3
    avg3+=int(cols[4])/3
    if int(cols[2])<minsub1:
        minsub1=int(cols[2])
    if int(cols[2])>maxsub1:
        maxsub1=int(cols[2])
    if int(cols[3])<minsub2:
        minsub2=int(cols[3])
    if int(cols[3])>maxsub2:
        maxsub2=int(cols[3])
    if int(cols[4])<minsub3:
        minsub3=int(cols[4])
    if int(cols[4])>maxsub3:
        maxsub3=int(cols[4])
print("Subject 1 avg:",avg1)
print("Subject 2 avg:",avg2)
print("Subject 3 average:",avg3)
# min and max of sub1
print("Subject 1 min:",minsub1)
print("Subject 1 max:",maxsub1)
# min and max of sub2
print("Subject 2 min:",minsub2)
print("Subject 2 max:",maxsub2)
# min and max of sub3
print("Subject 3 min:",minsub3)
print("Subject 3 max:",maxsub3)