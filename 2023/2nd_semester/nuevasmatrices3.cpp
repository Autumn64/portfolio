//Autor: Aurora Giselle Flores Gómez.
#include <iostream>
using namespace std;

const int MaxElementos = 6;

void muestra(int v[]){
    for (int i = 0; i < MaxElementos; i++){
        cout << v[i] << endl;
    }
}

int main(){
    int v [] = {45, 23, 22, 12, 11, 10};
    muestra(v);

    return 0;
}