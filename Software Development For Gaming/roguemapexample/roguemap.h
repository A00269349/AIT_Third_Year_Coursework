// Sample RogueMap class
//###########################################################
//# PLEASE READ THE MULTIDIMENSIONAL ARRAYS DOCUMENT FIRST
//###########################################################
#include <string>
class RogueMap
{
public:
	RogueMap();
	~RogueMap();

	// Load the map from a file
	void loadMapFromFile(std::string);
	// Load the map from a user defined array
	void loadMapFromArray(char* m, int width, int height);
	// Get the character at position xy on the map 
	char getXY(int x, int y);
	// Set the character at position xy on the map 
	void setXY(int x, int y, char value);
	// Print the map at an offset
	void printMap(int offsetX, int offsetY);

private:
	// A Pointer to the 
	char* map;
	int mapWidth;
	int mapHeight;
};