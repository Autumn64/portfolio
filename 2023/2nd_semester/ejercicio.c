//Autor: Aurora Giselle Flores Gomez
#include <stdio.h> //Uso C y no C++ porque estoy mas acostumbrada a C, y a final de cuentas el ejercicio es libre.
#include <stdlib.h>
#include <windows.h>
#include <string.h>
#include "unnchar.h" //Libreria que yo hice para quitarle el '\n' a los char arrays.

typedef struct Pregunta{
    char* nombre;
    char* nc;
    char* lnac;
    int fnac, fdef;
    char* profesion;
    char* desarrollos;
    char* logros;
} Pregunta;

Pregunta pregunta;

void beginn();
void game();
void rules();
void err();

void menu(){
    char op;
    system("cls");
    Sleep(1000);
    printf(" ************* TEST QUIZ *******************\n");
    printf(" Flores Gomez Jose Guillermo. 660103897\n");
    printf("\n 1. Jugar\n");
    printf(" 2. Reglas\n");
    printf(" 3. Salir\n");
    printf("\n Escoja una opcion (1-3): ");
    scanf("%c", &op);
    while(getchar() != '\n'); //Eliminamos el salto de linea que deja scanf.
    switch(op){
    case '1':
        beginn();
        break;
    case '2':
        rules();
        break;
    case '3':
        printf("\n Saliendo"); Sleep(300);
        for(int i = 0; i < 5; i++){
                printf("."); Sleep(300);
        }
        printf("."); Sleep(1000);
        exit(0);
        break;
    default:
        break;
    }
}

void rules(){
    system("cls");
    Sleep(1000);
    printf(" ************* REGLAS *******************\n");
    printf(" Cuando ingreses una respuesta, siempre empieza por mayuscula y sigue en minusculas a menos que sea\n nombre propio.");
    printf("\n                En que lugar nacio? -> Ciudad de Mexico\n");
    printf("\n Las fechas van en valor numerico.");
    printf("\n                En que anio ocurrio? -> 1983\n");
    printf("\n Si te piden varios datos a la vez, separalos por comas y empieza por mayuscula.");
    printf("\n                Quienes fueron? -> Juanita, Panchito, Carlitos\n");
    printf("\n Evita incluir acentos para asegurar que la informacion se lea correctamente.\n");
    printf("\n No incluyas punto al final de tu respuesta.\n\n");
    system("pause");
    return;
}

void beginn(){
    system("cls");
    Sleep(1000);
    printf(" ************* TEST QUIZ *******************\n");
    printf("\n Pistas:");
    printf("\n\n  - El individuo es estadounidense.");
    printf("\n  - El individuo nacio cuando la WW2 aun estaba en curso.");
    printf("\n  - El individuo estudio en Harvard y se graduo en fisica y matematicas aplicadas.");
    printf("\n  - El individuo contribuyo con alrededor de 50 documentos academicos enfocados a\n    ciencias de la computacion.");
    printf("\n  - El individuo solia ser conocido bajo el nombre de usuario 'dmr'.");
    printf("\n\n Iniciando partida");
    for(int i = 0; i < 20; i++){
        printf("."); Sleep(400);
    }
    printf("."); Sleep(2000);
    game();
}

void game(){
    system("cls");
    Sleep(1000);
    int fnac, fdef;

    printf(" ************* TEST QUIZ *******************\n");
    printf("\n Comenzamos!\n");
    printf("\n Cuando nacio el individuo?: ");
    scanf("%d", &fnac);
    while(getchar() != '\n');
    if(fnac != pregunta.fnac){
        err();
        return;
    }
    printf("\n Correcto! El individuo nacio en 1941.\n");
    Sleep(1000);
    printf("\n Cual es la profesion del individuo?: ");
    char* profesion = malloc(500); /*Asignamos dinamicamente los char arrays para que el usuario sea libre de poner cuantos datos quiera.
                                    Tambien asi simulamos el comportamiento de un string de C++.*/
    fgets(profesion, 500, stdin); unnchar(profesion);
    profesion = realloc(profesion, strlen(profesion) + 1); //Le bajamos el tamaño al array para que no ocupe tanto espacio.
    if(strcmp(profesion, pregunta.profesion) != 0){ //strcmp compara los datos de dos char arrays y arroja un valor entero.
        err();                                      //El 0 signfiica que ambos arrays son iguales.
        free(profesion);
        return;
    }
    printf("\n Correcto! El individuo se dedicaba a las Ciencias de la computacion.\n");
    free(profesion); //Liberamos la memoria del array puesto que ya no lo usaremos.
    Sleep(1000);
    printf("\n Donde nacio el individuo?\n Solo coloca el nombre del lugar sin la ciudad: ");
    char* lnac = malloc(500);// Type casting no es necesario al usar malloc en C.
    fgets(lnac, 500, stdin); unnchar(lnac);
    lnac = realloc(lnac, strlen(lnac) + 1);
    if(strcmp(lnac, pregunta.lnac) != 0){
        err();
        free(lnac);
        return;
    }
    printf("\n Correcto! El individuo nacio en Bronxville, Nueva York.\n");
    free(lnac);
    Sleep(1000);
    printf("\n El individuo ya fallecio. Cuando lo hizo?: ");
    scanf("%d", &fdef);
    while(getchar() != '\n');
    if(fdef != pregunta.fdef){
        err();
        return;
    }
    printf("\n Correcto! El individuo fallecio en 2011 a la edad de 70 anios.\n");
    Sleep(1000);
    printf("\n El individuo es conocido por desarrollar tres de los productos mas importantes\n de la historia de las ciencias de la computacion.");
    printf("\n Cuales son esos 3 productos?: ");
    char* desarrollos = malloc(500);
    fgets(desarrollos, 500, stdin); unnchar(desarrollos);
    desarrollos = realloc(desarrollos, strlen(desarrollos) + 1);
    if(strcmp(desarrollos, pregunta.desarrollos) != 0){
        err();
        free(desarrollos);
        return;
    }
    printf("\n Correcto! El individuo es conocido por haber desarrollado Multics, Unix\n y el lenguaje de programacion C.\n");
    free(desarrollos);
    Sleep(1000);
    printf("\n El individuo recibio un premio en 1983, y otro en 1997. Cuales son?: ");
    char* logros = malloc(500); //No pongo sizeof(char) * 500 porque sizeof(char) siempre arroja 1.
    fgets(logros, 500, stdin); unnchar(logros);
    logros = realloc(logros, strlen(logros) + 1);
    if(strcmp(logros, pregunta.logros) != 0){
        err();
        free(logros);
        return;
    }
    printf("\n Correcto! El individuo recibio el Premio Turing en 1983 y la Medalla Nacional de la\n Tecnologia en 1997.\n");
    free(logros);
    Sleep(1000);
    printf("\n Ultima pregunta, Cual es el nombre del individuo?: ");
    char* nombre = malloc(500);
    fgets(nombre, 500, stdin); unnchar(nombre);
    nombre = realloc(nombre, strlen(nombre) + 1);
    if(strcmp(nombre, pregunta.nombre) != 0){
            if(strcmp(nombre, pregunta.nc) != 0){
                err();
                free(nombre);
                return;
            }
    }
    printf("\n Correcto! El individuo se llama Dennis Ritchie. Su nombre completo es Dennis MacAlistair Ritchie.\n");
    free(nombre);
    Sleep(1000);
    printf("\n Has ganado el juego! Pocas personas saben lo que sabes, asi que sientete especial!");
    printf("\n Muchisimas gracias por jugar. 2023.\n\n");
    Sleep(5000);
    system("pause");
    return;
}

void err(){
    printf("\n Whoops! Te has equivocado. Juego terminado.\n");
    printf(" ");
    system("pause");
    return;
}

int main(){
    pregunta.nombre = "Dennis Ritchie";
    pregunta.nc = "Dennis MacAlistair Ritchie";
    pregunta.lnac = "Bronxville";
    pregunta.fnac = 1941;
    pregunta.fdef = 2011;
    pregunta.profesion = "Ciencias de la computacion";
    pregunta.desarrollos = "Multics, Unix, C";
    pregunta.logros = "Premio Turing, Medalla Nacional de la Tecnologia";

    while(1){
        menu();
    }
    return 0;
}
