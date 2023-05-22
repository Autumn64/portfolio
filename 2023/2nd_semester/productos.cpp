//Autor: Aurora Giselle Flores Gomez
#include <iostream>
#include<vector>
using namespace std;

int main()
{
    int n;
    int total = 0;
    vector<int> totales;
    cout << "Ingrese la cantidad de articulos: ";
    cin >> n;
    for (int i = 1; i <= n; i++) {
        int c, p;
        cout << "Ingrese la cantidad del articulo " << i << ": ";
        cin >> c;
        cout << "Ingrese el precio c/u del articulo " << i << ": ";
        cin >> p;
        totales.insert(totales.end(), { c * p });
    }
    for (int i = 0; i < totales.size(); i++) {
        total += totales[i];
    }
    cout << "El total a pagar es: " << total << endl;
    return 0;
}