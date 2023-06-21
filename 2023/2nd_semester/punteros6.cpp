//Autor: Aurora Giselle Flores Gómez.

#include <iostream>
using namespace std;

class CustomIntStack{
    int array[20];
    int cuenta = 0;
public:
    CustomIntStack& operator << (int elem){
        if (cuenta < 20){
            array[cuenta] = elem;
            cuenta++;
        }else{
            cout << "Esta lleno!" << endl;
        }
        return *this;
    }
    void printInfo(){
        if (cuenta > 0){
            for (int i = 0; i < cuenta; i++){
                cout << array[i] << endl;
            }
        }
    }
};

int main(){
    CustomIntStack myStack;
    myStack << 1 << 2 << 3 << 4 << 5 << 6 << 7;
    myStack.printInfo();
    return 0;
}