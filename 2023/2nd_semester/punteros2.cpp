//Autor: Aurora Giselle Flores Gómez

#include <iostream>
using namespace std;

int main(){
    float var = 33.66;
    float *ptr_var = &var;

    cout << "Valor de la variable var: " << var << endl;
    cout << "Direccion de la variable var: " << &var << endl;
    cout << "Valor de lo que hay almacenado en la direccion de memoria: " << endl;
    cout << ptr_var << &ptr_var << endl;

    *ptr_var = 100.25;
    cout << "Valor de la variable var: " << var << endl;
    return 0;
}