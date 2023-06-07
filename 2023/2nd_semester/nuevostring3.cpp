//Autor: Aurora Giselle Flores Gómez
#include <iostream>
#include <string>
using namespace std;

int main(){
    cout << "\n" << "Por favor ingrese su nombre: ";
    string nombre;
    getline(cin, nombre);

    cout << "Bienvenido al sistema, " << nombre;
    cout << ". Gracias por usar nuestra aplicación." << endl;
    return 0;
}