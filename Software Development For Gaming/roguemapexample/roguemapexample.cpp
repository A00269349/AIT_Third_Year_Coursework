#include <windows.h>
#include <iostream>
#include <string>
#include "roguemap.h"
#include "utility.h"

unsigned int playerPositionX = 5;
unsigned int playerPositionY = 5;
unsigned int newPlayerPositionX = playerPositionX;
unsigned int newPlayerPositionY = playerPositionY;

unsigned int health = 0;

char playerChar = 2;

RogueMap map;

void handleInput()
{
	newPlayerPositionX = playerPositionX;
	newPlayerPositionY = playerPositionY;

	if (GetKeyState(VK_UP) & 0x8000)
	{
		newPlayerPositionY = playerPositionY - 1;
	}

	if (GetKeyState(VK_DOWN) & 0x8000)
	{
		newPlayerPositionY = playerPositionY + 1;
	}

	if (GetKeyState(VK_RIGHT) & 0x8000)
	{
		newPlayerPositionX = playerPositionX + 1;
	}

	if (GetKeyState(VK_LEFT) & 0x8000)
	{
		newPlayerPositionX = playerPositionX - 1;
	}
}

void handleCollisions()
{
	char potPos = map.getXY(newPlayerPositionX, newPlayerPositionY);

	switch (potPos)
	{
	case 'a':
		newPlayerPositionX = playerPositionX;
		newPlayerPositionY = playerPositionY;
		break;
	case 'H':
		if (health < 10)
		{
			// Increase our health
			health += 10;

			// Remove the health pack from the map
			map.setXY(newPlayerPositionX, newPlayerPositionY, ' ');
		}
		break;
	}

}

void renderGUI()
{
	// RogueMap::getHeight() needs to be implemented
	// Do nothing for now
	//utility::gotoScreenPosition(2, map.getHeight() + 3);
	//std::cout << "Health: " << health;
}

void renderPlayer()
{
	// Blank old player position by querying the map
	// for the char 'underneath' the current players 
	// position and printing that.
	utility::gotoScreenPosition(playerPositionX, playerPositionY);
	char oldPos = map.getXY(playerPositionX, playerPositionY);
	std::cout << oldPos;

	// Draw new player position
	utility::gotoScreenPosition(newPlayerPositionX, newPlayerPositionY);
	std::cout << playerChar;

	playerPositionX = newPlayerPositionX;
	playerPositionY = newPlayerPositionY;

	Sleep(60);
}

void setupMap()
{
	/*const int levelWidth = 4;
	const int levelHeight = 4;

	// We use levelWidth+1 because strings are always  terminated with '\0'
	// Example the string "????" is actually the following five characters
	// '?''?''?''?''\0'
	char level[levelHeight][levelWidth + 1] =
	{
	"????",
	"?  ?",
	"?  ?",
	"????"
	};*/

	const int levelWidth = 20;
	const int levelHeight = 10;

	// Why do we use levelWidth+1? Please see explanation above
	char level[levelHeight][levelWidth + 1] =
	{
	"????????????????????",
	"?          H       ?",
	"?                  ?",
	"?                  ?",
	"?                  ?",
	"?      A           ?",
	"?                  ?",
	"?              H   ?",
	"?                  ?",
	"????????????????????"
	};

	// Load the map from the array
	// &level[0][0] - this give a pointer to the first element
	map.loadMapFromArray(&level[0][0], levelWidth + 1, levelHeight);

	//map.loadFromFile("mylevel.txt");
}

int main()
{
	HWND console = GetConsoleWindow();
	RECT r;
	GetWindowRect(console, &r);

	MoveWindow(console, r.left, r.top, 800, 800, TRUE);

	utility::showConsoleCursor(false);

	setupMap();

	map.printMap(0, 0);

	while (true)
	{
		// Handles the input and updates the players position
		handleInput();

		// Handle Collisions
		handleCollisions();

		// Render the scene
		renderPlayer();

		// Render the GUI
		// Does nothing right now
		renderGUI();
	}

	return 0;
}