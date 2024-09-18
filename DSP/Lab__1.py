#Indexing in 2 dimension

import numpy as np
arr1 = np.arange(12)
a = arr1.reshape(3,4)
print("Array : " ,a)
print("Indexed elements : " , a[0,0])

#Indexing in 3 dimension

c = arr1.reshape(2,2,3)
print("3D array : " , c)
print("ELEMENT" , c[1][0][2])

#Slicing in 2d array

print("Sliced Array is " , a[0: , 1:]) #First part represents row and second column


# Broadcasting !!

# print(np.amin(c[1][1]))
# print(np.amax(c[1][0]))

