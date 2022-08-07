#!/usr/bin/env bash
set -e; set -u

read -p "Enter a letter :: " char

case $char in
  A|E|I|O|U|a|e|i|o|u) echo \"$char\" is a vowel;;
  *) echo \"$char\" is a consonant;;
esac

