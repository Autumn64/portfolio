//Author: Aurora Giselle Flores Gomez (Autumn64)
#include<stdio.h>
#include<stdlib.h>
#include<string.h>

typedef struct admision{
    char *nombre, *carrera, *direccion;
    int edad, matricula;
    float promedio;
}admision;


void captura(admision *admision){
    admision->nombre = malloc(sizeof(char) * 300);
    admision->carrera = malloc(sizeof(char) * 300);
    admision->direccion = malloc(sizeof(char) * 300);

    printf("Ingrese la matricula del estudiante: ");
    scanf("%d", &admision->matricula);
    while((getchar()) != '\n');
    printf("Ingrese el nombre del estudiante: ");
    fgets(admision->nombre, 300, stdin);
    printf("La longitud del array del nombre es de: %d\n", strlen(admision->nombre));
    printf("Ingrese la carrera del estudiante: ");
    fgets(admision->carrera, 300, stdin);
    printf("Ingrese el promedio del estudiante: ");
    scanf("%f", &admision->promedio);
    while((getchar()) != '\n');
    printf("Ingrese la direccion del estudiante: ");
    fgets(admision->direccion, 300, stdin);

    admision->nombre[strlen(admision->nombre) - 1] = '\0';
    admision->carrera[strlen(admision->carrera) - 1] = '\0';
    admision->direccion[strlen(admision->direccion) - 1] = '\0';

    admision->nombre = realloc(admision->nombre, sizeof(char) * strlen(admision->nombre));
    admision->carrera = realloc(admision->carrera, sizeof(char) * strlen(admision->carrera));
    admision->direccion = realloc(admision->direccion, sizeof(char) * strlen(admision->direccion));
}

void poner(admision *admision){
    printf("\nLa matricula del estudiante es: %d\n", admision->matricula);
    printf("El nombre del estudiante es: %s\n", admision->nombre);
    printf("La carrera del estudiante es: %s\n", admision->carrera);
    printf("El promedio del estudiante es: %.2f\n", admision->promedio);
    printf("La direccion del estudiante es: %s\n", admision->direccion);

    printf("La nueva longitud del array del nombre es de: %d\n", strlen(admision->nombre));
}

void liberar(admision *admision){
    free(admision->nombre);
    free(admision->carrera);
    free(admision->direccion);
}

int main(){
    admision admision;
    captura(&admision);
    poner(&admision);
    liberar(&admision);

    return 0;
}
