#!/bin/bash
# Script to add a user to Linux system
if [ $(id -u) -eq 0 ]; then
$username=johndoe
read -s -p "Enter password : " password
egrep "^$username" /etc/passwd >/dev/null
if [ $? -eq 0 ]; then
echo "$username exists!"
exit 1
else
useradd -m -p $password $username
[ $? -eq 0 ] && echo "User has been added
to system!" || echo "Failed to add a user!"
fi
fi