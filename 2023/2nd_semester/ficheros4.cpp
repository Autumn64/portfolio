//Autor: Aurora Giselle Flores Gómez
#include <iostream>
#include <fstream>
#include <string>

using namespace std;

int main(){
    ifstream f;
    int i, dato;
    f.open("datos.txt"); //Ya debe de estar creado previamente
    
    if (!f){
        cout << "Error abriendo el fichero." << endl;
    }else{
        while (f >> dato){
            cout << dato << endl;
        }
        f.close();
    }
    return 0;
}
