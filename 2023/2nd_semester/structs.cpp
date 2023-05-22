//Autor: Aurora Giselle Flores Gomez
#include<iostream>
#include "unnchar.h"
using namespace std;

struct Admision{
    char nombre[50], carrera [50], direccion[150];
    int edad, matricula;
    float promedio;
};

void captura(){
    Admision alumno {};
    cout << "Ingrese la matricula del estudiante: ";
    cin >> alumno.matricula; cin.ignore(256, '\n');
    cout << "Ingrese el nombre del estudiante: ";
    fgets(alumno.nombre, 50, stdin); unnchar(alumno.nombre);
    cout << "Ingrese la carrera del estudiante: ";
    fgets(alumno.carrera, 50, stdin); unnchar(alumno.carrera);
    cout << "Ingrese el promedio del estudiante: ";
    cin >> alumno.promedio; cin.ignore(256, '\n');
    cout << "Ingrese la direccion del estudiante: ";
    fgets(alumno.direccion, 150, stdin); unnchar(alumno.direccion);
}

void imprimir(){
    Admision alumno {};
    cout << "\nLa matricula del estudiante es: " << alumno.matricula << endl;
    cout << "El nombre del estudiante es: " << alumno.nombre << endl;
    cout << "La carrera del estudiante es: " << alumno.carrera << endl;
    cout << "El promedio del estudiante es: " << alumno.promedio << endl;
    cout << "La direccion del estudiante es: " << alumno.direccion << endl;
}

int main(){
    captura();
    imprimir();
    return 0;
}
