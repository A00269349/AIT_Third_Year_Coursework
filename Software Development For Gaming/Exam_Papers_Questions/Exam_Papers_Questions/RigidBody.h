#pragma once
#include "Body.h"

class RigidBody : public Body
{
public:
	RigidBody();
	~RigidBody();
private:
	double elasticity;
};
