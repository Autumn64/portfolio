//Autor: Aurora Giselle Flores Gómez
#include <iostream>
#include <fstream>
#include <string>

using namespace std;

int main(){
    ifstream f;
    char dato;
    f.open("datos.txt"); //Ya debe de estar creado previamente
    
    if (!f){
        cout << "Error abriendo el fichero." << endl;
    }else{
        dato = f.get();
        while (!f.eof()){
            cout << dato << endl;
            dato = f.get();
        }
        f.close();
    }
    return 0;
}
