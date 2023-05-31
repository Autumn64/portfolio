//Autor: Aurora Giselle Flores Gómez
#include <iostream>
#include <fstream>
#include <string>

using namespace std;

int main(){
    ofstream archivo;
    archivo.open("datos.txt");
    
    archivo << "Primera linea de texto" << endl;
    archivo << "Segunda linea de texto" << endl;
    archivo << "Tercera linea de texto" << endl;
    
    archivo.close();
    return 0;
}