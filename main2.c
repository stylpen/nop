int i = 0;
int c;
int j = 5;
int d = 11;

int foo(int i, int o) {
	int x = i * o;
}

int main (int k)
{
	int z = foo(j, foo(d, 3));

	/*z = z == 10 ? 2 : 1;
	x = b + a;
	a = (b != d) + (i < j);
	a = 0;	
	z = b / a;*/
}
