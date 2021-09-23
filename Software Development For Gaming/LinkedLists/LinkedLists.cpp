#include <windows.h>
#include <iostream>
#include <string>
using namespace std;

#include <iostream>
#include <list>

class Phones
{
private:
    string make;
    double price;
    int release_year;

public:
    Phones();
    ~Phones();
    void createPhone(string make, double price, int release_year)
    {
        this->make = make;
        this->price = price;
        this->release_year = release_year;
    }
};

Phones::Phones()
{
}

Phones::~Phones()
{
}

int main()
{
    list<double> list_double;

    for (int i = 0; i < 10; ++i)
    {
        list_double.push_back(i);
    }

    list<Phones> phones_list;

    Phones samsung_s10;
    Phones iphone_x;
    Phones sony_xperia;

    samsung_s10.createPhone("samsung s10", 12.32, 2023);
    iphone_x.createPhone("iphone x", 41.23, 2345);
    sony_xperia.createPhone("sony xperia", 4.3, 1932);

    phones_list.push_back(samsung_s10);
    phones_list.push_back(iphone_x);
    phones_list.push_back(sony_xperia);
}