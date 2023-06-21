//Autor: Aurora Giselle Flores Gómez

#include <iostream>
using namespace std;

class MiClase{
    int x;
public:
    MiClase(int n): x(n){}
    void printX(){
        cout << "El valor de x es: " << x << endl;
    }
    void setX(int a){
        x = a;
    }
};

int main(){
    MiClase obj(15);
    MiClase *ptr_obj = &obj;

    obj.printX();
    ptr_obj -> printX();
    ptr_obj -> setX(66);
    obj.printX();
    return 0;
}