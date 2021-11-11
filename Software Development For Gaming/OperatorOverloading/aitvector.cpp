#include "aitvector.h"

aitVector::aitVector()
{
	x = 0.0f;
	y = 0.0f;
	z = 0.0f;
}

aitVector::aitVector(float xp, float yp, float zp)
	: x(xp), y(yp), z(zp)
{
}

aitVector operator+(const aitVector& lhs, const aitVector& rhs)
{
	aitVector result;
	result.x = lhs.x + rhs.x;
	result.y = lhs.y + rhs.y;
	result.z = lhs.z + rhs.z;
	return result;
}

aitVector operator-(const aitVector& lhs, const aitVector& rhs)
{
	aitVector result;
	result.x = lhs.x - rhs.x;
	result.y = lhs.y - rhs.y;
	result.z = lhs.z - rhs.z;
	return result;
}