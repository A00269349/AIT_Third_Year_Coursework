#pragma once
#include <string>
#include "shape.h"
 
class Triangle : public Shape
{
public:
	Triangle();
	Triangle(std::string p_color, double p_base, double p_height);
	void SetPerpendicularHeight(double height);
	void SetBaseLength(double base);
	void PrintDetails();
	void CalculateArea();

private:
	double height, base;

};