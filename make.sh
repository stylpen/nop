#!/bin/sh
java org.antlr.Tool nopC.g 
javac src/*.java 
javac C.java
