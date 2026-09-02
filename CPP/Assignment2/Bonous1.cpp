#include <iostream>
using namespace std;

int level = 1;   // Global variable

int main()
{
    int level = 10;   // Local variable

    cout << "Local level  : "
         << level << endl;

    cout << "Global level : "
         << ::level << endl;

    return 0;
}
