#!/bin/bash
echo -n "Enter three numbers :: "
read a b c
if [ $a -eq $b -a $a -eq $c ]; then
    echo "All the three numbers are equal"
elif [[ $a -eq $b || $b -eq $c || $c -eq $a ]]; then
    echo "Cannot find largest number"
else
    if [ $a -gt $b -a $a -gt $c ]; then
        echo "$a is biggest number"
    elif [ $b -gt $a -a $b -gt $c ]; then
        echo "$b is biggest number"
    elif [ $c -gt $a -a $c -gt $b ]; then
        echo "$c is biggest number"
    fi
fi
