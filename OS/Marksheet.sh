echo "*********" 
echo "Mark Sheet"
echo "*********"

echo "Enter your name: "
read name 
echo "Enter your roll nummber" 
read roll 
echo "Enter your marks in Operating System: "
read os
echo "Enter your marks in Data Base: "
read db
total=`expr $os + $db`
echo "Total marks : $total" 
per=`expr $total / 2` 
echo "Percentage : $per"
if [ $per -ge 80 ]
then 
echo "Grade A" 
elif [ $per -ge 70 ]
then 
echo "Grade B" 
fi 


