#!/usr/bin/env bash
set -e; set -u

printf 'Enter three numbers :: '
read a b c

if [ $a -eq $b -a $a -eq $c ]; then
    printf 'All the three numbers are equal'
else
    if [ $a -gt $b -a $a -gt $c ]; then
        printf '%d is the largest number\n' $a
    elif [ $b -gt $a -a $b -gt $c ]; then
        printf '%d is the largest number\n' $b
    elif [ $c -gt $a -a $c -gt $b ]; then
        printf '%d is the largest number\n' $c
    fi
fi
