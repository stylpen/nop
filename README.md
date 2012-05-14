# NOP #
Nop is not only a parser, but also a not optimized compiler based on ANTLR-3.

It serves as a project for the compiler construction lecture at university and currently compiles a subset of ANSI-C to assembly code for the DCPU-16 architecture (specification 1.1).
See proposal.pdf for a list of probably supported language constructs and http://0x10c.com/ for more information about the DCPU-16 architecture.

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