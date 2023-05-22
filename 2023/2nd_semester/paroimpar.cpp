//Autor: Aurora Giselle Flores Gomez
#include <iostream>
using namespace std;

void paroimpar() {
    int par = 0, impar = 0;
    int numeros[8], pares[8], impares[8];

    cout << "\nIntroducir datos: " << endl;
    for (int i = 0; i < 8; i++) {
        cout << "(" << i + 1 << "/8): ";
        cin >> numeros[i];
        if (numeros[i] % 2 == 0) pares[par++] = numeros[i];
        else impares[impar++] = numeros[i];
    }

    cout << "\nNumeros pares: ";
    for (int i = 0; i < par; i++) {
        cout << pares[i] << " ";
    }

    cout << "\nNumeros impares: ";
    for (int i = 0; i < impar; i++) {
        cout << impares[i] << " ";
    }
}

int main()
{
    paroimpar();
    return 0;
}
