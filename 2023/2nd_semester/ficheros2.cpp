//Autor: Aurora Giselle Flores Gómez
#include <iostream>
#include <fstream>
#include <string>

using namespace std;

int main(){
    ofstream f;
    int i;
    f.open("datos.txt");
    if (!f){
        cout << "Error abriendo el fichero" << endl;
    }else{
        for(i =1; i <= 10; i++){
            f << i << endl;
        }
        f.close();
    }
    return 0;
}
