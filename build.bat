@echo off

FOR %%A IN (target\*.*) DO DEL %%A

javac -d target DigitizeMe.java

