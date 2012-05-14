// This is a simple testfile
// Pipe it to java C in order to test the compiler

int i = 0;
int j = 1, k, b = 3;
int c;


int foo(int a, int b) {
    return a + b;
}

void bar(int c) {
    int b = 1 >> 3;
    ++c;
    c++;
    int a = b = 5, c = 9;
    a=foo(c,4);
}


int main()
{
  int i;
  int a = 1;
  for(i=0;i<10;i++){
   a *= 2;
  }
}

