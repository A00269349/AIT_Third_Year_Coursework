#include "shape.h"
#include "triangle.h"
#include <iostream>
using namespace std;
int main()
{
	Shape myShape;

	Triangle triangle_1;
	Triangle triangle_2("BLACK", 12.3,13.2);

	triangle_1.PrintDetails();
	triangle_2.PrintDetails(); 

	Shape* shapes[3];
	shapes[0] = new Triangle("BLACK", 12.3, 13.2);
	shapes[1] = new Triangle("BLACHFKJDAFHKJDSK", 12132132.3, 13.22131);
	shapes[2] = new Triangle("BLACKFDASKJF;LKDSAJFLKDA", 1232112.3, 12132133.2);

	for (int i = 0; i < 3; i++)
	{
		shapes[i]->PrintDetails();
		cout << "The area of the shape is: " << shapes[i]->CalculateArea() << "." << endl;
	}

	for (int i = 0; i < 3; i++)
	{
		delete shapes[i];
	}
}