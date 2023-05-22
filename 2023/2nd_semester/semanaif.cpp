//Autor: Aurora Giselle Flores Gomez
#include <iostream>
using namespace std;

int main()
{
    int numero;
    cout << "Ingresa un numero: ";
    cin >> numero;
    if (numero == 1) {
        cout << "Es Lunes." << endl;
    }
    else {
        if (numero == 2) {
            cout << "Es Martes." << endl;
        }
        else {
            if (numero == 3) {
                cout << "Es Miercoles." << endl;
            }
            else {
                if (numero == 4) {
                    cout << "Es Jueves." << endl;
                }
                else {
                    if (numero == 5) {
                        cout << "Es Viernes." << endl;
                    }
                    else {
                        if (numero == 6) {
                            cout << "Es sabado." << endl;
                        }
                        else {
                            if (numero == 7) {
                                cout << "Es Domingo." << endl;
                            }
                            else {
                                cout << "Ingresa un numero entre el 1 y el 7." << endl;
                            }
                        }
                    }
                }
            }
        }
    }
}
