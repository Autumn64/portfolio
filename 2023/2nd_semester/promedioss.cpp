//Autor: Aurora Giselle Flores Gomez
#include <iostream>
using namespace std;

void leoarreglo(int a[], int n) {
    for (int i = 0; i < n; i++) {
        cout << "Ingrese las notas: ";
        cin >> a[i];
        cout << "\n";
    }
}

void imprimoarreglo(int a[], int n) {
    for (int i = 0; i < n; i++) {
        cout << "El numero " << i + 1 << endl << a[i] << endl;
    }
}

int sumoarreglo(int a[], int n) {
    int suma = 0;
    for (int i = 0; i < n; i++) {
        suma += a[i];
    }return suma;
}

float promedio(int a[], int n) {
    return sumoarreglo(a, n) / n;
}


int main()
{
    int notas[3];
    cout << "Ingresa las calificaciones de 3 estudiantes" << endl;
    leoarreglo(notas, 3);

    cout << "Las calificaciones de los estudiantes son: " << endl;
    imprimoarreglo(notas, 3);

    cout << "El promedio de las calificaciones es: " << endl;
    cout << promedio(notas, 3) << endl;
    return 0;
}
