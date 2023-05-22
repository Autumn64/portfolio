//Autor: Aurora Giselle Flores Gomez
#include <iostream>
using namespace std;

int main()
{
    float l, p, g;
    cout << "Ingrese la cantidad de litros vendida: ";
    cin >> l;
    cout << "Ingrese el precio de un galon de leche: ";
    cin >> p;
    g = (l / 3.785) * p;
    cout << "La ganancia obtenida de la venta de " << l << " litros de leche a $" << 
        p << " el galon es $" << g;
    return 0;
}