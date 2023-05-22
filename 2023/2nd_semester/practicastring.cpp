//Autor: Aurora Giselle Flores Gomez
#include <iostream>
#include <string>
using namespace std;

int main() {
    string cadena1, cadena2, cadena3;

    cout << "Ingrese la primera cadena: ";
    getline(cin, cadena1);

    cout << "Ingrese la segunda cadena: ";
    getline(cin, cadena2);

    cout << "Ingrese la tercera cadena: ";
    getline(cin, cadena3);

    int longitud_cadena1 = cadena1.length();
    int longitud_cadena2 = cadena2.length();
    int longitud_cadena3 = cadena3.length();

    cout << "Longitud de la cadena 1: " << longitud_cadena1 << endl;
    cout << "Longitud de la cadena 2: " << longitud_cadena2 << endl;
    cout << "Longitud de la cadena 3: " << longitud_cadena3 << endl;

    return 0;
}