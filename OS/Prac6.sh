while true
do 
    echo "1.Display the calender of the current month "
    echo "1. Addition "
    echo "2. Substraction " 
    echo "3. Multiplication " 
    echo "4. Division "
    echo "5. Exit  "
    echo "Enter Your choice :"
    read ch 
    if [ $ch -eq 5 ]
    then 
        echo "Quitting" 
        break 
    fi 