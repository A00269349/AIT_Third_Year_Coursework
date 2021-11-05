#pragma once
#include "Body.h"

class SoftBody : public Body
{
public:
	SoftBody();
	~SoftBody();
private:
	double viscosity;
};
