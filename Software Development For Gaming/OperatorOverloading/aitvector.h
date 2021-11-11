#ifndef AITVECTOR_H
#define AITVECTOR_H

class aitVector
{
public:
	aitVector();
	aitVector(float xp, float yp, float zp);

public:
	float x;
	float y;
	float z;
};

aitVector operator+(const aitVector& lhs, const aitVector& rhs);
aitVector operator-(const aitVector& lhs, const aitVector& rhs);

#endif