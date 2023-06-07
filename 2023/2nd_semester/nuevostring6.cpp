//Autor: Aurora Giselle Flores Gómez
#include <iostream>
#include <string>
#include <cctype>
using namespace std;

void limitestr(string *str){
    if (str->length() > 50){
        *str = str->substr(0, 50);
    }
}

void convert_mayus(string *str){
    for (int i = 0; i < str->length(); i++){
        (*str)[i] = toupper((*str)[i]);
    }
}

void copiar_cadena(string *str, string *str2){
    *str2 = *str;
}

void voltear_str(string *str){
    int inicio = 0;
    int fin = str->length() - 1;

    while(inicio < fin){
        char tmp = (*str)[inicio];
        (*str)[inicio] = (*str)[fin];
        (*str)[fin] = tmp;

        inicio++;
        fin--;
    }
}

int main(){
    string str;
    string str2;
    cout << "Escribe algo: ";
    getline(cin, str);
    limitestr(&str);
    cout << str << endl;
    convert_mayus(&str);
    cout << str << endl;
    copiar_cadena(&str, &str2);
    cout << "Cadena 1: " << str << endl << "Cadena 2: " << str2 << endl;
    voltear_str(&str);
    cout << "Cadena 1: " << str << endl << "Cadena 2: " << str2 << endl;
    return 0;
}