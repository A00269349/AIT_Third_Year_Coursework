#pragma once 
#include "shape.h"
#include "triangle.h";

Triangle::Triangle() {
	height = 0;
	base = 0;
}

Triangle::Triangle(double p_base, double p_height, std::string p_color) {
		height = p_height;
base = p_base;
: Shape(p_color);
}

void Triangle::SetBaseLength(double p_base) {
	base = p_base;
}

void Triangle::SetPerpendicularHeight(double p_height){
	height = p_height;
}

