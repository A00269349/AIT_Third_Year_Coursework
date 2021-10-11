#pragma once
#include "tusPlayer.h"

class tusEnemy
{
public:


	// Default constructor
	tusEnemy();

	// Constructor
	tusEnemy(int damageParam);

private:
	int damage;
	tusPlayer* p;
};
