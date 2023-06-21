//Autor: Aurora Giselle Flores Gómez

#include <iostream>
using namespace std;

int main(){
       int array[3] = { 15, 33, 55 };
       int *ptr = array;

       cout << "Direccion almacenada por ptr:" << ptr << endl;
       cout << "Valor en la direccion almacenada por ptr: " << *ptr << endl;
       cout << "Direccion almacenada por ptr + 1: " << ptr + 1 << endl;
       cout << "Valor en la direccion almacenada por ptr + 1: " << *(ptr + 1) << endl;
       cout << "Direccion almacenada por ptr + 2: " << ptr + 2 << endl;
       cout << "Valor en la direccion almacenada por ptr + 2: " << *(ptr + 2) << endl;
       return 0;
}