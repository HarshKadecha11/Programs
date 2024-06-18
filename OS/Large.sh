x=$1
y=$2
z=$3 

if [ $x -gt $y ]
then 
    if [ $x -gt $z ]
    then 
        echo "$x is the largest."
    else 
        echo "$z is the largest."
    fi 
else 
    if [ $y -gt $z ]
    then 
        echo "$y is the largest."
    else 
        echo "$z is the largest."
    fi 

fi 

