//Autor: Aurora Giselle Flores Gomez
#include <iostream>
using namespace std;

int main() {
    int c[5];
    int t;
    cout << "Ingresa el tamanio del arreglo: ";
    cin >> t;
    for (int i = 0; i < t; i++) {
        cout << "Dame la cantidad en la posicion " << i << ": ";
        cin >> c[i];
    }
    for (int i = 0; i < t; i++) {
        cout << c[i] << endl;
    }
    return 0;
}

void array5() {
    float arr1[3], arr2[3];
    for (int i = 0; i < 3; i++) {
        cout << "Introduce el valor " << i << " del array 1: ";
        cin >> arr1[i];
    }
    for (int i = 0; i < 3; i++) {
        cout << "Introduce el valor " << i << " del array 2: ";
        cin >> arr2[i];
    }
    for (int i = 0; i < 3; i++) {
        cout << "La suma de " << arr1[i] << " y " << arr2[i] << " es " << arr1[i] + arr2[i] << endl;
    }
    for (int i = 0; i < 3; i++) {
        cout << "La resta de " << arr1[i] << " y " << arr2[i] << " es " << arr1[i] - arr2[i] << endl;
    }
    for (int i = 0; i < 3; i++) {
        cout << "La multiplicacion de " << arr1[i] << " y " << arr2[i] << " es " << arr1[i] * arr2[i] << endl;
    }
    for (int i = 0; i < 3; i++) {
        cout << "La division de " << arr1[i] << " y " << arr2[i] << " es " << arr1[i] / arr2[i] << endl;
    }
}

void array4() {
    int cantidad[5];
    int x, j;
    for (x = 0; x < 5; x++) {
        cout << "Dame un numero en la posicion " << x << ": ";
        cin >> cantidad[x];
    }
    cout << "Las cantidaddes son: " << endl;
    for (j = 0; j < 5; j++) {
        cout << cantidad[j] << endl;
    }
}

void array3() {
    string libro[3];
    string autor[3];
    libro[0] = "Robada";
    libro[1] = "Persona Normal";
    libro[2] = "El primer hombre";
    autor[0] = "Lucy Christopher";
    autor[1] = "Benito Taibo";
    autor[2] = "Albert Camus";
    cout << "Libros." << endl;
    cout << "\nLibro: " << libro[0] << endl << "Autor: " << autor[0] << endl;
    cout << "\nLibro: " << libro[1] << endl << "Autor: " << autor[1] << endl;
    cout << "\nLibro: " << libro[2] << endl << "Autor: " << autor[2] << endl;
}

void array2() {
    float arr[6];
    arr[0] = 5;
    arr[1] = 3;
    arr[2] = arr[0] + arr[1];
    arr[3] = arr[0] - arr[1];
    arr[4] = arr[0] * arr[1];
    arr[5] = arr[0] / arr[1];
    cout << "Resultados del array: " << endl;
    cout << arr[0] << endl;
    cout << arr[1] << endl;
    cout << arr[2] << endl;
    cout << arr[3] << endl;
    cout << arr[4] << endl;
    cout << arr[5] << endl;
}


void array1()
{
    float ejemplo[5];
    ejemplo[0] = 2.5;
    ejemplo[1] = 5;
    ejemplo[2] = 8;
    ejemplo[3] = 9;
    ejemplo[4] = 100;
    cout << endl << "Valores del arreglo:" << endl;
    cout << ejemplo[0] << endl;
    cout << ejemplo[1] << endl;
    cout << ejemplo[2] << endl;
    cout << ejemplo[3] << endl;
    cout << ejemplo[4] << endl;
}
