echo "How many numbers you want to enter? " 
read n 
i=0 
while [ $i -lt $n ]
do 
    echo "Enter the $i th element" 
    read arr[i] 
    i=`expr $i + 1` 
done 
sum=0 
for i in "${arr[@]}"
do 
    sum=`expr $sum + $i`
done 
echo "The sum of the numbers are $sum " 



