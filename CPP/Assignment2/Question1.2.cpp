#include <iostream>
using namespace std;


double reorderCost(int qty, double unitPrice)
{
    return qty * unitPrice;
}


double reorderCost(double qty, double unitPrice)
{
    return qty * unitPrice;
}


double reorderCost(int qty, double unitPrice, double taxRate)
{
    double cost = qty * unitPrice;
    double tax = cost * taxRate / 100;

    return cost + tax;
}

double applyDiscount(double price, double discountPercent = 10.0)
{
    double discount = price * discountPercent / 100;

    return price - discount;
}

int main()
{

    cout << "Integer Reorder Cost: "
         << reorderCost(10, 50.0) << endl;


    cout << "Fractional Reorder Cost: "
         << reorderCost(2.5, 100.0) << endl;

    cout << "Reorder Cost with Tax: "
         << reorderCost(10, 50.0, 18.0) << endl;

    cout << "Discounted Price (Default 10%): "
         << applyDiscount(1000) << endl;


    cout << "Discounted Price (20%): "
         << applyDiscount(1000, 20.0) << endl;

    return 0;
}
