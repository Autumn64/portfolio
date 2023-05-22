// Autor: Aurora Giselle Flores Gomez
#include <iostream>
using namespace std;

int main()
{
    float b, h, r;
    cout << "Ingrese el valor de la base del triangulo: ";
    cin >> b;
    cout << "Ingrese el valor de la altura del triangulo: ";
    cin >> h;
    r = b * h / 2;
    cout << "El area de un triangulo con base " << b << " y altura " << h << " es " << r << "." << endl;
    return 0;
}