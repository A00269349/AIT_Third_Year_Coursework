#include <iostream>
#include <assert.h>
#include "aitvector.h"

using namespace std;

int main()
{
	aitVector va(1.0f, 3.0f, 5.0f);
	aitVector vb(2.0f, 2.0f, 2.0f);

	aitVector vc = va + vb;

	aitVector vd = va - vb;

	return 1;
}