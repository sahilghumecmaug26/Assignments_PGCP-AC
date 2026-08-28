#include <iostream>

using namespace std;

int main7()
{
    int statusReg  = 0b10110001;
    int controlReg = 0b00000000;
    int dataReg    = 0b11001010;


    // regPtr1 : Pointer to const


    const int *regPtr1 = &statusReg;

    cout << "Status Register : "<< *regPtr1 << endl;

    // Attempt to write
   // *regPtr1 = 10;
    // ERROR: Cannot modify the value through a pointer to const.


    // Attempt to repoint
    regPtr1 = &dataReg;       // This IS allowed

    cout << "After repointing : " << *regPtr1 << endl;



    // regPtr2 : Const pointer


    int *const regPtr2 = &controlReg;

    // Writing is allowed
    *regPtr2 = 0b11110000;

    cout << "Control Register : "<< *regPtr2 << endl;


    // Attempt to repoint
    // regPtr2 = &dataReg;
    // ERROR: regPtr2 is a const pointer so its address cannot be changed.



    // regPtr3 : Const pointer to const

    const int *const regPtr3 = &statusReg;

    cout << "Status Register 2 : " << *regPtr3 << endl;


    // Attempt to write
    // *regPtr3 = 20;
    // ERROR: Cannot modify the value because regPtr3 points to const data.


    // Attempt to repoint
    // regPtr3 = &dataReg;
    // ERROR: regPtr3 itself is const, so it cannot point to another address.


    return 0;
}
