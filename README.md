# NOP #
Nop is not only a parser, but also a not optimized compiler.

It uses ANTLR-3 for parsing input files and serves as a project for the compiler construction lecture at university.
It currently compiles a subset of ANSI-C to assembly code for the DCPU-16 architecture according to specification 1.1.
See proposal.pdf for a list of probably supported language constructs and http://0x10c.com/ for more information about the DCPU-16 architecture.

###Usage ###
Run the make.sh script after changes to the grammar or when running for the first time in order to prepare all necessary files. 
In case the script fails make sure that the project directory, the src folder and the ANTLR files are in your Java classpath. 

Execute the following code in order to compile a .c file
````
$ cat main.c | java C 
$ cat asm.txt
````

Afterwards use e.g http://migerh.github.com/dcpu16.js/ to run your assembled code. 

###License ###
Copyright (C) 2012 Stephan Wypler, Alexander Rust

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program.  If not, see <http://www.gnu.org/licenses/>.