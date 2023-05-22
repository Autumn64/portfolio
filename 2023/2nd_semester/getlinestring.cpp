//Autor: Aurora Giselle Flores Gomez
#include <iostream>
#include <string>
using namespace std;

int main()
{
    string cad = "uno tres";
    cout << "Cadena original: " << cad << endl;
    cad.append(" cuatro");
    cout << "Cadena despues de llamar a append: " << cad << endl;
    cad.insert(3, " dos");
    cout << "Cadena despues de llamar a insert: " << cad << endl;
    cad.erase(0, 4);
    cout << "Cadena despues de llamar a erase: " << cad << endl;
    return 0;
}