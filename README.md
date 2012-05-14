# NOP #
Nop is not only a parser, but also a not optimized compiler based on ANTLR-3.

It currently compiles a subset of ANSI-C to assembly code for the DCPU-16 architecture.

###Usage ###
Execute the following code in order to compile a .c file
````
$ ./make.sh
$ cat main.c | java C 
$ cat asm.txt
````

Afterwards use e.g http://migerh.github.com/dcpu16.js/ to run your assembled code. 



###License ###
All code is licensed under GPL-3.