#include "tusWeapon.h"

// Default constructor
tusWeapon::tusWeapon()
{
	damage = 0;
	playerHasWeapon = false;
	name = "";
}

// Constructor
tusWeapon::tusWeapon(std::string name, int damage, bool playerHasWeapon)
{
	this-> name = name;
	this-> damage = damage;
	this-> playerHasWeapon = playerHasWeapon;
}