// Include the shape header file.
#include "shape.h"

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




