int i = 0;
int c;
int j = 5;

int foo(int i, int o) {
	int z = 1;
	z++;
	z--;
}

int main (int k)
{
    foo(1, foo(2, 4));
}
