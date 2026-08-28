#include <iostream>
using namespace std;

int main2(){

	int N ;
	cout << "Enter Number of Readings " << endl;
	cin >> N ;

	double readings[N];

	for(int i =0 ; i<N ; i ++){
		cin >> readings[i];
	}

	cout<<"Valid Readings : ";
	int skipped = 0;
	for(int i=0;i<N;i++){
		if(readings[i]<=0){
			skipped ++;
			continue;
		}
		cout<<readings[i]<< " ";
	}

	cout <<"\nSkipped (errors): "<< skipped <<endl;

	for(int i=0;i<N;i++){
			if(readings[i]>= 45 ){
				cout<<"First CRITICAL : INDEX "<<i<<" -> "<<readings[i]<<"C"<<endl;
				break;
			}

		}


	double min =0 ;
	double max =0;
	double sum =0;
	int count = 0;

	for(int i=0;i<N;i++){
		if(readings[i]<=0){
			continue;
		}

		if(count ==0 ){
			min = readings[i];
			max = readings[i];
		}
		if(readings[i]<min){
			min = readings[i];
		}

		if(readings[i]>max){
			max = readings[i];
		}

		sum += readings[i];
		count++;
	}

	double average = sum /count;

	cout << "Min : " << min << "°C    ";
	cout << "Max : " << max << "°C    ";
	cout << "Avg : " << average << "°C" << endl;

	int normal = 0;
	int warning = 0;
	int critical = 0;
	int shutdown = 0;

	for(int i=0;i<N;i++){
		if(readings[i]<0){
			continue;
		}
		else if(readings[i]<=29){
			normal++;
		}
		else if(readings[i]<=44){
			warning++;
		}
		else if(readings[i]<=59){
			critical++;
		}
		else{
			shutdown++;
		}


	}


	cout<<"Normal : "<<normal<< " Warning : "<< warning << " Critical : " << critical <<" Shutdown : "<<shutdown;



	return 0;


}
