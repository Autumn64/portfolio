//Autor: Aurora Giselle Flores Gómez
#include <iostream>
#include <fstream>
#include <string>
using namespace std;

struct Libro{
    int fechap;
    string nombre, autor, genero, pais;
};

int main(){
    Libro libro;
    ifstream f;
    f.open("datos.txt");
    getline(f, libro.nombre);
    getline(f, libro.autor);
    f >> libro.fechap;
    f.ignore(4, '\n');
    getline(f, libro.genero);
    getline(f, libro.pais);
    f.close();
    
    cout << "Nombre: " << libro.nombre << endl;
    cout << "Autor: " << libro.autor << endl;
    cout << "Fecha: " << libro.fechap << endl;
    cout << "Genero: " << libro.genero << endl;
    cout << "Pais: " << libro.pais << endl;
    return 0;
}
