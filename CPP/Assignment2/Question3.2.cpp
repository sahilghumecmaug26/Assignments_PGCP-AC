#include <iostream>
using namespace std;

namespace Physics
{
    double clamp(double val, double min, double max)
    {
        if (val < min)
            return min;

        if (val > max)
            return max;

        return val;
    }

    double lerp(double a, double b, double t)
    {
        return a + (b - a) * t;
    }
}


namespace GameMath
{
    int clamp(int val, int min, int max)
    {
        if (val < min)
            return min;

        if (val > max)
            return max;

        return val;
    }

    double lerp(double a, double b, double t)
    {
        return a + (b - a) * t;
    }
}


int main()
{
    double velocity = Physics::clamp(15.5, 0.0, 10.0);

    cout << "Physics Clamp: "
         << velocity << endl;


    int health = GameMath::clamp(120, 0, 100);

    cout << "GameMath Clamp: "
         << health << endl;


    cout << "Physics Lerp: "
         << Physics::lerp(0, 100, 0.5)
         << endl;


    cout << "GameMath Lerp: "
         << GameMath::lerp(0, 100, 0.25)
         << endl;


    // Limited scope
    {
        using namespace Physics;

        cout << "Limited Scope Clamp: "
             << clamp(20.0, 0.0, 10.0)
             << endl;
    }

    return 0;
}
