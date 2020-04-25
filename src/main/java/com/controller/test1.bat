@echo off
title bat 脚本例子2
COLOR A
echo ------------bat脚本例子2----------
echo=
echo=
echo 当前工作路径为: %cd%
rem 输出文件目录的树形目录
tree /E >tree_list.TXT
rem CD切换不同盘符时候需要加上/d
cd /e c:\
echo 当前的工作路径为: %cd%
dir
rem 创建目录 bat_examole2
md bat_example2
dir
rem 拷贝目录/s/e/y说明:在复制文件的同时也复制空目录或子目录,如果目标路径已经有相同的文件了,使用覆盖的方式而不进行提示
Xcopy C:\bat_example2 d:\bat_examole2  /s/e/y
rem 删除目录 bat_example2
rem rd /q/s bat_example2
rem dir
echo=
echo=
echo ----------
PAUSE