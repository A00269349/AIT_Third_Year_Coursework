#pragma once
#include "tusWeapon.h"
#include "tusLocation.h"

class tusPlayer
{
public:
	// Default constructor
	tusPlayer();
	tusPlayer(int healthParam, tusLocation locParam, bool shieldOnParam, tusWeapon weapon);
	// Constructor
	tusPlayer(int healthParam, tusLocation locParam, tusWeapon weapon, bool shieldOnParam = false);

private:
	int health;
	tusLocation location;
	tusWeapon weapon;
	bool shieldOn;
};