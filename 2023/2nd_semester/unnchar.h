//Made by Aurora Giselle Flores Gomez (Autumn64)
#ifndef UNNCHAR_H_INCLUDED
#define UNNCHAR_H_INCLUDED

#include<string.h>

char* unnchar(char * str){
    str[strlen(str) - 1] = '\0';
    return str;
}

#endif // UNNCHAR_H_INCLUDED
