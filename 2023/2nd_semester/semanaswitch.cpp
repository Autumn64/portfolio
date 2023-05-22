//Autor: Aurora Giselle Flores Gomez.
#include <iostream>
using namespace std;

int main()
{
    int numero;
    cout << "Ingresa un numero: ";
    cin >> numero;
    switch (numero) {
    case 1:
        cout << "Es Lunes";
        break;
    case 2:
        cout << "Es Martes";
        break;
    case 3:
        cout << "Es Miercoles";
        break;
    case 4:
        cout << "Es Jueves";
        break;
    case 5:
        cout << "Es Viernes";
        break;
    case 6:
        cout << "Es Sabado";
        break;
    case 7:
        cout << "Es Domingo";
        break;
    default:
        cout << "Opcion no valida." << endl;
        break;

    return 0;
    }
}
