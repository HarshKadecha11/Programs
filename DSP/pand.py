import random

import pandas as pd
import numpy as np

#Creating empty series

ser = pd.Series()
print(ser)

#Array
data = np.array(['g' , 'e' , 'e' , 'k' , 's'])
ser = pd.Series(data)
print(ser)


d = pd.read_csv("books.csv")
print(d)

import pandas as pd
import numpy as np

#Creating empty series

ser = pd.Series()
print(ser)

data = {
    'Name': ['Harsh', 'Aniket', 'Charlie'],
    'Age': [45, 32, 37],
    'City': ['New York', 'Los Angeles', 'Chicago'],
}
df = pd.DataFrame(data)

print(df)


sorted_df = df.sort_values(by='City')
print("Sorted by City : \n" , sorted_df)

sorted_index = df.sort_index()
print("Sorted by index : \n " , sorted_index)

s = pd.Series(['Tom' , 'William Rick' , 'John' , ])

info = pd.DataFrame({
    'P':['h','e','l','l','o'],
    'Q':[1,2,3,4,5],
    'R':['hitarth','esha','lakshya','lokesh','osman'],
    'S':[6,7,8,9,10]},
    index = [7,12,9,10,11]
)

ind = info.sort_index()
print(ind)

h = pd.read_csv("books.csv" , index_col="Name")
first = data["Age"]
print(first)

# Homework ---  Most Common 10 python errors