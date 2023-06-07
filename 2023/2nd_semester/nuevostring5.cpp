//Autor: Aurora Giselle Flores Gómez
#include <iostream>
#include <stdlib.h>
#include <string>
using namespace std;

int main(){
    string* titulos = nullptr;
    string* autores = nullptr;
    int tamanio;
    cout << "Cuantos libros desea ingresar?: ";
    string entrada;
    getline(cin, entrada);
    tamanio = stoi(entrada);

    titulos = new string[tamanio];
    autores = new string[tamanio];

    cout << "Por favor ingrese la siguiente informacion: " << endl;
    for (int i = 0; i < tamanio; i++){
        cout << "\n*********Libro " << i + 1 << "*********" << endl;
        cout << "Titulo: ";
        getline(cin, titulos[i]);
        cout << "Autor: ";
        getline(cin, autores[i]);
    }

    delete[] titulos;
    delete[] autores;
    titulos = nullptr;
    autores = nullptr;

    system("pause");
    return 0;
}