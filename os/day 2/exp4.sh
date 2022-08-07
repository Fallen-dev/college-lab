#!/usr/bin/env bash
set -e; set -u

read -p 'Enter a number :: ' num

fact=1

for (( i=2; i<=num; i++)) {
  fact=$(($fact*$i))
}

printf 'The factorial of %d is %d\n' $num $fact
