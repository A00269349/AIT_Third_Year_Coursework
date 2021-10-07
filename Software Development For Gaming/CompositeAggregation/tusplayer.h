#pragma once
#include "tusWeapon.h"
#include "tusLocation.h"

class tusPlayer
{
public:
	// Default constructor
	tusPlayer();
	// Constructor
	tusPlayer(int healthParam, tusLocation locParam, tusWeapon weapon, bool shieldOnParam = false);

private:
	int health;
	tusLocation location;
	tusWeapon weapon;
	bool shieldOn;
};