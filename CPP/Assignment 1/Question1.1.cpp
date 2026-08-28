#include <iostream>
using namespace std;

int getStatusCode(double temprature){
	if(temprature < 0 ){
		return -1 ;
	}
	else if(temprature <= 29){
		return 0;
	}
	else if(temprature <=44){
		return 1;
	}
	else if(temprature <=59){
		return 2;
	}
	else{
		return 3;
	}
}

void getStatusLable(int statusCode){
	switch (statusCode){
	case -1:
			cout << "Status : SENSOR_ERROR"<<endl;
			cout << "Action : Sensor fault — check wiring"<<endl;
			break;
	case 0:
			cout << "Status : NORMAL"<<endl;
			cout << "Action : No action required"<<endl;
			break;
	case 1:
			cout << "Status : WARNING"<<endl;
			cout << "Action : Alert sent to supervisor"<<endl;
			break;
	case 2:
			cout << "Status : CRITICAL"<<endl;
			cout << "Action : Cooling system triggered"<<endl;
			break;
	case 3:
			cout << "Status : SHUTDOWN"<<endl;
			cout << "Action : Emergency shutdown initiated"<<endl;
			break;

	}
}

int main(){
	double temperature ;
	cout << "Enter the temperature "<<endl;
	cin >> temperature ;

	double  Fahrenheit = (temperature * 9/5 ) +32 ;

	cout << "Temperature : " << temperature << "C / " << Fahrenheit << "F"<<endl;
	int StatusCode = getStatusCode(temperature);
	getStatusLable(StatusCode);

	cout << "Reading  : " << ( temperature >= 25 ? "Above Average " : "Below Average ")<<endl;
	return 0;
}






