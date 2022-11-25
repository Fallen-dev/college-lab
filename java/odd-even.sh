#I/bin/bash
read -p 'Enter a number :: ' number
[[ $((number%2)) -eq 0 ]] && printf '%d is even number\n' $number || printf '%d is odd\n' $number
