//Author: Aurora Giselle Flores Gomez (Autumn64)
#include<stdio.h>

void suma(int *a, int *b){
    *a += 2;
    *b += 2;
}

int s(int a, int b){
    return a + b;
}

int main(){
    int a, b;
    printf("Pon el valor de a: ");
    scanf("%d", &a);
    printf("Pon el valor de b: ");
    scanf("%d", &b);
    printf("%d + %d = %d\n", a, b, s(a, b));
    suma(&a,&b);
    printf("a + 2 es %d\n", a);
    printf("b + 2 es %d\n", b);
    printf("%d + %d = %d\n", a, b, s(a, b));
    return 0;
}
