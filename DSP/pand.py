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
    'Name': ['Alice', 'Bob', 'Charlie'],
    'Age': [25, 30, 35],
    'City': ['New York', 'Los Angeles', 'Chicago']
}
df = pd.DataFrame(data)
print(df)



