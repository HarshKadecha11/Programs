import numpy as np

arr3 = np.array([[[1, 2, 3], [4, 5, 6]],
                  [[7, 8, 9], [10, 11, 12]],
                  [[13, 14, 15], [16, 17, 18]]])

np.save('outfile' , arr3)   # To save the file in .npy extention

b = np.load('outfile.npy')
print(b)

a = np.array([1,2,3,4,5])
np.savetxt('textfile.txt',a)

arr = np.arange(1,10,2)
print("Elements : " ,arr)
a1 = arr[np.array([4,0,2,-1,-2])]
print("Indexed Elements : " , a1)
