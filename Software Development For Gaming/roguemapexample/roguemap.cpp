//###########################################################
//# PLEASE READ THE MULTIDIMENSIONAL ARRAYS DOCUMENT FIRST
//###########################################################
#include "roguemap.h"
#include "utility.h"
#include <iostream>

RogueMap::RogueMap()
{
	map = NULL;
	mapWidth = 0;
	mapHeight = 0;
}

RogueMap::~RogueMap()
{
	delete[] map;
}

void RogueMap::loadMapFromArray(char* m, int width, int height)
{
	mapWidth = width;
	mapHeight = height;
	// we can't do this: map = new char[height][width];
	map = new char[width * height];

	// Option A: Copy array element by element
	for (int y = 0; y < height; y++)
	{
		for (int x = 0; x < width; x++)
		{
			map[y * width + x] = m[y * width + x];
		}
	}

	// Option B: Block copy
	//memcpy(map, m, width * height);
}

void RogueMap::loadMapFromFile(std::string)
{
	// Open the file

	// Read the first line of the file
	// and get the length of the string.
	// This will give you the level width

	// Count the number of lines in the file
	// This will give you the level height

	// Allocate memory on the heap to load the map
	// i.e. map = new char[width * height];

	// Read the file again and populate your
	// new block of memory.

}

char RogueMap::getXY(int x, int y)
{
	return map[y * mapWidth + y];
}

void RogueMap::setXY(int x, int y, char value)
{
	map[y * mapWidth + x] = value;
}

void RogueMap::printMap(int offsetX, int offsetY)
{
	utility::gotoScreenPosition(offsetX, offsetY);
	for (int y = 0; y < mapHeight; y++)
	{
		for (int x = 0; x < mapWidth; x++)
		{
			std::cout << map[y * mapWidth + x];
		}
		std::cout << std::endl;
	}
	std::cout << std::endl;
}