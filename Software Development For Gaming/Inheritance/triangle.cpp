#pragma once 
#include "shape.h"
#include "triangle.h";
#include <iostream>

using namespace std;

Triangle::Triangle() {
	height = 0;
	base = 0;
}

Triangle::Triangle(std::string p_color, double p_base, double p_height) : Shape(p_color)
{
	height = p_height;
	base = p_base;
}

void Triangle::SetBaseLength(double p_base) {
	base = p_base;
}

void Triangle::SetPerpendicularHeight(double p_height){
	height = p_height;
}

void Triangle::PrintDetails()
{
	Shape::PrintDetails();
	cout << "HEIGHT = " << height << endl;;
	cout << "BASE = " << base << endl;;
}

void Triangle::CalculateArea() {
	double half = 1 / 2;

	double area = half * base * height;

	cout << "AREA: " << area;

}