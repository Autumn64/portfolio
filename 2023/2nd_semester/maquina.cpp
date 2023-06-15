//Autor: Aurora Giselle Flores Gómez
#include <iostream>
#include <string>
#include <map>
#include <cstdlib>
using namespace std;

float monto = 0.0;

string productos[3] = {"Cheetos", "Coca-Cola", "Chicles"};

map <string, float> dictProductos = { //Using dictionaries (or maps in C++) is just much easier than anything else.
    {"Cheetos", 5},
    {"Coca-Cola", 12},
    {"Chicles", 7}
};

void menu();

void ingresarDinero(){
    float valorInicial = monto;
    float deposito;
    system("cls");
    cout << "********* MAQUINA EXPENDEDORA *********\n" << endl;
    cout << " Ingrese la cantidad que desea ingresar: ";
    cin >> deposito;
    cin.ignore(10, '\n');
    if (deposito != 1 && deposito != 2 && deposito != 5 && deposito != 10 && 
    deposito != 20 && deposito != 50 && deposito != 100 || deposito < 1){
        cout << " Monto invalido. Por favor ingrese dinero en cantidades de 1, 2, 5, 10, 20, 50 o 100 pesos." << endl;
        system("pause");
        return;
    }
    monto += deposito;
    cout << " Se ha ingresado su dinero correctamente." << endl;
    cout << " $" << valorInicial << " => $" << monto << endl;
    system("pause");
    return;
}

void comprar(char eleccion){
    string producto = productos[int(eleccion) - 49]; //Convert char to number and substract 48 - 1 to get the actual index.
    float precio = dictProductos[producto];
    if (precio > monto){
        cout << " Saldo insuficiente." << endl;
        system("pause");
        return;
    }
    monto -= precio;
    cout << " Has comprado 1 articulo de: " << producto << endl;
    system("pause");
    return; 
}

void devolverDinero(){
    monto = 0;
    cout << "Cambio devuelto." << endl;
    system("pause");
    return;
}

void menu(){
    while(1){
        char opcion;
        system("cls");
        cout << "********* MAQUINA EXPENDEDORA *********\n" << endl;
        cout << " Su monto actual es: $" << monto << endl;
        cout << " 1. Cheetos: $" << dictProductos["Cheetos"] << endl; 
        cout << " 2. Coca-Cola: $" << dictProductos["Coca-Cola"] << endl; 
        cout << " 3. Chicles: $" << dictProductos["Chicles"] << endl; 
        cout << " 4. Ingresar dinero." << endl;
        cout << " 5. Devolver cambio." << endl;
        cout << " 6. Salir." << endl;
        cout << " Ingrese una opcion (1-6): ";
        cin >> opcion;
        cin.ignore(1, '\n');
        switch(opcion){
            case '1':
                comprar(opcion);
                break;
            case '2':
                comprar(opcion);
                break;
            case '3':
                comprar(opcion);
                break;
            case '4':
                ingresarDinero();
                break;
            case '5':
                devolverDinero();
                break;
            case '6':
                return;
                break;
            default:
                break;
        }
    }
}

int main(){
    menu();
    return 0;
}