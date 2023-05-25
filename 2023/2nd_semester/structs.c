//Author: Aurora Giselle Flores Gomez (Autumn64)
#include <stdio.h>
#include <stdlib.h>
#include "unnchar.h"

typedef struct Estudiante{
    char matricula[15], nombre[50], apellidos[50], carrera[50];
} Estudiante;

Estudiante* estudiantes;
int cnt = 0;

void agregar(){
    Estudiante alumno; //Struct temporal
    system("cls");
    printf("Ingrese matricula: ");
    fgets(alumno.matricula, 15, stdin); unnchar(alumno.matricula);
    printf("Ingrese nombre: ");
    fgets(alumno.nombre, 50, stdin); unnchar(alumno.nombre);
    printf("Ingrese apellidos: ");
    fgets(alumno.apellidos, 50, stdin); unnchar(alumno.apellidos);
    printf("Ingrese carrera: ");
    fgets(alumno.carrera, 50, stdin); unnchar(alumno.carrera);
    cnt++;
    estudiantes = realloc(estudiantes, sizeof(Estudiante) * cnt);
    estudiantes[cnt - 1] = alumno;
    printf("\nEstudiante agregado exitosamente.\n");
    system("pause");
    return;
}

void eliminar(){
    char matricula[15], el;
    system("cls");
    printf("Ingrese la matricula: ");
    fgets(matricula, 15, stdin); unnchar(matricula);
    for(int i = 0; i < cnt; i++){
        if(strcmp(matricula, estudiantes[i].matricula) == 0){
            printf("\nSe encontro al siguiente estudiante:\n");
            printf("Matricula: %s\n", estudiantes[i].matricula);
            printf("Nombre: %s\n", estudiantes[i].nombre);
            printf("Apellidos %s\n", estudiantes[i].apellidos);
            printf("Carrera: %s\n", estudiantes[i].carrera);
            printf("\nDesea eliminarlo? (s/n): ");
            scanf("%c", &el);
            while(getchar() != '\n');
            if(el == 's'){
                for(int j = i; j < cnt - 1; j++){
                    estudiantes[j] = estudiantes[j + 1];
                }
                cnt--;
                estudiantes = realloc(estudiantes, sizeof(Estudiante) * cnt); //Realloc gets rid of last element.
                printf("\nEstudiante eliminado exitosamente.\n");
                system("pause");
                return;
            }else{
                printf("\nOperacion cancelada.\n");
                return;
            }
        }
    }
    printf("\nNo se encontro ningun estudiante con esa matricula, volviendo al menu principal.\n");
    system("pause");
    return;
}

void mostrar(){
    system("cls");
    printf("\nTODOS LOS ESTUDIANTES\n\n");
    if(cnt == 0){
        printf("\nNo hay estudiantes para mostrar\n\n");
        system("pause");
        return;
    }else{
        for(int i = 0; i < cnt; i++){
            printf("Matricula: %s\n", estudiantes[i].matricula);
            printf("Nombre: %s\n", estudiantes[i].nombre);
            printf("Apellidos %s\n", estudiantes[i].apellidos);
            printf("Carrera: %s\n", estudiantes[i].carrera);
            printf("-------------------\n\n");
        }
    }
    system("pause");
    return;
}

int main(){
    while(1){
        char op;
        system("cls");
        printf("\nHay %d estudiantes registrados.\n", cnt);
        printf("1. Agregar\n2. Eliminar\n3. Mostrar todo\n4. Salir\n\nEscoja una opcion: ");
        scanf("%c", &op);
        while(getchar() != '\n');
        switch(op){
        case '1':
            op = '0';
            agregar();
            break;
        case '2':
            op = '0';
            eliminar();
            break;
        case '3':
            op = '0';
            mostrar();
            break;
        case '4':
            if(cnt != 0){
                free(estudiantes);
            }
            exit(0);
        default:
            break;
        }
    }
}
