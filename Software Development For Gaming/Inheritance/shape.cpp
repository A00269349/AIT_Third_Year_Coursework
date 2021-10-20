// Include the shape header file.
#include "shape.h"
#include <iostream>
using namespace std;
Shape::Shape()
{
	colour = "empty";
}

Shape::Shape(std::string colourParam)
{
	colour = colourParam;
}

std::string Shape::getColour() const
{
	return colour;
}

void Shape::setColour(std::string colourParam)
{
	colour = colourParam;
}

void Shape::PrintDetails()
{
	cout << "COLOUR: " << colour << endl;;
}

double Shape::CalculateArea()
{
	return 0.0;
}




