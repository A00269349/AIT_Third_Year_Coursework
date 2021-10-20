#include "shape.h"
#include "triangle.h"

int main()
{
	Shape myShape;

	Triangle triangle_1;
	Triangle triangle_2("BLACK", 12.3,13.2);

	triangle_1.PrintDetails();
	triangle_2.PrintDetails();
}