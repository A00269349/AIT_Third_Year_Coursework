#pragma once
#include <string>
#include "shape.h"
 
class Triangle : public Shape
{
public:
	Triangle();
	Triangle(double p_base, double p_height, std::string p_color)
	void SetPerpendicularHeight(double height);
	void SetBaseLength(double base);
private:
	double height, base;

};