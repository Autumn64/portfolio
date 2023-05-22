//Autor: Aurora Giselle Flores Gomez
#include <iostream>
using namespace std;

int main()
{
    int x, n;
    cout << "Ingresa cuantos numeros quieres calcular: ";
    cin >> x;
    for (int i = 1; i <= x; i++) {
        cout << "Ingresa el numero " << i << ": ";
        cin >> n;
        if(n%2 == 0){
            cout << "El numero " << n << " es par." << endl;
        }
        else {
            cout << "El numero " << n << " es impar." << endl;
        }
    }
}