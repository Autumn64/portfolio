//Autor: Aurora Giselle Flores Gómez
#include <iostream>
using namespace std;

const int MaxDimensiones = 2;

void muestra(int v[][MaxDimensiones]){
    for (int i = 0; i < MaxDimensiones; i++){
        for (int j = 0; j < MaxDimensiones; j++){
            cout << v[i][j] << endl;
        }
    }
}

int main(){
    int v[][MaxDimensiones] = {1, 2, 3, 4};
    muestra(v);
    return 0;
}