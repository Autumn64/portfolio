//Autor: Aurora Giselle Flores Gomez
#include <iostream>
using namespace std;

int main()
{
	int h;
	float p;

	cout << "Ingrese la cantidad de horas que un trabajador labora al dia: ";
	cin >> h;
	cout << "Ingrese la cantidad del pago por una hora de trabajo: ";
	cin >> p;

	float s = (h * 5) * p;
	cout << "El salario de un trabajador que labora " << h << " horas al dia a $" <<
		p << " la hora es de aproximadamente $" << s*4 << " al mes";

	return 0;
}