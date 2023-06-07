//Autor: Aurora Giselle Flores Gómez
#include <iostream>
#include <cstdio>
using namespace std;

int funcion(int valor){
    valor = valor + 10;
    return valor;
}

int funcionPunteros(int* valor){
    *valor = *valor + 10;
    return *valor;
}

int main(){
    int numero = 10;
    cout << "Antes de funcion " << numero << endl;
    funcion(numero);
    cout << "Despues de funcion " << numero << endl;
    cout << "Antes de funcionPunteros " << numero << endl;
    funcionPunteros(&numero);
    cout << "Despues de funcionPunteros " << numero << endl;
    system("pause");
    return 0;
}