//Autor: Aurora Giselle Flores Gomez
#include <iostream>
using namespace std;

void comprobar(char c) {
    int n = int(c);
    if (n >= 48 and n <= 57) {
        cout << "Has introducido un numero." << endl;
    }
    else {
        cout << "Introduciste una letra, por favor introduce un numero: ";
        cin >> c;
        comprobar(c);
    }
}

int main()
{
    char c;
    cout << "Pulsa un numero: ";
    cin >> c;
    comprobar(c);
    cout << "Programa terminado." << endl;
}