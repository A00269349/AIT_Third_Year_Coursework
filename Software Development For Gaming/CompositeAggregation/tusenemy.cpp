#pragma once
#include "tusEnemy.h"
#include <stddef.h>

tusEnemy::tusEnemy()
{
	damage = 0;
	p = NULL;
}

tusEnemy::tusEnemy(int damageParam)
{
	damage = damageParam;
}