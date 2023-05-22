//Autor: Aurora Giselle Flores Gomez
#include<stdio.h>

int main(){
    int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, c;
    char b[10];
    printf("Escoge un numero del 1 al 10: ");
    scanf("%d",&c);
    if(c <= 10 && c >= 1){
        printf("Escogiste el numero %d\n",a[c-1]);
    }else{
        printf("No escogiste un numero del 1 al 10.\n");
    }
    printf("Escribe tu nombre: ");
    scanf("%s", b); //Terrible idea to use scanf lmao.
    printf("Hola, %s\n", b);
    return 0;
}
