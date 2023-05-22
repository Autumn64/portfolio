// Autor: Aurora Giselle Flores Gomez
#include <iostream>
using namespace std;

int main()
{
    string seleccion;
    float radio;
    cout << "Ingresara radio o diametro? (r/d): ";
    cin >> seleccion;
    if (seleccion == "d") {
        float diametro;
        cout << "Ingrese el valor del diametro: ";
        cin >> diametro;
        radio = diametro / 2;
    }
    else {
        cout << "Ingrese el valor del radio: ";
        cin >> radio;
    }
    float r2 = radio * radio;
    float a = r2 * 3.1416;
    cout << "El area de la circunferencia con radio " << radio << " es: " << a;

    return 0;
}