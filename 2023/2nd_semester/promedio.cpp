//Autor: Aurora Giselle Flores Gomez
#include<iostream>
using namespace std;

int main() {
    float cal1, cal2, cal3;
    cout << "Ingresa calificacion 1: ";
    cin >> cal1;
    cout << "Ingresa calificacion 2: ";
    cin >> cal2;
    cout << "Ingresa calificacion 3: ";
    cin >> cal3;
    float promedio = (cal1 + cal2 + cal3) / 3;
    cout << "El promedio es: " << promedio << "\n";
    if (promedio >= 7 && promedio < 9.5) {
        cout << "EL ESTUDIANTE APROBO";
    }
    else if (promedio < 7){
        cout << "EL ESTUDIANTE REPROBO";
    }
    else if (promedio >= 9.5) {
        cout << "EL ESTUDIANTE ES EXCELENTE";
    }

    return 0;
}