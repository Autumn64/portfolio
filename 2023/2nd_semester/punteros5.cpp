//Autor: Aurora Giselle Flores Gómez

#include <iostream>
using namespace std;

struct Clase{
    char mem1 = 'D';
    double mem2 = 12345678987654321.88888888888889;
    unsigned short mem3 = 4554;
    float mem4 = 3.14159;
    long long int mem5 = 5444333222;
    char mem6 = 'X';
    int mem7 = 434776;
    double mem8 = 2.35656778457911;
};

int main(){
    struct Clase local_struct;
    struct Clase *ptr_str = &local_struct;

    cout << *((char*)ptr_str) << endl;
    cout << *((double*)ptr_str + 1) << endl;
    cout << *((short*)ptr_str + 8) << endl;
    cout << *((float*)ptr_str + 5) << endl;
    cout << *((long long int*)ptr_str + 3) << endl;
    cout << *((char*)ptr_str + 32) << endl;
    cout << *((int*)ptr_str + 9) << endl;
    cout << *((double*)ptr_str + 5) << endl;

    return 0;
}