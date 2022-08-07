#!/usr/bin/env bash
set -e; set -u

function string_copy() {
  read -p 'Enter a word :: ' word

  word=$(printf $word%.0s {1..5})

  printf '%s\n' $word
}

string_copy
