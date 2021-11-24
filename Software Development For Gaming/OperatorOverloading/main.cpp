#include <iostream>
#include <assert.h>
#include <string>

using namespace std;

template<class T>
T addFuunction(T x, T y) {
	return x + y;
}

template<class T>
T reverse(T x) {
	return -x;
}

template<class T>
T findLargest(T x, T y, T z) {
	T largest = 0;
	if ((x >= y) && (x >= z)) {
		largest = x;
	}
	if ((y >= x) && (y >= z)) {
		largest = y;
	}
	if ((z >= x) && (z >= y)) {
		 largest = z;
	}
	return largest;
}

int main()
{
	/*
	aitVector va(1.0f, 3.0f, 5.0f);
	aitVector vb(2.0f, 2.0f, 2.0f);
	aitVector vc = va + vb;

	aitVector vd = va - vb;

	return 1;
	*/
	int x = 1;
	int y = 1;
	int z = 2;
	cout << "1 + 1 = " << addFuunction(x, y);
	cout << endl;
	cout << "1 Negated is " << reverse(x);
	cout << endl;
	cout << "The largest out of 1 1 2 = " << findLargest(x, y, z);
	return 0;
}