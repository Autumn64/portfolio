//Autor: Aurora Giselle Flores Gómez
#include <iostream>
#include <cstdlib>
using namespace std;

void suma(), resta(), multiplicacion(), division();

void menu(){
    while(1){
        system("cls");
        char op;
        cout << "***** OPERACIONES CON MATRICES *****" << endl;
        cout << " 1. Suma" << endl;
        cout << " 2. Resta" << endl;
        cout << " 3. Multiplicacion" << endl;
        cout << " 4. Division" << endl;
        cout << " 5. Salir" << endl;
        cout << endl;
        cout << "Escoja una opcion (1-5): ";
        cin >> op;
        cin.ignore(1, '\n');

        switch(op){
            case '1':
                suma();
                break;
            case '2':
                resta();
                break;
            case '3':
                multiplicacion();
                break;
            case '4':
                division();
                break;
            case '5':
                return;
                break;
            default:
                break;   
        }
    }
}

void suma(){
    system("cls");
    int matriz[3][3];
    int count;
    for (int i = 0; i < 3; i ++){
        for (int j = 0; j < 3; j++){
            cout << "Introduce el dato (" << i << ", " << j << "): ";
            cin >> matriz[i][j];
            cin.ignore(10, '\n');
        }
    }
    for (int i = 0; i < 3; i ++){
        for (int j = 0; j < 3; j++){
            count += matriz[i][j];
        }
    }
    cout << "La suma es " << count << endl;
    system("pause");
    return;
}

void resta(){
    system("cls");
    int matriz[3][3];
    for (int i = 0; i < 3; i ++){
        for (int j = 0; j < 3; j++){
            cout << "Introduce el dato (" << i << ", " << j << "): ";
            cin >> matriz[i][j];
            cin.ignore(10, '\n');
        }
    }
    int count = matriz[0][0];
    for (int i = 0; i < 3; i ++){
        for (int j = 0; j < 3; j++){
            count -= matriz[i][j];
        }
    }
    cout << "La resta es " << count << endl;
    system("pause");
    return;
}

void multiplicacion(){
    system("cls");
    int matriz[3][3];
    int count = 1;
    for (int i = 0; i < 3; i ++){
        for (int j = 0; j < 3; j++){
            cout << "Introduce el dato (" << i << ", " << j << "): ";
            cin >> matriz[i][j];
            cin.ignore(10, '\n');
        }
    }
    for (int i = 0; i < 3; i ++){
        for (int j = 0; j < 3; j++){
            count *= matriz[i][j];
        }
    }
    cout << "La multiplicacion es " << count << endl;
    system("pause");
    return;
}

void division(){
    system("cls");
    float matriz[3][3];
    for (int i = 0; i < 3; i ++){
        for (int j = 0; j < 3; j++){
            cout << "Introduce el dato (" << i << ", " << j << "): ";
            cin >> matriz[i][j];
            cin.ignore(10, '\n');
        }
    }
    float count = matriz[0][0];
    for (int i = 0; i < 3; i ++){
        for (int j = 0; j < 3; j++){
            count /= matriz[i][j];
        }
    }
    cout << "La division es " << count << endl;
    system("pause");
    return;
}

int main(){
    menu();
    return 0;
}