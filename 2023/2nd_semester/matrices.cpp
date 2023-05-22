//Autor: Aurora Giselle Flores Gomez
//Btw this code was made by the teacher and it wasn't explained to us.
#include <iostream>
#include <stdlib.h>
using namespace std;

int** matriz1, ** matriz2, **matrizp, filas, columnas;

void pedirdatos();
void sumadatos();
void mostrardatos();
void promedio();

int main()
{
    pedirdatos();
    sumadatos();
    mostrardatos();
    promedio();
    return 0;
}

void pedirdatos() {
    cout << "Humano ingresa el tamanio de tu matriz" << endl;
    cout << "Filas: "; cin >> filas;
    cout << "Columnas: "; cin >> columnas;
    matriz1 = new int* [filas];
    matriz2 = new int* [filas];
    matrizp = new int* [filas];

    for (int i = 0; i < filas; i++) {
        matriz1[i] = new int[columnas];
        matriz2[i] = new int[columnas];
        matrizp[i] = new int[columnas];
    }
    for (int i = 0; i < filas; i++) {
        for (int j = 0; j < columnas; j++) {
            cout << "Matriz1[" << i + 1 << "][" << j + 1 << "]: ";
            cin >> *(*(matriz1 + i) + j);
        }
    }
    for (int i = 0; i < filas; i++) {
        for (int j = 0; j < columnas; j++) {
            cout << "Matriz2[" << i + 1 << "][" << j + 1 << "]: ";
            cin >> *(*(matriz2 + i) + j);
        }
    }
}

void sumadatos() {
    for (int i = 0; i < filas; i++) {
        for (int j = 0; j < columnas; j++) {
            *(*(matrizp + i) + j) = *(*(matriz1 + i) + j) + *(*(matriz2 + i) + j);
        }
    }
}

void mostrardatos() {
    cout << "\n\nSUMA DE LAS MATRICES\n";
    for (int i = 0; i < filas; i++) {
        for (int j = 0; j < columnas; j++) {
            cout << *(*(matrizp + i) + j) << ",";
        }
        cout << endl;
    }
}

void promedio() {
    cout << "El promedio de las matrices es: " << endl;
    for (int i = 0; i < filas; i++) {
        for (int j = 0; j < columnas; j++) {
            cout << *(*(matrizp + i) + j) / 2 << ",";
        }
        cout << endl;
    }
}
