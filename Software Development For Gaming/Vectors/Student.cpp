#include <windows.h>
#include <iostream>
#include <string>
#include <vector>

using namespace std;

class Student
{
private:
public:
    string name;
    double score;

    void setDetails(string new_name, double new_score)
    {
        new_name = name;
        new_score = score;
    }
};

Student::Student()
{
}

Student::~Student()
{
}

int main()
{
    vector<Student> student;
    vector<Student>::iterator student_itr;

    Student bob;
    Student lilian;
    Student sanna;
    Student adeeb;
    Student reef;

    bob.setDetails("Bob Roberson", 44);
    lilian.setDetails("Lilian Macdonald", 53);
    sanna.setDetails("Sanna Finney", 31);
    adeeb.setDetails("Adeeb Reeves", 65);
    reef.setDetails("Reef Moody", 67);

    student.push_back(bob);
    student.push_back(lilian);
    student.push_back(adeeb);
    student.push_back(reef);

    student_itr = student.begin();

    for (size_t i = 0; i < student.size() / 2; i++)
    {
        student_itr++;
    }

    student.insert(student_itr, sanna);

    student.pop_back();

    student.erase(student_itr);
}
