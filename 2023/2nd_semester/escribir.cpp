// Autor: Aurora Giselle Flores Gomez
#include <iostream>
using namespace std;

void escribir(string f, int n) {
    cout << n << ":" << f << endl;
    n--;
    if (n > 0) escribir(f, n);
}

int main()
{
    string f;
    int n = 5;
    cout << "Escribe una palabra para repetirla 5 veces: ";
    cin >> (cin, f);
    cout << endl;
    escribir(f, 5);
}
