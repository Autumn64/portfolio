//Autor: Aurora Giselle Flores Gomez
#include <iostream>
#include <string>
using namespace std;

void tolower(string &s){
    for(int i = 0; i < s.size(); i++){
        int t = s[i]; //Extraemos el codigo ASCII de cada caracter.
        if(t >= 65 && t <= 90){ //Del ASCII 65 al 90 son mayusculas.
            t += 32; //Del ASCII 97 al 122 son minusculas.
            s[i] = t;
        }
    }
    return;
}

void toupper(string &s){
    for(int i = 0; i < s.size(); i++){
        int t = s[i];
        if(t >= 97 && t <= 122){
            t -= 32;
            s[i] = t;
        }
    }
    return;
}

int main(){
    string s;
    char opcion;
    cout << "Escribe algo: ";
    getline(cin, s);
    cout << "Deseas verlo en mayusculas (M), o minusculas (m)?: ";
    cin >> opcion;
    cin.ignore(1, '\n');
    switch(opcion){
        case 'm':
            tolower(s);
            cout << "Tu string convertido a minusculas es: " << s << endl;
            break;
        case 'M':
            toupper(s);
            cout << "Tu string convertido a mayusculas es: " << s << endl;
            break;
        default:
            cout << "Debes poner 'M' o 'm'" << endl;
            break;
    }
    return 0;
}