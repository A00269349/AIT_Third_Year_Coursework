#include <windows.h>
#include <iostream>
#include <string>
#include <vector>

using namespace std;

int main()
{
    vector<double> doubles;
    vector<double>::iterator doubles_iterator;

    //  Add elements at the end of the vector
    for (int i = 0; i < 10; i++)
    {
        doubles.push_back(i);
    }

    doubles_iterator = doubles.begin();

    for (size_t i = 0; i < doubles.size() / 2; i++)
    {
        doubles_iterator++;
    }

    //  Add elements to the middle of the vector
    doubles.insert(doubles_iterator, 23);

    //  Remove elements from the end of the vector
    doubles.pop_back();

    //  Remove elements from the middle of the vector
    doubles.erase(doubles_iterator);
}
