#!/bin/sh
export CLASSPATH=/Users/alexander/Code/nop/src:.:/Users/alexander/Studium/Semester4/FLA/Antlr/antlr-3.4-complete.jar
java org.antlr.Tool nopC.g 
javac src/*.java 
javac C.java
