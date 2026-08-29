#include <iostream>

using namespace std;

struct Layout1
{
    char c1;
    int i;
    char c2;
};

struct Layout2
{
    int i;
    char c1;
    char c2;
};

int main()
{
    cout << "Size of Layout1 : " << sizeof(Layout1) << " bytes" << endl;
    cout << "Size of Layout2 : " << sizeof(Layout2) << " bytes" << endl;

    /*
        Struct Padding Explanation:

        1. Layout1 and Layout2 contain the same members, but the
           members are arranged in different orders. Because of
           this different order, the compiler may add different
           amounts of padding.

        2. Padding means unused memory bytes inserted by the compiler
           between or after structure members. The compiler adds
           padding to satisfy memory alignment requirements.

        3. In Layout1, the char comes before the int. Since an int
           commonly requires 4-byte alignment, the compiler adds
           padding between c1 and i.

        4. In Layout2, the int comes first and the two char variables
           come together. Therefore, less padding is required.

        5. Member order matters in network packet headers and hardware
           register maps because the exact position and offset of each
           member can be important. Changing the order can change the
           memory layout and size of the structure.
    */

    return 0;
}
