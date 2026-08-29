#include <iostream>
using namespace std;
int main(){

	double temperature[3][3];
	cout<<"Enter Temperatures of 9 rooms : "<<endl;
	for(int i=0;i<3;i++){
		for(int j=0;j<3;j++){
			cin >> temperature[i][j];
		}
	}

	int hotestRoom =0 ;
	int hotestFloor =0 ;

	cout << "\n        Room1   Room2   Room3"<<endl;
	for(int i=0;i<3;i++){
		cout << "Floor " << i + 1 << " : ";
		for(int j=0;j<3;j++){
			cout << temperature[i][j] << "     ";
		}
		cout << endl;
	}

    double hottest = temperature[0][0];
    int hottestFloor = 0;
    int hottestRoom = 0;

    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 3; j++)
        {
            if (temperature[i][j] > hottest)
            {
                hottest = temperature[i][j];
                hottestFloor = i;
                hottestRoom = j;
            }
        }
    }
    cout << "Hottest Room  : Floor "<< hottestFloor + 1<< ", Room " << hottestRoom + 1<< "  ->  " << hottest << "°C" << endl;

    double highestAverage = 0;
    int hottestFloorNumber = 0;

    for (int i = 0; i < 3; i++)
    {
        double sum = 0;

        for (int j = 0; j < 3; j++)
        {
            sum += temperature[i][j];
        }

        double average = sum / 3;

        if (average > highestAverage)
        {
            highestAverage = average;
            hottestFloorNumber = i;
        }
    }

    cout << "Hottest Floor : Floor "<< hottestFloorNumber + 1 << "  (avg " << highestAverage << "°C)" << endl;

    int warningRooms = 0;

    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 3; j++)
        {
            if (temperature[i][j] >= 30)
            {
                warningRooms++;
            }
        }
    }

    cout << "Rooms at WARNING or above : "<< warningRooms << endl;

	return 0;
}


// Output : 

// Enter Temperatures of 9 rooms : 
// 54
// 78
// 52
// 24
// 34
// 65
// 54
// 12
// 24

//         Room1   Room2   Room3
// Floor 1 : 54     78     52     
// Floor 2 : 24     34     65     
// Floor 3 : 54     12     24     
// Hottest Room  : Floor 1, Room 2  ->  78°C
// Hottest Floor : Floor 1  (avg 61.3333°C)
// Rooms at WARNING or above : 6

