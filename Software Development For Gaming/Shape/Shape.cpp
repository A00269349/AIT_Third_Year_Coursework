
#include <iostream>
#include <string>
using namespace std;
class Shape
{
public:
    string colour;
    void SetColor(string colour)
    {
        this->colour =  colour;
    }

    string GetColor()
    {
        return colour;
    }
}

main()
{
    std::cout << "Hello World!\n";
}
