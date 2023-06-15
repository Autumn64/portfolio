//Autor: Aurora Giselle Flores Gómez
#include <iostream>
#include <cstdlib>
#include <string>
using namespace std;

int nip = 1234;
int intentos = 3;
float monto = 0.0;

void menu();
void consultar();
void depositar();
void retirar();

void validarNip(){
    int nip_temp;
    if (intentos < 1){
        cout << " Te has quedado sin intentos, saliendo..." << endl;
        system("pause");
        return;
    }
    cout << " Ingrese su nip: ";
    cin >> nip_temp;
    cin.ignore(4, '\n');
    if (nip_temp != nip){
        intentos--;
        system("cls");
        cout << "**********CAJERO AUTOMATICO**********\n" << endl;
        cout << " Nip incorrecto! Tiene " << intentos << " intentos." << endl;
        validarNip();
    }else{
        cout << " Ingreso exitoso." << endl;
        system("pause");
        menu();
        return;
    }
}

void menu(){
    while(1){
        system("cls");
        char op;
        cout << "**********CAJERO AUTOMATICO**********\n" << endl;
        cout << " 1. Consultar." << endl;
        cout << " 2. Depositar."  << endl;
        cout << " 3. Retirar." << endl;
        cout << " 4. Salir." << endl;
        cout << " Escoja una opcion (1-4): ";
        cin >> op;
        cin.ignore(1, '\n');
        switch(op){
            case '1':
                consultar();
                break;
            case '2':
                depositar();
                break;
            case '3':
                retirar();
                break;
            case '4':
                return;
            default:
                break;
        }
    }
}

void consultar(){
    system("cls");
    cout << "**********CAJERO AUTOMATICO**********\n" << endl;
    cout << " Saldo disponible: $" << monto << "." << endl;
    system("pause");
    return;
}

void depositar(){
    float valorActual = monto;
    float deposito;
    char eleccion;
    system("cls");
    cout << "**********CAJERO AUTOMATICO**********\n" << endl;
    cout << " Ingrese la cantidad de dinero que desea depositar: ";
    cin >> deposito;
    cin.ignore(10, '\n');
    if (deposito < 0){
        cout << "No puede ingresar un valor menor a 0." << endl;
        system("pause");
        return;
    }
    cout << " Se ingresaran $" << deposito << " a su cuenta. Desea continuar? (s/n): ";
    cin >> eleccion;
    cin.ignore(1, '\n');
    if (eleccion == 's'){
        monto += deposito;
        cout << " Se han ingresado $" << deposito << " a su cuenta." << endl;
        cout << " $" << valorActual << " => $" << monto << endl;
        system("pause");
        return;
    }
    cout << " Operacion cancelada." << endl;
    system("pause");
    return;
}

void retirar(){
    float retiro;
    float saldoActual = monto;
    char eleccion;
    system("cls");
    cout << "**********CAJERO AUTOMATICO**********\n" << endl;
    cout << " Su saldo actual es de $" << monto << "." << endl;
    cout << " Ingrese la cantidad que desea retirar: ";
    cin >> retiro;
    cin.ignore(10, '\n');
    if (retiro > monto){
        cout << " Saldo insuficiente." << endl;
        system("pause");
        return;
    }
    if (retiro < 0){
        cout << "No puede retirar un valor menor a 0." << endl;
        system("pause");
        return;
    }
    cout << " Se retiraran $" << retiro << ". Desea continuar? (s/n): ";
    cin >> eleccion;
    cin.ignore(1, '\n');
    if (eleccion == 's'){
        monto -= retiro;
        cout << " Se han retirado $" << retiro << "." << endl;
        cout << " $" << saldoActual << " => $" << monto << endl;
        system("pause");
        return;
    }
    cout << " Operacion cancelada." << endl;
    system("pause");
    return;
}

int main(){
    system("cls");
    cout << "**********CAJERO AUTOMATICO**********\n" << endl;
    validarNip();
    return 0;
}