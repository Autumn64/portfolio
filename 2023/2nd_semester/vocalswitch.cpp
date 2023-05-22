//Autor: Aurora Giselle Flores Gomez
#include <iostream>
using namespace std;

int main()
{
    char l;
    cout << "Ingresa una letra: ";
    cin >> l;
    switch (l) {
    case 'a':
        cout << "Es vocal." << endl;
    case 'e':
        cout << "Es vocal." << endl;
    case 'i':
        cout << "Es vocal." << endl;
    case 'o':
        cout << "Es vocal." << endl;
    case 'u':
        cout << "Es vocal." << endl;
    default:
        cout << "Es consonante." << endl;
    }
    return 0;
}