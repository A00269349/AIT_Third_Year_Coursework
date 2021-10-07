#include "tusplayer.h"
#include "tusWeapon.h"


// Default constructor
tusPlayer::tusPlayer()
{
	health = 0;
	shieldOn = false;
}

// Constructor
tusPlayer::tusPlayer(int healthParam, tusLocation locParam, bool shieldOnParam, tusWeapon weapon)
{
	health = healthParam;
	location = locParam;
	shieldOn = shieldOnParam;
	
}