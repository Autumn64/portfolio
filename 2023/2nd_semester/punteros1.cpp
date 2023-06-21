//Autor: Aurora Giselle Flores Gómez

#include <iostream>
using namespace std;

class MiClase{
    int x;
public:
    MiClase() :x(0){}
};

int main(){
    int var = 250;
    int *ptr_var = &var;

    MiClase obj;
    MiClase *ptr_obj = &obj;

    cout << "Valor de la variable var: " << var << endl;
    cout << "Direccion de la variable var: " << &var << endl;
    cout << "Direccion almacenada en el puntero ptr_var: " << ptr_var << endl;
    cout << "-------------------------------------------" << endl;
    cout << "Direccion del objeto obj: " << &obj << endl;
    cout << "Direccion almacenada en el puntero ptr_obj: " << ptr_obj << endl;
    return 0;
}