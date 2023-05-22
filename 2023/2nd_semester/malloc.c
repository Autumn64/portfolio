//Author: Aurora Giselle Flores Gomez (Autumn64)
#include<stdio.h>
#include<stdlib.h>
#include<string.h>

int main(){
    char *p = malloc(sizeof(char) * 300);
    printf("the current size of the string is %d\n", strlen(p));
    printf("enter your address: ");
    fgets(p, 300, stdin);
    p[strlen(p)-1] = '\0';
    p = realloc(p, sizeof(char) * strlen(p));
    printf("the new size of the string is %d, and you wrote: %s", strlen(p), p);
    fwrite("\nHello there", sizeof(char), 13, stdout); //test without printf
    free(p);
    return 0;
}
