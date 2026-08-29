#include <iostream>
using namespace std;

// V1 - Call by Value
void resetSensorPairV1(int reading1, int reading2)
	{
	    int temp = reading1;
	    reading1 = reading2;
	    reading2 = temp;
	}

	// V2 - Call by Reference
	void resetSensorPairV2(int& reading1, int& reading2)
	{
	    int temp = reading1;
	    reading1 = reading2;
	    reading2 = temp;
	}

	// V3 - Call by Pointer
	void resetSensorPairV3(int* reading1, int* reading2)
	{
	    int temp = *reading1;
	    *reading1 = *reading2;
	    *reading2 = temp;
	}


int main(){

	    int A = 55;
	    int B = 12;

	    // V1
	    cout << "V1: Call by Value" << endl;
	    cout << "Before : A=" << A << "  B=" << B << endl;
	    resetSensorPairV1(A, B);
	    cout << "After  : A=" << A << "  B=" << B << endl;

	    // V2
	    cout << "V2: Call by Reference" << endl;
	    cout << "Before : A=" << A << "  B=" << B << endl;
	    resetSensorPairV2(A, B);
	    cout << "After  : A=" << A << "  B=" << B << endl;

	    // V3
	    cout << "V3: Call by Pointer" << endl;
	    cout << "Before : A=" << A << "  B=" << B << endl;
	    resetSensorPairV3(&A, &B);
	    cout << "After  : A=" << A << "  B=" << B << endl;

	return 0;

}


// Output : 

// V1: Call by Value
// Before : A=55  B=12
// After  : A=55  B=12
// V2: Call by Reference
// Before : A=55  B=12
// After  : A=12  B=55
// V3: Call by Pointer
// Before : A=12  B=55
// After  : A=55  B=12
