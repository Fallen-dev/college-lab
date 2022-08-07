#!/usr/bin/env bash
set -e; set -u

read -p 'Enter a number :: ' num

if [[ $((num%2)) -eq 0 ]]; then
  printf '%d is Even\n' $num
else
  printf '%d is Odd\n' $num
fi
