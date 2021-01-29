#!/bin/bash
_test_func(){ 
 echo 'MahmoodAdil'
 echo 'Building from Git Repo'
 pwd
 mkdir -p fun2go
 cd fun2go
 echo 'after CD to fun2go'
 pwd
 touch fun2testgo.txt
 ls
 git status
 git add -A
 git commit -m "great work done"
 git push origin master
}