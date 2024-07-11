echo "Enter the number to find the factorial : " 
read n 
i= $n 
fact=1
while [ $i -le 1 ]
do 
fact=`expr $fact \* $i` 
i=`expr $i - 1`
done
echo "Factorial of $n is $fact"
