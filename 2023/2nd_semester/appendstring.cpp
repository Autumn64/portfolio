//Autor: Aurora Giselle Flores Gomez
#include <iostream>
#include <string>
using namespace std;

int main()
{
    string nombre = "Enrique";
    string apellido1 = "Barros";
    string apellido2 = "Fernandez";
    string nombreCompleto = nombre.append(" " + apellido1 + " ").append(apellido2 + " ");
    cout << nombreCompleto;
    return 0;
}
