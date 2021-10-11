#pragma once
#include <string>

class tusWeapon
{
public:
	// Default constructor
	tusWeapon();

	// Constructor
	tusWeapon(std::string name, int damage, bool playerHasWeapon);

private:
	std::string name;
	int damage;
	bool playerHasWeapon;
};
