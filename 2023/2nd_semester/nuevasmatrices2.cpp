//Autor: Aurora Giselle Flores Gómez
#include <iostream>
#include <string>
#include <cstdlib>
using namespace std;

int main(){
    string libros[5][2];
    cout << "Por favor ingrese la informacion: " << endl;
    string titulo, autor;
    for (int i = 0; i < 5; i++){
        cout << "\n******* Libro " << i + 1 << "*******" << endl;
        cout << "Titulo: ";
        getline(cin, titulo);
        cout << "Autor: ";
        getline(cin, autor);
        libros[i][0] = titulo;
        libros[i][1] = autor;
    }
    system("pause");
    return 0;
}